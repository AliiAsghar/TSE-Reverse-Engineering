package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asph implements asrq {
    public final long a;
    public boolean b;
    public final asqu c = new asqu();
    public final asqu d = new asqu();
    public boolean e;
    final /* synthetic */ aspj f;

    public asph(aspj aspjVar, long j, boolean z) {
        this.f = aspjVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.f.i;
    }

    @Override // defpackage.asrq
    public final long b(asqu asquVar, long j) {
        Throwable th;
        Throwable th2;
        boolean z;
        long j2;
        do {
            aspj aspjVar = this.f;
            synchronized (aspjVar) {
                aspjVar.i.e();
                try {
                    th = null;
                    if (aspjVar.j() != 0 && !this.b) {
                        th2 = aspjVar.k;
                        if (th2 == null) {
                            int j3 = aspjVar.j();
                            if (j3 != 0) {
                                th2 = new aspq(j3);
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    if (!this.e) {
                        asqu asquVar2 = this.d;
                        long j4 = asquVar2.b;
                        z = false;
                        if (j4 > 0) {
                            j2 = asquVar2.b(asquVar, Math.min(8192L, j4));
                            long j5 = aspjVar.c + j2;
                            aspjVar.c = j5;
                            long j6 = j5 - aspjVar.d;
                            if (th2 == null) {
                                aspc aspcVar = aspjVar.b;
                                if (j6 >= aspcVar.q.c() / 2) {
                                    aspcVar.h(aspjVar.a, j6);
                                    aspjVar.d = aspjVar.c;
                                }
                            } else {
                                th = th2;
                            }
                        } else {
                            if (!this.b && th2 == null) {
                                aspjVar.g();
                                z = true;
                            } else {
                                th = th2;
                            }
                            j2 = -1;
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } finally {
                    aspjVar.i.b();
                }
            }
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    public final void c(long j) {
        byte[] bArr = asmt.a;
        this.f.b.e(j);
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        aspj aspjVar = this.f;
        synchronized (aspjVar) {
            this.e = true;
            asqu asquVar = this.d;
            j = asquVar.b;
            asquVar.z();
            aspjVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.d();
    }
}
