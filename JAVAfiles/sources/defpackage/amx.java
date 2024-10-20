package defpackage;

import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amx {
    public static final void a(cga cgaVar, bwj bwjVar) {
        amy amyVar = amy.a;
        int a = bwg.a(bwjVar);
        cga b = cfv.b(bwjVar, cgaVar);
        bwy d = bwjVar.d();
        int i = cwl.a;
        arqg arqgVar = cwl.a.a;
        bwjVar.N();
        bwjVar.A();
        if (bwjVar.K()) {
            bwjVar.l(arqgVar);
        } else {
            bwjVar.C();
        }
        caw.b(bwjVar, amyVar, cwl.a.e);
        caw.b(bwjVar, d, cwl.a.d);
        caw.b(bwjVar, b, cwl.a.c);
        arqv arqvVar = cwl.a.f;
        if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a))) {
            Integer valueOf = Integer.valueOf(a);
            bwjVar.B(valueOf);
            bwjVar.j(valueOf, arqvVar);
        }
        bwjVar.p();
    }
}
