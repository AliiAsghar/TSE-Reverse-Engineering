package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kax implements kaa {
    public final boolean a;
    public final String b;
    private final mxf c;

    public kax(mxf mxfVar, boolean z, String str) {
        this.c = mxfVar;
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kax)) {
            return false;
        }
        kax kaxVar = (kax) obj;
        if (d.F(this.c, kaxVar.c) && this.a == kaxVar.a && d.F(this.b, kaxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + a.v(this.a)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SatelliteAttachmentFailureBubbleArgs(content=" + this.c + ", isHighlighted=" + this.a + ", contentDescription=" + this.b + ")";
    }
}
