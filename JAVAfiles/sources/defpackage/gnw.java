package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnw extends gvf {
    public final List a = new ArrayList(3);

    private static final void j(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.gvf
    public final void bT(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gvf) it.next()).bT(i);
            }
        } catch (ConcurrentModificationException e) {
            j(e);
        }
    }

    @Override // defpackage.gvf
    public final void g(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gvf) it.next()).g(i);
            }
        } catch (ConcurrentModificationException e) {
            j(e);
        }
    }

    @Override // defpackage.gvf
    public final void h(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gvf) it.next()).h(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            j(e);
        }
    }

    public final void i(gvf gvfVar) {
        this.a.add(gvfVar);
    }
}
