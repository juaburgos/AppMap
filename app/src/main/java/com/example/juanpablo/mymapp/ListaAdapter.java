package com.example.juanpablo.mymapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.juanpablo.mymapp.models.CentrosAyuda;

import java.util.ArrayList;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {
    private ArrayList<CentrosAyuda> dataset;
    private Context context;

    public ListaAdapter (Context context)
    {
        this.context=context;
        dataset = new ArrayList<>();
    }


    @Override
    public ListaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lista_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaAdapter.ViewHolder holder, int position) {
        CentrosAyuda c = dataset.get(position);
        holder.departamento.setText(c.getDepartamento());
        holder.municipio.setText(c.getMunicipio());
        holder.tipo.setText(c.getTipo());
        holder.nombre.setText(c.getNombre());
        holder.telefono.setText(c.getTelefono());
        holder.direccion.setText(c.getDireccion());

    }

    @Override
    public int getItemCount() {
        return  dataset.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView departamento;
        private TextView municipio;
        private TextView  tipo;
        private TextView  nombre;
        private TextView  direccion;
        private TextView  telefono;

        public ViewHolder(View itemView) {
            super(itemView);

            departamento = (TextView) itemView.findViewById(R.id.tv_departamento);
            municipio=(TextView) itemView.findViewById(R.id.tv_municipio);
            tipo=(TextView) itemView.findViewById(R.id.tv_tipo);
            nombre=(TextView) itemView.findViewById(R.id.tv_nombre);
            direccion=(TextView) itemView.findViewById(R.id.tv_direccion);
            telefono=(TextView) itemView.findViewById(R.id.tv_telefono);

        }
    }
    public void agregar(ArrayList<CentrosAyuda> lista)
    {
        dataset.addAll(lista);
        notifyDataSetChanged();


    }
}
