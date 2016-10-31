package ufrn.tads.washington.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ufrn.tads.washington.guiarn.R;

/**
 * Created by Washington on 21/10/2016.
 */
public class Fotos extends Fragment {
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        View view = inflater.inflate(R.layout.fotos, container, false);
        //logica do fragment
        return view;
    }
}
