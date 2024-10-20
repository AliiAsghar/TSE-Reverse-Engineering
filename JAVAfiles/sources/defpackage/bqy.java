package defpackage;

import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import defpackage.bst;
import defpackage.cfq;
import defpackage.cwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqy extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ cga a;
    final /* synthetic */ cmb b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ adr e;
    final /* synthetic */ ajr f;
    final /* synthetic */ boolean g;
    final /* synthetic */ arqg h;
    final /* synthetic */ float i;
    final /* synthetic */ arqv j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqy(cga cgaVar, cmb cmbVar, long j, float f, adr adrVar, ajr ajrVar, boolean z, arqg arqgVar, float f2, arqv arqvVar) {
        super(2);
        this.a = cgaVar;
        this.b = cmbVar;
        this.c = j;
        this.d = f;
        this.e = adrVar;
        this.f = ajrVar;
        this.g = z;
        this.h = arqgVar;
        this.i = f2;
        this.j = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga a;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga cgaVar = this.a;
            cmb cmbVar = this.b;
            long j = this.c;
            float f = this.d;
            a = avt.a(bqv.a(bmi.a(cgaVar), cmbVar, bqv.b(j, f, bwjVar), this.e, ((dqv) bwjVar.g(dch.d)).em(this.i)), false, this.f, bon.a(false, brg.a, 0L, 7), this.g, null, this.h).a(new ChildSemanticsNodeElement(bst.AnonymousClass1.a));
            cga a2 = bmg.a(a, this.f);
            arqv arqvVar = this.j;
            int i = cfq.a;
            cue a3 = akc.a(cfq.a.a, true);
            int a4 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, a2);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a3, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar2);
            }
            caw.b(bwjVar, b, cwl.a.c);
            arqvVar.a(bwjVar, 0);
            bwjVar.p();
        }
        return arnb.a;
    }
}
