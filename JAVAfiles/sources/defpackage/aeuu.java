package defpackage;

import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuu extends arrp implements arqw {
    final /* synthetic */ arqw a;
    final /* synthetic */ aeuy b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeuu(arqw arqwVar, aeuy aeuyVar, boolean z, long j) {
        super(3);
        this.a = arqwVar;
        this.b = aeuyVar;
        this.c = z;
        this.d = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [cga] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga.a aVar;
        int i;
        aki akiVar = (aki) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        akiVar.getClass();
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(akiVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            Object a = this.a.a(this.b.a, Integer.valueOf(((dqv) bwjVar.g(dch.d)).eo(akiVar.d())), adcx.bT(this.b, bwjVar));
            bwjVar.y(851851348);
            boolean z = this.c;
            aeuy aeuyVar = this.b;
            cga.a aVar2 = cga.e;
            if (z) {
                cga.a aVar3 = cga.e;
                bwjVar.y(84286858);
                boolean G = bwjVar.G(aeuyVar);
                Object h = bwjVar.h();
                if (G || h == bwj.a.a) {
                    h = new aetz(aeuyVar, 4);
                    bwjVar.B(h);
                }
                bwjVar.q();
                aVar = adw.c(aVar3, false, null, (arqg) h, 7);
            } else {
                aVar = aVar2;
            }
            bwjVar.q();
            ahji.d(adcx.bM((String) a, this.c, this.d), aVar, this.d, 0L, 0L, 0L, 0, false, 0, null, null, adcx.bT(this.b, bwjVar), bwjVar, 0, 0, 65528);
        }
        return arnb.a;
    }
}
