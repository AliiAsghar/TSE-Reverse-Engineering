package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrj implements xzh {
    public final HashSet a = new HashSet();
    public final Object b = new Object();

    public final void a() {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = (HashSet) this.a.clone();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((uie) it.next()).b();
        }
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        a();
    }
}
