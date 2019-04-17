package com.example.group8_finalproject_w2019_mad3125.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.group8_finalproject_w2019_mad3125.CartDetails;
import com.example.group8_finalproject_w2019_mad3125.Modal.Cart;
import com.example.group8_finalproject_w2019_mad3125.R;

import java.util.List;

public class AdapterCart extends RecyclerView.Adapter<AdapterCart.Holder> {
    private List<Cart> Listcart;
    private Context con;

    public AdapterCart(List<Cart> listcart) {
        Listcart = listcart;
    }

    @NonNull
    @Override
    public AdapterCart.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.customrecycle, viewGroup, false);
        con = viewGroup.getContext();
        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCart.Holder holder, int i) {
        final Cart cart = Listcart.get(i);
        holder.txtproductname.setText(cart.getProductname());
        holder.txtid.setText(cart.getProductId());
        holder.txtqty.setText(cart.getQuantity());
        holder.txtsubtot.setText(String.valueOf(cart.getSubtotal()));
        int imageid = con.getResources().getIdentifier(cart.getProductimage(),"drawable", con.getPackageName());
        holder.cimg1.setImageResource(imageid);

    }

    @Override
    public int getItemCount() {
        return Listcart.size();
    }

    public class Holder extends RecyclerView.ViewHolder
    {
        private ImageView cimg1;
        private TextView txtproductname;
        private TextView txtid;
        private TextView txtqty;
        private TextView txtsubtot;


        public Holder(View itemView) {
            super(itemView);
            cimg1=(ImageView) itemView.findViewById(R.id.cimage);
            txtproductname=(TextView) itemView.findViewById(R.id.cname);
            txtid=(TextView) itemView.findViewById(R.id.cid);
            txtqty=(TextView)itemView.findViewById(R.id.cqty);
            txtsubtot=(TextView)itemView.findViewById(R.id.csubtotal);

        }
    }
}
