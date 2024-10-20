package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaj {
    public final int a;
    public final gef b;

    public gaj(int i, gef gefVar) {
        gefVar.getClass();
        this.a = i;
        this.b = gefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaj)) {
            return false;
        }
        gaj gajVar = (gaj) obj;
        if (this.a == gajVar.a && d.F(this.b, gajVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
