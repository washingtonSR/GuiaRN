package ufrn.tads.washington.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import ufrn.tads.washington.guiarn.R;

/**
 * Created by Washington on 21/10/2016.
 */
public class BairroAdp extends BaseAdapter {
    private String[] bairros = new String [] {
            "Jardim Planalto", "Vale do Sol", "Jardim Primavera",
            "Centro", "Jockey Clube", "Vida Nova", "Bela Vista"
    };
    private Context context;

    public BairroAdp(Context context){
        super();
        this.context=context;
    }

    @Override
    public int getCount() {
        return bairros.length;
    }

    @Override
    public Object getItem(int position) {
        return bairros[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        String bairroEscolhido = bairros[position];

        LayoutInflater textInflater = LayoutInflater.from(context);
        TextView tv = (TextView) textInflater.inflate(R.layout.elemento_bairro, viewGroup, false);
        tv.setText(bairroEscolhido);
        return tv;
    }
    //Getters and Setters
    public String[] getBairros() {
        return bairros;
    }

    public void setBairros(String[] bairros) {
        this.bairros = bairros;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
