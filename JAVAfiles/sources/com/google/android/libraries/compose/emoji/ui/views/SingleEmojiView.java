package com.google.android.libraries.compose.emoji.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.aflo;
import defpackage.aflw;
import defpackage.afpx;
import defpackage.afpy;
import defpackage.aqil;
import defpackage.ekb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleEmojiView extends afpy<aflw> {
    private static final aflo j = new aflo("");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // defpackage.afpx
    public final /* bridge */ /* synthetic */ CharSequence a(Object obj) {
        ((aflw) obj).getClass();
        return ((aflw) c()).a();
    }

    @Override // defpackage.afpx
    public final /* synthetic */ Object b() {
        return j;
    }

    @Override // defpackage.afpx
    public final void d(Canvas canvas, ekb[] ekbVarArr) {
        afpx.g(this, canvas, (ekb) aqil.l(ekbVarArr), ((aflw) c()).a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
