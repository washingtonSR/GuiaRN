package ufrn.tads.washington.guiarn;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ufrn.tads.washington.adapters.FixedTabsPageAdapter;

public class MainActivity extends FragmentActivity{
    TabLayout tabLayout;
    PagerAdapter pa;
    ViewPager vp;
    FragmentTransaction ft = getFragmentManager().beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.pager);
        pa = new FixedTabsPageAdapter(getSupportFragmentManager());
        vp.setAdapter(pa);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);
    }
}
