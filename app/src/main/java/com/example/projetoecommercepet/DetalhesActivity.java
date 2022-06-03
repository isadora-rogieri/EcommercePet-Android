package com.example.projetoecommercepet;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DetalhesActivity extends AppCompatActivity {
    ImageView imgProdDet;
    TextView txtnomeDet,txtprecoDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

       imgProdDet= findViewById(R.id.imgProdDet);
       txtnomeDet = findViewById(R.id.txtnomeDet);
       txtprecoDet = findViewById(R.id.txtprecoDet);


       Intent intent = getIntent();
       Produtos p = (Produtos) getIntent().getSerializableExtra("produto");

        imgProdDet.setImageResource(p.getImg());
        txtnomeDet.setText(p.getNome());
        txtprecoDet.setText(String.valueOf(p.getPreco()));




        Button btAdicionar = findViewById(R.id.btAdicinar);

        btAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DetalhesActivity.this, CarrinhoActivity.class);
                intent1.putExtra("produtoSel", txtnomeDet.getText().toString());
                intent1.putExtra("precoProdSel", txtprecoDet.getText());
                startActivity(intent1);


            }
        });



    }




}