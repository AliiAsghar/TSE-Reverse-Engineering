package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anth {
    public static final anth a = new anth(DesugarCollections.unmodifiableMap(new HashMap()));
    public final Map b;

    public anth(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anth)) {
            return false;
        }
        return this.b.equals(((anth) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
