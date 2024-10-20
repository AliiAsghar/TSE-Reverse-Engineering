package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qja implements akgr {
    private static final akfc a = new akgc("ImmediateLocalDataSource");
    private final Object b;

    public qja(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ akfd a() {
        return a;
    }

    @Override // defpackage.akgr
    public final ListenableFuture b() {
        akul ag = aktp.ag(this.b);
        ag.getClass();
        return ag;
    }
}
