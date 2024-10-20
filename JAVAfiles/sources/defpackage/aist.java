package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aist implements aitf {
    final /* synthetic */ Bundle a;
    private final /* synthetic */ int b;

    public aist(Bundle bundle, int i) {
        this.b = i;
        this.a = bundle;
    }

    @Override // defpackage.aitf
    public final void a(aitx aitxVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (aitxVar instanceof aitu) {
                                    Bundle bundle = new Bundle();
                                    ((aitu) aitxVar).a();
                                    String H = aitg.H(aitxVar);
                                    H.getClass();
                                    this.a.putBundle(H, bundle);
                                    return;
                                }
                                return;
                            }
                            if (aitxVar instanceof aitk) {
                                aitg.I(aitxVar, this.a);
                                ((aitk) aitxVar).a();
                                return;
                            }
                            return;
                        }
                        if (aitxVar instanceof aitd) {
                            aite.I(aitxVar, this.a);
                            ((aitd) aitxVar).a();
                            return;
                        }
                        return;
                    }
                    if (aitxVar instanceof aitb) {
                        aite.I(aitxVar, this.a);
                        ((aitb) aitxVar).a();
                        return;
                    }
                    return;
                }
                if (aitxVar instanceof aisw) {
                    aite.I(aitxVar, this.a);
                    ((aisw) aitxVar).a();
                    return;
                }
                return;
            }
            if (aitxVar instanceof aisj) {
                aisv.I(aitxVar, this.a);
                ((aisj) aitxVar).a();
                return;
            }
            return;
        }
        if (aitxVar instanceof aisn) {
            aisv.I(aitxVar, this.a).getClass();
            ((aisn) aitxVar).a();
        }
    }
}
