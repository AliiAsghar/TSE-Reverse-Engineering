package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkf {
    public static final asai a(asai asaiVar, String str) {
        asaiVar.getClass();
        return new qkb(str, asaiVar);
    }

    public static final ascv b(ascv ascvVar, String str) {
        ascvVar.getClass();
        return new qkd(str, ascvVar);
    }

    public static final asai c(asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, asai asaiVar5, asai asaiVar6, arra arraVar) {
        asaiVar2.getClass();
        asaiVar5.getClass();
        asaiVar6.getClass();
        return new jdn(arrn.P(asaiVar, asaiVar2, asaiVar3, qjv.a), arrn.P(asaiVar4, asaiVar5, asaiVar6, qjw.a), new kea(arraVar, (arpe) null, 3), 17, null);
    }

    public static final ascv d(ascv ascvVar, arwe arweVar, arqr arqrVar) {
        ascvVar.getClass();
        if (ascvVar instanceof qjr) {
            return new qjr(new qjz(arqrVar, ascvVar, 0));
        }
        ascd a = ascy.a(arqrVar.a(ascvVar.c()));
        qjh.l(arweVar, null, new qka(ascvVar, a, arqrVar, (arpe) null, 0), 3);
        return a;
    }

    public static /* synthetic */ arqg e(arqg arqgVar, arwe arweVar) {
        return new kdt((Object) new arsb(), (Object) arweVar, (Object) arqgVar, 9, (short[]) null);
    }

    public static /* synthetic */ arqr f(arqr arqrVar, arwe arweVar) {
        return new eiw((Object) new arsb(), (Object) arweVar, (Object) arqrVar, 16, (byte[]) null);
    }

    public static /* synthetic */ arqv g(arqv arqvVar, arwe arweVar) {
        return new keh(new arsb(), arweVar, arqvVar, 2, (char[]) null);
    }

    public static /* synthetic */ arqw h(arqw arqwVar, arwe arweVar) {
        return new qjl(new arsb(), arweVar, arqwVar, 0);
    }

    public static final Object i(acir acirVar, arpe arpeVar) {
        return arro.F(agkx.f(acirVar), arpeVar);
    }

    public static final /* synthetic */ qei j(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (qei) s;
    }

    public static final void k(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qei qeiVar = (qei) aozyVar.b;
        qei qeiVar2 = qei.a;
        qeiVar.b |= 2;
        qeiVar.d = str;
    }

    public static final void l(qeh qehVar, aozy aozyVar) {
        qehVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qei qeiVar = (qei) aozyVar.b;
        qei qeiVar2 = qei.a;
        qeiVar.c = qehVar.e;
        qeiVar.b |= 1;
    }

    public static /* synthetic */ boolean m(qbs qbsVar, qfi qfiVar) {
        qei qeiVar = qei.a;
        qfm qfmVar = qfiVar.d;
        if (qfmVar == null) {
            qfmVar = qfm.a;
        }
        qei qeiVar2 = qfmVar.c;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        if (!qeiVar.equals(qeiVar2)) {
            qei qeiVar3 = qbsVar.j;
            qfm qfmVar2 = qfiVar.d;
            if (qfmVar2 == null) {
                qfmVar2 = qfm.a;
            }
            qei qeiVar4 = qfmVar2.c;
            if (qeiVar4 == null) {
                qeiVar4 = qei.a;
            }
            if (!qeiVar3.equals(qeiVar4)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void n(int i, mbl mblVar) {
        mblVar.e("Bugle.Rcs.Groups.Recreation.Counts", i - 1);
    }

    public static boolean o() {
        return anfi.a("bugle.add_pending_message_channels_logging", "bugle");
    }
}
