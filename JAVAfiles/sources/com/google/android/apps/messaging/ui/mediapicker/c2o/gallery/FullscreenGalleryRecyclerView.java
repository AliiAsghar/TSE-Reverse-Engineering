package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.aaqp;
import defpackage.oo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FullscreenGalleryRecyclerView extends RecyclerView implements aaqp {
    public GridLayoutManager ab;
    public int ac;
    private final int ad;
    private final int ae;

    public FullscreenGalleryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ac = 1;
        this.ad = context.getResources().getDimensionPixelSize(R.dimen.full_screen_recycler_view_padding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.columnWidth});
        this.ae = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ae > 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.ad;
            int max = Math.max(1, (size - (i3 + i3)) / this.ae);
            this.ac = max;
            this.ab.r(max);
        }
    }

    @Override // defpackage.aaqp
    public final List t() {
        int L = this.ab.L();
        int N = this.ab.N();
        ArrayList arrayList = new ArrayList();
        if (L >= 0) {
            while (L <= N) {
                oo h = h(L);
                if (h != null) {
                    arrayList.add(h.a);
                }
                L++;
            }
        }
        return arrayList;
    }

    @Override // defpackage.aaqp
    public final void u(int i, int i2) {
    }
}
