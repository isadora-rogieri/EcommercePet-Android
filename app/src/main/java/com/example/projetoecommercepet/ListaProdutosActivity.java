package com.example.projetoecommercepet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {
    RecyclerView.Adapter reclyclerViewAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Produtos> listaProdutos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produtos);
        Produtos coleira = new Produtos( "Coleira para Gato", 35.90 , R.drawable.i003);
        Produtos comedorAutomatico = new Produtos( "Comedor Automatico", 85.90 , R.drawable.i008);
        Produtos luvaPelos = new Produtos( "Luva tira pelos", 22.50 , R.drawable.i004);
        Produtos camaSofa = new Produtos( "Cama em forma de sofá mini", 79.00 , R.drawable.i005);
        Produtos peixinho = new Produtos( "Peixinho para gatos", 29.00 , R.drawable.pexinho);
        Produtos postePipi = new Produtos( "Poste do pipi Dog", 36.50 , R.drawable.i010);
        Produtos mordeddor = new Produtos( "Mordedor Chupeta", 19.00 , R.drawable.i011);
        Produtos comedouro_doguinho = new Produtos( "Comedouro Doguinho", 29.00 , R.drawable.i009);
        Produtos gravata = new Produtos( "Gravata e Bandana", 15.90 , R.drawable.i013);
        Produtos moletom = new Produtos( "Moletom Azul com Capuz", 65.50 , R.drawable.i014);
        Produtos cachecol = new Produtos( "Cachecol de Natal", 25.50 , R.drawable.i015);
        Produtos abelha = new Produtos( "Roupinha Abelha", 36.10 , R.drawable.i018);
        Produtos arranhador = new Produtos( "Arranhador braço de sofa", 95.00 , R.drawable.i016);
        Produtos casinhaArranhador = new Produtos( "Arranhador Casinha ", 355.50 , R.drawable.i017);
        Produtos capa_de_chuva = new Produtos( "Capa de Chuva", 89.90 , R.drawable.i051);
        Produtos patinho = new Produtos( "Pelúcia Sweet Patinho", 24.80 , R.drawable.i029);


        listaProdutos.add(abelha);
        listaProdutos.add(arranhador);
        listaProdutos.add(casinhaArranhador);
        listaProdutos.add(capa_de_chuva);
        listaProdutos.add(patinho);
        listaProdutos.add(coleira);
        listaProdutos.add(comedorAutomatico);
        listaProdutos.add(luvaPelos);
        listaProdutos.add(peixinho);
        listaProdutos.add(camaSofa);
        listaProdutos.add(postePipi);
        listaProdutos.add(mordeddor);
        listaProdutos.add(gravata);
        listaProdutos.add(moletom);
        listaProdutos.add(comedouro_doguinho);
        listaProdutos.add(cachecol);



        RecyclerView recyclerTela = findViewById(R.id.recyclerTela);
        layoutManager = new LinearLayoutManager(this);
        recyclerTela.setLayoutManager(layoutManager);
        reclyclerViewAdapter = new ProdutoViewHolderAdapter(this, listaProdutos);
        recyclerTela.setAdapter(reclyclerViewAdapter);


    }



}