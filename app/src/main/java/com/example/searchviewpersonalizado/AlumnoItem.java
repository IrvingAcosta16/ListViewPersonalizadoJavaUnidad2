package com.example.searchviewpersonalizado;

public class AlumnoItem {
    private String imageId;
    private String nombreCompleto;
    private String matricula;


    public AlumnoItem(String imageId, String nombreCompleto, String matricula){
        this.imageId = imageId;
        this.nombreCompleto = nombreCompleto;
        this.matricula = matricula;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
