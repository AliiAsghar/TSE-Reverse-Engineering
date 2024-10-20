package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhi extends arrp implements arqw {
    final /* synthetic */ float a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhi(float f, afhp afhpVar, aki akiVar, byj byjVar, afhe afheVar, arqg arqgVar, int i) {
        super(3);
        this.g = i;
        this.a = f;
        this.f = afhpVar;
        this.b = akiVar;
        this.c = byjVar;
        this.d = afheVar;
        this.e = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, aki] */
    /* JADX WARN: Type inference failed for: r13v0, types: [byj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, arqw] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float f;
        if (this.g != 0) {
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            ((akn) obj).getClass();
            if ((intValue & 81) == 16 && bwjVar.L()) {
                bwjVar.v();
            } else {
                aeul aeulVar = (aeul) this.d;
                adcx.bu(aeulVar.k, aeulVar.a, aeulVar.u, bwjVar, 0, 0);
                Object obj4 = this.d;
                Object obj5 = this.f;
                aeul aeulVar2 = (aeul) obj4;
                int i = aeulVar2.A;
                cga.a aVar = cga.e;
                if (i == 2) {
                    f = this.a;
                } else {
                    f = 0.0f;
                }
                adcx.cr(aeulVar2, (aeux) obj5, amd.b(aVar, f, brg.a), bwjVar, 0);
                bwjVar.y(-2074300290);
                Object obj6 = this.d;
                Object obj7 = this.c;
                aeul aeulVar3 = (aeul) obj6;
                adcx.cs(aeulVar3, (aetu) obj7, (zj) this.b, null, this.e, bwjVar, 512);
                bwjVar.q();
                aetu aetuVar = (aetu) this.c;
                if (((Boolean) aetuVar.c.a()).booleanValue() && (((Boolean) aetuVar.b.a()).booleanValue() || aetuVar.a)) {
                    Object obj8 = this.d;
                    cga cgaVar = cga.e;
                    if (adcx.cc((aeul) obj8)) {
                        cgaVar = amh.i(cgaVar, 19.0f, brg.a, 2);
                    }
                    cga b = amd.b(cgaVar, this.a, brg.a);
                    aeul aeulVar4 = (aeul) this.d;
                    adcx.cj(b, aeulVar4, aeulVar4.j, (aeux) this.f, bwjVar, 0);
                }
            }
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj2;
        int intValue2 = ((Number) obj3).intValue();
        ((akn) obj).getClass();
        if ((intValue2 & 81) == 16 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            akh.a(cur.a(ani.b(amv.q(cga.e, brg.a, this.a, 1)), new afhh((dqv) bwjVar2.g(dch.d), this.a, (afhp) this.f, this.b, this.c)), null, cdk.e(-726624413, new afao(this.d, (arqg) this.e, 3), bwjVar2), bwjVar2, 3072, 6);
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhi(aeul aeulVar, aeux aeuxVar, float f, aetu aetuVar, zj zjVar, arqw arqwVar, int i) {
        super(3);
        this.g = i;
        this.d = aeulVar;
        this.f = aeuxVar;
        this.a = f;
        this.c = aetuVar;
        this.b = zjVar;
        this.e = arqwVar;
    }
}
