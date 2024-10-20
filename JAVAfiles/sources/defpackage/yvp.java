package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvp {
    public static final xze a = xze.g("Bugle", "ViLTEPicker");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final cg g;

    public yvp(cg cgVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.g = cgVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.e = armfVar3;
        this.d = armfVar4;
        this.f = armfVar5;
    }

    public final void a(Runnable runnable, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amiw amiwVar = (amiw) aozyVar.b;
        amiw amiwVar2 = amiw.a;
        amiwVar.b |= 64;
        amiwVar.h = true;
        cg cgVar = this.g;
        View view = cgVar.Q;
        view.getClass();
        Snackbar q = Snackbar.q(view.getRootView(), cgVar.z().getString(R.string.snack_bar_video_call_error), 0);
        q.n();
        q.s(this.g.z().getString(R.string.action_advanced_feedback), new uai(runnable, 8));
        q.i();
    }
}
