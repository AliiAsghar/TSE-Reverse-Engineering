package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vy extends arrp implements arqw<wh, bwj, Integer, arnb> {
    final /* synthetic */ cez a;
    final /* synthetic */ Object b;
    final /* synthetic */ AnimatedContentTransitionScopeImpl c;
    final /* synthetic */ arqx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(cez cezVar, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, arqx arqxVar) {
        super(3);
        this.a = cezVar;
        this.b = obj;
        this.c = animatedContentTransitionScopeImpl;
        this.d = arqxVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean I;
        int i;
        wh whVar = (wh) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                I = bwjVar.G(whVar);
            } else {
                I = bwjVar.I(whVar);
            }
            if (true != I) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            boolean G = bwjVar.G(this.a) | bwjVar.I(this.b) | bwjVar.I(this.c);
            cez cezVar = this.a;
            Object obj4 = this.b;
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.c;
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new vx(cezVar, obj4, animatedContentTransitionScopeImpl);
                bwjVar.B(h);
            }
            bxl.c(whVar, (arqr) h, bwjVar);
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.c;
            Object obj5 = this.b;
            whVar.getClass();
            animatedContentTransitionScopeImpl2.d.j(obj5, ((wi) whVar).a);
            Object h2 = bwjVar.h();
            if (h2 == bwj.a.a) {
                h2 = new wc(whVar);
                bwjVar.B(h2);
            }
            this.d.a((wc) h2, this.b, bwjVar, 0);
        }
        return arnb.a;
    }
}
