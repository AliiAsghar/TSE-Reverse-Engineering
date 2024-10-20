package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelz extends arrp implements arqw {
    final /* synthetic */ aemb a;
    final /* synthetic */ arwe b;
    final /* synthetic */ bpq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelz(aemb aembVar, arwe arweVar, bpq bpqVar) {
        super(3);
        this.a = aembVar;
        this.b = arweVar;
        this.c = bpqVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        akn aknVar = (akn) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        aknVar.getClass();
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(aknVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwjVar.y(-1648390664);
            aemb aembVar = this.a;
            if (aembVar.f) {
                aeke.ab(aknVar, new zzg(this.b, this.c, aembVar, 5), bwjVar, intValue & 14);
            }
            bwjVar.q();
            float f = 24.0f;
            cga i2 = amh.i(cga.e, 24.0f, brg.a, 2);
            int i3 = cfq.a;
            aemb aembVar2 = this.a;
            cue a = akk.a(ajw.c, cfq.a.n, bwjVar, 48);
            int a2 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, i2);
            int i4 = cwl.a;
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
            cga c = afs.c(ako.a.b(cga.e, 1.0f, false), afs.b(bwjVar, 0), false, 14);
            cue a3 = akk.a(ajw.c, cfq.a.n, bwjVar, 48);
            int a4 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b2 = cfv.b(bwjVar, c);
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
            aews aewsVar = aembVar2.i;
            bwjVar.y(-1718648681);
            float f2 = 8.0f;
            if (aewsVar != null) {
                if (true == aembVar2.f) {
                    f = 8.0f;
                }
                amx.a(amv.d(cga.e, f), bwjVar);
                aeke.ak(aewsVar, null, bwjVar, 0);
            }
            bwjVar.q();
            if (aembVar2.i != null) {
                f2 = 16.0f;
            } else if (!aembVar2.f) {
                f2 = 48.0f;
            }
            amx.a(amv.d(cga.e, f2), bwjVar);
            aeke.ae(aembVar2.a, null, bwjVar, 0);
            String str = aembVar2.d;
            bwjVar.y(-1718635680);
            if (str != null) {
                amx.a(amv.d(cga.e, 16.0f), bwjVar);
                aeke.aa(str, aembVar2.e, bwjVar, 64);
            }
            bwjVar.q();
            amx.a(amv.d(cga.e, 28.0f), bwjVar);
            bwjVar.p();
            aeke.af(aembVar2.g, aembVar2.b, aembVar2.c, null, null, bwjVar, 0);
            bwjVar.p();
        }
        return arnb.a;
    }
}
