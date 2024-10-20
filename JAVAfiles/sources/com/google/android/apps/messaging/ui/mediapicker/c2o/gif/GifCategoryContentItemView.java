package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.aaqf;
import defpackage.aaqi;
import defpackage.aarv;
import defpackage.aaub;
import defpackage.zmr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GifCategoryContentItemView extends aaub implements aaqi {
    public aaqf a;
    public zmr b;

    public GifCategoryContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aaqi
    public final int a() {
        return 1;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.a = aaqfVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this.b.a(new aarv(this, 9)));
        setClipToOutline(true);
    }
}
