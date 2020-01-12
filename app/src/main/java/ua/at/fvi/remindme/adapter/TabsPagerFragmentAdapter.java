package ua.at.fvi.remindme.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ua.at.fvi.remindme.fragment.tabs.AbstractTabFragment;
import ua.at.fvi.remindme.fragment.tabs.BirthdayFragment;
import ua.at.fvi.remindme.fragment.tabs.HistoryFragment;
import ua.at.fvi.remindme.fragment.tabs.IdeasFragment;
import ua.at.fvi.remindme.fragment.tabs.TodoFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3,BirthdayFragment.getInstance(context));
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
