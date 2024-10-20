package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrb {
    public final String a;

    public vrb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrb) {
            return this.a.equals(((vrb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LegacyConferenceUri{conferenceUri=" + this.a + "}";
    }

    public vrb(String str) {
        this.a = str;
    }
}
