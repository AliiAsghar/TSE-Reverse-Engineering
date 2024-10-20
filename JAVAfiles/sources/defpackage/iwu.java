package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwu implements emx {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public iwu(aabk aabkVar, Compose2oFragment compose2oFragment, int i) {
        this.c = i;
        this.b = compose2oFragment;
        this.a = aabkVar;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                aabk aabkVar = (aabk) this.a;
                aabz aabzVar = aabkVar.n;
                Object obj = this.b;
                if (aabzVar.aT() && aabkVar.n.b()) {
                    ((Compose2oFragment) obj).E().g = aabkVar.g.b(-1);
                } else {
                    aapc E = ((Compose2oFragment) obj).E();
                    aabkVar.f.c();
                    aabkVar.f.b();
                    E.g = aabkVar.f.d();
                }
                ((aabk) this.a).o((Compose2oFragment) this.b);
                return;
            }
            Object obj2 = this.b;
            ila x = ixd.x((cg) this.a);
            x.k(((ixd) obj2).A());
            x.j(new rre(((ixd) this.b).ca));
            return;
        }
        albo.T(this.a instanceof akkh);
        Object E2 = ((akkh) this.a).E();
        albo.T(E2 instanceof itb);
        ixd ixdVar = (ixd) this.b;
        ixdVar.bX = (itb) E2;
        ixdVar.bX.an = ixdVar.A();
    }

    public iwu(ixd ixdVar, cg cgVar, int i) {
        this.c = i;
        this.a = cgVar;
        this.b = ixdVar;
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
