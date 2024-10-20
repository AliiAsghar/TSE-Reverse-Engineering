package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzv {
    public final alpt a;
    public final boolean b;

    public kzv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kzv) {
            kzv kzvVar = (kzv) obj;
            if (this.a.equals(kzvVar.a) && this.b == kzvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "ConversationListChangePayload{changedViewParts=" + this.a.toString() + ", shouldRecalculate=" + this.b + "}";
    }

    public kzv(alpt alptVar, boolean z) {
        if (alptVar == null) {
            throw new NullPointerException("Null changedViewParts");
        }
        this.a = alptVar;
        this.b = z;
    }
}
