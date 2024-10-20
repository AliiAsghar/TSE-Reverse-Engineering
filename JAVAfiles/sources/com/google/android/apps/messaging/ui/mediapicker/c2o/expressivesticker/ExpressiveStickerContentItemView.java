package com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.aari;
import defpackage.aksr;
import defpackage.akwb;
import defpackage.zmr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpressiveStickerContentItemView extends aari {
    public aksr a;
    public zmr b;

    public ExpressiveStickerContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, defpackage.aaqi
    public final int a() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new akwb(this.a, "ExpressiveStickerContentItemView::onClick", this.b.a(this.n), 1));
    }
}
