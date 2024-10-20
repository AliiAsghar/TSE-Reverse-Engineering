package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspc implements Closeable {
    public static final aspp a;
    public final asop b;
    public final Map c = new LinkedHashMap();
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final asmy h;
    public final asmx i;
    public final asmx j;
    public final asmx k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final aspp q;
    public aspp r;
    public long s;
    public long t;
    public final aspk u;
    public final asou v;
    public final Set w;
    private long x;
    private long y;
    private final Socket z;

    static {
        aspp asppVar = new aspp();
        asppVar.g(7, 65535);
        asppVar.g(5, 16384);
        a = asppVar;
    }

    public aspc(ason asonVar) {
        this.b = asonVar.f;
        String str = asonVar.c;
        asqw asqwVar = null;
        if (str == null) {
            arro.b("connectionName");
            str = null;
        }
        this.d = str;
        this.f = 3;
        asmy asmyVar = asonVar.a;
        this.h = asmyVar;
        this.i = asmyVar.a();
        this.j = asmyVar.a();
        this.k = asmyVar.a();
        aspp asppVar = new aspp();
        asppVar.g(7, 16777216);
        this.q = asppVar;
        this.r = a;
        this.t = r0.c();
        Socket socket = asonVar.b;
        if (socket == null) {
            arro.b("socket");
            socket = null;
        }
        this.z = socket;
        asqv asqvVar = asonVar.e;
        if (asqvVar == null) {
            arro.b("sink");
            asqvVar = null;
        }
        this.u = new aspk(asqvVar);
        asqw asqwVar2 = asonVar.d;
        if (asqwVar2 == null) {
            arro.b("source");
        } else {
            asqwVar = asqwVar2;
        }
        this.v = new asou(this, new aspf(asqwVar));
        this.w = new LinkedHashSet();
    }

    public static final boolean j(int i) {
        if ((i & 1) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized aspj a(int i) {
        return (aspj) this.c.get(Integer.valueOf(i));
    }

    public final synchronized aspj b(int i) {
        aspj aspjVar;
        aspjVar = (aspj) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return aspjVar;
    }

    public final void c(IOException iOException) {
        k(2, 2, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        k(1, 9, null);
    }

    public final void d() {
        this.u.d();
    }

    public final synchronized void e(long j) {
        long j2 = this.x + j;
        this.x = j2;
        long j3 = j2 - this.y;
        if (j3 >= this.q.c() / 2) {
            h(0, j3);
            this.y += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.u.a);
        r6 = r2;
        r8.s += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r9, boolean r10, defpackage.asqu r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L63
        L7:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L62
            monitor-enter(r8)
        Lc:
            long r4 = r8.s     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            long r6 = r8.t     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r8.c     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            if (r2 == 0) goto L24
            r8.wait()     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            goto Lc
        L24:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            throw r9     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L51
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L51
            aspk r4 = r8.u     // Catch: java.lang.Throwable -> L51
            int r4 = r4.a     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L51
            long r4 = r8.s     // Catch: java.lang.Throwable -> L51
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L51
            long r4 = r4 + r6
            r8.s = r4     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)
            long r12 = r12 - r6
            aspk r4 = r8.u
            if (r10 == 0) goto L4c
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r3
        L4d:
            r4.c(r5, r9, r11, r2)
            goto L7
        L51:
            r9 = move-exception
            goto L60
        L53:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L51
            r9.interrupt()     // Catch: java.lang.Throwable -> L51
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L51
            r9.<init>()     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L60:
            monitor-exit(r8)
            throw r9
        L62:
            return
        L63:
            aspk r12 = r8.u
            r12.c(r10, r9, r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspc.f(int, boolean, asqu, long):void");
    }

    public final void g(boolean z, int i, int i2) {
        try {
            this.u.g(z, i, i2);
        } catch (IOException e) {
            c(e);
        }
    }

    public final void h(int i, long j) {
        this.i.f(new aspb(this.d + "[" + i + "] windowUpdate", this, i, j));
    }

    public final synchronized boolean i(long j) {
        if (this.g) {
            return false;
        }
        if (this.n < this.m) {
            if (j >= this.p) {
                return false;
            }
        }
        return true;
    }

    public final void k(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        byte[] bArr = asmt.a;
        try {
            l(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.c.isEmpty()) {
                objArr = this.c.values().toArray(new aspj[0]);
                this.c.clear();
            } else {
                objArr = null;
            }
        }
        aspj[] aspjVarArr = (aspj[]) objArr;
        if (aspjVarArr != null) {
            for (aspj aspjVar : aspjVarArr) {
                try {
                    aspjVar.k(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.u.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.i.b();
        this.j.b();
        this.k.b();
    }

    public final void l(int i) {
        synchronized (this.u) {
            arrz arrzVar = new arrz();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                arrzVar.a = this.e;
                aspk aspkVar = this.u;
                int i2 = arrzVar.a;
                byte[] bArr = asmt.a;
                aspkVar.k(i2, i);
            }
        }
    }

    public final void m(int i, int i2) {
        this.u.j(i, i2);
    }

    public final void n(int i, int i2) {
        this.i.f(new aspa(this.d + "[" + i + "] writeSynReset", this, i, i2));
    }
}
