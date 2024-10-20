package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kat implements kaa {
    public final mxf a;
    public final boolean b;
    public final String c;

    public kat(mxf mxfVar, boolean z, String str) {
        this.a = mxfVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kat)) {
            return false;
        }
        kat katVar = (kat) obj;
        if (d.F(this.a, katVar.a) && this.b == katVar.b && d.F(this.c, katVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PermanentFailureBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
