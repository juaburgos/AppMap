package com.example.juanpablo.mymapp.API;

import com.example.juanpablo.mymapp.models.CentrosAyuda;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Juan Pablo on 26/10/2017.
 */

public interface DatosAPI
{
        @GET("kspt-6t6c.json")
        Call<ArrayList<CentrosAyuda>> obtenerLista();
}
