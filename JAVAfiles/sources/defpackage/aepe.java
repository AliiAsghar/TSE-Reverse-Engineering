package defpackage;

import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepe extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepe(aenr aenrVar, aeoo aeooVar, float f, cit citVar, aeop aeopVar, aeom aeomVar, int i) {
        super(2);
        this.g = i;
        this.b = aenrVar;
        this.c = aeooVar;
        this.a = f;
        this.d = citVar;
        this.e = aeopVar;
        this.f = aeomVar;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [bsc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [dqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [cas, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga.a aVar = cga.e;
                bwjVar.y(-33815255);
                boolean G = bwjVar.G(this.f) | bwjVar.D(this.a) | bwjVar.G(this.c);
                float f = this.a;
                ?? r6 = this.c;
                ?? r7 = this.b;
                ?? r8 = this.f;
                Object h = bwjVar.h();
                if (G || h == bwj.a.a) {
                    h = new kia(f, r6, r7, r8);
                    bwjVar.B(h);
                }
                bwjVar.q();
                cga a = amd.a(aVar, (arqr) h);
                Object obj3 = this.e;
                lga.aT(((khy) obj3).a, a, this.d, bwjVar, 0);
            }
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            Object obj4 = this.b;
            Object obj5 = this.c;
            float f2 = this.a;
            Object obj6 = this.d;
            Object obj7 = this.e;
            Object obj8 = this.f;
            ajw.e eVar = ajw.d;
            cga.a aVar2 = cga.e;
            int i = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, bwjVar2, 6);
            int a3 = bwg.a(bwjVar2);
            bwy d = bwjVar2.d();
            cga b = cfv.b(bwjVar2, aVar2);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar2.N();
            bwjVar2.A();
            if (bwjVar2.K()) {
                bwjVar2.l(arqgVar);
            } else {
                bwjVar2.C();
            }
            caw.b(bwjVar2, a2, cwl.a.e);
            caw.b(bwjVar2, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar2.K() || !d.F(bwjVar2.h(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwjVar2.B(valueOf);
                bwjVar2.j(valueOf, arqvVar);
            }
            caw.b(bwjVar2, b, cwl.a.c);
            aenr aenrVar = (aenr) obj4;
            adom.aK(aenrVar.b, false, (aeoo) obj5, f2, null, bwjVar2, 48, 16);
            cga j = amh.j(cga.e, 16.0f, brg.a, 4.0f, brg.a, 10);
            cue a4 = amq.a(ajw.a, cfq.a.l, bwjVar2, 48);
            int a5 = bwg.a(bwjVar2);
            bwy d2 = bwjVar2.d();
            cga b2 = cfv.b(bwjVar2, j);
            arqg arqgVar2 = cwl.a.a;
            bwjVar2.N();
            bwjVar2.A();
            if (bwjVar2.K()) {
                bwjVar2.l(arqgVar2);
            } else {
                bwjVar2.C();
            }
            caw.b(bwjVar2, a4, cwl.a.e);
            caw.b(bwjVar2, d2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar2.K() || !d.F(bwjVar2.h(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwjVar2.B(valueOf2);
                bwjVar2.j(valueOf2, arqvVar2);
            }
            caw.b(bwjVar2, b2, cwl.a.c);
            adom.aO(amu.a, aenrVar, (cit) obj6, null, null, false, false, brg.a, (aeop) obj7, bwjVar2, 6, 124);
            adom.N(aenrVar, (aeom) obj8, bwjVar2, 0);
            bwjVar2.p();
            bwjVar2.p();
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepe(cas casVar, float f, dqv dqvVar, khy khyVar, bsc bscVar, byn bynVar, int i) {
        super(2);
        this.g = i;
        this.f = casVar;
        this.a = f;
        this.c = dqvVar;
        this.e = khyVar;
        this.d = bscVar;
        this.b = bynVar;
    }
}
