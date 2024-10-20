package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arly extends aqtx {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public arly(List list, AtomicInteger atomicInteger) {
        d.t(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((aqtx) it.next()).hashCode();
        }
        this.c = i;
    }

    @Override // defpackage.aqtx
    public final aqtt a(aqtu aqtuVar) {
        return ((aqtx) this.a.get((this.b.getAndIncrement() & Integer.MAX_VALUE) % this.a.size())).a(aqtuVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof arly)) {
            return false;
        }
        arly arlyVar = (arly) obj;
        if (arlyVar == this) {
            return true;
        }
        if (this.c != arlyVar.c || this.b != arlyVar.b || this.a.size() != arlyVar.a.size() || !new HashSet(this.a).containsAll(arlyVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        algv ai = albo.ai(arly.class);
        ai.b("subchannelPickers", this.a);
        return ai.toString();
    }
}
