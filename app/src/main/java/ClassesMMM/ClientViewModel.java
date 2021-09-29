package ClassesMMM;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.tp2_mmm.BR;

public class ClientViewModel extends BaseObservable {

    private Client model;
    @Bindable
    public String getName(){
        return this.model.nom;
    }

    public void setName(String nom){
        this.model.nom = nom;

        notifyPropertyChanged(BR.name);
    }

}
