package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvd implements apus {
    private final apus a;
    private final long b;
    private final long c;
    private long d;
    private long e;

    public apvd(apus apusVar, int i) {
        boolean z;
        boolean z2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Chunk granularity must be greater than 0.");
        long j = i;
        if (j < apusVar.c()) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "Chunk granularity must be smaller than the read ahead limit.");
        long d = apusVar.d();
        long e = apusVar.e();
        if (e < 0) {
            while (apusVar.i() && apusVar.d() - apusVar.b() < apusVar.c()) {
                apusVar.f(apusVar.c());
            }
            e = apusVar.d();
            apusVar.h();
            apusVar.f(d - apusVar.b());
        } else {
            long b = apusVar.b() + apusVar.c();
            if (b > 0 && b < e) {
                e = b;
            }
        }
        long j2 = ((e - d) / j) * j;
        if (apusVar.c() < Long.MAX_VALUE) {
            d.s(j2 <= apusVar.c() - (apusVar.d() - apusVar.b()));
        }
        this.a = apusVar;
        this.b = apusVar.d();
        this.c = j2;
    }

    @Override // defpackage.apus
    public final synchronized int a(byte[] bArr, int i, int i2) {
        boolean z;
        int a;
        if (65536 - i >= i2) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min(i2, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.h();
            long b = (this.b - this.a.b()) + this.d;
            while (b > 0) {
                b -= this.a.f(b);
            }
        }
        a = this.a.a(bArr, i, min);
        this.d += a;
        return a;
    }

    @Override // defpackage.apus
    public final synchronized long b() {
        return this.e;
    }

    @Override // defpackage.apus
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.apus, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.apus
    public final synchronized long d() {
        return this.d;
    }

    @Override // defpackage.apus
    public final synchronized long e() {
        return this.c;
    }

    @Override // defpackage.apus
    public final synchronized long f(long j) {
        long f;
        long min = Math.min(j, this.c - this.d);
        if (this.b + this.d != this.a.d()) {
            this.a.h();
            long b = (this.b - this.a.b()) + this.d;
            while (b > 0) {
                b -= this.a.f(b);
            }
        }
        f = this.a.f(min);
        this.d += f;
        return f;
    }

    @Override // defpackage.apus
    public final synchronized void g() {
        this.e = this.d;
    }

    @Override // defpackage.apus
    public final synchronized void h() {
        this.d = this.e;
    }

    @Override // defpackage.apus
    public final synchronized boolean i() {
        if (this.d < this.c) {
            return true;
        }
        return false;
    }
}
