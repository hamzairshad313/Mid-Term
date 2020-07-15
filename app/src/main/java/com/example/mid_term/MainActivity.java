package com.example.mid_term;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText item_Name;
    private EditText item_Details;
    private EditText item_Deadline;
    private Button btn;

    private ArrayList<string> items;
    private ArrayAdapter<string> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item_Name = findViewById(R.id.item_edit_Name);
        item_Details = findViewById(R.id.item_edit_Details);
        item_Deadline = findViewById(R.id.item_edit_Date);
        btn = findViewById(R.id.add_button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add_button:
                String itemEnterd = item_Name.getText().toString();
                String itemDetail = item_Details.getText().toString();
                string itemDeadline = item_Deadline.getText();
                adapter.add(itemEnterd);
                item_Name.setText("");


        }
    }
}
