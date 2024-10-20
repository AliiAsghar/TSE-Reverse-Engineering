package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class agwv {
    final long h;

    public agwv(long j) {
        this.h = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long c(int i, int i2, int i3) {
        return (i2 << 32) | (i << 60) | i3;
    }

    public abstract int a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agwv) && this.h == ((agwv) obj).h) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a.A(this.h);
    }
}
