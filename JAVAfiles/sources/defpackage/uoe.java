package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uoe {
    public final Map a;
    public final Map b;
    public final Optional c;

    public uoe(Map map, Map map2, Optional optional) {
        this.a = map;
        this.b = map2;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoe)) {
            return false;
        }
        uoe uoeVar = (uoe) obj;
        if (d.F(this.a, uoeVar.a) && d.F(this.b, uoeVar.b) && d.F(this.c, uoeVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SchedulingTransactionResult(duplicateRows=" + this.a + ", newRows=" + this.b + ", maybeSchedulingDeferred=" + this.c + ")";
    }
}
