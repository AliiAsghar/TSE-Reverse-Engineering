package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wak extends vzr {
    private final armf a;
    private final armf b;

    public wak(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.b = armfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vzr
    /* renamed from: a */
    public final qey apply(wct wctVar) {
        boolean z;
        wbw wbwVar;
        wbw wbwVar2;
        wbw wbwVar3;
        wbw wbwVar4;
        wcx wcxVar;
        wcx wcxVar2;
        wcx wcxVar3;
        if (wctVar.c == 3) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Unexpected missing groupEvent");
        if (wctVar.c == 3) {
            wbwVar = (wbw) wctVar.d;
        } else {
            wbwVar = wbw.a;
        }
        d.t(!wbwVar.b.isEmpty(), "Unexpected empty changedMember");
        aozy createBuilder = qey.c.createBuilder();
        wbk wbkVar = wctVar.e;
        if (wbkVar == null) {
            wbkVar = wbk.a;
        }
        wcy wcyVar = wbkVar.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str = wcyVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar = (qey) createBuilder.b;
        str.getClass();
        qeyVar.d |= 1;
        qeyVar.e = str;
        psq psqVar = (psq) this.a.b();
        if (wctVar.c == 3) {
            wbwVar2 = (wbw) wctVar.d;
        } else {
            wbwVar2 = wbw.a;
        }
        for (wbz wbzVar : wbwVar2.b) {
            int i = wbzVar.g;
            wby b = wby.b(i);
            if (b == null) {
                b = wby.UNKNOWN_TYPE;
            }
            if (b != wby.PRESENT) {
                wby b2 = wby.b(i);
                if (b2 == null) {
                    b2 = wby.UNKNOWN_TYPE;
                }
                if (b2 == wby.PENDING) {
                }
            }
            wcz wczVar = wbzVar.d;
            if (wczVar == null) {
                wczVar = wcz.a;
            }
            if (wczVar.b == 1) {
                wcxVar3 = (wcx) wczVar.c;
            } else {
                wcxVar3 = wcx.a;
            }
            createBuilder.C(psqVar.a(wcxVar3.c, false));
        }
        psq psqVar2 = (psq) this.a.b();
        if (wctVar.c == 3) {
            wbwVar3 = (wbw) wctVar.d;
        } else {
            wbwVar3 = wbw.a;
        }
        for (wbz wbzVar2 : wbwVar3.b) {
            wby b3 = wby.b(wbzVar2.g);
            if (b3 == null) {
                b3 = wby.UNKNOWN_TYPE;
            }
            if (b3 == wby.ABSENT) {
                wcz wczVar2 = wbzVar2.d;
                if (wczVar2 == null) {
                    wczVar2 = wcz.a;
                }
                if (wczVar2.b == 1) {
                    wcxVar2 = (wcx) wczVar2.c;
                } else {
                    wcxVar2 = wcx.a;
                }
                createBuilder.D(psqVar2.a(wcxVar2.c, false));
            }
        }
        aozy createBuilder2 = qfm.a.createBuilder();
        psq psqVar3 = (psq) this.a.b();
        if (wctVar.c == 3) {
            wbwVar4 = (wbw) wctVar.d;
        } else {
            wbwVar4 = wbw.a;
        }
        wcz wczVar3 = ((wbz) wbwVar4.b.get(0)).e;
        if (wczVar3 == null) {
            wczVar3 = wcz.a;
        }
        if (wczVar3.b == 1) {
            wcxVar = (wcx) wczVar3.c;
        } else {
            wcxVar = wcx.a;
        }
        qei a = psqVar3.a(wcxVar.c, false);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qfm qfmVar = (qfm) createBuilder2.b;
        a.getClass();
        qfmVar.c = a;
        qfmVar.b |= 1;
        qfm qfmVar2 = (qfm) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar2 = (qey) createBuilder.b;
        qfmVar2.getClass();
        qeyVar2.o = qfmVar2;
        qeyVar2.d |= 64;
        qei qeiVar = (qei) ((vbu) this.b.b()).e().orElseThrow(new vtc(7));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qey qeyVar3 = (qey) createBuilder.b;
        qeiVar.getClass();
        qeyVar3.q = qeiVar;
        qeyVar3.d |= 256;
        return (qey) createBuilder.s();
    }

    @Override // defpackage.vzr, java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((wct) obj);
    }
}
