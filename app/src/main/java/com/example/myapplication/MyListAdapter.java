package com.example.myapplication;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private List_items[] listdata;

    public MyListAdapter(List_items[] listItems) {
this.listdata = listItems;    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from((parent.getContext()));
        View listItem =layoutInflater.inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    final List_items listItems=listdata[position];
    holder.textview.setText(listdata[position].getDescription());
    holder.imageView.setImageResource(listdata[position].getImgId());
    holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "click on item"+listItems.getDescription(),Toast.LENGTH_LONG);
        }
    });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textview;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView){
            super(itemView);
            this.imageView=(ImageView)  itemView.findViewById(R.id.imageView);
            this.textview = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativelayout);
        }

        }
    }

