package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pub {
    private final String a;
    private final String b;

    public pub() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pub) {
            pub pubVar = (pub) obj;
            if (this.a.equals(pubVar.a) && this.b.equals(pubVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PresenceCapability{serviceId=" + this.a + ", version=" + this.b + "}";
    }

    public pub(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
