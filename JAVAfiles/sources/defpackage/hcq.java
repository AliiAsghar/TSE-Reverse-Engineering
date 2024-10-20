package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcq implements hbz, hcr {
    public final boolean a;
    public final hcw b;
    public final hcw c;
    public final hcw d;
    public final int e;
    private final List f = new ArrayList();

    public hcq(hfw hfwVar, hfu hfuVar) {
        this.a = hfuVar.d;
        this.e = hfuVar.e;
        hcw a = hfuVar.a.a();
        this.b = a;
        hcw a2 = hfuVar.b.a();
        this.c = a2;
        hcw a3 = hfuVar.c.a();
        this.d = a3;
        hfwVar.i(a);
        hfwVar.i(a2);
        hfwVar.i(a3);
        a.h(this);
        a2.h(this);
        a3.h(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(hcr hcrVar) {
        this.f.add(hcrVar);
    }

    @Override // defpackage.hcr
    public final void d() {
        for (int i = 0; i < this.f.size(); i++) {
            ((hcr) this.f.get(i)).d();
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        throw null;
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
    }
}
