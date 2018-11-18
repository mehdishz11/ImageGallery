package com.rasa.imagegallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rasa.gallery.ZGallery;
import com.rasa.gallery.entities.PictureModel;
import com.rasa.gallery.entities.ZColor;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PictureModel> arrayList=new ArrayList<>();
        PictureModel pictureModel1=new PictureModel();
        pictureModel1.setImageUrl("https://www.ensearch.org/wp-content/uploads/2016/11/nGcPaoo.jpg");
        pictureModel1.setTextTitle("عکس شماره ۱");

        PictureModel pictureModel2=new PictureModel();
        pictureModel2.setImageUrl("https://cdn.guidingtech.com/media/assets/WordPress-Import/2017/06/img-14.jpg");
        pictureModel2.setTextTitle("عکس شماره ۲");

        arrayList.add(pictureModel1);
        arrayList.add(pictureModel2);

        ZGallery.with(this,arrayList /*your string arraylist of image urls*/)
                .setToolbarTitleColor(ZColor.WHITE) // toolbar title color
                .setGalleryBackgroundColor(ZColor.WHITE) // activity background color
                .setToolbarColorResId(R.color.colorPrimary) // toolbar color
                .setTitle("Zak Gallery") // toolbar title
                .show();
    }
}
