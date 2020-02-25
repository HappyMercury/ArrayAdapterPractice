package com.example.arrayadapterpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Message> messages = new ArrayList<>();

        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));
        messages.add(new Message("this is an excellent piece at a very reasonable price","Whiteboard","Rs 10000",R.drawable.enhance));


        MessageAdapter adapter = new MessageAdapter(this,messages);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ItemDescription.class);
                startActivity(intent);
            }
        });

    }
}
