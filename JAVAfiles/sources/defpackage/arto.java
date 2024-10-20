package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arto extends arnf {
    private final Iterator a;
    private final HashSet b = new HashSet();

    public arto(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.arnf
    protected final void a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
            HashSet hashSet = this.b;
            Object next = it.next();
            if (hashSet.add(next)) {
                c(next);
                return;
            }
        }
        b();
    }
}
