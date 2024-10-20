package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpq {
    public final alpt a;
    public final alpt b;

    public lpq(alpt alptVar, alpt alptVar2) {
        this.a = alptVar;
        this.b = alptVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpq)) {
            return false;
        }
        lpq lpqVar = (lpq) obj;
        if (d.F(this.a, lpqVar.a) && d.F(this.b, lpqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProcessedConversationIds(insertedIds=" + this.a + ", handledIds=" + this.b + ")";
    }
}
