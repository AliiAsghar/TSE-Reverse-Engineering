package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnr implements enk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gnr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        View view;
        if (this.b != 0) {
            if (enfVar == enf.ON_STOP && (view = ((cg) this.a).Q) != null) {
                view.cancelPendingInputEvents();
                return;
            }
            return;
        }
        ((gns) this.a).a(false);
    }
}
