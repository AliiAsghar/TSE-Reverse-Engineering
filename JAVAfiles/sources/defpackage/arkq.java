package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkq implements arki {
    public int a;
    private final asqv b;
    private final asqu c;
    private final arkl d;
    private boolean e;

    public arkq(asqv asqvVar) {
        this.b = asqvVar;
        asqu asquVar = new asqu();
        this.c = asquVar;
        this.d = new arkl(asquVar);
        this.a = 16384;
    }

    @Override // defpackage.arki
    public final synchronized void a() {
        if (!this.e) {
            if (arkr.a.isLoggable(Level.FINE)) {
                arkr.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", arkr.b.d()));
            }
            this.b.X(arkr.b.k());
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void b(boolean z, int i, asqu asquVar, int i2) {
        if (!this.e) {
            k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.b.hq(asquVar, i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // defpackage.arki
    public final synchronized void c() {
        if (!this.e) {
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.arki
    public final synchronized void d(boolean z, int i, int i2) {
        if (!this.e) {
            k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.b.P(i);
            this.b.P(i2);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void e(int i, arkh arkhVar) {
        if (!this.e) {
            if (arkhVar.s != -1) {
                k(i, 4, (byte) 3, (byte) 0);
                this.b.P(arkhVar.s);
                this.b.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void f(int i, long j) {
        if (!this.e) {
            if (j != 0) {
                k(i, 4, (byte) 8, (byte) 0);
                this.b.P((int) j);
                this.b.flush();
            } else {
                throw arkr.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void g(arkh arkhVar, byte[] bArr) {
        if (!this.e) {
            if (arkhVar.s != -1) {
                k(0, 8, (byte) 7, (byte) 0);
                this.b.P(0);
                this.b.P(arkhVar.s);
                this.b.flush();
            } else {
                throw arkr.d("errorCode.httpCode == -1", new Object[0]);
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void h(boolean z, int i, List list) {
        byte b;
        byte b2;
        int i2;
        int i3;
        if (!this.e) {
            arkl arklVar = this.d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                arkj arkjVar = (arkj) list.get(i4);
                asqx g = arkjVar.f.g();
                asqx asqxVar = arkjVar.g;
                Integer num = (Integer) arkm.c.get(g);
                if (num != null) {
                    int intValue = num.intValue();
                    i3 = intValue + 1;
                    if (i3 >= 2 && i3 <= 7) {
                        if (arkm.b[intValue].g.equals(asqxVar)) {
                            i2 = i3;
                        } else if (arkm.b[i3].g.equals(asqxVar)) {
                            i3 = intValue + 2;
                            i2 = i3;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i3 == -1) {
                    int i5 = arklVar.d + 1;
                    while (true) {
                        arkj[] arkjVarArr = arklVar.b;
                        if (i5 < arkjVarArr.length) {
                            if (arkjVarArr[i5].f.equals(g)) {
                                if (arklVar.b[i5].g.equals(asqxVar)) {
                                    int i6 = i5 - arklVar.d;
                                    int length = arkm.b.length;
                                    i3 = i6 + 61;
                                    break;
                                } else if (i2 == -1) {
                                    int i7 = i5 - arklVar.d;
                                    int length2 = arkm.b.length;
                                    i2 = i7 + 61;
                                }
                            }
                            i5++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                }
                if (i3 != -1) {
                    arklVar.c(i3, 127, 128);
                } else if (i2 == -1) {
                    arklVar.a.M(64);
                    arklVar.b(g);
                    arklVar.b(asqxVar);
                    arklVar.a(arkjVar);
                } else if (g.i(arkm.a) && !arkj.e.equals(g)) {
                    arklVar.c(i2, 15, 0);
                    arklVar.b(asqxVar);
                } else {
                    arklVar.c(i2, 63, 64);
                    arklVar.b(asqxVar);
                    arklVar.a(arkjVar);
                }
            }
            long j = this.c.b;
            int min = (int) Math.min(this.a, j);
            long j2 = min;
            if (j == j2) {
                b = 4;
            } else {
                b = 0;
            }
            k(i, min, (byte) 1, b);
            this.b.hq(this.c, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min(this.a, j3);
                    long j4 = min2;
                    j3 -= j4;
                    if (j3 == 0) {
                        b2 = 4;
                    } else {
                        b2 = 0;
                    }
                    k(i, min2, (byte) 9, b2);
                    this.b.hq(this.c, j4);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void i(asnn asnnVar) {
        if (!this.e) {
            int i = this.a;
            if ((asnnVar.a & 32) != 0) {
                i = ((int[]) asnnVar.b)[5];
            }
            this.a = i;
            k(0, 0, (byte) 4, (byte) 1);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.arki
    public final synchronized void j(asnn asnnVar) {
        int i;
        if (!this.e) {
            int i2 = 0;
            k(0, Integer.bitCount(asnnVar.a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (asnnVar.e(i2)) {
                    if (i2 == 4) {
                        int i3 = i2;
                        i2 = 3;
                        i = i3;
                    } else {
                        i = 7;
                        if (i2 == 7) {
                            i2 = 4;
                        } else {
                            i = i2;
                        }
                    }
                    this.b.Q(i2);
                    this.b.P(asnnVar.c(i));
                    i2 = i;
                }
                i2++;
            }
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    final void k(int i, int i2, byte b, byte b2) {
        if (arkr.a.isLoggable(Level.FINE)) {
            arkr.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", arko.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                asqv asqvVar = this.b;
                asqvVar.N((i2 >>> 16) & 255);
                asqvVar.N((i2 >>> 8) & 255);
                asqvVar.N(i2 & 255);
                this.b.N(b);
                this.b.N(b2);
                this.b.P(i & Integer.MAX_VALUE);
                return;
            }
            throw arkr.d("reserved bit set: %s", Integer.valueOf(i));
        }
        throw arkr.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
