package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class end implements enk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public end(enh enhVar, iba ibaVar, int i) {
        this.c = i;
        this.a = enhVar;
        this.b = ibaVar;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.c != 0) {
            if (enfVar == enf.ON_CREATE) {
                Object obj = this.a;
                Object obj2 = this.b;
                onBackInvokedDispatcher = ((Activity) obj).getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.getClass();
                ((rm) obj2).e(onBackInvokedDispatcher);
                return;
            }
            return;
        }
        if (enfVar == enf.ON_START) {
            ((enh) this.a).d(this);
            ((iba) this.b).d(enc.class);
        }
    }

    public /* synthetic */ end(rm rmVar, re reVar, int i) {
        this.c = i;
        this.b = rmVar;
        this.a = reVar;
    }
}
