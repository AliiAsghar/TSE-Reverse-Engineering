package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artd extends artc implements arsz {
    public artd(long j, long j2) {
        super(j, j2);
    }

    @Override // defpackage.artc, defpackage.arsz
    public final boolean a() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public final boolean b(long j) {
        if (this.a <= j && j <= this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.artc
    public final boolean equals(Object obj) {
        if (!(obj instanceof artd)) {
            return false;
        }
        if (a() && ((artd) obj).a()) {
            return true;
        }
        artd artdVar = (artd) obj;
        if (this.a != artdVar.a || this.b != artdVar.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.artc
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        long j = this.a;
        long j2 = this.b;
        return (int) (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.artc
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
