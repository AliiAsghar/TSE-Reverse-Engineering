package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfo {
    public final long a;
    public final long b;

    public bfo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfo)) {
            return false;
        }
        bfo bfoVar = (bfo) obj;
        if (a.bB(this.a, bfoVar.a) && a.bB(this.b, bfoVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) cku.g(this.a)) + ", selectionBackgroundColor=" + ((Object) cku.g(this.b)) + ')';
    }
}
