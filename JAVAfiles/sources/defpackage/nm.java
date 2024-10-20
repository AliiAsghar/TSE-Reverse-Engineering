package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nm extends mz {
    final /* synthetic */ nn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(nn nnVar, Context context) {
        super(context);
        this.f = nnVar;
    }

    @Override // defpackage.mz
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mz
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.mz, defpackage.ok
    protected final void j(View view, oi oiVar) {
        nn nnVar = this.f;
        int[] c = nnVar.c(nnVar.a.m, view);
        int i = c[0];
        int i2 = c[1];
        int d = d(Math.max(Math.abs(i), Math.abs(i2)));
        if (d > 0) {
            oiVar.b(i, i2, d, this.b);
        }
    }
}
