package fr.alainmuller.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<DataItem> data;

    public MyAdapter(List<DataItem> data) {
        this.data = data;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        // TODO : check NPE
        final DataItem item = data.get(position);
        holder.bindView(item.getItemTitle());
    }

    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0;
    }
}
