package com.google.android.apps.messaging.home.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.arrr;
import defpackage.arsc;
import defpackage.arsn;
import defpackage.artm;
import defpackage.edz;
import defpackage.lbd;
import defpackage.lbe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StatusBarScrimView extends View {
    public static final /* synthetic */ artm[] a;
    public final arsn b;

    static {
        arrr arrrVar = new arrr(StatusBarScrimView.class, "topInset", "getTopInset()I", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarScrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = new lbe(0, this);
        edz.k(this, new lbd(this, 0));
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((Number) this.b.c(a[0])).intValue(), 1073741824));
    }
}
