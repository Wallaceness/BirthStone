package com.example.android.birthstones;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class DetailView extends AppCompatActivity {
    TextView nameView;
    TextView descriptionView;
    ConstraintLayout detailParent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        if (savedInstanceState != null){
        //set saved values from orientation change
        }
        nameView = findViewById(R.id.name_field);
        descriptionView =findViewById(R.id.description_field);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int image = intent.getIntExtra("image", 0);
        String description = intent.getStringExtra("description");

        nameView.setText(name);
        descriptionView.setText(description);
        descriptionView.setBackground(getDrawable(image));
    }
}
