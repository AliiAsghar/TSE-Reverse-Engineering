package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gxy implements arqr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gxy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [mtn, java.lang.Object] */
    @Override // defpackage.arqr
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            miz mizVar = (miz) obj;
                            return this.a.A(mizVar.b(), mizVar.h());
                        }
                        rsr rsrVar = (rsr) ((ixd) this.a).cl.a();
                        if (((Boolean) obj).booleanValue()) {
                            return Integer.valueOf(rsrVar.n());
                        }
                        return Integer.valueOf(rsrVar.m());
                    }
                    ((gzn) this.a).n((HashMap) obj);
                    return arnb.a;
                }
                ((gzn) this.a).o((HashMap) obj);
                return arnb.a;
            }
            ((gxz) this.a).b((HashMap) obj);
            return arnb.a;
        }
        ((gxz) this.a).a((HashMap) obj);
        return arnb.a;
    }
}
