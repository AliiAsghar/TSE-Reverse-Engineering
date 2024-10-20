package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepg extends arrp implements arqv {
    final /* synthetic */ aenr a;
    final /* synthetic */ float b;
    final /* synthetic */ aeoo c;
    final /* synthetic */ cit d;
    final /* synthetic */ aeop e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepg(aenr aenrVar, float f, aeoo aeooVar, cit citVar, aeop aeopVar) {
        super(2);
        this.a = aenrVar;
        this.b = f;
        this.c = aeooVar;
        this.d = citVar;
        this.e = aeopVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            aenr aenrVar = this.a;
            float f = this.b;
            aeoo aeooVar = this.c;
            cit citVar = this.d;
            aeop aeopVar = this.e;
            cga.a aVar = cga.e;
            ajw.b bVar = ajw.a;
            int i = cfq.a;
            cue a = amq.a(bVar, cfq.a.j, bwjVar, 0);
            int a2 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, aVar);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            cga.a aVar2 = cga.e;
            cue a3 = akk.a(ajw.c, cfq.a.m, bwjVar, 0);
            int a4 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b2 = cfv.b(bwjVar, aVar2);
            arqg arqgVar2 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar2);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a3, cwl.a.e);
            caw.b(bwjVar, d2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                bwjVar.B(valueOf2);
                bwjVar.j(valueOf2, arqvVar2);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            adom.aS(aenrVar.c, null, f, true, bwjVar, 3120, 0);
            adom.aK(aenrVar.b, false, aeooVar, f, null, bwjVar, 48, 16);
            adom.K(aenrVar, citVar, aeopVar, bwjVar, 0);
            bwjVar.p();
            bwjVar.p();
        }
        return arnb.a;
    }
}
