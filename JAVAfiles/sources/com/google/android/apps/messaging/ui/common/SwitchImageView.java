package com.google.android.apps.messaging.ui.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.SparseArray;
import defpackage.zng;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchImageView extends AppCompatImageView {
    private final SparseArray a;

    public SwitchImageView(Context context) {
        super(context);
        this.a = new SparseArray();
        b(-1);
    }

    private final void b(int i) {
        LayerDrawable layerDrawable;
        if (i != -1) {
            zng zngVar = new zng(getContentDescription());
            if (this.a.get(i) == null) {
                this.a.put(i, zngVar);
                Drawable mutate = getContext().getResources().getDrawable(i, getContext().getTheme()).mutate();
                mutate.setAlpha(0);
                if (getDrawable() instanceof LayerDrawable) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) getDrawable();
                    int numberOfLayers = layerDrawable2.getNumberOfLayers();
                    Drawable[] drawableArr = new Drawable[numberOfLayers + 1];
                    int[] iArr = new int[numberOfLayers];
                    for (int i2 = 0; i2 < numberOfLayers; i2++) {
                        drawableArr[i2] = layerDrawable2.getDrawable(i2);
                        iArr[i2] = layerDrawable2.getId(i2);
                    }
                    drawableArr[numberOfLayers] = mutate;
                    layerDrawable = new LayerDrawable(drawableArr);
                    for (int i3 = 0; i3 < numberOfLayers; i3++) {
                        layerDrawable.setId(i3, iArr[i3]);
                    }
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{mutate});
                }
                layerDrawable.setId(layerDrawable.getNumberOfLayers() - 1, i);
                setImageDrawable(layerDrawable);
                if (this.a.size() == 1) {
                    a(i);
                }
            }
            a(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    public final void a(int i) {
        int i2;
        if (this.a.get(i) != null) {
            for (int i3 = 0; i3 < ((LayerDrawable) getDrawable()).getNumberOfLayers(); i3++) {
                int id = ((LayerDrawable) getDrawable()).getId(i3);
                Drawable drawable = ((LayerDrawable) getDrawable()).getDrawable(i3);
                if (id == i) {
                    i2 = 255;
                } else {
                    i2 = 0;
                }
                drawable.setAlpha(i2);
            }
            zng zngVar = (zng) this.a.get(i);
            if (zngVar != null) {
                setOnClickListener(null);
                setContentDescription(zngVar.a);
                setVisibility(0);
            }
        }
    }

    public SwitchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", -1));
    }
}
