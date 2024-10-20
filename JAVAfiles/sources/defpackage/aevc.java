package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevc extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevc(Object obj, long j, int i) {
        super(2);
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    cga e = amh.e(cga.e, 8.0f, 2.0f);
                    dje djeVar = bmp.d(bwjVar).o;
                    ahji.e((String) this.b, e, this.a, 0L, 0L, null, 0L, 0, false, 0, 0, null, djeVar, bwjVar, 432, 0, 65528);
                }
                return arnb.a;
            }
            bwj bwjVar2 = (bwj) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
                bwjVar2.v();
            } else {
                cga e2 = amh.e(cga.e, 16.0f, 10.0f);
                int i2 = cfq.a;
                Object obj3 = this.b;
                long j = this.a;
                cue a = amq.a(ajw.a, cfq.a.k, bwjVar2, 48);
                int a2 = bwg.a(bwjVar2);
                bwy d = bwjVar2.d();
                cga b = cfv.b(bwjVar2, e2);
                int i3 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar2.N();
                bwjVar2.A();
                if (bwjVar2.K()) {
                    bwjVar2.l(arqgVar);
                } else {
                    bwjVar2.C();
                }
                caw.b(bwjVar2, a, cwl.a.e);
                caw.b(bwjVar2, d, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwjVar2.K() || !d.F(bwjVar2.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar2.B(valueOf);
                    bwjVar2.j(valueOf, arqvVar);
                }
                caw.b(bwjVar2, b, cwl.a.c);
                bwjVar2.y(-1416448892);
                bwjVar2.q();
                ahji.e(((aemg) obj3).a, null, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar2).m, bwjVar2, 0, 0, 65530);
                bwjVar2.p();
            }
            return arnb.a;
        }
        bwj bwjVar3 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar3.L()) {
            bwjVar3.v();
        } else {
            cga e3 = amh.e(cga.e, 8.0f, 2.0f);
            dje djeVar2 = bmp.d(bwjVar3).o;
            ahji.e((String) this.b, e3, this.a, 0L, 0L, null, 0L, 0, false, 0, 0, null, djeVar2, bwjVar3, 432, 0, 65528);
        }
        return arnb.a;
    }
}
