package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.cfq;
import defpackage.cwl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzr extends arrp implements arqw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(jxf jxfVar, arqr arqrVar, cas casVar, byn bynVar, int i) {
        super(3);
        this.e = i;
        this.c = jxfVar;
        this.b = arqrVar;
        this.a = casVar;
        this.d = bynVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v0, types: [wh, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        cga b;
        int i;
        if (this.e != 0) {
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
            if ((intValue & 91) != 18 || !bwjVar.L()) {
                b = aknVar.b(cga.e, 1.0f, true);
                int i2 = cfq.a;
                Object obj4 = this.c;
                ?? r7 = this.b;
                ?? r0 = this.a;
                ?? r3 = this.d;
                cue a = akk.a(ajw.c, cfq.a.n, bwjVar, 48);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b2 = cfv.b(bwjVar, b);
                int i3 = cwl.a;
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
                caw.b(bwjVar, b2, cwl.a.c);
                amx.a(amh.c(cga.e, ang.a(anl.f(bwjVar), bwjVar)), bwjVar);
                bwjVar.y(-2057518218);
                if (((Configuration) bwjVar.g(AndroidCompositionLocals_androidKt.a)).orientation == 1) {
                    hwr.U(bwjVar, 0);
                }
                bwjVar.q();
                jxf jxfVar = (jxf) obj4;
                hwr.X(jxfVar.b, jxfVar.c, hwr.Q(r0), hwr.R(r3), r7, bwjVar, 4616);
                bwjVar.p();
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj2;
        int intValue2 = ((Number) obj3).intValue();
        ((amj) obj).getClass();
        if ((intValue2 & 81) == 16 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            ?? r32 = this.a;
            ?? r4 = this.b;
            Object obj5 = this.c;
            if (obj5 != null && !((zzp) obj5).f.a) {
                z = true;
            } else {
                z = false;
            }
            zzp zzpVar = (zzp) obj5;
            aabr.M(r32, r4, zzpVar.c, zzpVar.e, z, this.d, bwjVar2, 262208);
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(yg ygVar, List list, zzp zzpVar, wh whVar, int i) {
        super(3);
        this.e = i;
        this.a = ygVar;
        this.b = list;
        this.c = zzpVar;
        this.d = whVar;
    }
}
