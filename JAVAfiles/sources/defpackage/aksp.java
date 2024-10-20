package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aksp {
    public akrc a = null;
    public boolean b = false;
    final /* synthetic */ aksr c;

    public aksp(aksr aksrVar) {
        this.c = aksrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(cg cgVar, boolean z) {
        if (z && this.a == null && !akqj.u()) {
            boolean v = akqj.v();
            this.b = v;
            if (!v) {
                this.a = this.c.b("FragmentTransaction Popped");
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && z && (cgVar instanceof akrw)) {
            ((akrw) cgVar).aZ(aktr.b());
        }
    }
}
