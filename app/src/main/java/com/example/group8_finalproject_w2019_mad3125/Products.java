package com.example.group8_finalproject_w2019_mad3125;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.group8_finalproject_w2019_mad3125.Adapter.AdapterProduct;
import com.example.group8_finalproject_w2019_mad3125.Modal.Prod;

import java.util.ArrayList;
import java.util.List;

public class Products extends AppCompatActivity {

    private List<Prod> productsArrayList;
    private RecyclerView productList;
    private List<String> prodname;
    private AdapterProduct mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        getItems();

        productList =findViewById(R.id.recyclerView);

        getSupportActionBar().setTitle("Products");
        prodname = new ArrayList<>();
       for (Prod str : productsArrayList) {
            prodname.add(str.getName());
           // prodname.add(str.getName());
        }

        mAdapter = new AdapterProduct(productsArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        productList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL, 16));
        productList.setHasFixedSize(false);
        productList.setLayoutManager(mLayoutManager);
        productList.setItemAnimator(new DefaultItemAnimator());
        productList.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();




    }

    public void getItems()
    {
        productsArrayList = new ArrayList<>();
        productsArrayList.add(new Prod("P1","Laptop","2000","laptop"));
        productsArrayList.add(new Prod("P2","Mouse","10","mouse_techbuy"));
       /* productsArrayList.add(new Prod("P3","Printer","500","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P4","USB","20","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P5","Hard Disk","1000","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P6","Floppy Disk","30","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P7","CPU","600","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P8","Monitor","750","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P9","Keyboard","300","Intel core, i5, 4GB RAM"));
        productsArrayList.add(new Prod("P10","Data cable","10","Intel core, i5, 4GB RAM"));
    */
    }
}
