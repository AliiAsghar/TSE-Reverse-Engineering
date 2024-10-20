package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kvd implements abbm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kvd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.abbm
    public final oo a(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        if (this.b != 0) {
            itb itbVar = (itb) this.a;
            return new ajbx((zjm) itbVar.aq.f.c.get(i), itbVar.aq.c.G(viewGroup, i, layoutInflater));
        }
        return ((kxm) this.a).H(viewGroup, i, layoutInflater);
    }
}
