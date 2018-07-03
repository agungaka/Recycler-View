package com.akaprod.agung.rview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private Context context;
    private List<kumpulanData> data;


    public myAdapter(Context context, List<kumpulanData> data) {
        this.context = context;
        this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView head, isi;

        public ViewHolder(View itemView) {
            super(itemView);

            head = (TextView)itemView.findViewById(R.id.head);
            isi = (TextView)itemView.findViewById(R.id.isi);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.activity_blue_print, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        kumpulanData pu = data.get(position);

        holder.head.setText(pu.getNama());
        holder.isi.setText(pu.getIsi());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
