package defpackage;

import com.google.android.gms.feedback.LogOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqws {
    public boolean a;

    public aqws() {
        this.a = aqwt.a.b;
    }

    public final aqwt a() {
        return new aqwt(this.a);
    }

    public final void b() {
        this.a = true;
    }

    public final LogOptions c() {
        return new LogOptions(null, this.a, false, false, false, null);
    }

    public final void d() {
        this.a = true;
    }

    public final synchronized void e() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void f() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean g() {
        return this.a;
    }

    public final synchronized boolean h() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized void i() {
        this.a = false;
    }

    public final lq j() {
        return new lq(this.a);
    }

    public final void k() {
        this.a = false;
    }

    public aqws(byte[] bArr) {
        this.a = true;
    }

    public aqws(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = lq.a.b;
    }

    public aqws(char[] cArr) {
    }
}
