package com.example.group8_finalproject_w2019_mad3125;

import android.content.Intent;
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

                double total = Double.valueOf(p.getPrice())*Double.valueOf(q.getText().toString()) ;
                double qq=Double.valueOf(q.getText().toString());
                Cart addcart=new Cart(p.getName(),p.getProductId(),q.getText().toString(),Double.valueOf(p.getPrice()),total,p.getImg());
                c.addtocart(addcart);
                Intent LoginIntent = new Intent(ProductDetails.this, MainMenu.class);

                startActivity(LoginIntent);
            }
        });

    }
}
