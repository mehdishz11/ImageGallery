package com.rasa.gallery.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by AMiR Ehsan on 4/11/2017 AD.
 */

public class RGalleryCustomTextViewBold extends android.support.v7.widget.AppCompatTextView {
    public RGalleryCustomTextViewBold(Context context) {
        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansBold.ttf");
        this.setTypeface(face);
    }

    public RGalleryCustomTextViewBold(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansBold.ttf");
        this.setTypeface(face);
    }

    public RGalleryCustomTextViewBold(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansBold.ttf");
        this.setTypeface(face);
    }

}
