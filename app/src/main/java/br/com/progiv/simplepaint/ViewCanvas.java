package br.com.progiv.simplepaint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ViewCanvas extends View {

    private Path path;
    private Bitmap bitmap;
    private Canvas canvas;
    private float fixoX, fixoY;
    private int TOLERANCIA_MOVIMENTO = 5;

    public ViewCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
