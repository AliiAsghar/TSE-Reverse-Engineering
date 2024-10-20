package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ascu implements ascp {
    public final long b;
    public final long c;

    public ascu(long j, long j2) {
        this.b = j;
        this.c = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            } else {
                throw new IllegalArgumentException(a.cn(j2, "replayExpiration(", " ms) cannot be negative"));
            }
        }
        throw new IllegalArgumentException(a.cn(j, "stopTimeout(", " ms) cannot be negative"));
    }

    @Override // defpackage.ascp
    public final asai a(ascv ascvVar) {
        return asar.a(new akee(new asdn(new asct(this, null), ascvVar), new fzj((arpe) null, 11, (boolean[][]) null), 7));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ascu) {
            ascu ascuVar = (ascu) obj;
            if (this.b == ascuVar.b && this.c == ascuVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.b) * 31) + a.A(this.c);
    }

    public final String toString() {
        aron aronVar = new aron(2);
        long j = this.b;
        if (j > 0) {
            aronVar.add(a.cn(j, "stopTimeout=", "ms"));
        }
        long j2 = this.c;
        if (j2 < Long.MAX_VALUE) {
            aronVar.add(a.cn(j2, "replayExpiration=", "ms"));
        }
        return "SharingStarted.WhileSubscribed(" + aqjn.aK(aqjn.x(aronVar), null, null, null, null, 63) + ")";
    }
}
