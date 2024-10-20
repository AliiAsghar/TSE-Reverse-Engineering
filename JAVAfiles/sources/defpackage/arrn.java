package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arrn {
    private arrn() {
    }

    public static arta A(arta artaVar, int i) {
        artaVar.getClass();
        if (artaVar.c <= 0) {
            i = -i;
        }
        return new arta(artaVar.a, artaVar.b, i);
    }

    public static artb B(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return artb.d;
        }
        return new artb(i, i2 - 1);
    }

    public static Comparable C(Comparable comparable, arsy arsyVar) {
        if (!arsyVar.a()) {
            if (arsy.e(comparable, arsyVar.c()) && !arsy.e(arsyVar.c(), comparable)) {
                return arsyVar.c();
            }
            if (arsy.e(arsyVar.b(), comparable) && !arsy.e(comparable, arsyVar.b())) {
                return arsyVar.b();
            }
            return comparable;
        }
        throw new IllegalArgumentException(a.cc(arsyVar, "Cannot coerce value to an empty range: ", "."));
    }

    public static final arvv D(Object obj) {
        arvv arvvVar = new arvv();
        arvvVar.T(obj);
        return arvvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:
    
        r5 = defpackage.arwh.a;
        r5 = r0.d.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if ((r5 instanceof defpackage.arvw) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r5 = ((defpackage.arvw) r5).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        r0.c.b = 536870911;
        r0.d.c(defpackage.arvh.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return new defpackage.arvp(r5, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.arvp E(defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aset
            if (r0 != 0) goto Lb
            arvp r0 = new arvp
            r1 = 1
            r0.<init>(r5, r1)
            return r0
        Lb:
            r0 = r5
            aset r0 = (defpackage.aset) r0
            arve r1 = r0.f
        L10:
            java.lang.Object r2 = r1.a
            if (r2 != 0) goto L1d
            arve r0 = r0.f
            asfn r1 = defpackage.aseu.b
            r0.c(r1)
            r0 = 0
            goto L2e
        L1d:
            boolean r3 = r2 instanceof defpackage.arvp
            if (r3 == 0) goto L54
            arve r3 = r0.f
            asfn r4 = defpackage.aseu.b
            boolean r3 = r3.d(r2, r4)
            if (r3 == 0) goto L10
            r0 = r2
            arvp r0 = (defpackage.arvp) r0
        L2e:
            if (r0 == 0) goto L4d
            boolean r5 = defpackage.arwh.a
            arve r5 = r0.d
            java.lang.Object r5 = r5.a
            boolean r1 = r5 instanceof defpackage.arvw
            if (r1 == 0) goto L3e
            arvw r5 = (defpackage.arvw) r5
            java.lang.Object r5 = r5.d
        L3e:
            arvc r5 = r0.c
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5.b = r1
            arve r5 = r0.d
            arvh r1 = defpackage.arvh.a
            r5.c(r1)
            return r0
        L4d:
            arvp r0 = new arvp
            r1 = 2
            r0.<init>(r5, r1)
            return r0
        L54:
            asfn r3 = defpackage.aseu.b
            if (r2 == r3) goto L10
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 == 0) goto L5d
            goto L10
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Objects.toString(r2)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.E(arpe):arvp");
    }

    public static final void F(arvo arvoVar, arwu arwuVar) {
        ((arvp) arvoVar).B(new arvm(arwuVar, 2));
    }

    public static final Object G(arpi arpiVar, arqv arqvVar) {
        arwx arwxVar;
        arpi b;
        long j;
        arvx arvxVar;
        Thread currentThread = Thread.currentThread();
        arpf arpfVar = (arpf) arpiVar.get(arpf.k);
        if (arpfVar == null) {
            ThreadLocal threadLocal = aryl.a;
            arwxVar = aryl.a();
            b = arwa.b(arxg.a, arpiVar.plus(arwxVar));
        } else {
            if (arpfVar instanceof arwx) {
            }
            ThreadLocal threadLocal2 = aryl.a;
            arwxVar = (arwx) aryl.a.get();
            b = arwa.b(arxg.a, arpiVar);
        }
        arvk arvkVar = new arvk(b, currentThread, arwxVar);
        arwf.a.a(arqvVar, arvkVar, arvkVar);
        arwx arwxVar2 = arvkVar.b;
        if (arwxVar2 != null) {
            arwxVar2.o(false);
        }
        while (!Thread.interrupted()) {
            try {
                arwx arwxVar3 = arvkVar.b;
                if (arwxVar3 != null) {
                    j = arwxVar3.l();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!arvkVar.z()) {
                    LockSupport.parkNanos(arvkVar, j);
                } else {
                    arwx arwxVar4 = arvkVar.b;
                    if (arwxVar4 != null) {
                        arwxVar4.m(false);
                    }
                    Object b2 = arxx.b(arvkVar.G());
                    if (b2 instanceof arvx) {
                        arvxVar = (arvx) b2;
                    } else {
                        arvxVar = null;
                    }
                    if (arvxVar == null) {
                        return b2;
                    }
                    throw arvxVar.b;
                }
            } catch (Throwable th) {
                arwx arwxVar5 = arvkVar.b;
                if (arwxVar5 != null) {
                    arwxVar5.m(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        arvkVar.Q(interruptedException);
        throw interruptedException;
    }

    public static final Object H(arpi arpiVar, arqv arqvVar, arpe arpeVar) {
        return arro.q(arpiVar, arqvVar, arpeVar);
    }

    public static /* synthetic */ arwl I(arwe arweVar, arpi arpiVar, arwf arwfVar, arqv arqvVar, int i) {
        if ((i & 1) != 0) {
            arpiVar = arpj.a;
        }
        if ((i & 2) != 0) {
            arwfVar = arwf.a;
        }
        return arro.r(arweVar, arpiVar, arwfVar, arqvVar);
    }

    public static /* synthetic */ arxm J(arwe arweVar, arpi arpiVar, arwf arwfVar, arqv arqvVar, int i) {
        if ((i & 1) != 0) {
            arpiVar = arpj.a;
        }
        if ((i & 2) != 0) {
            arwfVar = arwf.a;
        }
        return arro.s(arweVar, arpiVar, arwfVar, arqvVar);
    }

    public static /* synthetic */ Object K(arqv arqvVar) {
        return G(arpj.a, arqvVar);
    }

    public static final void L(asdf asdfVar, Object obj) {
        if (asdfVar.a == obj) {
        } else {
            throw asdfVar;
        }
    }

    public static final Object M(arqv arqvVar, arpe arpeVar) {
        asdu asduVar = new asdu(arpeVar.u(), arpeVar);
        Object ay = arsd.ay(asduVar, asduVar, arqvVar);
        if (ay == arpl.a) {
            arpeVar.getClass();
        }
        return ay;
    }

    public static final Object N(asaj asajVar, asai[] asaiVarArr, arqg arqgVar, arqw arqwVar, arpe arpeVar) {
        Object M = M(new asds(asaiVarArr, arqgVar, arqwVar, asajVar, null), arpeVar);
        if (M == arpl.a) {
            return M;
        }
        return arnb.a;
    }

    public static final Object O(arpi arpiVar, Object obj, Object obj2, arqv arqvVar, arpe arpeVar) {
        Object a;
        Object b = asfq.b(arpiVar, obj2);
        try {
            ased asedVar = new ased(arpeVar, arpiVar);
            if (!(arqvVar instanceof arpq)) {
                a = arhi.g(arqvVar, obj, asedVar);
            } else {
                arsd.g(arqvVar, 2);
                a = arqvVar.a(obj, asedVar);
            }
            asfq.c(arpiVar, b);
            if (a == arpl.a) {
                arpeVar.getClass();
            }
            return a;
        } catch (Throwable th) {
            asfq.c(arpiVar, b);
            throw th;
        }
    }

    public static final asai P(asai asaiVar, asai asaiVar2, asai asaiVar3, arqx arqxVar) {
        return new akee(new asai[]{asaiVar, asaiVar2, asaiVar3}, arqxVar, 11);
    }

    public static final asai Q(asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, arqy arqyVar) {
        return new akee(new asai[]{asaiVar, asaiVar2, asaiVar3, asaiVar4}, arqyVar, 12);
    }

    public static final asai R(asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, asai asaiVar5, arqz arqzVar) {
        return new akee(new asai[]{asaiVar, asaiVar2, asaiVar3, asaiVar4, asaiVar5}, arqzVar, 13);
    }

    public static final ascg S(asai asaiVar, arwe arweVar, ascp ascpVar, int i) {
        ascn ab = ab(asaiVar, i);
        int i2 = ab.b;
        int i3 = ab.d;
        arpi arpiVar = ab.c;
        asai asaiVar2 = ab.a;
        ascc d = asck.d(i, i2, i3);
        ac(arweVar, arpiVar, asaiVar2, d, ascpVar, asck.a);
        return new asce(d);
    }

    public static final ascv T(asai asaiVar, arwe arweVar, ascp ascpVar, Object obj) {
        ascn ab = ab(asaiVar, 1);
        arpi arpiVar = ab.c;
        asai asaiVar2 = ab.a;
        ascd a = ascy.a(obj);
        ac(arweVar, arpiVar, asaiVar2, a, ascpVar, obj);
        return new ascf(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object U(defpackage.asai r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.asbo
            if (r0 == 0) goto L13
            r0 = r6
            asbo r0 = (defpackage.asbo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            asbo r0 = new asbo
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            agco r5 = r0.d
            arsb r0 = r0.c
            defpackage.aqil.P(r6)     // Catch: defpackage.asdf -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L5b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aqil.P(r6)
            arsb r6 = new arsb
            r6.<init>()
            asfn r2 = defpackage.asdy.a
            r6.a = r2
            agco r2 = new agco
            r4 = 13
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.asdf -> L57
            r0.d = r2     // Catch: defpackage.asdf -> L57
            r0.b = r3     // Catch: defpackage.asdf -> L57
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.asdf -> L57
            if (r5 == r1) goto L56
            r0 = r6
            goto L5e
        L56:
            return r1
        L57:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L5b:
            L(r6, r5)
        L5e:
            java.lang.Object r5 = r0.a
            asfn r6 = defpackage.asdy.a
            if (r5 == r6) goto L65
            return r5
        L65:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.U(asai, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object V(defpackage.asai r5, defpackage.arqv r6, defpackage.arpe r7) {
        /*
            boolean r0 = r7 instanceof defpackage.asbp
            if (r0 == 0) goto L13
            r0 = r7
            asbp r0 = (defpackage.asbp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asbp r0 = new asbp
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            zdd r5 = r0.e
            arsb r6 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r7)     // Catch: defpackage.asdf -> L2d
            goto L64
        L2d:
            r7 = move-exception
            goto L61
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r7)
            arsb r7 = new arsb
            r7.<init>()
            asfn r2 = defpackage.asdy.a
            r7.a = r2
            zdd r2 = new zdd
            r4 = 17
            r2.<init>(r6, r7, r4)
            r0.a = r6     // Catch: defpackage.asdf -> L5c
            r0.d = r7     // Catch: defpackage.asdf -> L5c
            r0.e = r2     // Catch: defpackage.asdf -> L5c
            r0.c = r3     // Catch: defpackage.asdf -> L5c
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.asdf -> L5c
            if (r5 == r1) goto L5b
            r0 = r6
            r6 = r7
            goto L64
        L5b:
            return r1
        L5c:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L61:
            L(r7, r5)
        L64:
            java.lang.Object r5 = r6.a
            asfn r6 = defpackage.asdy.a
            if (r5 == r6) goto L6b
            return r5
        L6b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.util.Objects.toString(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r7 = "Expected at least one element matching the predicate "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.V(asai, arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object W(defpackage.asai r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.asbr
            if (r0 == 0) goto L13
            r0 = r6
            asbr r0 = (defpackage.asbr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            asbr r0 = new asbr
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            agco r5 = r0.d
            arsb r0 = r0.c
            defpackage.aqil.P(r6)     // Catch: defpackage.asdf -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aqil.P(r6)
            arsb r6 = new arsb
            r6.<init>()
            agco r2 = new agco
            r4 = 14
            r2.<init>(r6, r4)
            r0.c = r6     // Catch: defpackage.asdf -> L53
            r0.d = r2     // Catch: defpackage.asdf -> L53
            r0.b = r3     // Catch: defpackage.asdf -> L53
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.asdf -> L53
            if (r5 == r1) goto L52
            r0 = r6
            goto L5a
        L52:
            return r1
        L53:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L57:
            L(r6, r5)
        L5a:
            java.lang.Object r5 = r0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.W(asai, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object X(defpackage.asai r5, defpackage.arqv r6, defpackage.arpe r7) {
        /*
            boolean r0 = r7 instanceof defpackage.asbs
            if (r0 == 0) goto L13
            r0 = r7
            asbs r0 = (defpackage.asbs) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            asbs r0 = new asbs
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            zdd r5 = r0.d
            arsb r6 = r0.c
            defpackage.aqil.P(r7)     // Catch: defpackage.asdf -> L2b
            goto L5a
        L2b:
            r7 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aqil.P(r7)
            arsb r7 = new arsb
            r7.<init>()
            zdd r2 = new zdd
            r4 = 18
            r2.<init>(r6, r7, r4)
            r0.c = r7     // Catch: defpackage.asdf -> L53
            r0.d = r2     // Catch: defpackage.asdf -> L53
            r0.b = r3     // Catch: defpackage.asdf -> L53
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.asdf -> L53
            if (r5 == r1) goto L52
            r6 = r7
            goto L5a
        L52:
            return r1
        L53:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L57:
            L(r7, r5)
        L5a:
            java.lang.Object r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.X(asai, arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Y(defpackage.asai r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.asbt
            if (r0 == 0) goto L13
            r0 = r6
            asbt r0 = (defpackage.asbt) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            asbt r0 = new asbt
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            arsb r5 = r0.c
            defpackage.aqil.P(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            arsb r6 = new arsb
            r6.<init>()
            asfn r2 = defpackage.asdy.a
            r6.a = r2
            agco r2 = new agco
            r4 = 15
            r2.<init>(r6, r4)
            r0.c = r6
            r0.b = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 == r1) goto L5e
            r5 = r6
        L4f:
            java.lang.Object r5 = r5.a
            asfn r6 = defpackage.asdy.a
            if (r5 == r6) goto L56
            return r5
        L56:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.Y(asai, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Z(defpackage.asaj r4, java.lang.Object r5, java.lang.Object r6, defpackage.arpe r7) {
        /*
            boolean r0 = r7 instanceof defpackage.asbc
            if (r0 == 0) goto L13
            r0 = r7
            asbc r0 = (defpackage.asbc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asbc r0 = new asbc
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r7)
            goto L3f
        L31:
            defpackage.aqil.P(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.fv(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            asdf r4 = new asdf
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.Z(asaj, java.lang.Object, java.lang.Object, arpe):java.lang.Object");
    }

    public static final String a(arrl arrlVar) {
        String obj = arrlVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public static final asai aa(asai asaiVar, int i) {
        if (i > 0) {
            return new asbe(asaiVar, i, 0);
        }
        throw new IllegalArgumentException(a.cb(i, "Requested element count ", " should be positive"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r4 == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.ascn ab(defpackage.asai r7, int r8) {
        /*
            boolean r0 = defpackage.arwh.a
            int r0 = defpackage.arzj.f
            int r0 = defpackage.arzi.a
            int r0 = r(r8, r0)
            boolean r1 = r7 instanceof defpackage.asdj
            int r0 = r0 - r8
            r2 = 1
            if (r1 == 0) goto L3c
            r1 = r7
            asdj r1 = (defpackage.asdj) r1
            asai r3 = r1.f()
            if (r3 == 0) goto L3c
            ascn r7 = new ascn
            int r4 = r1.b
            r5 = -3
            if (r4 == r5) goto L27
            r5 = -2
            if (r4 == r5) goto L27
            if (r4 == 0) goto L27
            r0 = r4
            goto L34
        L27:
            int r5 = r1.c
            r6 = 0
            if (r5 != r2) goto L2f
            if (r4 != 0) goto L34
            goto L33
        L2f:
            if (r8 != 0) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r6
        L34:
            int r8 = r1.c
            arpi r1 = r1.a
            r7.<init>(r3, r0, r8, r1)
            return r7
        L3c:
            ascn r8 = new ascn
            arpj r1 = defpackage.arpj.a
            r8.<init>(r7, r0, r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrn.ab(asai, int):ascn");
    }

    private static final void ac(arwe arweVar, arpi arpiVar, asai asaiVar, ascc asccVar, ascp ascpVar, Object obj) {
        arwf arwfVar;
        if (d.F(ascpVar, asco.a)) {
            arwfVar = arwf.a;
        } else {
            arwfVar = arwf.d;
        }
        arro.s(arweVar, arpiVar, arwfVar, new asbw(ascpVar, asaiVar, asccVar, obj, null));
    }

    public static final Iterator b(arqv arqvVar) {
        arty artyVar = new arty();
        artyVar.a = arhi.h(arqvVar, artyVar, artyVar);
        return artyVar;
    }

    public static artx c(artx artxVar) {
        if (artxVar instanceof artn) {
            return artxVar;
        }
        return new artn(artxVar);
    }

    public static artx d(arqg arqgVar) {
        return c(new artw(arqgVar, new arub(arqgVar), 0));
    }

    public static artx e(Object obj, arqr arqrVar) {
        if (obj == null) {
            return arts.a;
        }
        return new artw(new aruc(obj, 0), arqrVar, 0);
    }

    public static Object f(artx artxVar) {
        artxVar.getClass();
        Iterator a = artxVar.a();
        if (!a.hasNext()) {
            return null;
        }
        return a.next();
    }

    public static List g(artx artxVar) {
        Iterator a = artxVar.a();
        if (!a.hasNext()) {
            return arnv.a;
        }
        Object next = a.next();
        if (!a.hasNext()) {
            return aqjn.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return arrayList;
    }

    public static artx h(artx artxVar, int i) {
        if (i >= 0) {
            if (i != 0) {
                if (artxVar instanceof artr) {
                    return ((artr) artxVar).b(i);
                }
                return new arui(artxVar, i, 1);
            }
            return artxVar;
        }
        throw new IllegalArgumentException(a.cb(i, "Requested element count ", " is less than zero."));
    }

    public static artx i(artx artxVar, arqr arqrVar) {
        artxVar.getClass();
        return new artw(artxVar, arqrVar, 3);
    }

    public static artx j(artx artxVar, arqr arqrVar) {
        artxVar.getClass();
        return new artt(new artw(artxVar, arqrVar, 3), false, arua.c);
    }

    public static artx k(artx artxVar, int i) {
        if (i >= 0) {
            if (i == 0) {
                return arts.a;
            }
            if (artxVar instanceof artr) {
                return ((artr) artxVar).c(i);
            }
            return new arui(artxVar, i, 0);
        }
        throw new IllegalArgumentException(a.cb(i, "Requested element count ", " is less than zero."));
    }

    public static /* synthetic */ String l(artx artxVar, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator a = artxVar.a();
        int i = 0;
        while (a.hasNext()) {
            Object next = a.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            d.n(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static double m(double d, double d2) {
        if (d < d2) {
            return d2;
        }
        return d;
    }

    public static double n(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ".");
    }

    public static float o(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public static float p(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public static float q(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ".");
    }

    public static int r(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public static int s(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static int t(int i, arsz arszVar) {
        arszVar.getClass();
        if (!arszVar.a()) {
            artb artbVar = (artb) arszVar;
            if (i < artbVar.d().intValue()) {
                return artbVar.d().intValue();
            }
            if (i > artbVar.c().intValue()) {
                return artbVar.c().intValue();
            }
            return i;
        }
        throw new IllegalArgumentException(a.cc(arszVar, "Cannot coerce value to an empty range: ", "."));
    }

    public static int u(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException(a.cl(i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
    }

    public static long v(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    public static long w(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    public static long x(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    public static Comparable y(Comparable comparable, Comparable comparable2) {
        if (comparable.compareTo(comparable2) < 0) {
            return comparable2;
        }
        return comparable;
    }

    public static Comparable z(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 != null && comparable3 != null) {
            if (comparable2.compareTo(comparable3) <= 0) {
                if (comparable.compareTo(comparable2) < 0) {
                    return comparable2;
                }
                if (comparable.compareTo(comparable3) > 0) {
                    return comparable3;
                }
            } else {
                throw new IllegalArgumentException(a.ce(comparable2, comparable3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
            }
        } else {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }
}
