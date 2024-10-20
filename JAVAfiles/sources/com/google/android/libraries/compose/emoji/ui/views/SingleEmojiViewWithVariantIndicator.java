package com.google.android.libraries.compose.emoji.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import defpackage.aflo;
import defpackage.afmz;
import defpackage.afpt;
import defpackage.afpx;
import defpackage.afpz;
import defpackage.aqil;
import defpackage.ekb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleEmojiViewWithVariantIndicator extends afpz<afpt> {
    public static final afpt j;

    static {
        aflo afloVar = new aflo("");
        j = new afpt(afloVar, new afmz(afloVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiViewWithVariantIndicator(Context context) {
        super(context);
        context.getClass();
    }

    @Override // defpackage.afpx
    public final /* bridge */ /* synthetic */ CharSequence a(Object obj) {
        ((afpt) obj).getClass();
        return ((afpt) c()).a.a();
    }

    @Override // defpackage.afpx
    public final /* synthetic */ Object b() {
        return j;
    }

    @Override // defpackage.afpx
    public final void d(Canvas canvas, ekb[] ekbVarArr) {
        afpx.g(this, canvas, (ekb) aqil.l(ekbVarArr), ((afpt) c()).a.a());
        if (!((afpt) c()).b.i().isEmpty()) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawPath((Path) afpx.d.a(Integer.valueOf(((Number) this.i.a()).intValue()), Integer.valueOf(width), Integer.valueOf(height)), (Paint) this.h.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiViewWithVariantIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
