package defpackage;

import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeou extends arrp implements arqv {
    final /* synthetic */ aenr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aeoo c;
    final /* synthetic */ float d;
    final /* synthetic */ cit e;
    final /* synthetic */ aeop f;
    final /* synthetic */ aeom g;
    final /* synthetic */ aeoa h;
    final /* synthetic */ byn i;
    final /* synthetic */ boolean j;
    final /* synthetic */ byn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeou(aenr aenrVar, boolean z, aeoo aeooVar, float f, cit citVar, aeop aeopVar, aeom aeomVar, aeoa aeoaVar, byn bynVar, boolean z2, byn bynVar2) {
        super(2);
        this.a = aenrVar;
        this.b = z;
        this.c = aeooVar;
        this.d = f;
        this.e = citVar;
        this.f = aeopVar;
        this.g = aeomVar;
        this.h = aeoaVar;
        this.i = bynVar;
        this.j = z2;
        this.k = bynVar2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            aenr aenrVar = this.a;
            boolean z = this.b;
            aeoo aeooVar = this.c;
            float f = this.d;
            cit citVar = this.e;
            aeop aeopVar = this.f;
            aeom aeomVar = this.g;
            aeoa aeoaVar = this.h;
            byn bynVar = this.i;
            boolean z2 = this.j;
            byn bynVar2 = this.k;
            ajw.e eVar = ajw.d;
            cga.a aVar = cga.e;
            int i = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, bwjVar, 6);
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
            aenl aenlVar = aenrVar.e;
            aenk aenkVar = aenrVar.b;
            if (aenlVar != null) {
                str = aenlVar.a;
            } else {
                str = null;
            }
            adom.aK(aenkVar, z, aeooVar, f, str, bwjVar, 0, 0);
            cga j = amh.j(cga.e, 16.0f, brg.a, 4.0f, brg.a, 10);
            cue a3 = amq.a(ajw.a, cfq.a.l, bwjVar, 48);
            int a4 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b2 = cfv.b(bwjVar, j);
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
            amu amuVar = amu.a;
            bwjVar.y(-1711097930);
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new aeju(bynVar2, 13);
                bwjVar.B(h);
            }
            bwjVar.q();
            adom.aO(amuVar, aenrVar, citVar, (arqr) h, null, false, false, brg.a, aeopVar, bwjVar, 3078, 120);
            adom.aa(aenrVar, aeomVar, aeoaVar, bynVar, z2, aeooVar, aeopVar, bwjVar, 3072);
            bwjVar.p();
            bwjVar.p();
        }
        return arnb.a;
    }
}
