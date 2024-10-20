package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhq {
    public long a;
    public long b;
    public fhq c;
    public atal d;

    public fhq(long j) {
        c(j);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.d.a;
        return (int) j2;
    }

    public final fhq b() {
        this.d = null;
        fhq fhqVar = this.c;
        this.c = null;
        return fhqVar;
    }

    public final void c(long j) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.a = j;
        this.b = j + 65536;
    }
}
