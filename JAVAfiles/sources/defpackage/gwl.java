package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwl implements gwt {
    public final ConnectivityManager a;
    public final long b;

    public gwl(ConnectivityManager connectivityManager, long j) {
        this.a = connectivityManager;
        this.b = j;
    }

    @Override // defpackage.gwt
    public final asai a(gsf gsfVar) {
        gsfVar.getClass();
        return new asac(new gwk(gsfVar, this, (arpe) null, 0));
    }

    @Override // defpackage.gwt
    public final boolean b(gys gysVar) {
        if (gysVar.l.a() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gwt
    public final boolean c(gys gysVar) {
        if (!b(gysVar)) {
            return false;
        }
        throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
    }
}
