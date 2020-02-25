package com.example.arrayadapterpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);

        ScrollView scrollVeiw = findViewById(R.id.scrollView);

        ImageView productImageView = findViewById(R.id.productImage);

        TextView title = findViewById(R.id.title);

        TextView description = findViewById(R.id.description);

        TextView price = findViewById(R.id.price);

        TextView userInfo = findViewById(R.id.userInfo);

        TextView header = findViewById(R.id.header);

        productImageView.setImageResource(R.drawable.enhance);
        title.setText("Whiteboard");
        description.setText("Useful,Used price is negotiable. an essential item for any room");
        price.setText("Rs 10000");
        userInfo.setText("Harsh Gupta");
    }
}
