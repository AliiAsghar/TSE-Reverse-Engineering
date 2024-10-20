package defpackage;

import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;
import defpackage.doy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeps extends arrp implements arqw {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeps(Object obj, boolean z, int i) {
        super(3);
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r4v6, types: [cas, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga c;
        int i = this.c;
        int i2 = 4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    bqb bqbVar = (bqb) obj;
                    bwj bwjVar = (bwj) obj2;
                    int intValue = ((Number) obj3).intValue();
                    bqbVar.getClass();
                    if ((intValue & 14) == 0) {
                        if (true != bwjVar.G(bqbVar)) {
                            i2 = 2;
                        }
                        intValue |= i2;
                    }
                    if ((intValue & 91) == 18 && bwjVar.L()) {
                        bwjVar.v();
                    } else {
                        ahgy.a.b(bqbVar, null, this.a, (bpt) this.b, null, brg.a, brg.a, bwjVar, (intValue & 14) | 12582920);
                    }
                    return arnb.a;
                }
                aki akiVar = (aki) obj;
                bwj bwjVar2 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                akiVar.getClass();
                if ((intValue2 & 14) == 0) {
                    if (true != bwjVar2.G(akiVar)) {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 91) == 18 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    if (this.a) {
                        bwjVar2.y(-555862451);
                        float em = ((dqv) bwjVar2.g(dch.d)).em(akiVar.c()) * 0.07f;
                        bwjVar2.y(-156474590);
                        boolean D = bwjVar2.D(em);
                        Object h = bwjVar2.h();
                        if (D || h == bwj.a.a) {
                            h = new cod(em, brg.a, 0, 0, 30);
                            bwjVar2.B(h);
                        }
                        bwjVar2.q();
                        cga c2 = cho.c(cga.e, new aewb(em, (cod) h));
                        bwjVar2.y(-156462670);
                        Object h2 = bwjVar2.h();
                        if (h2 == bwj.a.a) {
                            h2 = aedh.s;
                            bwjVar2.B(h2);
                        }
                        bwjVar2.q();
                        c = cld.a(c2, (arqr) h2);
                        bwjVar2.q();
                    } else {
                        bwjVar2.y(-555289447);
                        c = adl.c(cga.e, akiVar.c() * 0.07f, bmp.a(bwjVar2).n, awh.a);
                        bwjVar2.q();
                    }
                    cga d = amh.d(amv.g(cga.e, akiVar.c()).a(c), 1.0f);
                    ?? r3 = this.b;
                    int i3 = cfq.a;
                    cue a = akc.a(cfq.a.a, false);
                    int a2 = bwg.a(bwjVar2);
                    bwy d2 = bwjVar2.d();
                    cga b = cfv.b(bwjVar2, d);
                    int i4 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar2.N();
                    bwjVar2.A();
                    if (bwjVar2.K()) {
                        bwjVar2.l(arqgVar);
                    } else {
                        bwjVar2.C();
                    }
                    caw.b(bwjVar2, a, cwl.a.e);
                    caw.b(bwjVar2, d2, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar2.K() || !d.F(bwjVar2.h(), Integer.valueOf(a2))) {
                        Integer valueOf = Integer.valueOf(a2);
                        bwjVar2.B(valueOf);
                        bwjVar2.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar2, b, cwl.a.c);
                    r3.a(akf.a, bwjVar2, 6);
                    bwjVar2.p();
                }
                return arnb.a;
            }
            bwj bwjVar3 = (bwj) obj2;
            int intValue3 = ((Number) obj3).intValue();
            ((awg) obj).getClass();
            if ((intValue3 & 81) == 16 && bwjVar3.L()) {
                bwjVar3.v();
            } else {
                adom.cn(new aezf((String) this.b, null, true, false, null, false, this.a, null, false, null, null, null, false, false, null, false, null, 2096982), null, null, null, bwjVar3, 0, 14);
            }
            return arnb.a;
        }
        arqv arqvVar2 = (arqv) obj;
        bwj bwjVar4 = (bwj) obj2;
        int intValue4 = ((Number) obj3).intValue();
        arqvVar2.getClass();
        if ((intValue4 & 14) == 0) {
            if (true != bwjVar4.I(arqvVar2)) {
                i2 = 2;
            }
            intValue4 |= i2;
        }
        if ((intValue4 & 91) == 18 && bwjVar4.L()) {
            bwjVar4.v();
        } else {
            ahhj ahhjVar = ahhj.a;
            amj g = amh.g(brg.a, 12.0f, 1);
            bwjVar4.y(47047948);
            Object h3 = bwjVar4.h();
            if (h3 == bwj.a.a) {
                h3 = new ajs();
                bwjVar4.B(h3);
            }
            ajr ajrVar = (ajr) h3;
            bwjVar4.q();
            int i5 = doy.a;
            ahhjVar.a((String) this.b.a(), arqvVar2, true, doy.a.a, ajrVar, cdk.e(-428274746, new aepr(this.a, 0), bwjVar4), null, null, g, aepq.a, bwjVar4, ((intValue4 << 3) & 112) | 100887936, 114819072);
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeps(boolean z, Object obj, int i) {
        super(3);
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
