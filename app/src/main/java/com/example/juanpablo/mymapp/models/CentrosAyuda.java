package com.example.juanpablo.mymapp.models;

/**
 * Created by Juan Pablo on 26/10/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CentrosAyuda {

    @SerializedName("coddepto")
    @Expose
    private String coddepto;
    @SerializedName("codmunicipio")
    @Expose
    private String codmunicipio;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("latitud")
    @Expose
    private String latitud;
    @SerializedName("longitud")
    @Expose
    private String longitud;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("nivel")
    @Expose
    private String nivel;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("nombreresponsable")
    @Expose
    private String nombreresponsable;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("tipo")
    @Expose
    private String tipo;

    public String getCoddepto() {
        return coddepto;
    }

    public void setCoddepto(String coddepto) {
        this.coddepto = coddepto;
    }

    public String getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(String codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreresponsable() {
        return nombreresponsable;
    }

    public void setNombreresponsable(String nombreresponsable) {
        this.nombreresponsable = nombreresponsable;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}