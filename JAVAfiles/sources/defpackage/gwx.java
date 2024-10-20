package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwx extends gwq {
    public gwx(gxg gxgVar) {
        super(gxgVar);
    }

    @Override // defpackage.gwt
    public final boolean b(gys gysVar) {
        int i = gysVar.l.j;
        if (i == 3) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gwq
    public final int d() {
        return 7;
    }

    @Override // defpackage.gwq
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        gwm gwmVar = (gwm) obj;
        gwmVar.getClass();
        if (gwmVar.a && !gwmVar.c) {
            return false;
        }
        return true;
    }
}
