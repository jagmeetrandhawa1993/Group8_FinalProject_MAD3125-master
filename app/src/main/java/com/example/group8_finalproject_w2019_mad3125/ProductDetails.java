package com.example.group8_finalproject_w2019_mad3125;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.group8_finalproject_w2019_mad3125.Modal.Cart;
import com.example.group8_finalproject_w2019_mad3125.Modal.Prod;

public class ProductDetails extends AppCompatActivity {
    public  static  Cart c = new Cart();
    private TextView productId;
    private TextView productName;
    private TextView productPrice;
    private ImageView productImage;
    private Button addToCart;
    private TextView q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        getSupportActionBar().setTitle("Product Details");
        productId=findViewById(R.id.textViewId);
        productName=findViewById(R.id.textViewName);
        productPrice=findViewById(R.id.textViewPrice);
        productImage=findViewById(R.id.proImg);
        q=findViewById(R.id.editqty);
        addToCart=findViewById(R.id.btncart);
        Intent i=getIntent();
        final Prod p = (Prod) i.getExtras().getSerializable("productdetails");
        productId.setText("Product ID::"+p.getProductId());
        productName.setText("Product Name::"+p.getName());
        productPrice.setText("Price:$:"+p.getPrice());
        int imageId = this.getResources().getIdentifier(p.getImg(),"drawable", this.getPackageName());
        this.productImage.setImageResource(imageId);
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double total = Double.valueOf(p.getPrice()) * Double.valueOf(q.getText().toString());


                double qq = Double.valueOf(q.getText().toString());


                if (qq > 5) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ProductDetails.this);

                    alertDialogBuilder.setTitle(" You can not add more than 5 items");
                    alertDialogBuilder

                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();


                } else {
                    Cart addcart = new Cart(p.getName(), p.getProductId(), q.getText().toString(), Double.valueOf(p.getPrice()), total, p.getImg());
                    c.addtocart(addcart);

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ProductDetails.this);

                    alertDialogBuilder.setTitle("Move item to cart");
                    alertDialogBuilder

                            .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent LoginIntent = new Intent(ProductDetails.this, Products.class);

                                    startActivity(LoginIntent);
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
            }
        });

    }
}
