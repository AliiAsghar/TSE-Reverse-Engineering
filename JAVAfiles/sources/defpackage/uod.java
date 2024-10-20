package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uod {
    public final Map a;
    public final Map b;

    public uod(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uod)) {
            return false;
        }
        uod uodVar = (uod) obj;
        if (d.F(this.a, uodVar.a) && d.F(this.b, uodVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DuplicationResult(potentialDuplicatesInDb=" + this.a + ", duplicatesInBatch=" + this.b + ")";
    }
}
