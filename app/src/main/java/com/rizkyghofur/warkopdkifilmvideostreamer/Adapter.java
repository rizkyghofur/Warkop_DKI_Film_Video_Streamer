package com.rizkyghofur.warkopdkifilmvideostreamer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private Context mContext;
    private List<Data> ListFilm;

    Adapter(Context mContext, List<Data> ListFilm) {
        this.mContext = mContext;
        this.ListFilm = ListFilm;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row_item, parent, false);
        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mImage.setImageResource(ListFilm.get(position).getAlbum());
        holder.mTitle.setText(ListFilm.get(position).getNamafilm());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, Detail.class);
                mIntent.putExtra("Judul", ListFilm.get(holder.getAdapterPosition()).getNamafilm());
                mIntent.putExtra("Deskripsi", ListFilm.get(holder.getAdapterPosition()).getDeskripsifilm());
                mIntent.putExtra("Gambar", ListFilm.get(holder.getAdapterPosition()).getAlbum());
                mIntent.putExtra("Key", ListFilm.get(holder.getAdapterPosition()).getKey());
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ListFilm.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    CardView mCardView;

    ViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}
