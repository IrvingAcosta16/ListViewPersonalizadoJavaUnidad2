package com.example.searchviewpersonalizado;
// Importaciones necesarias
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AdapterAlumno extends ArrayAdapter<AlumnoItem> {
    private Activity context; // Referencia a la actividad que utiliza el adaptador
    private int layoutResourceId; // ID del diseño de fila utilizado para mostrar cada elemento
    private ArrayList<AlumnoItem> list; // Lista de elementos AlumnoItem que se mostrarán en la vista de lista
    private LayoutInflater inflater; // Utilizado para inflar las vistas del diseño

    // Constructor del adaptador
    public AdapterAlumno(Activity context, int layoutResourceId, ArrayList<AlumnoItem> list){
        super(context, layoutResourceId, list);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // Método para obtener la vista de cada elemento en la lista
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder;

        // Si la vista de fila no existe, se infla utilizando el diseño de fila especificado
        if (row == null) {
            row = inflater.inflate(layoutResourceId, parent, false);

            // Se crea un objeto ViewHolder para almacenar las referencias a los elementos de la vista de fila
            holder = new ViewHolder();
            holder.imgFoto = row.findViewById(R.id.imgFoto);
            holder.txtNombre = row.findViewById(R.id.txtNombre);
            holder.txtMatricula = row.findViewById(R.id.txtMatricula);

            // Se almacena el objeto ViewHolder en la vista de fila utilizando setTag
            row.setTag(holder);
        } else {
            // Si la vista de fila ya existe, se obtiene el objeto ViewHolder almacenado en la vista utilizando getTag
            holder = (ViewHolder) row.getTag();
        }

        // Se obtiene el objeto AlumnoItem correspondiente a la posición actual
        AlumnoItem alumno = list.get(position);

        // Se establecen los valores de los elementos de la vista de fila utilizando los datos del objeto AlumnoItem
        holder.txtNombre.setText(alumno.getNombreCompleto());
        holder.txtMatricula.setText(alumno.getMatricula());

        // Se construye el nombre de la imagen basado en la matrícula del alumno
        String imagenNombre = "img_" + alumno.getMatricula();

        // Se obtiene el ID de la imagen utilizando el nombre construido y el contexto de la actividad
        int imagenId = context.getResources().getIdentifier(imagenNombre, "drawable", context.getPackageName());

        // Se verifica si se encontró una imagen con el ID obtenido
        if (imagenId != 0) {
            // Si se encontró la imagen, se establece en el ImageView correspondiente
            holder.imgFoto.setImageResource(imagenId);
        } else {
            // Si no se encontró la imagen, se puede realizar alguna otra acción
        }

        // Se retorna la vista de fila actualizada
        return row;
    }

    // Clase interna para almacenar las referencias a los elementos de la vista de fila
    static class ViewHolder {
        ImageView imgFoto;
        TextView txtNombre;
        TextView txtMatricula;
    }
}
