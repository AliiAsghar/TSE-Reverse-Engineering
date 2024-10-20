package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anja {
    public final aozb a;
    public final anip b;

    public anja() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anja) {
            anja anjaVar = (anja) obj;
            if (this.a.equals(anjaVar.a) && this.b.equals(anjaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        anip anipVar = this.b;
        return "TransportMessage{content=" + String.valueOf(this.a) + ", contentType=" + String.valueOf(anipVar) + "}";
    }

    public anja(aozb aozbVar, anip anipVar) {
        this.a = aozbVar;
        this.b = anipVar;
    }
}
