package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wzr {
    public final alpt a;
    public final alpt b;
    public final alpt c;
    public final alpt d;

    public wzr() {
        throw null;
    }

    public final alpt a() {
        alpr alprVar = new alpr();
        alprVar.j(this.a);
        alprVar.j(this.c);
        return alprVar.g();
    }

    public final alpt b() {
        alpr alprVar = new alpr();
        alprVar.j(this.b);
        alprVar.j(this.a);
        alprVar.j(this.c);
        return alprVar.g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wzr) {
            wzr wzrVar = (wzr) obj;
            if (this.a.equals(wzrVar.a) && this.b.equals(wzrVar.b) && this.c.equals(wzrVar.c) && this.d.equals(wzrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        alpt alptVar = this.d;
        alpt alptVar2 = this.c;
        alpt alptVar3 = this.b;
        return "MessageEnvelope{from=" + this.a.toString() + ", to=" + alptVar3.toString() + ", cc=" + alptVar2.toString() + ", fromIdentities=" + alptVar.toString() + "}";
    }

    public wzr(alpt alptVar, alpt alptVar2, alpt alptVar3, alpt alptVar4) {
        if (alptVar == null) {
            throw new NullPointerException("Null from");
        }
        this.a = alptVar;
        if (alptVar2 != null) {
            this.b = alptVar2;
            if (alptVar3 != null) {
                this.c = alptVar3;
                if (alptVar4 != null) {
                    this.d = alptVar4;
                    return;
                }
                throw new NullPointerException("Null fromIdentities");
            }
            throw new NullPointerException("Null cc");
        }
        throw new NullPointerException("Null to");
    }
}
