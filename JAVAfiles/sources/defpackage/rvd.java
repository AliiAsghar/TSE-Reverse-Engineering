package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvd {
    public final long a;

    public rvd(long j) {
        this.a = j;
    }

    public final boolean a(vbe vbeVar) {
        if ((this.a & vbeVar.a()) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvd) || this.a != ((rvd) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }
}
