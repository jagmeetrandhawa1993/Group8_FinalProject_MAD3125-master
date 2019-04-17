package com.example.group8_finalproject_w2019_mad3125;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.group8_finalproject_w2019_mad3125.Adapter.AdapterCart;
import com.example.group8_finalproject_w2019_mad3125.Modal.Cart;

import java.util.List;

import static com.example.group8_finalproject_w2019_mad3125.ProductDetails.c;

public class CartDetails extends AppCompatActivity {
    private List<Cart> cArrayList;
    private RecyclerView cList;

    private AdapterCart cAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_details);
        getSupportActionBar().setTitle("Cart");
        cList =findViewById(R.id.cartrecycler);
        cAdapter = new AdapterCart(c.getClist());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        cList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        cList.setHasFixedSize(false);
        cList.setLayoutManager(mLayoutManager);
        cList.setItemAnimator(new DefaultItemAnimator());
        cList.setAdapter(cAdapter);
        cAdapter.notifyDataSetChanged();
    }
}
