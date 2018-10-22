package com.github.estevaocs.cnes;

public final class Unidade {

    private String codigo;

    private String razaoSocial;

    private String latitude;

    private String longitude;

    Unidade(final String cod, final String raz, final String lat,
            final String lon) {
        this.codigo = cod;
        this.razaoSocial = raz;
        this.latitude = lat;
        this.longitude = lon;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getLatitude() {
        return latitude;
    }


    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    public String getLongitude() {
        return longitude;
    }


    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
