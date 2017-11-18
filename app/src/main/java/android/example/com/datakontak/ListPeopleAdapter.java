package android.example.com.datakontak;

import android.content.Context;
import android.example.com.datakontak.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Muriyu on 18/11/2017.
 */

public class ListPeopleAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> people = new ArrayList<String>();
    private TextView tv_people;

    public ListPeopleAdapter(Context context, ArrayList<String> people) {
        this.context = context;
        this.people = people;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return people.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemPeople = View.inflate(context, R.layout.list_people,null);
        tv_people = (TextView) itemPeople.findViewById(R.id.tv_people);
        tv_people.setText(people.get(position));
        return itemPeople;
    }
}
