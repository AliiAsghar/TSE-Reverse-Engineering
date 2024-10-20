package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arip implements asro {
    public final ariq c;
    public asro f;
    public Socket g;
    public int h;
    public int i;
    private final argl j;
    private boolean l;
    public final Object a = new Object();
    public final asqu b = new asqu();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public arip(argl arglVar, ariq ariqVar) {
        arglVar.getClass();
        this.j = arglVar;
        this.c = ariqVar;
    }

    @Override // defpackage.asro
    public final asrs a() {
        return asrs.j;
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new arer(this, 13));
    }

    @Override // defpackage.asro, java.io.Flushable
    public final void flush() {
        if (!this.k) {
            int i = armc.a;
            synchronized (this.a) {
                if (this.e) {
                    return;
                }
                this.e = true;
                this.j.execute(new arin(this));
                return;
            }
        }
        throw new IOException("closed");
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        if (!this.k) {
            int i = armc.a;
            synchronized (this.a) {
                this.b.hq(asquVar, j);
                int i2 = this.i + this.h;
                this.i = i2;
                boolean z = false;
                this.h = 0;
                if (!this.l && i2 > 10000) {
                    this.l = true;
                    z = true;
                } else {
                    if (!this.d && !this.e && this.b.h() > 0) {
                        this.d = true;
                    }
                    return;
                }
                if (z) {
                    try {
                        this.g.close();
                        return;
                    } catch (IOException e) {
                        this.c.a(e);
                        return;
                    }
                }
                this.j.execute(new arim(this));
                return;
            }
        }
        throw new IOException("closed");
    }
}
