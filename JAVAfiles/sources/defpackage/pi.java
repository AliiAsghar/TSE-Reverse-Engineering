package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class pi extends mz {
    final /* synthetic */ nz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(nz nzVar, Context context) {
        super(context);
        this.f = nzVar;
    }

    @Override // defpackage.mz
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.mz, defpackage.ok
    protected final void j(View view, oi oiVar) {
        nz nzVar = this.f;
        RecyclerView recyclerView = nzVar.a;
        if (recyclerView != null) {
            int[] c = nzVar.c(recyclerView.m, view);
            int i = c[0];
            int i2 = c[1];
            int d = d(Math.max(Math.abs(i), Math.abs(i2)));
            if (d > 0) {
                oiVar.b(i, i2, d, this.b);
            }
        }
    }
}
