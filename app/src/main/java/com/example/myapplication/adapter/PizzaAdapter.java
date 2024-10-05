package com.example.myapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;
    public PizzaAdapter(List<Produit> produits, Activity activity){
        this.produits=produits;
        inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view = inflater.inflate(R.layout.item,null);
        ImageView imagepizza=view.findViewById(R.id.imagepizza);
        TextView titrepizza=view.findViewById(R.id.titrepizza);
        TextView duree=view.findViewById(R.id.duree);
        TextView nbrvisit=view.findViewById(R.id.nbvisit);
        imagepizza.setImageResource(produits.get(i).getPhoto());
        titrepizza.setText(produits.get(i).getNom()+"");
        duree.setText((int)produits.get(i).getDuree()+" min");
        nbrvisit.setText(produits.get(i).getNbreIngredients()+"");


        return view;
    }
}
