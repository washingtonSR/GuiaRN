package ufrn.tads.washington.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import ufrn.tads.washington.adapters.BairroAdp;
import ufrn.tads.washington.guiarn.BairroSingleton;
import ufrn.tads.washington.guiarn.R;

/**
 * Created by Washington on 21/10/2016.
 */
public class Bairros extends Fragment implements AdapterView.OnItemClickListener{
    View v;
    private ListView bairros;
    static BairroSingleton singleton;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        v = inflater.inflate(R.layout.bairros, container, false);
        //logica do fragment
        bairros = (ListView) v.findViewById(R.id.listaBairros);
        bairros.setAdapter(new BairroAdp(getContext()));
        bairros.setOnItemClickListener(this);



        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        singleton.getInstace().setBairro((String) adapterView.getAdapter().getItem(i));
        //singleton.setBairro((String) adapterView.getAdapter().getItem(i));
        //selecionado = (String) adapterView.getAdapter().getItem(i);
        TextView titulo = (TextView) v.findViewById(R.id.bairrosTitulo);
        titulo.setText(singleton.getInstace().getBairro());
    }
    public int getIndice(){
        return 0;
    }
}
