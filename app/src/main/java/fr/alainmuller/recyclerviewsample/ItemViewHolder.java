package fr.alainmuller.recyclerviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private Context context;

    private TextView titleView;
    private ListView listView;

    public ItemViewHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        titleView = (TextView) itemView.findViewById(R.id.item_title);
        listView = (ListView) itemView.findViewById(R.id.item_list);
    }

    public void bindView(final String title /*, final List<String> data */) {
        titleView.setText(title);
        // TODO DLE: libre à toi de  créer (ou réutiliser l'existant) une classe CustomAdapter pour redéfinir les données à afficher dans la listView ;)
        listView.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, genFakeData(title)));
    }

    private List<String> genFakeData(String base) {
        final List<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(base + " col " + i);
        }
        return data;
    }
}
