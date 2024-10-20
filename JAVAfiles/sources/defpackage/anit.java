package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anit {
    public static final anit a = new anit(anir.q, anis.a);
    public final anir b;
    public final anis c;

    public anit(anir anirVar, anis anisVar) {
        anirVar.getClass();
        anisVar.getClass();
        this.b = anirVar;
        this.c = anisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anit)) {
            return false;
        }
        anit anitVar = (anit) obj;
        if (this.b == anitVar.b && this.c == anitVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TachygramErrorReason(tachygramError=" + this.b + ", recoveryType=" + this.c + ")";
    }
}
