package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kar implements kaa {
    public final miz a;
    public final myk b;
    public final boolean c;
    public final String d;
    public final aevr e = null;
    private final boolean f;

    public kar(miz mizVar, myk mykVar, boolean z, String str, boolean z2) {
        this.a = mizVar;
        this.b = mykVar;
        this.c = z;
        this.d = str;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kar)) {
            return false;
        }
        kar karVar = (kar) obj;
        if (!d.F(this.a, karVar.a) || !d.F(this.b, karVar.b) || this.c != karVar.c || !d.F(this.d, karVar.d) || this.f != karVar.f) {
            return false;
        }
        aevr aevrVar = karVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode()) * 31) + a.v(this.f)) * 31;
    }

    public final String toString() {
        return "FileBubbleArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ", isOutgoing=" + this.f + ", statusUiData=null)";
    }
}
