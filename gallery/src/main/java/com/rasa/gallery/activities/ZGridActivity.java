package com.rasa.gallery.activities;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.rasa.gallery.Constants;
import com.rasa.gallery.R;
import com.rasa.gallery.ZGallery;
import com.rasa.gallery.adapters.GridImagesAdapter;
import com.rasa.gallery.adapters.listeners.GridClickListener;
import com.rasa.gallery.entities.ZColor;

/**
 * Created by mohamedzakaria on 8/6/16.
 */
public final class ZGridActivity extends BaseActivity implements GridClickListener {
    private RecyclerView mRecyclerView;
    private GridImagesAdapter adapter;

    private int imgPlaceHolderResId;
    private int spanCount = 2;

    @Override
    protected int getResourceLayoutId() {
        return R.layout.z_activity_grid;
    }

    @Override
    protected void afterInflation() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // get extra values
        imgPlaceHolderResId = getIntent().getIntExtra(Constants.IntentPassingParams.IMG_PLACEHOLDER, -1);
        spanCount = getIntent().getIntExtra(Constants.IntentPassingParams.COUNT, 2);

        adapter = new GridImagesAdapter(this, imageURLs, imgPlaceHolderResId);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, spanCount));
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(int pos) {
        ZGallery.with(this, imageURLs)
                .setToolbarTitleColor(ZColor.WHITE)
                .setToolbarColorResId(toolbarColorResId)
                .setSelectedImgPosition(pos)
                .setTitle(mToolbar.getTitle().toString())
                .show();
    }
}
