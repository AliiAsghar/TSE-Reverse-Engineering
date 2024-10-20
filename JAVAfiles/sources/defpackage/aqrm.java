package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqrm {
    public static final aqrm a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new aqrm(identityHashMap);
    }

    public aqrm(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(aqrl aqrlVar) {
        return this.b.get(aqrlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aqrm aqrmVar = (aqrm) obj;
        if (this.b.size() != aqrmVar.b.size()) {
            return false;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            if (!aqrmVar.b.containsKey(entry.getKey()) || !d.B(entry.getValue(), aqrmVar.b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
