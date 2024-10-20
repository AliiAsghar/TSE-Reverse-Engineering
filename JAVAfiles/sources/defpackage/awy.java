package defpackage;

import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awy extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ bfb a;
    final /* synthetic */ ayd b;
    final /* synthetic */ boolean c;
    final /* synthetic */ arqr d;
    final /* synthetic */ doj e;
    final /* synthetic */ dob f;
    final /* synthetic */ dqv g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awy(bfb bfbVar, ayd aydVar, boolean z, arqr arqrVar, doj dojVar, dob dobVar, dqv dqvVar, int i) {
        super(2);
        this.a = bfbVar;
        this.b = aydVar;
        this.c = z;
        this.d = arqrVar;
        this.e = dojVar;
        this.f = dobVar;
        this.g = dqvVar;
        this.h = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            awx awxVar = new awx(this.b, this.d, this.e, this.f, this.g, this.h);
            cga.a aVar = cga.e;
            int a = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, aVar);
            int i = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, awxVar, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            bwjVar.p();
            bfb bfbVar = this.a;
            if (this.b.c() != axq.a && this.b.e() != null) {
                cti e = this.b.e();
                e.getClass();
                if (e.r() && this.c) {
                    z = true;
                    awu.b(bfbVar, z, bwjVar, 0);
                    if (this.b.c() == axq.c && this.c) {
                        awu.c(this.a, bwjVar, 0);
                    }
                }
            }
            z = false;
            awu.b(bfbVar, z, bwjVar, 0);
            if (this.b.c() == axq.c) {
                awu.c(this.a, bwjVar, 0);
            }
        }
        return arnb.a;
    }
}
