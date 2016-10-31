package ufrn.tads.washington.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ufrn.tads.washington.fragments.Bairros;
import ufrn.tads.washington.fragments.Fotos;
import ufrn.tads.washington.fragments.Info;

/**
 * Created by Washington on 21/10/2016.
 */
public class FixedTabsPageAdapter extends FragmentPagerAdapter{

    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Bairros";
            case 1:
                return "Fotos";
            case 2:
                return "Informações";
            default:
                return null;
        }
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Bairros();
            case 1:
                return new Fotos();
            case 2:
                return new Info();
            default:
                return null;
        }
    }

//    public View getView(int position) {
//        if(position==0) {
//            return new Bairros().getView();
//        }else if(position==1){
//            return new Fotos().getView();
//        }else{
//            return new Info().getView();
//        }
//    }

    @Override
    public int getCount() {
        return 3;
    }
}
