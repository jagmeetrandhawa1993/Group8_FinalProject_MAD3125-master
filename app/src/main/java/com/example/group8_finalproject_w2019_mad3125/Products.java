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
        getSupportActionBar().setTitle("Products");
        getItems();
        productList =findViewById(R.id.recyclerView);
        prodname = new ArrayList<>();
       for (Prod str : productsArrayList) {
            prodname.add(str.getName());
            prodname.add(str.getImg());
        }

        mAdapter = new AdapterProduct(productsArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        productList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        productList.setHasFixedSize(false);
        productList.setLayoutManager(mLayoutManager);
        productList.setItemAnimator(new DefaultItemAnimator());
        productList.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }

    public void getItems()
    {
        productsArrayList = new ArrayList<>();
        productsArrayList.add(new Prod("P1","Phone","2000","phone5t"));
        productsArrayList.add(new Prod("P2","Mouse","10","mouse_techbuy"));
        productsArrayList.add(new Prod("P3","Macbook","500","macbook"));
        productsArrayList.add(new Prod("P4","One Plus","20","phone"));
        productsArrayList.add(new Prod("P5","Headphones","1000","headphones"));

    }
}
