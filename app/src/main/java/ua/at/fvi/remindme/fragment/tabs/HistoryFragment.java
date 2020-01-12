package ua.at.fvi.remindme.fragment.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.at.fvi.remindme.R;

public class HistoryFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_history;


    public static HistoryFragment getInstance(Context  context) {
        Bundle args = new Bundle();
        HistoryFragment fr = new HistoryFragment();
        fr.setArguments(args);
        fr.setContext(context);
        fr.setTitle(context.getString(R.string.tab_item_history));
        return fr;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container,false);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}

