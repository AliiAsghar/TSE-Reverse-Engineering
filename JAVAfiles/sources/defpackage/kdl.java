package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdl implements kaa {
    public final miz a;
    public final myo b;
    public final boolean c;
    public final String d;

    public kdl(miz mizVar, myo myoVar, boolean z, String str) {
        myoVar.getClass();
        this.a = mizVar;
        this.b = myoVar;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdl)) {
            return false;
        }
        kdl kdlVar = (kdl) obj;
        if (d.F(this.a, kdlVar.a) && d.F(this.b, kdlVar.b) && this.c == kdlVar.c && d.F(this.d, kdlVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RichCardBubbleArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ")";
    }
}
