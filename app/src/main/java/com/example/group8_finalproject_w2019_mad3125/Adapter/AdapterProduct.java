package com.example.group8_finalproject_w2019_mad3125.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
    public AdapterProduct.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.customlist, viewGroup, false);
        mcontext = viewGroup.getContext();
        return new Holder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull Holder myviewholder, int i) {
        final Prod p=ProductsList.get(i);
        myviewholder.txtproductname.setText(p.getName());

       int imageid = mcontext.getResources().getIdentifier(p.getImg(),"drawable", mcontext.getPackageName());
      myviewholder.proimg1.setImageResource(imageid);

       myviewholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mcontext, ProductDetails.class);
                i.putExtra("productdetails",p);
                mcontext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ProductsList.size();
    }

    public class Holder extends RecyclerView.ViewHolder
    {
        private ImageView proimg1;
        private TextView txtproductname;

        public Holder(View itemView) {
            super(itemView);
            proimg1=(ImageView) itemView.findViewById(R.id.img1);
            txtproductname=(TextView) itemView.findViewById(R.id.textViewProducts);

        }
    }
}
