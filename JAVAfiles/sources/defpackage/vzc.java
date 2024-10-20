package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzc implements pss {
    public final vzh a;
    private final vyw b;
    private final vzg c;
    private final vyh d;
    private final anen e;
    private final vyh f;
    private final vyh g;
    private final vyh h;
    private final vyh i;
    private final vyh j;
    private final wpp k;
    private final znj l;
    private final znj m;
    private final znj n;
    private final znj o;
    private final znj p;
    private final znj q;

    public vzc(vyw vywVar, vyh vyhVar, znj znjVar, vzg vzgVar, wpp wppVar, vyh vyhVar2, znj znjVar2, vyh vyhVar3, znj znjVar3, vyh vyhVar4, znj znjVar4, vyh vyhVar5, znj znjVar5, vyh vyhVar6, znj znjVar6, vzh vzhVar, anen anenVar) {
        this.b = vywVar;
        this.f = vyhVar;
        this.n = znjVar;
        this.c = vzgVar;
        this.k = wppVar;
        this.g = vyhVar2;
        this.q = znjVar2;
        this.h = vyhVar4;
        this.o = znjVar4;
        this.d = vyhVar3;
        this.p = znjVar3;
        this.i = vyhVar5;
        this.l = znjVar5;
        this.j = vyhVar6;
        this.m = znjVar6;
        this.a = vzhVar;
        this.e = anenVar;
    }

    @Override // defpackage.pss
    public final akul a(qec qecVar) {
        if (this.b.a()) {
            return ((wej) this.q.a).a(qecVar);
        }
        return this.g.a.a(qecVar);
    }

    @Override // defpackage.pss
    public final akul b(qen qenVar) {
        if (this.b.a()) {
            return ((wej) this.p.a).a(qenVar);
        }
        return this.d.a.a(qenVar);
    }

    @Override // defpackage.pss
    public final akul c(qfy qfyVar) {
        if (this.b.a()) {
            return ((wej) this.o.b).a(qfyVar);
        }
        return this.h.a.a(qfyVar);
    }

    @Override // defpackage.pss
    public final akul d(qgb qgbVar) {
        if (this.b.a()) {
            return ((wej) this.n.b).a(qgbVar);
        }
        return this.f.a.a(qgbVar);
    }

    @Override // defpackage.pss
    public final akul e(qgf qgfVar) {
        akul a;
        rve a2 = rve.a(qgfVar.f);
        if (((Boolean) ((utz) vzh.b.get()).e()).booleanValue()) {
            vzh vzhVar = this.a;
            qgr qgrVar = qgfVar.l;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            vzhVar.b(qgrVar, a2);
        }
        if (this.b.a()) {
            a = ((wej) this.k.b).a(qgfVar);
        } else {
            a = this.c.a.a(qgfVar);
        }
        return a.h(new tul((Object) this, (Object) qgfVar, a2, 18), this.e);
    }

    @Override // defpackage.pss
    public final akul f(qgt qgtVar) {
        if (this.b.a()) {
            return ((wej) this.m.b).a(qgtVar);
        }
        return this.j.a.a(qgtVar);
    }

    @Override // defpackage.pss
    public final akul g(qgw qgwVar) {
        if (this.b.a()) {
            return ((wej) this.l.b).a(qgwVar);
        }
        return this.i.a.a(qgwVar);
    }
}
