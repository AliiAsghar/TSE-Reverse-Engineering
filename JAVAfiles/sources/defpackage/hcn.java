package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcn implements hcr, hbz {
    public final hcw a;
    public hfp b;
    private final hbl c;

    public hcn(hbl hblVar, hfw hfwVar, hfo hfoVar) {
        this.c = hblVar;
        hcw a = hfoVar.a.a();
        this.a = a;
        hfwVar.i(a);
        a.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.hcr
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hbz
    public final String g() {
        throw null;
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
    }
}
