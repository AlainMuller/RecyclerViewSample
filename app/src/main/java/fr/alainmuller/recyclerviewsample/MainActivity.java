package fr.alainmuller.recyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        setupData();

        // let the magic operate ;)
        recyclerView.setAdapter(adapter);
    }

    private void setupData() {
        // generate fake data
        final List<DataItem> items = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            items.add(new DataItem("Item " + i));
        }

        // set data to adapter
        adapter = new MyAdapter(items);
    }
}
