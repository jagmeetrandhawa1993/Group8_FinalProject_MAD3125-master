package com.example.group8_finalproject_w2019_mad3125.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.group8_finalproject_w2019_mad3125.Modal.Prod;
import com.example.group8_finalproject_w2019_mad3125.ProductDetails;
import com.example.group8_finalproject_w2019_mad3125.R;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.Holder> {



    private List<Prod> ProductsList;
    private Context mcontext;
    public AdapterProduct(List<Prod> productsList) {
      ProductsList = productsList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.customlist, viewGroup, false);
        mcontext = viewGroup.getContext();
        return new Holder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull Holder myviewholder, int i) {
        final Prod p=ProductsList.get(i);
        //  myviewholder.sid.setText("Student ID::"+stud.getSid());
       // myviewholder.productImage.setText("Product image::"+prod.productImage());
        //  myviewholder.gender.setText("Gender::"+stud.getGender());

        myviewholder.txtproductname.setText(p.getName());

    }

    @Override
    public int getItemCount() {
        return ProductsList.size();
    }

    public class Holder extends RecyclerView.ViewHolder
    {
       // public ImageView productImage ;
       // public ImageView img1;
        private TextView txtproductname;

        public Holder(View itemView) {
            super(itemView);

           // productImage=(ImageView) itemView.findViewById(R.id.imageView);
            txtproductname=(TextView) itemView.findViewById(R.id.textViewProducts);

        }
    }
}
