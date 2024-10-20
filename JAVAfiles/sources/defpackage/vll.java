package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vll {
    public final String a;

    public vll() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vll) {
            return this.a.equals(((vll) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "NotificationSummaryBuilderInfo{groupKey=" + this.a + "}";
    }

    public vll(byte[] bArr) {
        this.a = "incoming_message_group_key";
    }
}
