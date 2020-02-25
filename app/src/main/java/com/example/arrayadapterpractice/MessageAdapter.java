package com.example.arrayadapterpractice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MessageAdapter extends ArrayAdapter<Message> {

    public MessageAdapter(Activity context, ArrayList<Message> messages)
    {

        super(context,0,messages);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View message = convertView;
        if(message == null) {
            message = LayoutInflater.from(getContext()).inflate(
                    R.layout.message, parent, false);
        }

        Message currentMessage = getItem(position);

        TextView title = message.findViewById(R.id.title);
        title.setText(currentMessage.getTitle());

        TextView description = message.findViewById(R.id.description);
        description.setText(currentMessage.getDescription());

        TextView price = message.findViewById(R.id.price);
        price.setText(currentMessage.getPrice());

        ImageView productImage = message.findViewById(R.id.productImage);
        productImage.setImageResource(currentMessage.getProductImage());

        return message;

    }

}
