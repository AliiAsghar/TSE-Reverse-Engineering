package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dro {
    public final long a;

    public /* synthetic */ dro(long j) {
        this.a = j;
    }

    public static String a(long j) {
        if (a.bB(j, 0L)) {
            return "Unspecified";
        }
        if (a.bB(j, 4294967296L)) {
            return "Sp";
        }
        if (a.bB(j, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dro) && this.a == ((dro) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
