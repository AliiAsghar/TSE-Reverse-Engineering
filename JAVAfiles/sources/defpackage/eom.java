package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eom implements gjy {
    public Bundle a;
    private boolean b;
    private final arml c;
    private final iba d;

    public eom(iba ibaVar, eoz eozVar) {
        this.d = ibaVar;
        this.c = armd.a(new rd(eozVar, 9));
    }

    private final eon c() {
        return (eon) this.c.a();
    }

    @Override // defpackage.gjy
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((eog) entry.getValue()).e.a();
            if (!d.F(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (!this.b) {
            Bundle b = this.d.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.a;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b != null) {
                bundle.putAll(b);
            }
            this.a = bundle;
            this.b = true;
            c();
        }
    }
}
