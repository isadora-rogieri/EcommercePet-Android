package com.example.projetoecommercepet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoActivity extends AppCompatActivity {
    private List<String> produtos = new ArrayList<>();
    ArrayAdapter<String> adapter;
    AlertDialog alert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        Intent intent = getIntent();

          produtos.add(intent.getStringExtra("produtoSel") + " R$ " + intent.getStringExtra("precoProdSel"));


        adapter = new ArrayAdapter<String>(
                this, //Contexto da tela aonde será montado
                android.R.layout.simple_list_item_1, //Layout que será usado
                produtos);

        ListView listaProd = findViewById(R.id.listCarrinho);

        listaProd.setAdapter(adapter);

        listaProd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                montaAlert("Remover item", "Deseja mesmo apagar?", i);
            }
        });
    }


    private void montaAlert(String titulo, String mensagem, int posicao){
        //Novo objeto da classe AlertDialog porém com a opção de configurar (Builder)
        AlertDialog.Builder configAlert = new AlertDialog.Builder(this);
        configAlert.setTitle(titulo); //Configura o título
        configAlert.setMessage(mensagem); //Configura a mensagem interna


        configAlert.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                produtos.remove(posicao);
                adapter.notifyDataSetChanged();
            }
        });

        configAlert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alert.cancel();
            }
        });


        alert = configAlert.create();
        alert.show();
    }

}