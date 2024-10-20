package defpackage;

import defpackage.cfq;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boc extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ arqg a;
    final /* synthetic */ amj b;
    final /* synthetic */ cfq.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boc(arqg arqgVar, amj amjVar, cfq.b bVar) {
        super(1);
        this.a = arqgVar;
        this.b = amjVar;
        this.c = bVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        long j = ((cjt) ((arrq) this.a).b()).a;
        float c = cjt.c(j);
        if (c > brg.a) {
            float em = cntVar.em(4.0f);
            float a = this.c.a(arsk.g(c), arsk.g((cjt.c(cntVar.o()) - r5) - cntVar.em(this.b.c(cntVar.r()))), cntVar.r()) + cntVar.em(this.b.b(cntVar.r()));
            float f = c / 2.0f;
            float f2 = a + f;
            float o = arrn.o((f2 - f) - em, brg.a);
            float p = arrn.p(f2 + f + em, cjt.c(cntVar.o()));
            float a2 = cjt.a(j);
            float f3 = -a2;
            float f4 = a2 / 2.0f;
            cnu q = cntVar.q();
            long a3 = q.a();
            q.b().l();
            try {
                ((cnr.AnonymousClass1) q).a.b(o, f3 / 2.0f, p, f4, 0);
                cntVar.p();
            } finally {
                q.b().j();
                q.h(a3);
            }
        } else {
            cntVar.p();
        }
        return arnb.a;
    }
}
