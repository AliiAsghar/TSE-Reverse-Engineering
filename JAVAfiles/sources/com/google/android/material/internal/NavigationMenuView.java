package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.ij;
import defpackage.ix;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NavigationMenuView extends RecyclerView implements ix {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aj(new LinearLayoutManager(1));
    }

    @Override // defpackage.ix
    public final void a(ij ijVar) {
    }
}
