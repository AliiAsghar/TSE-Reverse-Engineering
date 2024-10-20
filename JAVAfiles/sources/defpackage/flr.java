package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flr implements fmq {
    private final byte[] a = new byte[4096];

    @Override // defpackage.fmq
    public final /* synthetic */ int d(eqe eqeVar, int i, boolean z) {
        return dxt.C(this, eqeVar, i, z);
    }

    @Override // defpackage.fmq
    public final /* synthetic */ void l(euf eufVar, int i) {
        dxt.D(this, eufVar, i);
    }

    @Override // defpackage.fmq
    public final void m(euf eufVar, int i, int i2) {
        eufVar.K(i);
    }

    @Override // defpackage.fmq
    public final int u(eqe eqeVar, int i, boolean z) {
        int a = eqeVar.a(this.a, 0, Math.min(4096, i));
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return a;
    }

    @Override // defpackage.fmq
    public final void h(eqn eqnVar) {
    }

    @Override // defpackage.fmq
    public final void n(long j, int i, int i2, int i3, fmp fmpVar) {
    }
}
