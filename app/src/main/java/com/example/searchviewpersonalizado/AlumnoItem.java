package com.example.searchviewpersonalizado;

public class AlumnoItem {
    private String imageId; // Variable para almacenar el ID de la imagen del alumno
    private String nombreCompleto; // Variable para almacenar el nombre completo del alumno
    private String matricula; // Variable para almacenar la matrícula del alumno

    public AlumnoItem(String imageId, String nombreCompleto, String matricula){
        this.imageId = imageId; // Asigna el valor del parámetro "imageId" a la variable miembro "imageId"
        this.nombreCompleto = nombreCompleto; // Asigna el valor del parámetro "nombreCompleto" a la variable miembro "nombreCompleto"
        this.matricula = matricula; // Asigna el valor del parámetro "matricula" a la variable miembro "matricula"
    }

    public String getImageId() {
        return imageId; // Devuelve el valor de la variable miembro "imageId"
    }

    public void setImageId(String imageId) {
        this.imageId = imageId; // Asigna el valor del parámetro "imageId" a la variable miembro "imageId"
    }

    public String getNombreCompleto() {
        return nombreCompleto; // Devuelve el valor de la variable miembro "nombreCompleto"
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto; // Asigna el valor del parámetro "nombreCompleto" a la variable miembro "nombreCompleto"
    }

    public String getMatricula() {
        return matricula; // Devuelve el valor de la variable miembro "matricula"
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula; // Asigna el valor del parámetro "matricula" a la variable miembro "matricula"
    }
}
