package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List_items[] listItems =new List_items[]{
                new List_items("Email", android.R.drawable.ic_dialog_email),
                new List_items("info", android.R.drawable.ic_dialog_info),
                new List_items("Delete", android.R.drawable.ic_delete),
                new List_items("Dialer", android.R.drawable.ic_dialog_dialer),
                new List_items("Alert", android.R.drawable.ic_dialog_alert),
                new List_items("Map", android.R.drawable.ic_dialog_map),
                new List_items("Email", android.R.drawable.ic_dialog_email),
                new List_items("info", android.R.drawable.ic_dialog_info),
                new List_items("Delete", android.R.drawable.ic_delete),
                new List_items("Dialer", android.R.drawable.ic_dialog_dialer),
                new List_items("Alert", android.R.drawable.ic_dialog_alert),
                new List_items("Map", android.R.drawable.ic_dialog_map),
        };
        RecyclerView recyclerView =(RecyclerView) findViewById((R.id.recview));
        MyListAdapter adapter = new MyListAdapter(listItems);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}