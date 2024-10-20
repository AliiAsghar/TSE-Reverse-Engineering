package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcg extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cga c;
    final /* synthetic */ bcv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcg(long j, boolean z, cga cgaVar, bcv bcvVar) {
        super(2);
        this.a = j;
        this.b = z;
        this.c = cgaVar;
        this.d = bcvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ajw.b bVar;
        cga a;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else if (this.a != 9205357640488583168L) {
            bwjVar.y(-837649504);
            if (this.b) {
                bVar = ajw.a.b;
            } else {
                bVar = ajw.a.a;
            }
            cga cgaVar = this.c;
            long j = this.a;
            a = cgaVar.a(new SizeElement(dra.b(j), dra.a(j), Float.NaN, Float.NaN, false));
            bcv bcvVar = this.d;
            boolean z = this.b;
            int i = cfq.a;
            cue a2 = amq.a(bVar, cfq.a.j, bwjVar, 0);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, a);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a2, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            cga.a aVar = cga.e;
            boolean I = bwjVar.I(bcvVar);
            Object h = bwjVar.h();
            if (I || h == bwj.a.a) {
                h = new bce(bcvVar);
                bwjVar.B(h);
            }
            bcd.c(aVar, (arqg) h, z, bwjVar, 6);
            bwjVar.p();
            bwjVar.q();
        } else {
            bwjVar.y(-836720496);
            cga cgaVar2 = this.c;
            boolean I2 = bwjVar.I(this.d);
            bcv bcvVar2 = this.d;
            Object h2 = bwjVar.h();
            if (I2 || h2 == bwj.a.a) {
                h2 = new bcf(bcvVar2);
                bwjVar.B(h2);
            }
            bcd.c(cgaVar2, (arqg) h2, this.b, bwjVar, 0);
            bwjVar.q();
        }
        return arnb.a;
    }
}
