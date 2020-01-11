package ua.at.fvi.remindme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ua.at.fvi.remindme.adapter.TabsPagerFragmentAdapter;

public class MainActivity extends AppCompatActivity {

private static final int LAYOUT=R.layout.activity_main;

private Toolbar toolbar;
private DrawerLayout drawerLayout;
private TabLayout tabLayout;
private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //default theme settings in styles.xml
        setTheme(R.style.AppDefault);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
        initTabs();



    }

    private void initTabs() {
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        TabsPagerFragmentAdapter adapter = new TabsPagerFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout =(TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void initNavigationView() {
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

    }

    private void initToolbar() {
        toolbar =(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.menu);

    }
}
