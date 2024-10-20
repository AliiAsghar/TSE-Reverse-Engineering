package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arlu {
    final Collection a;
    final int b;

    public arlu(aqsq aqsqVar) {
        aqsqVar.getClass();
        if (aqsqVar.b.size() < 10) {
            this.a = aqsqVar.b;
        } else {
            this.a = new HashSet(aqsqVar.b);
        }
        Iterator it = aqsqVar.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((SocketAddress) it.next()).hashCode();
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arlu)) {
            return false;
        }
        arlu arluVar = (arlu) obj;
        if (arluVar.b != this.b || arluVar.a.size() != this.a.size()) {
            return false;
        }
        return arluVar.a.containsAll(this.a);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
