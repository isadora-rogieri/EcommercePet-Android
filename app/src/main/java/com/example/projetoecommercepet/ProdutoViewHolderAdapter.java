package com.example.projetoecommercepet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProdutoViewHolderAdapter  extends RecyclerView.Adapter<ProdutoViewHolderAdapter.ViewHolder>  {
    Context context;
    List<Produtos> produtosList = new ArrayList<>();
    List<Produtos> mProdutoList;
    View view;
    ViewHolder viewHolderProdutos;




    public ProdutoViewHolderAdapter(Context context, List<Produtos> produtosList) {
        this.context = context;
        this.produtosList = produtosList;
        this.mProdutoList = produtosList;

    }
    public static class ViewHolder extends  RecyclerView.ViewHolder implements  View.OnClickListener {
        public ImageView imagemProduto;
        public TextView nomeProduto, precoProduto;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagemProduto = itemView.findViewById(R.id.imgProd);
            nomeProduto = itemView.findViewById(R.id.txtProd);
            precoProduto = itemView.findViewById(R.id.txtPreco);

        }

        @Override
        public void onClick(View view) {

        }
    }

    @NonNull
    @Override
    public ProdutoViewHolderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.layout_item, parent, false);
        viewHolderProdutos = new ViewHolder(view);
        return viewHolderProdutos;
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolderAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.nomeProduto.setText(produtosList.get(position).getNome());
        holder.precoProduto.setText(String.valueOf(produtosList.get(position).getPreco()));
        holder.imagemProduto.setImageResource(produtosList.get(position).getImg());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Produtos produto = new Produtos(produtosList.get(position).getNome(),
                        produtosList.get(position).getPreco(), produtosList.get(position).getImg());


                Intent intent = new Intent(context, DetalhesActivity.class);

                intent.putExtra("produto", produto);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return produtosList.size();
    }



    }



