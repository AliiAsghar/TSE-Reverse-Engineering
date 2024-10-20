package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.focus.FocusEventElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenb extends arrp implements arqv {
    final /* synthetic */ aenr a;
    final /* synthetic */ int b;
    final /* synthetic */ amt c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ cit f;
    final /* synthetic */ arqr g;
    final /* synthetic */ aeop h;
    final /* synthetic */ Boolean i;
    final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenb(aenr aenrVar, int i, amt amtVar, boolean z, boolean z2, cit citVar, arqr arqrVar, aeop aeopVar, Boolean bool, float f) {
        super(2);
        this.a = aenrVar;
        this.b = i;
        this.c = amtVar;
        this.d = z;
        this.e = z2;
        this.f = citVar;
        this.g = arqrVar;
        this.h = aeopVar;
        this.i = bool;
        this.j = f;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga b;
        boolean z;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            aenr aenrVar = this.a;
            dje b2 = afaf.b(dje.y(bmp.d(bwjVar).j, bmp.a(bwjVar).q, 0L, null, null, null, null, 0L, 0, this.b, 0L, null, null, 0, 16711678), bwjVar);
            b = this.c.b(cga.e, 1.0f, true);
            if (!this.a.a.g.b) {
                b = b.a(wj.b(cga.e));
            }
            if (this.d && this.a.a.b.length() == 0 && !this.e) {
                z = true;
            } else {
                z = false;
            }
            float f = this.j;
            if (z) {
                b = b.a(amv.f(cga.e, f));
            }
            cga a = dea.a(civ.a(b, this.f), "Compose:Draft:Text").a(new FocusEventElement(this.g));
            ayc aycVar = new ayc(3, 0, 0, 126);
            bwjVar.y(1620586753);
            boolean G = bwjVar.G(this.a);
            aenr aenrVar2 = this.a;
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new aeju(aenrVar2, 10);
                bwjVar.B(h);
            }
            bwjVar.q();
            dqy dqyVar = null;
            ayb aybVar = new ayb(null, null, (arqr) h, 31);
            bwjVar.y(1620594118);
            double d = ((Configuration) bwjVar.g(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            bwjVar.q();
            aenr aenrVar3 = this.a;
            long j = bmp.a(bwjVar).s;
            aeno aenoVar = aenrVar3.a;
            afzq afzqVar = new afzq(aenoVar.c, j);
            aeop aeopVar = this.h;
            if (aeopVar.f) {
                dqyVar = new dqy(2.0f);
            }
            dqy dqyVar2 = dqyVar;
            double d2 = 0.25d * d;
            boolean z2 = aeopVar.d;
            aeno aenoVar2 = aenrVar.a;
            aenn aennVar = aenoVar.g;
            boolean z3 = aenoVar.e;
            Integer num = aenoVar.d;
            aenr aenrVar4 = this.a;
            Boolean bool = this.i;
            float f2 = this.j;
            afzv.k(aenoVar2.a, new Void[0], aenoVar2.b, a, b2, aycVar, aybVar, (float) d2, 4, num, z3, aennVar.a, afzqVar, bool, f2, z2, dqyVar2, aenrVar4.a.g.c, bwjVar, 113443392, 0);
        }
        return arnb.a;
    }
}
