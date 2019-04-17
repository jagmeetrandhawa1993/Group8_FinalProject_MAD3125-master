package com.example.group8_finalproject_w2019_mad3125;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.group8_finalproject_w2019_mad3125.Modal.Prod;

public class ProductDetails extends AppCompatActivity {

    private TextView productId;
    private TextView productName;
    private TextView productPrice;
    private ImageView productImage;
    private Button addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        productId=findViewById(R.id.textViewId);
        productName=findViewById(R.id.textViewName);
        productPrice=findViewById(R.id.textViewPrice);

        //qty=findViewById(R.id.txtqty);
        productImage=findViewById(R.id.proImg);
       // qty.setFilters(new InputFilter[]{ new MinMaxFilter("1", "5")});
        Intent i=getIntent();
        Prod p = (Prod) i.getExtras().getSerializable("pdetails");
        productId.setText("Product ID::"+p.getProductId());
        productName.setText("Product Name::"+p.getName());
        productPrice.setText("Price:$:"+p.getPrice());
       // desc.setText("Description:"+probj.getDescription());
        int imageId = this.getResources().getIdentifier(p.getImg(),"drawable", this.getPackageName());
        this.productImage.setImageResource(imageId);

    }
}
