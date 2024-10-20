package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mzp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        if (this.b != 0) {
            cg cgVar = ((itb) this.a).f;
            if (cgVar == null) {
                return -1;
            }
            Context x = cgVar.x();
            x.getClass();
            return Integer.valueOf(x.getResources().getDisplayMetrics().heightPixels);
        }
        miz mizVar = (miz) obj;
        return ((mzs) this.a).a.A(mizVar.b(), mizVar.h());
    }
}
