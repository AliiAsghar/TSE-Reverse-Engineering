package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afil extends no {
    public static final /* synthetic */ artm[] c;
    public int d;
    public final arsn e = new afik(this);

    static {
        arrr arrrVar = new arrr(afil.class, "view", "getView()Landroid/view/View;", 0);
        int i = arsc.a;
        c = new artm[]{arrrVar};
    }

    @Override // defpackage.no
    public final int b() {
        return this.d;
    }

    @Override // defpackage.no
    public final int c(int i) {
        return 1;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        View view = (View) this.e.c(c[0]);
        if (view != null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new oo(view);
        }
        throw new IllegalStateException("View must be set before this adapter gets invoked");
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        ooVar.getClass();
    }
}
