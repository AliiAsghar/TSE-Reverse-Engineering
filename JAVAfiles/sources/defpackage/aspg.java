package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspg implements asro {
    public final boolean a;
    public boolean b;
    final /* synthetic */ aspj c;
    private final asqu d = new asqu();

    public aspg(aspj aspjVar, boolean z) {
        this.c = aspjVar;
        this.a = z;
    }

    private final void c(boolean z) {
        long min;
        boolean z2;
        aspj aspjVar = this.c;
        synchronized (aspjVar) {
            aspjVar.j.e();
            while (aspjVar.e >= aspjVar.f && !this.a && !this.b && aspjVar.j() == 0) {
                try {
                    aspjVar.g();
                } finally {
                    aspjVar.j.b();
                }
            }
            aspjVar.j.b();
            aspjVar.e();
            min = Math.min(aspjVar.f - aspjVar.e, this.d.b);
            aspjVar.e += min;
            if (z && min == this.d.b) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.c.j.e();
        try {
            aspj aspjVar2 = this.c;
            aspjVar2.b.f(aspjVar2.a, z2, this.d, min);
        } finally {
            aspjVar = this.c;
        }
    }

    @Override // defpackage.asro
    public final asrs a() {
        return this.c.j;
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = asmt.a;
        aspj aspjVar = this.c;
        synchronized (aspjVar) {
            if (this.b) {
                return;
            }
            int j = aspjVar.j();
            aspj aspjVar2 = this.c;
            if (!aspjVar2.h.a) {
                if (this.d.b > 0) {
                    while (this.d.b > 0) {
                        c(true);
                    }
                } else if (j == 0) {
                    aspjVar2.b.f(aspjVar2.a, true, null, 0L);
                }
            }
            synchronized (this.c) {
                this.b = true;
            }
            this.c.b.d();
            this.c.d();
        }
    }

    @Override // defpackage.asro, java.io.Flushable
    public final void flush() {
        byte[] bArr = asmt.a;
        aspj aspjVar = this.c;
        synchronized (aspjVar) {
            aspjVar.e();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.d();
        }
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        byte[] bArr = asmt.a;
        this.d.hq(asquVar, j);
        while (this.d.b >= 16384) {
            c(false);
        }
    }
}
