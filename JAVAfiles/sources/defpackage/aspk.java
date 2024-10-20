package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspk implements Closeable {
    private static final Logger b = Logger.getLogger(asom.class.getName());
    public int a;
    private final asqv c;
    private final asqu d;
    private boolean e;
    private final asok f;

    public aspk(asqv asqvVar) {
        asqvVar.getClass();
        this.c = asqvVar;
        asqu asquVar = new asqu();
        this.d = asquVar;
        this.a = 16384;
        this.f = new asok(asquVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r0 = r3.f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(defpackage.aspp r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r3.e     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L5a
            int r0 = r3.a     // Catch: java.lang.Throwable -> L62
            int r1 = r4.a     // Catch: java.lang.Throwable -> L62
            r1 = r1 & 32
            if (r1 == 0) goto L17
            java.lang.Object r0 = r4.b     // Catch: java.lang.Throwable -> L62
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L62
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L62
        L17:
            r3.a = r0     // Catch: java.lang.Throwable -> L62
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L62
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L4e
            asok r0 = r3.f     // Catch: java.lang.Throwable -> L62
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L62
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L62
            int r1 = r0.d     // Catch: java.lang.Throwable -> L62
            if (r1 != r4) goto L32
            goto L4e
        L32:
            if (r4 >= r1) goto L3c
            int r1 = r0.b     // Catch: java.lang.Throwable -> L62
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L62
            r0.b = r1     // Catch: java.lang.Throwable -> L62
        L3c:
            r0.c = r2     // Catch: java.lang.Throwable -> L62
            r0.d = r4     // Catch: java.lang.Throwable -> L62
            int r1 = r0.h     // Catch: java.lang.Throwable -> L62
            if (r4 >= r1) goto L4e
            if (r4 != 0) goto L4a
            r0.a()     // Catch: java.lang.Throwable -> L62
            goto L4e
        L4a:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L62
        L4e:
            r4 = 4
            r0 = 0
            r3.e(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L62
            asqv r4 = r3.c     // Catch: java.lang.Throwable -> L62
            r4.flush()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r3)
            return
        L5a:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r4     // Catch: java.lang.Throwable -> L62
        L62:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspk.a(aspp):void");
    }

    public final synchronized void b() {
        if (!this.e) {
            Logger logger = b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(asmt.j(">> CONNECTION ".concat(asom.a.d()), new Object[0]));
            }
            this.c.J(asom.a);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(boolean z, int i, asqu asquVar, int i2) {
        if (!this.e) {
            e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                asqv asqvVar = this.c;
                asquVar.getClass();
                asqvVar.hq(asquVar, i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.c.close();
    }

    public final synchronized void d() {
        if (!this.e) {
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            asqx asqxVar = asom.a;
            logger.fine(asom.b(false, i, i2, i3, i4));
        }
        int i5 = this.a;
        if (i2 <= i5) {
            if ((Integer.MIN_VALUE & i) == 0) {
                asqv asqvVar = this.c;
                byte[] bArr = asmt.a;
                asqvVar.N((i2 >>> 16) & 255);
                asqvVar.N((i2 >>> 8) & 255);
                asqvVar.N(i2 & 255);
                this.c.N(i3);
                this.c.N(i4);
                this.c.P(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.bV(i, "reserved bit set: "));
        }
        throw new IllegalArgumentException(a.bU(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
    }

    public final synchronized void f(boolean z, int i, List list) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.e) {
            asok asokVar = this.f;
            if (asokVar.c) {
                int i6 = asokVar.b;
                if (i6 < asokVar.d) {
                    asokVar.d(i6, 31, 32);
                }
                asokVar.c = false;
                asokVar.b = Integer.MAX_VALUE;
                asokVar.d(asokVar.d, 31, 32);
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                asoi asoiVar = (asoi) list.get(i7);
                asqx g = asoiVar.g.g();
                asqx asqxVar = asoiVar.h;
                asoi[] asoiVarArr = asol.a;
                Integer num = (Integer) asol.b.get(g);
                if (num != null) {
                    int intValue = num.intValue();
                    i5 = intValue + 1;
                    if (i5 >= 2 && i5 < 8) {
                        if (d.F(asol.a[intValue].h, asqxVar)) {
                            i4 = i5;
                        } else if (d.F(asol.a[i5].h, asqxVar)) {
                            i5 = intValue + 2;
                            i4 = i5;
                        }
                    }
                    i4 = i5;
                    i5 = -1;
                } else {
                    i4 = -1;
                    i5 = -1;
                }
                if (i5 == -1) {
                    int i8 = asokVar.f + 1;
                    int length = asokVar.e.length;
                    while (true) {
                        if (i8 < length) {
                            asoi asoiVar2 = asokVar.e[i8];
                            asoiVar2.getClass();
                            if (d.F(asoiVar2.g, g)) {
                                asoi asoiVar3 = asokVar.e[i8];
                                asoiVar3.getClass();
                                if (d.F(asoiVar3.h, asqxVar)) {
                                    int i9 = i8 - asokVar.f;
                                    int length2 = asol.a.length;
                                    i5 = i9 + 61;
                                    break;
                                } else if (i4 == -1) {
                                    int i10 = i8 - asokVar.f;
                                    int length3 = asol.a.length;
                                    i4 = i10 + 61;
                                }
                            }
                            i8++;
                        } else {
                            i5 = -1;
                            break;
                        }
                    }
                }
                if (i5 != -1) {
                    asokVar.d(i5, 127, 128);
                } else if (i4 == -1) {
                    asokVar.a.M(64);
                    asokVar.c(g);
                    asokVar.c(asqxVar);
                    asokVar.b(asoiVar);
                } else if (g.i(asoi.a) && !d.F(asoi.f, g)) {
                    asokVar.d(i4, 15, 0);
                    asokVar.c(asqxVar);
                } else {
                    asokVar.d(i4, 63, 64);
                    asokVar.c(asqxVar);
                    asokVar.b(asoiVar);
                }
            }
            long j = this.d.b;
            long min = Math.min(this.a, j);
            if (j == min) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            e(i, (int) min, 1, i2);
            this.c.hq(this.d, min);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.a, j2);
                    j2 -= min2;
                    int i11 = (int) min2;
                    if (j2 == 0) {
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                    e(i, i11, 9, i3);
                    this.c.hq(this.d, min2);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(boolean z, int i, int i2) {
        if (!this.e) {
            e(0, 8, 6, z ? 1 : 0);
            this.c.P(i);
            this.c.P(i2);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(aspp asppVar) {
        int i;
        if (!this.e) {
            e(0, Integer.bitCount(asppVar.a) * 6, 4, 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (asppVar.f(i2)) {
                    if (i2 != 4) {
                        if (i2 != 7) {
                            i = i2;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    this.c.Q(i);
                    this.c.P(asppVar.a(i2));
                }
            }
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void i(int i, long j) {
        if (!this.e) {
            if (j != 0 && j <= 2147483647L) {
                e(i, 4, 8, 0);
                this.c.P((int) j);
                this.c.flush();
            } else {
                throw new IllegalArgumentException(a.ck(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(int i, int i2) {
        if (!this.e) {
            e(i, 4, 3, 0);
            this.c.P(i2 - 1);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i, int i2) {
        if (!this.e) {
            e(0, 8, 7, 0);
            this.c.P(i);
            this.c.P(i2 - 1);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
