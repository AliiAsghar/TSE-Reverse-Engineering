package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frm implements flw {
    private final flw a;
    private final frj b;
    private final SparseArray c = new SparseArray();

    public frm(flw flwVar, frj frjVar) {
        this.a = flwVar;
        this.b = frjVar;
    }

    @Override // defpackage.flw
    public final fmq p(int i, int i2) {
        if (i2 != 3) {
            return this.a.p(i, i2);
        }
        fro froVar = (fro) this.c.get(i);
        if (froVar != null) {
            return froVar;
        }
        fro froVar2 = new fro(this.a.p(i, 3), this.b);
        this.c.put(i, froVar2);
        return froVar2;
    }

    @Override // defpackage.flw
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.flw
    public final void w(fmk fmkVar) {
        this.a.w(fmkVar);
    }
}
