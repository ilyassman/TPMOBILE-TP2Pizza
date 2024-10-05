package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailPizza extends AppCompatActivity {
    private ImageView image;
    private TextView titre,descp,ingre,prepa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_pizza);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        image=findViewById(R.id.image);
        titre=findViewById(R.id.titre);
        descp=findViewById(R.id.description);
        ingre=findViewById(R.id.ingredients);
        prepa=findViewById(R.id.preparation);
        image.setImageResource(this.getIntent().getIntExtra("image",0));
        titre.setText(this.getIntent().getStringExtra("nom"));
        descp.setText(this.getIntent().getStringExtra("descp"));
        ingre.setText(this.getIntent().getStringExtra("ingre"));
        prepa.setText(this.getIntent().getStringExtra("prepa"));
    }
}