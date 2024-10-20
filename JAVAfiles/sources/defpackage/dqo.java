package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqo {
    public static final dqo a = new dqo(0L, 3);
    public final long b;
    public final long c;

    public dqo(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqo)) {
            return false;
        }
        dqo dqoVar = (dqo) obj;
        if (a.bB(this.b, dqoVar.b) && a.bB(this.c, dqoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.b) * 31) + a.A(this.c);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) drm.d(this.b)) + ", restLine=" + ((Object) drm.d(this.c)) + ')';
    }

    public /* synthetic */ dqo(long j, int i) {
        this((i & 1) != 0 ? drn.c(0) : 0L, (i & 2) != 0 ? drn.c(0) : j);
    }
}
