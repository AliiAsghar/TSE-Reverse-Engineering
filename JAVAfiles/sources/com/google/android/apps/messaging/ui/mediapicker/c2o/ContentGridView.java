package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.aape;
import defpackage.nw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContentGridView extends RecyclerView {
    public int ab;
    public aape ac;

    public ContentGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i, int i2) {
        nw nwVar = this.m;
        if (!(nwVar instanceof LinearLayoutManager)) {
            return;
        }
        ((LinearLayoutManager) nwVar).ad(i, i2);
    }

    public final void aN(int i) {
        this.ab = i;
        aape aapeVar = this.ac;
        if (aapeVar != null) {
            aapeVar.m();
        }
    }
}
