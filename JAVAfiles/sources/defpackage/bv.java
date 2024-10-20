package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bv extends cl {
    final /* synthetic */ cl a;
    final /* synthetic */ bw b;

    public bv(bw bwVar, cl clVar) {
        this.b = bwVar;
        this.a = clVar;
    }

    @Override // defpackage.cl
    public final View a(int i) {
        cl clVar = this.a;
        if (clVar.b()) {
            return clVar.a(i);
        }
        Dialog dialog = this.b.d;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.cl
    public final boolean b() {
        if (!this.a.b() && !this.b.e) {
            return false;
        }
        return true;
    }
}
