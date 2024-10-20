package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajoc {
    public final int a;
    public final CopyOnWriteArrayList b;

    public ajoc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajoc) {
            ajoc ajocVar = (ajoc) obj;
            if (this.a == ajocVar.a && this.b.equals(ajocVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EventObserverList{subscribedKey=" + this.a + ", listeners=" + this.b.toString() + "}";
    }

    public ajoc(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = i;
        this.b = copyOnWriteArrayList;
    }
}
