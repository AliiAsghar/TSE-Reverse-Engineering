package defpackage;

import android.support.v7.widget.SwitchCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pq extends dyp {
    private final Reference a;

    public pq(SwitchCompat switchCompat) {
        super(null);
        this.a = new WeakReference(switchCompat);
    }

    @Override // defpackage.dyp
    public final void a(Throwable th) {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.a();
        }
    }

    @Override // defpackage.dyp
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.a();
        }
    }
}
