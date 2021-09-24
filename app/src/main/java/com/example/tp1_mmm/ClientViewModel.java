package com.example.tp1_mmm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ClientViewModel extends BaseObservable {

    private Client model;
    @Bindable
    public String getName(){
        return "";
    }

    public void setName(String nom){
        this.model.nom = nom;

        notifyPropertyChanged(BR.name);
    }

}
