package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vik {
    public final String a;
    public final String b;

    public vik() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vik) {
            vik vikVar = (vik) obj;
            if (this.a.equals(vikVar.a) && this.b.equals(vikVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageFailureNotificationContent{contentTitle=" + this.a + ", contentText=" + this.b + "}";
    }

    public vik(String str, String str2) {
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
