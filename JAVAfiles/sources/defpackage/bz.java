package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bz extends cl {
    final /* synthetic */ cg a;

    public bz(cg cgVar) {
        this.a = cgVar;
    }

    @Override // defpackage.cl
    public final View a(int i) {
        View view = this.a.Q;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.a + " does not have a view");
    }

    @Override // defpackage.cl
    public final boolean b() {
        if (this.a.Q != null) {
            return true;
        }
        return false;
    }
}
