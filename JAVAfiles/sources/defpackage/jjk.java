package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjk {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public jjk(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjk)) {
            return false;
        }
        jjk jjkVar = (jjk) obj;
        if (this.a == jjkVar.a && this.b == jjkVar.b && this.c == jjkVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + a.v(this.b)) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "TransportDraftData(hasSubject=" + this.a + ", isUrgent=" + this.b + ", hasAttachments=" + this.c + ")";
    }
}
