package nl.vu.cs.s2group.android_prefetching_2018.cardview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nl.vu.cs.s2group.android_prefetching_2018.R;
import nl.vu.cs.s2group.android_prefetching_2018.data.News;

public class NewsCardViewAdapter extends RecyclerView.Adapter<NewsCardViewAdapter.NewsViewHolder> {

    public List<News> newsList = new ArrayList<News>();

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_news, parent, false);
        return new NewsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.title.setText(news.title);
        holder.description.setText(news.description);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;

        NewsViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_title);
            description = itemView.findViewById(R.id.text_description);
        }
    }
}
