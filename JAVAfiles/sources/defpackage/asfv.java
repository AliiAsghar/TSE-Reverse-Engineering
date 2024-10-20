package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfv extends Thread {
    public final arvc a;
    public boolean b;
    final /* synthetic */ asfw c;
    public int d;
    public final atqq e;
    private final arsb f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public asfv(asfw asfwVar, int i) {
        this.c = asfwVar;
        setDaemon(true);
        setContextClassLoader(asfwVar.getClass().getClassLoader());
        this.e = new atqq();
        this.f = new arsb();
        this.d = 4;
        this.a = new arvc(0, arvf.a);
        this.nextParkedWorker = asfw.a;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        c(i);
    }

    private final asga e() {
        if (a(2) == 0) {
            asga asgaVar = (asga) this.c.i.n();
            if (asgaVar != null) {
                return asgaVar;
            }
            return (asga) this.c.j.n();
        }
        asga asgaVar2 = (asga) this.c.j.n();
        if (asgaVar2 != null) {
            return asgaVar2;
        }
        return (asga) this.c.i.n();
    }

    private final asga f(int i) {
        asga asgaVar;
        boolean z;
        long j;
        long j2;
        long j3;
        int i2;
        int i3 = (int) (this.c.h.b & 2097151);
        if (i3 < 2) {
            return null;
        }
        int a = a(i3);
        asfw asfwVar = this.c;
        long j4 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            a++;
            if (a > i3) {
                a = 1;
            }
            asfv asfvVar = (asfv) asfwVar.g.a(a);
            if (asfvVar != null && asfvVar != this) {
                atqq atqqVar = asfvVar.e;
                arsb arsbVar = this.f;
                if (i == 3) {
                    asgaVar = atqqVar.f();
                } else {
                    int i5 = ((arvc) atqqVar.a).b;
                    int i6 = ((arvc) atqqVar.b).b;
                    while (i5 != i6) {
                        if (i == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && ((arvc) atqqVar.d).b == 0) {
                            break;
                        }
                        int i7 = i5 + 1;
                        asgaVar = atqqVar.g(i5, z);
                        if (asgaVar != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    asgaVar = null;
                }
                if (asgaVar != null) {
                    arsbVar.a = asgaVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        asga asgaVar2 = (asga) ((arve) atqqVar.c).a;
                        j = -2;
                        if (asgaVar2 == null) {
                            break;
                        }
                        if (true != asgaVar2.h) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        if ((i2 & i) == 0) {
                            break;
                        }
                        String str = asgc.a;
                        long nanoTime = System.nanoTime() - asgaVar2.g;
                        long j5 = asgc.b;
                        if (nanoTime < j5) {
                            j = j5 - nanoTime;
                            break;
                        }
                        if (((arve) atqqVar.c).d(asgaVar2, null)) {
                            arsbVar.a = asgaVar2;
                            j = -1;
                            break;
                        }
                    }
                    j2 = j;
                    j3 = -1;
                }
                if (j2 == j3) {
                    arsb arsbVar2 = this.f;
                    asga asgaVar3 = (asga) arsbVar2.a;
                    arsbVar2.a = null;
                    return asgaVar3;
                }
                if (j2 > 0) {
                    j4 = Math.min(j4, j2);
                }
            }
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.h = j4;
        return null;
    }

    private final boolean g() {
        if (this.nextParkedWorker != asfw.a) {
            return true;
        }
        return false;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i5 & i6;
        }
        return (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.asga b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.d
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            goto L7b
        L8:
            asfw r0 = r8.c
        La:
            arvd r3 = r0.h
            long r3 = r3.b
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r5 = (int) r5
            if (r5 != 0) goto L6b
            atqq r9 = r8.e
        L1c:
            java.lang.Object r0 = r9.c
            arve r0 = (defpackage.arve) r0
            java.lang.Object r0 = r0.a
            asga r0 = (defpackage.asga) r0
            if (r0 != 0) goto L27
            goto L37
        L27:
            boolean r3 = r0.h
            if (r3 != r2) goto L37
            java.lang.Object r3 = r9.c
            arve r3 = (defpackage.arve) r3
            boolean r3 = r3.d(r0, r1)
            if (r3 == 0) goto L1c
            r1 = r0
            goto L57
        L37:
            java.lang.Object r0 = r9.a
            arvc r0 = (defpackage.arvc) r0
            int r0 = r0.b
            java.lang.Object r3 = r9.b
            arvc r3 = (defpackage.arvc) r3
            int r3 = r3.b
        L43:
            if (r0 == r3) goto L57
            java.lang.Object r4 = r9.d
            arvc r4 = (defpackage.arvc) r4
            int r4 = r4.b
            if (r4 != 0) goto L4e
            goto L57
        L4e:
            int r3 = r3 + (-1)
            asga r4 = r9.g(r3, r2)
            if (r4 == 0) goto L43
            r1 = r4
        L57:
            if (r1 != 0) goto Lbb
            asfw r9 = r8.c
            asuo r9 = r9.j
            java.lang.Object r9 = r9.n()
            r1 = r9
            asga r1 = (defpackage.asga) r1
            if (r1 != 0) goto Lbb
            asga r1 = r8.f(r2)
            goto Lbb
        L6b:
            r5 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r5 = r5 + r3
            arvd r7 = r0.h
            boolean r3 = r7.c(r3, r5)
            if (r3 == 0) goto La
            r8.d = r2
        L7b:
            if (r9 == 0) goto Lb5
            asfw r9 = r8.c
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L89
            goto L8a
        L89:
            r2 = 0
        L8a:
            if (r2 == 0) goto L94
            asga r9 = r8.e()
            if (r9 == 0) goto L94
            r1 = r9
            goto Lbb
        L94:
            atqq r9 = r8.e
            java.lang.Object r0 = r9.c
            arve r0 = (defpackage.arve) r0
            java.lang.Object r0 = r0.a(r1)
            asga r0 = (defpackage.asga) r0
            if (r0 != 0) goto La8
            asga r9 = r9.f()
            r1 = r9
            goto La9
        La8:
            r1 = r0
        La9:
            if (r1 == 0) goto Lac
            goto Lbb
        Lac:
            if (r2 != 0) goto Lbc
            asga r1 = r8.e()
            if (r1 == 0) goto Lbc
            goto Lbb
        Lb5:
            asga r1 = r8.e()
            if (r1 == 0) goto Lbc
        Lbb:
            return r1
        Lbc:
            r9 = 3
            asga r9 = r8.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asfv.b(boolean):asga");
    }

    public final void c(int i) {
        String valueOf;
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        setName(this.c.e + "-worker-" + valueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.d;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            this.c.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.d = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        long j;
        int i;
        boolean z2 = false;
        loop0: while (true) {
            boolean z3 = z2;
            while (!this.c.d() && this.d != 5) {
                asga b = b(this.b);
                if (b != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.d == 3) {
                        boolean z4 = arwh.a;
                        this.d = 2;
                    }
                    if (b.h) {
                        if (d(2)) {
                            this.c.c();
                        }
                        asfw.f(b);
                        this.c.h.a(-2097152L);
                        if (this.d != 5) {
                            boolean z5 = arwh.a;
                            this.d = 4;
                        }
                    } else {
                        asfw.f(b);
                    }
                } else {
                    this.b = z2;
                    if (this.h != 0) {
                        if (!z3) {
                            z3 = true;
                        } else {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                        }
                    } else {
                        if (!g()) {
                            asfw asfwVar = this.c;
                            if (this.nextParkedWorker == asfw.a) {
                                arvd arvdVar = asfwVar.f;
                                do {
                                    j = arvdVar.b;
                                    i = this.indexInArray;
                                    boolean z6 = arwh.a;
                                    this.nextParkedWorker = asfwVar.g.a((int) (j & 2097151));
                                } while (!asfwVar.f.c(j, ((2097152 + j) & (-2097152)) | i));
                            } else {
                                z = z2;
                                z2 = z;
                            }
                        } else {
                            int i2 = -1;
                            this.a.b = -1;
                            while (g() && this.a.b == i2 && !this.c.d() && this.d != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + this.c.d;
                                }
                                LockSupport.parkNanos(this.c.d);
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    asfw asfwVar2 = this.c;
                                    synchronized (asfwVar2.g) {
                                        if (!asfwVar2.d()) {
                                            if (((int) (asfwVar2.h.b & 2097151)) > asfwVar2.b) {
                                                if (this.a.c(i2, 1)) {
                                                    int i3 = this.indexInArray;
                                                    c(0);
                                                    asfwVar2.b(this, i3, 0);
                                                    int andDecrement = (int) (arvd.a.getAndDecrement(asfwVar2.h) & 2097151);
                                                    if (andDecrement != i3) {
                                                        Object a = asfwVar2.g.a(andDecrement);
                                                        a.getClass();
                                                        asfv asfvVar = (asfv) a;
                                                        asfwVar2.g.b(i3, asfvVar);
                                                        asfvVar.c(i3);
                                                        asfwVar2.b(asfvVar, andDecrement, i3);
                                                    }
                                                    asfwVar2.g.b(andDecrement, null);
                                                    this.d = 5;
                                                    i2 = -1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        z2 = z;
                    }
                }
            }
        }
        d(5);
    }
}
