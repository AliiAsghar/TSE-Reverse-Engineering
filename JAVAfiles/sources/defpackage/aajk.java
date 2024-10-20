package defpackage;

import android.widget.Toast;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aajk implements akbp<Void, Void> {
    final /* synthetic */ DebugGServiceKeysFragment a;

    public aajk(DebugGServiceKeysFragment debugGServiceKeysFragment) {
        this.a = debugGServiceKeysFragment;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        Toast.makeText(this.a.e.getContext(), "Error writing flags to file", 1).show();
        alvw i = DebugGServiceKeysFragment.a.i();
        i.X(alwp.a, "BugleDiagnostics");
        ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$2", "onFailure", '^', "DebugGServiceKeysFragment.java")).q("Error writing flags to file");
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Toast.makeText(this.a.e.getContext(), "Wrote flags to /d/d/c.g.a.a.m/cache/autorampflags.txt", 1).show();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
