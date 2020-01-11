package ua.at.fvi.remindme.fragment.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.at.fvi.remindme.R;

public class ExampleFragmentTabs extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example_tabs;
    private View view;

    public static ExampleFragmentTabs getInstance() {
        Bundle args = new Bundle();
        ExampleFragmentTabs fr = new ExampleFragmentTabs();
        fr.setArguments(args);
        return fr;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container,false);

        return view;
    }
}
