package br.senac.es.helpdesk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class TabsActivity extends AppCompatActivity {

    private TabAdapter tabadapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        viewPager =(ViewPager) findViewById(R.id.viePager);
        tabLayout=(TabLayout) findViewById(R.id.tabLayout);



        tabadapter = new TabAdapter( getSupportFragmentManager());
        tabadapter.addFragment( new Tab1Fragment() , "Abertos");
        tabadapter.addFragment( new Tab2Fragment(), "Fechados");

        viewPager.setAdapter(tabadapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
