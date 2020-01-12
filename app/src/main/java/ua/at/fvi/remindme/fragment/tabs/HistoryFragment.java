package ua.at.fvi.remindme.fragment.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ua.at.fvi.remindme.R;
import ua.at.fvi.remindme.adapter.RemindListAdapter;
import ua.at.fvi.remindme.dto.RemindDTO;

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

        RecyclerView rv= (RecyclerView)view.findViewById(R.id.recyclerView_history);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createRemindListData()));
        return view;
    }
    private List<RemindDTO> createRemindListData(){
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}

