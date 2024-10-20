package defpackage;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axa extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ ayd a;
    final /* synthetic */ dje b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ azv e;
    final /* synthetic */ doj f;
    final /* synthetic */ doy g;
    final /* synthetic */ cga h;
    final /* synthetic */ cga i;
    final /* synthetic */ cga j;
    final /* synthetic */ cga k;
    final /* synthetic */ avj l;
    final /* synthetic */ bfb m;
    final /* synthetic */ boolean n;
    final /* synthetic */ arqr o;
    final /* synthetic */ dob p;
    final /* synthetic */ dqv q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa(ayd aydVar, dje djeVar, int i, int i2, azv azvVar, doj dojVar, doy doyVar, cga cgaVar, cga cgaVar2, cga cgaVar3, cga cgaVar4, avj avjVar, bfb bfbVar, boolean z, arqr arqrVar, dob dobVar, dqv dqvVar) {
        super(2);
        this.a = aydVar;
        this.b = djeVar;
        this.c = i;
        this.d = i2;
        this.e = azvVar;
        this.f = dojVar;
        this.g = doyVar;
        this.h = cgaVar;
        this.i = cgaVar2;
        this.j = cgaVar3;
        this.k = cgaVar4;
        this.l = avjVar;
        this.m = bfbVar;
        this.n = z;
        this.o = arqrVar;
        this.p = dobVar;
        this.q = dqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int d;
        cga bapVar;
        cga g;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga g2 = cfv.g(amv.q(cga.e, ((dqy) this.a.g.a()).a, brg.a, 2), new axr(this.c, this.d, this.b));
            azv azvVar = this.e;
            doj dojVar = this.f;
            doy doyVar = this.g;
            boolean I = bwjVar.I(this.a);
            ayd aydVar = this.a;
            Object h = bwjVar.h();
            if (I || h == bwj.a.a) {
                h = new awz(aydVar);
                bwjVar.B(h);
            }
            arqg arqgVar = (arqg) h;
            ahp c = azvVar.c();
            long j = dojVar.b;
            long j2 = djc.a;
            long j3 = azvVar.b;
            if (djc.e(j) != djc.e(j3)) {
                d = djc.e(j);
            } else if (djc.a(j) != djc.a(j3)) {
                d = djc.a(j);
            } else {
                d = djc.d(j);
            }
            azvVar.b = dojVar.b;
            dow a = bao.a(doyVar, dojVar.a);
            ahp ahpVar = ahp.a;
            int ordinal = c.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    bapVar = new axt(azvVar, d, a, arqgVar);
                } else {
                    throw new armm();
                }
            } else {
                bapVar = new bap(azvVar, d, a, arqgVar);
            }
            g = cfv.g(chk.b(g2).a(bapVar).a(this.h).a(this.i), new azz(this.b));
            bew.a(g.a(this.j).a(this.k).a(new BringIntoViewRequesterElement(this.l)), cdk.e(-363167407, new awy(this.m, this.a, this.n, this.o, this.f, this.p, this.q, this.d), bwjVar), bwjVar, 48);
        }
        return arnb.a;
    }
}
