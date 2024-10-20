package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fim {
    public final long a;
    public final long b;

    public fim(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fim)) {
            return false;
        }
        fim fimVar = (fim) obj;
        if (this.a == fimVar.a && this.b == fimVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
