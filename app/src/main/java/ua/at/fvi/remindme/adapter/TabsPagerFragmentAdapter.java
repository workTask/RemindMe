package ua.at.fvi.remindme.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ua.at.fvi.remindme.fragment.tabs.ExampleFragmentTabs;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs =new String[]{"Tab 1", "Нагадування","Tab 3"};
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragmentTabs.getInstance();
            case 1:
                return ExampleFragmentTabs.getInstance();
            case 2:
                return ExampleFragmentTabs.getInstance();
        }

        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
