package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspi extends asqs {
    final /* synthetic */ aspj a;

    public aspi(aspj aspjVar) {
        this.a = aspjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asqs
    public final void a() {
        this.a.l(9);
        aspc aspcVar = this.a.b;
        synchronized (aspcVar) {
            long j = aspcVar.n;
            long j2 = aspcVar.m;
            if (j >= j2) {
                aspcVar.m = j2 + 1;
                aspcVar.p = System.nanoTime() + 1000000000;
                aspcVar.i.f(new asoz(String.valueOf(aspcVar.d).concat(" ping"), aspcVar));
            }
        }
    }

    public final void b() {
        if (!f()) {
        } else {
            throw new SocketTimeoutException("timeout");
        }
    }
}
