package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vjc {
    public final String a;
    public final String b;

    public vjc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vjc) {
            vjc vjcVar = (vjc) obj;
            if (this.a.equals(vjcVar.a) && this.b.equals(vjcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "StuckMessagesNotificationContent{contentTitle=" + this.a + ", contentText=" + this.b + "}";
    }

    public vjc(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null contentTitle");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null contentText");
    }
}
