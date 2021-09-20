package com.example.tp1_mmm;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.tp1_mmm.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MainActivity m=(MainActivity)getActivity();
        m.setFirstFrag(this);

        binding.buttonValid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg=getResources().getString(R.string.validateMSG);
                List<View> l=getUserData();

                for(View e : l) {
                    EditText child = (EditText) e;
                    String s=child.getText().toString();
                    if(!s.equals("")){
                        msg+="\n      "+s;
                    }
                }
                Toast toast = Toast.makeText(getActivity().getApplicationContext(), msg, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    public List<View> getUserData(){
        List<View> res=new ArrayList<>();
        for(int i = 4; i < binding.userDataContainer.getChildCount(); i++) {
            res.add(binding.userDataContainer.getChildAt(i));
        }
        return res;
    }

    public void cleanDataUser(){
        List<View> l=getUserData();

        for(View e : l) {
            EditText child = (EditText) e;
            child.setText("");
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}