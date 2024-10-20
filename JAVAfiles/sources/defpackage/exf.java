package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class exf implements ezb {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ exf(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.ezb
    public final void a() {
        int i = this.c;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                exo exoVar = (exo) this.b;
                if (exoVar.k != null) {
                    z = true;
                }
                dzg.d(z);
                while (true) {
                    anna annaVar = exoVar.t;
                    if (annaVar.j() < annaVar.a) {
                        if (exoVar.i.a() <= this.a) {
                            exoVar.t.o();
                            exoVar.i.b();
                            ett.p(exoVar.j.b());
                            exoVar.n.d();
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                ((exc) this.b).e(this.a);
            }
        } else {
            exi exiVar = (exi) this.b;
            exo exoVar2 = exiVar.g;
            exoVar2.f.g();
            if (exoVar2.k == null) {
                long j = this.a;
                eqp eqpVar = exiVar.a;
                dzg.d(!exoVar2.l);
                Pair pair = (Pair) exoVar2.h.remove();
                exoVar2.a(eqpVar, (eqq) pair.first, ((Long) pair.second).longValue(), j);
                if (exoVar2.h.isEmpty() && exoVar2.m) {
                    gop gopVar = exoVar2.s;
                    dzg.g(gopVar);
                    gopVar.a();
                    exoVar2.m = false;
                }
            }
        }
    }
}
