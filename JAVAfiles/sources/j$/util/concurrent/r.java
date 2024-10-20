package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r extends l {
    private static final j$.sun.misc.a h;
    private static final long i;
    s e;
    volatile s f;
    volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a h2 = j$.sun.misc.a.h();
        h = h2;
        i = h2.j(r.class, "lockState");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        super(-2, null, null);
        int i2;
        int i3;
        s sVar2;
        this.f = sVar;
        s sVar3 = null;
        while (sVar != null) {
            s sVar4 = (s) sVar.d;
            sVar.g = null;
            sVar.f = null;
            if (sVar3 == null) {
                sVar.e = null;
                sVar.i = false;
            } else {
                Object obj = sVar.b;
                int i4 = sVar.a;
                s sVar5 = sVar3;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = sVar5.b;
                    int i5 = sVar5.a;
                    if (i5 > i4) {
                        i3 = -1;
                    } else if (i5 < i4) {
                        i3 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i6 = ConcurrentHashMap.g;
                            if (obj2 != null && obj2.getClass() == cls) {
                                i2 = ((Comparable) obj).compareTo(obj2);
                            } else {
                                i2 = 0;
                            }
                            if (i2 != 0) {
                                i3 = i2;
                            }
                        }
                        i3 = i(obj, obj2);
                    }
                    if (i3 <= 0) {
                        sVar2 = sVar5.f;
                    } else {
                        sVar2 = sVar5.g;
                    }
                    if (sVar2 == null) {
                        break;
                    } else {
                        sVar5 = sVar2;
                    }
                }
                sVar.e = sVar5;
                if (i3 <= 0) {
                    sVar5.f = sVar;
                } else {
                    sVar5.g = sVar;
                }
                sVar = c(sVar3, sVar);
            }
            sVar3 = sVar;
            sVar = sVar4;
        }
        this.e = sVar3;
    }

    static s b(s sVar, s sVar2) {
        boolean z;
        boolean z2;
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.e;
            if (sVar3 == null) {
                sVar2.i = false;
                return sVar2;
            }
            if (sVar2.i) {
                sVar2.i = false;
                return sVar;
            }
            s sVar4 = sVar3.f;
            s sVar5 = null;
            if (sVar4 == sVar2) {
                s sVar6 = sVar3.g;
                if (sVar6 != null && sVar6.i) {
                    sVar6.i = false;
                    sVar3.i = true;
                    sVar = g(sVar, sVar3);
                    sVar3 = sVar2.e;
                    sVar6 = sVar3 == null ? null : sVar3.g;
                }
                if (sVar6 != null) {
                    s sVar7 = sVar6.f;
                    s sVar8 = sVar6.g;
                    if ((sVar8 != null && sVar8.i) || (sVar7 != null && sVar7.i)) {
                        if (sVar8 == null || !sVar8.i) {
                            if (sVar7 != null) {
                                sVar7.i = false;
                            }
                            sVar6.i = true;
                            sVar = h(sVar, sVar6);
                            sVar3 = sVar2.e;
                            if (sVar3 != null) {
                                sVar5 = sVar3.g;
                            }
                            sVar6 = sVar5;
                        }
                        if (sVar6 != null) {
                            if (sVar3 == null) {
                                z2 = false;
                            } else {
                                z2 = sVar3.i;
                            }
                            sVar6.i = z2;
                            s sVar9 = sVar6.g;
                            if (sVar9 != null) {
                                sVar9.i = false;
                            }
                        }
                        if (sVar3 != null) {
                            sVar3.i = false;
                            sVar = g(sVar, sVar3);
                        }
                        sVar2 = sVar;
                    } else {
                        sVar6.i = true;
                    }
                }
                sVar2 = sVar3;
            } else {
                if (sVar4 != null && sVar4.i) {
                    sVar4.i = false;
                    sVar3.i = true;
                    sVar = h(sVar, sVar3);
                    sVar3 = sVar2.e;
                    sVar4 = sVar3 == null ? null : sVar3.f;
                }
                if (sVar4 != null) {
                    s sVar10 = sVar4.f;
                    s sVar11 = sVar4.g;
                    if ((sVar10 != null && sVar10.i) || (sVar11 != null && sVar11.i)) {
                        if (sVar10 == null || !sVar10.i) {
                            if (sVar11 != null) {
                                sVar11.i = false;
                            }
                            sVar4.i = true;
                            sVar = g(sVar, sVar4);
                            sVar3 = sVar2.e;
                            if (sVar3 != null) {
                                sVar5 = sVar3.f;
                            }
                            sVar4 = sVar5;
                        }
                        if (sVar4 != null) {
                            if (sVar3 == null) {
                                z = false;
                            } else {
                                z = sVar3.i;
                            }
                            sVar4.i = z;
                            s sVar12 = sVar4.f;
                            if (sVar12 != null) {
                                sVar12.i = false;
                            }
                        }
                        if (sVar3 != null) {
                            sVar3.i = false;
                            sVar = h(sVar, sVar3);
                        }
                        sVar2 = sVar;
                    } else {
                        sVar4.i = true;
                    }
                }
                sVar2 = sVar3;
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.i = true;
        while (true) {
            s sVar4 = sVar2.e;
            if (sVar4 == null) {
                sVar2.i = false;
                return sVar2;
            }
            if (!sVar4.i || (sVar3 = sVar4.e) == null) {
                break;
            }
            s sVar5 = sVar3.f;
            if (sVar4 == sVar5) {
                s sVar6 = sVar3.g;
                if (sVar6 != null && sVar6.i) {
                    sVar6.i = false;
                    sVar4.i = false;
                    sVar3.i = true;
                    sVar2 = sVar3;
                } else {
                    if (sVar2 == sVar4.g) {
                        sVar = g(sVar, sVar4);
                        s sVar7 = sVar4.e;
                        if (sVar7 == null) {
                            sVar3 = null;
                        } else {
                            sVar3 = sVar7.e;
                        }
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.i = false;
                        if (sVar3 != null) {
                            sVar3.i = true;
                            sVar = h(sVar, sVar3);
                        }
                    }
                }
            } else if (sVar5 != null && sVar5.i) {
                sVar5.i = false;
                sVar4.i = false;
                sVar3.i = true;
                sVar2 = sVar3;
            } else {
                if (sVar2 == sVar4.f) {
                    sVar = h(sVar, sVar4);
                    s sVar8 = sVar4.e;
                    if (sVar8 == null) {
                        sVar3 = null;
                    } else {
                        sVar3 = sVar8.e;
                    }
                    sVar4 = sVar8;
                    sVar2 = sVar4;
                }
                if (sVar4 != null) {
                    sVar4.i = false;
                    if (sVar3 != null) {
                        sVar3.i = true;
                        sVar = g(sVar, sVar3);
                    }
                }
            }
        }
        return sVar;
    }

    private final void d() {
        if (!h.c(this, i, 0, 1)) {
            boolean z = false;
            while (true) {
                int i2 = this.lockState;
                if ((i2 & (-3)) == 0) {
                    if (h.c(this, i, i2, 1)) {
                        break;
                    }
                } else if ((i2 & 2) == 0) {
                    if (h.c(this, i, i2, i2 | 2)) {
                        this.g = Thread.currentThread();
                        z = true;
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.g = null;
            }
        }
    }

    static s g(s sVar, s sVar2) {
        s sVar3;
        if (sVar2 != null && (sVar3 = sVar2.g) != null) {
            s sVar4 = sVar3.f;
            sVar2.g = sVar4;
            if (sVar4 != null) {
                sVar4.e = sVar2;
            }
            s sVar5 = sVar2.e;
            sVar3.e = sVar5;
            if (sVar5 == null) {
                sVar3.i = false;
                sVar = sVar3;
            } else if (sVar5.f == sVar2) {
                sVar5.f = sVar3;
            } else {
                sVar5.g = sVar3;
            }
            sVar3.f = sVar2;
            sVar2.e = sVar3;
        }
        return sVar;
    }

    static s h(s sVar, s sVar2) {
        s sVar3;
        if (sVar2 != null && (sVar3 = sVar2.f) != null) {
            s sVar4 = sVar3.g;
            sVar2.f = sVar4;
            if (sVar4 != null) {
                sVar4.e = sVar2;
            }
            s sVar5 = sVar2.e;
            sVar3.e = sVar5;
            if (sVar5 == null) {
                sVar3.i = false;
                sVar = sVar3;
            } else if (sVar5.g == sVar2) {
                sVar5.g = sVar3;
            } else {
                sVar5.f = sVar3;
            }
            sVar3.g = sVar2;
            sVar2.e = sVar3;
        }
        return sVar;
    }

    static int i(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            if (System.identityHashCode(obj) <= System.identityHashCode(obj2)) {
                return -1;
            }
            return 1;
        }
        return compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        l lVar = this.f;
        while (true) {
            s sVar = null;
            if (lVar == null) {
                return null;
            }
            int i3 = this.lockState;
            if ((i3 & 3) != 0) {
                if (lVar.a != i2 || ((obj2 = lVar.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    lVar = lVar.d;
                }
            } else {
                j$.sun.misc.a aVar = h;
                long j = i;
                if (aVar.c(this, j, i3, i3 + 4)) {
                    try {
                        s sVar2 = this.e;
                        if (sVar2 != null) {
                            sVar = sVar2.b(i2, obj, null);
                        }
                        if (aVar.f(this, j) == 6 && (thread2 = this.g) != null) {
                            LockSupport.unpark(thread2);
                        }
                        return sVar;
                    } catch (Throwable th) {
                        if (h.f(this, i) == 6 && (thread = this.g) != null) {
                            LockSupport.unpark(thread);
                        }
                        throw th;
                    }
                }
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.concurrent.s e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(j$.util.concurrent.s r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.f(j$.util.concurrent.s):boolean");
    }
}
