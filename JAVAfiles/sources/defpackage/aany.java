package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aany extends arrp implements arqv {
    final /* synthetic */ String a;
    final /* synthetic */ arqg b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aany(String str, arqg arqgVar, boolean z, String str2) {
        super(2);
        this.a = str;
        this.b = arqgVar;
        this.c = z;
        this.d = str2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga b;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga d = amh.d(cga.e, 12.0f);
            int i = cfq.a;
            String str = this.a;
            arqg arqgVar = this.b;
            boolean z = this.c;
            String str2 = this.d;
            cue a = amq.a(ajw.a, cfq.a.k, bwjVar, 48);
            int a2 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b2 = cfv.b(bwjVar, d);
            int i2 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar2);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a, cwl.a.e);
            caw.b(bwjVar, d2, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            b = amu.a.b(cga.e, 1.0f, true);
            ahji.e(str, b, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar, 0, 0, 131068);
            ahji.al(arqgVar, null, z, null, null, null, null, null, cdk.e(-1240457261, new yzl(str2, 11), bwjVar), bwjVar, 805306368);
            bwjVar.p();
        }
        return arnb.a;
    }
}
