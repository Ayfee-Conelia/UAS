package com.example.uas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class faceview extends View {
    public faceview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //gambar1
        Paint green = new Paint();
        green.setARGB(255,0,255,0);
        green.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(new RectF(250,250,550,550),green);


    }
}
