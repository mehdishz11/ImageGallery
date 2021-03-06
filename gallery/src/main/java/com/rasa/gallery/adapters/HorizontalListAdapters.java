package com.rasa.gallery.adapters;

import android.app.Activity;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.rasa.gallery.HorizontalImageViewHolder;
import com.rasa.gallery.OnImgClick;
import com.rasa.gallery.R;
import com.rasa.gallery.entities.PictureModel;

import java.util.ArrayList;

/**
 * Created by mohamedzakaria on 8/12/16.
 */
public class HorizontalListAdapters extends RecyclerView.Adapter<HorizontalImageViewHolder> {
    ArrayList<PictureModel> pictureModel;
    Activity activity;
    int selectedItem = -1;
    OnImgClick imgClick;

    public HorizontalListAdapters(Activity activity, ArrayList<PictureModel> images, OnImgClick imgClick) {
        this.activity = activity;
        this.pictureModel = images;
        this.imgClick = imgClick;
    }

    @Override
    public HorizontalImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HorizontalImageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.z_item_image_horizontal, null));
    }

    @Override
    public void onBindViewHolder(HorizontalImageViewHolder holder, final int position) {
        Glide.with(activity).load(pictureModel.get(position).getImageUrl()).into(holder.image);
        ColorMatrix matrix = new ColorMatrix();
        if (selectedItem != position) {
            matrix.setSaturation(0);

            ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
            holder.image.setColorFilter(filter);
            holder.image.setAlpha(0.5f);
        } else {
            matrix.setSaturation(1);

            ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
            holder.image.setColorFilter(filter);
            holder.image.setAlpha(1f);
        }

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pictureModel.size();
    }

    public void setSelectedItem(int position) {
        selectedItem = position;
        notifyDataSetChanged();
    }
}
