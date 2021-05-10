package com.mmabas77.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolderData>{
    ArrayList<Model> models;
    Context context;

    public ModelAdapter(ArrayList<Model> models,Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.design,parent,false);
        return new ViewHolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderData holder, int position) {
        Model current = models.get(position);
        holder.titke.setText(current.getTitle());
        holder.body.setText(current.getBody());
        holder.id.setText(current.getId()+"");
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class ViewHolderData extends RecyclerView.ViewHolder{

        TextView titke;
        TextView body;
        TextView id;


        public ViewHolderData(@NonNull View itemView) {
            super(itemView);

            titke = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);
            id = itemView.findViewById(R.id.id);
        }
    }
}
