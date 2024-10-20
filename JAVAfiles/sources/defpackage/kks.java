package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kks {
    public final alog a;

    public kks() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kks) {
            return alzz.at(this.a, ((kks) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DonationConversation{messages=" + String.valueOf(this.a) + "}";
    }

    public kks(alog alogVar) {
        this.a = alogVar;
    }
}
