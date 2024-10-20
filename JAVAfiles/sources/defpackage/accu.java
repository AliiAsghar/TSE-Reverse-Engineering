package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accu {
    private final String a;
    private final String b;
    private final int c;

    public accu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accu) {
            accu accuVar = (accu) obj;
            if (this.a.equals(accuVar.a) && this.b.equals(accuVar.b) && this.c == accuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "SystemPropertiesInfo{vendorBuildFingerprint=" + this.a + ", bootVerifiedBootState=" + this.b + ", bootFlashLocked=" + this.c + "}";
    }

    public accu(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
