package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftm implements ftn {
    private final List a;
    private final fmq[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public ftm(List list) {
        this.a = list;
        this.b = new fmq[list.size()];
    }

    private final boolean f(euf eufVar, int i) {
        if (eufVar.b() == 0) {
            return false;
        }
        if (eufVar.j() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.ftn
    public final void a(euf eufVar) {
        if (this.c) {
            if (this.d != 2 || f(eufVar, 32)) {
                if (this.d != 1 || f(eufVar, 0)) {
                    int i = eufVar.b;
                    int b = eufVar.b();
                    for (fmq fmqVar : this.b) {
                        eufVar.J(i);
                        fmqVar.l(eufVar, b);
                    }
                    this.e += b;
                }
            }
        }
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        for (int i = 0; i < this.b.length; i++) {
            fvq fvqVar = (fvq) this.a.get(i);
            fuqVar.c();
            fmq p = flwVar.p(fuqVar.a(), 3);
            eqm eqmVar = new eqm();
            eqmVar.a = fuqVar.b();
            eqmVar.b("application/dvbsubs");
            eqmVar.p = Collections.singletonList(fvqVar.a);
            eqmVar.d = (String) fvqVar.b;
            p.h(new eqn(eqmVar));
            this.b[i] = p;
        }
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
        boolean z2;
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            dzg.d(z2);
            for (fmq fmqVar : this.b) {
                fmqVar.n(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
