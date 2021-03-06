package nl.vu.cs.s2group.android_prefetching_2018;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import nl.vu.cs.s2group.android_prefetching_2018.network.OkHttpProvider;
import nl.vu.cs.s2group.android_prefetching_2018.stats.ListActivityActivity;
import nl.vu.cs.s2group.android_prefetching_2018.stats.SessionDataActivity;
import nl.vu.cs.s2group.android_prefetching_2018.stats.StatsActivity;
import nl.vu.cs.s2group.PrefetchingLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        PrefetchingLib.setCurrentActivity(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PrefetchingLib.init(this,9);
        OkHttpProvider.getInstance();

        setContentView(R.layout.activity_main);

        Button newsButton = findViewById(R.id.button_news);

        Button weatherButton = findViewById(R.id.button_weather);

        newsButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, NewsActivity.class);
            startActivity(intent);
        });

        Button interButton = findViewById(R.id.button_inter);

        interButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, InterActivity.class);
            startActivity(intent);
        });

        weatherButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, CapitalListActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.stats_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_stats_activity: {
                Intent intent = new Intent(this, StatsActivity.class);
                startActivity(intent);
                return true;
            }

            case R.id.menu_graph_activity: {
                Intent intent = new Intent(this, GraphActivity.class);
                startActivity(intent);
                return true;
            }

            case R.id.menu_list_activity: {
                Intent intent = new Intent(this, ListActivityActivity.class);
                startActivity(intent);
                return true;
            }

            case R.id.menu_list_session: {
                Intent intent = new Intent(this, SessionDataActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
