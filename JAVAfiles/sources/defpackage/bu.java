package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bu implements enz {
    final /* synthetic */ bw a;

    public bu(bw bwVar) {
        this.a = bwVar;
    }

    @Override // defpackage.enz
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((enm) obj) != null) {
            bw bwVar = this.a;
            if (bwVar.c) {
                View L = bwVar.L();
                if (L.getParent() == null) {
                    if (this.a.d != null) {
                        if (da.Y(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + this.a.d);
                        }
                        this.a.d.setContentView(L);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
