package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aens extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aens(aenv aenvVar, cku ckuVar, boolean z, int i) {
        super(2);
        this.d = i;
        this.b = aenvVar;
        this.c = ckuVar;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, cga] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        dtf dtfVar;
        Window a;
        int i = this.d;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    bwjVar.y(-1278290199);
                    if (this.a) {
                        ViewParent parent = ((View) bwjVar.g(AndroidCompositionLocals_androidKt.f)).getParent();
                        if (parent instanceof dtf) {
                            dtfVar = (dtf) parent;
                        } else {
                            dtfVar = null;
                        }
                        if (dtfVar != null && (a = dtfVar.a()) != null) {
                            a.setDimAmount(1.0f);
                        }
                    }
                    bwjVar.q();
                    bqv.c(this.c, ahji.av(bwjVar), ahji.at(bwjVar), 0L, 6.0f, brg.a, null, cdk.e(-419454138, new aekj(this.b, 17), bwjVar), bwjVar, 104);
                }
                return arnb.a;
            }
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            if (this.a) {
                ((kag) this.c).b.d(this.b, true, new khf(intValue, intValue2));
                z = true;
            }
            return Boolean.valueOf(z);
        }
        bwj bwjVar2 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            int i2 = cfq.a;
            Object obj3 = this.b;
            Object obj4 = this.c;
            boolean z2 = this.a;
            cfq.c cVar = cfq.a.k;
            cga.a aVar = cga.e;
            cue a2 = amq.a(ajw.a, cVar, bwjVar2, 48);
            int a3 = bwg.a(bwjVar2);
            bwy d = bwjVar2.d();
            cga b = cfv.b(bwjVar2, aVar);
            int i3 = cwl.a;
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
            aenv aenvVar = (aenv) obj3;
            adom.aG(amu.a, aenvVar.a, (cku) obj4, bwjVar2, 6);
            adom.aH(aenvVar.c, true ^ z2, bwjVar2, 0);
            bwjVar2.p();
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aens(boolean z, Object obj, Object obj2, int i) {
        super(2);
        this.d = i;
        this.a = z;
        this.c = obj;
        this.b = obj2;
    }
}
