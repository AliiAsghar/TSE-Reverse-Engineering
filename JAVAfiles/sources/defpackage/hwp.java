package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwp implements hwb {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.hwb
    public final void k() {
        Iterator it = hyv.g(this.a).iterator();
        while (it.hasNext()) {
            ((hxq) it.next()).k();
        }
    }

    @Override // defpackage.hwb
    public final void l() {
        Iterator it = hyv.g(this.a).iterator();
        while (it.hasNext()) {
            ((hxq) it.next()).l();
        }
    }

    @Override // defpackage.hwb
    public final void m() {
        Iterator it = hyv.g(this.a).iterator();
        while (it.hasNext()) {
            ((hxq) it.next()).m();
        }
    }
}
