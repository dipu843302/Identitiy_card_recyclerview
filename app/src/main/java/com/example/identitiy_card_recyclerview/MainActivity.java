package com.example.identitiy_card_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    LinearLayoutManager linearLayoutManager;
    ArrayList<ModelClass> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerview();

    }

    private void initRecyclerview() {
        recyclerView=findViewById(R.id.recyclerView);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        
    }

    private void initData() {

        userList=new ArrayList<>();
        int i=0;
        while (i<7) {
            userList.add(new ModelClass(R.drawable.prateek, "Masai", "32", "Businessman"));
            userList.add(new ModelClass(R.drawable.akshay, "Bollywood", "53", "Actor"));
            userList.add(new ModelClass(R.drawable.bezzos, "Amazon", "45", "Businessman"));
            i++;
        }
    }
}