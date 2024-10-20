package defpackage;

import defpackage.bwj;
import defpackage.cga;
import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axr extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ dje c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axr(int i, int i2, dje djeVar) {
        super(3);
        this.a = i;
        this.b = i2;
        this.c = djeVar;
    }

    private static final Object b(cas casVar) {
        return casVar.a();
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        Integer valueOf;
        float f;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(408240218);
        axs.a(this.a, this.b);
        if (this.a == 1 && this.b == Integer.MAX_VALUE) {
            cga.a aVar = cga.e;
            bwjVar.q();
            return aVar;
        }
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        dli.a aVar2 = (dli.a) bwjVar.g(dch.f);
        drk drkVar = (drk) bwjVar.g(dch.i);
        boolean G = bwjVar.G(this.c) | bwjVar.G(drkVar);
        dje djeVar = this.c;
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = djf.a(djeVar, drkVar);
            bwjVar.B(h);
        }
        dje djeVar2 = (dje) h;
        boolean G2 = bwjVar.G(aVar2) | bwjVar.G(djeVar2);
        Object h2 = bwjVar.h();
        if (G2 || h2 == bwj.a.a) {
            dli n = djeVar2.n();
            dlx q = djeVar2.q();
            if (q == null) {
                q = dlx.e;
            }
            dls o = djeVar2.o();
            if (o != null) {
                i = o.a;
            } else {
                i = 0;
            }
            dlt p = djeVar2.p();
            if (p != null) {
                i2 = p.a;
            } else {
                i2 = 65535;
            }
            h2 = aVar2.a(n, q, i, i2);
            bwjVar.B(h2);
        }
        cas casVar = (cas) h2;
        boolean G3 = bwjVar.G(b(casVar)) | bwjVar.G(dqvVar) | bwjVar.G(aVar2) | bwjVar.G(this.c) | bwjVar.G(drkVar);
        Object h3 = bwjVar.h();
        if (G3 || h3 == bwj.a.a) {
            h3 = Integer.valueOf((int) (ayy.a(djeVar2, dqvVar, aVar2, ayy.a, 1) & 4294967295L));
            bwjVar.B(h3);
        }
        int intValue = ((Number) h3).intValue();
        boolean G4 = bwjVar.G(drkVar) | bwjVar.G(dqvVar) | bwjVar.G(aVar2) | bwjVar.G(this.c) | bwjVar.G(b(casVar));
        Object h4 = bwjVar.h();
        if (G4 || h4 == bwj.a.a) {
            h4 = Integer.valueOf((int) (ayy.a(djeVar2, dqvVar, aVar2, ayy.a + '\n' + ayy.a, 2) & 4294967295L));
            bwjVar.B(h4);
        }
        int intValue2 = ((Number) h4).intValue() - intValue;
        Integer num = null;
        if (this.a == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf((-intValue2) + intValue);
        }
        int i3 = this.b;
        if (i3 != Integer.MAX_VALUE) {
            num = Integer.valueOf(intValue + (intValue2 * (i3 - 1)));
        }
        cga.a aVar3 = cga.e;
        float f2 = Float.NaN;
        if (valueOf != null) {
            f = dqvVar.eh(valueOf.intValue());
        } else {
            f = Float.NaN;
        }
        if (num != null) {
            f2 = dqvVar.eh(num.intValue());
        }
        cga e = amv.e(aVar3, f, f2);
        bwjVar.q();
        return e;
    }
}
