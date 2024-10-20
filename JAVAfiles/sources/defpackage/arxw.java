package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
@armg
/* loaded from: classes4.dex */
public class arxw implements arxm {
    private final arve a;
    public final arve d;

    public arxw(boolean z) {
        arww arwwVar;
        if (z) {
            arwwVar = arxx.g;
        } else {
            arwwVar = arxx.f;
        }
        this.d = new arve(arwwVar, arvf.a);
        this.a = new arve(null, arvf.a);
    }

    private final Object e(Object obj, Object obj2) {
        arxs arxsVar;
        arvx arvxVar;
        if (!(obj instanceof arxi)) {
            return arxx.a;
        }
        if (((obj instanceof arww) || (obj instanceof arxp)) && !(obj instanceof arvu) && !(obj2 instanceof arvx)) {
            arxi arxiVar = (arxi) obj;
            boolean z = arwh.a;
            if (!this.d.d(arxiVar, arxx.a(obj2))) {
                return arxx.c;
            }
            hj(obj2);
            k(arxiVar, obj2);
            return obj2;
        }
        arxi arxiVar2 = (arxi) obj;
        aryb i = i(arxiVar2);
        if (i == null) {
            return arxx.c;
        }
        Throwable th = null;
        if (arxiVar2 instanceof arxs) {
            arxsVar = (arxs) arxiVar2;
        } else {
            arxsVar = null;
        }
        if (arxsVar == null) {
            arxsVar = new arxs(i, null);
        }
        arsb arsbVar = new arsb();
        synchronized (arxsVar) {
            if (arxsVar.h()) {
                return arxx.a;
            }
            arxsVar.b.b = 1;
            if (arxsVar != arxiVar2 && !this.d.d(arxiVar2, arxsVar)) {
                return arxx.c;
            }
            boolean z2 = arwh.a;
            boolean g = arxsVar.g();
            if (obj2 instanceof arvx) {
                arvxVar = (arvx) obj2;
            } else {
                arvxVar = null;
            }
            if (arvxVar != null) {
                arxsVar.e(arvxVar.b);
            }
            Throwable d = arxsVar.d();
            boolean z3 = !g;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = d;
            }
            arsbVar.a = th;
            Throwable th2 = (Throwable) arsbVar.a;
            if (th2 != null) {
                l(i, th2);
            }
            arvu K = K(i);
            if (K != null && U(arxsVar, K, obj2)) {
                return arxx.b;
            }
            i.j(2);
            arvu K2 = K(i);
            if (K2 != null && U(arxsVar, K2, obj2)) {
                return arxx.b;
            }
            return E(arxsVar, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    private final Throwable f(Object obj) {
        CancellationException cancellationException;
        CancellationException cancellationException2 = null;
        if (obj != null && !(obj instanceof Throwable)) {
            arxw arxwVar = (arxw) obj;
            Object G = arxwVar.G();
            if (G instanceof arxs) {
                cancellationException = ((arxs) G).d();
            } else if (G instanceof arvx) {
                cancellationException = ((arvx) G).b;
            } else if (!(G instanceof arxi)) {
                cancellationException = null;
            } else {
                Objects.toString(G);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(G)));
            }
            if (cancellationException instanceof CancellationException) {
                cancellationException2 = cancellationException;
            }
            if (cancellationException2 == null) {
                return new arxn("Parent job is ".concat(u(G)), cancellationException, arxwVar);
            }
            return cancellationException2;
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        return new arxn(g(), null, this);
    }

    private final aryb i(arxi arxiVar) {
        aryb hc = arxiVar.hc();
        if (hc == null) {
            if (arxiVar instanceof arww) {
                return new aryb();
            }
            if (arxiVar instanceof arxp) {
                o((arxp) arxiVar);
                return null;
            }
            Objects.toString(arxiVar);
            throw new IllegalStateException("State should have list: ".concat(String.valueOf(arxiVar)));
        }
        return hc;
    }

    private final void k(arxi arxiVar, Object obj) {
        arvx arvxVar;
        Throwable th;
        arvt J = J();
        if (J != null) {
            J.hd();
            P(aryd.a);
        }
        arvy arvyVar = null;
        if (obj instanceof arvx) {
            arvxVar = (arvx) obj;
        } else {
            arvxVar = null;
        }
        if (arvxVar != null) {
            th = arvxVar.b;
        } else {
            th = null;
        }
        if (arxiVar instanceof arxp) {
            try {
                ((arxp) arxiVar).a(th);
                return;
            } catch (Throwable th2) {
                hi(new arvy(a.cd(this, arxiVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        aryb hc = arxiVar.hc();
        if (hc != null) {
            hc.j(1);
            Object f = hc.f();
            f.getClass();
            for (asfe asfeVar = (asfe) f; !d.F(asfeVar, hc); asfeVar = asfeVar.h()) {
                if (asfeVar instanceof arxp) {
                    try {
                        ((arxp) asfeVar).a(th);
                    } catch (Throwable th3) {
                        if (arvyVar != null) {
                            armd.c(arvyVar, th3);
                        } else {
                            arvyVar = new arvy(a.cd(this, asfeVar, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (arvyVar != null) {
                hi(arvyVar);
            }
        }
    }

    private final void l(aryb arybVar, Throwable th) {
        arybVar.j(4);
        Object f = arybVar.f();
        f.getClass();
        arvy arvyVar = null;
        for (asfe asfeVar = (asfe) f; !d.F(asfeVar, arybVar); asfeVar = asfeVar.h()) {
            if (asfeVar instanceof arxp) {
                arxp arxpVar = (arxp) asfeVar;
                if (arxpVar.b()) {
                    try {
                        arxpVar.a(th);
                    } catch (Throwable th2) {
                        if (arvyVar != null) {
                            armd.c(arvyVar, th2);
                        } else {
                            arvyVar = new arvy(a.cd(this, asfeVar, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (arvyVar != null) {
            hi(arvyVar);
        }
        p(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [arxh] */
    private final void n(arww arwwVar) {
        aryb arybVar = new aryb();
        if (!arwwVar.a) {
            arybVar = new arxh(arybVar);
        }
        this.d.d(arwwVar, arybVar);
    }

    private final void o(arxp arxpVar) {
        aryb arybVar = new aryb();
        arybVar.f.b(arxpVar);
        arybVar.e.b(arxpVar);
        while (true) {
            if (arxpVar.f() != arxpVar) {
                break;
            } else if (arxpVar.e.d(arxpVar, arybVar)) {
                arybVar.k(arxpVar);
                break;
            }
        }
        this.d.d(arxpVar, arxpVar.h());
    }

    private final boolean p(Throwable th) {
        if (hn()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        arvt J = J();
        if (J != null && J != aryd.a) {
            if (J.d(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    private static final String u(Object obj) {
        if (obj instanceof arxs) {
            arxs arxsVar = (arxs) obj;
            if (arxsVar.g()) {
                return "Cancelling";
            }
            if (!arxsVar.h()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof arxi) {
            if (((arxi) obj).he()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof arvx) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // defpackage.arxm
    public final boolean A() {
        int C;
        do {
            C = C(G());
            if (C == 0) {
                return false;
            }
        } while (C != 1);
        return true;
    }

    public final int C(Object obj) {
        if (obj instanceof arww) {
            if (((arww) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, arxx.g)) {
                return -1;
            }
            O();
            return 1;
        }
        if (!(obj instanceof arxh)) {
            return 0;
        }
        if (!this.d.d(obj, ((arxh) obj).a)) {
            return -1;
        }
        O();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[Catch: all -> 0x013a, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:31:0x00cc, B:32:0x00d0, B:34:0x00d6, B:36:0x00e0, B:41:0x00e8, B:44:0x00ec, B:47:0x00f2, B:55:0x00c8, B:69:0x0068, B:70:0x006c, B:72:0x0072, B:76:0x007f, B:78:0x0083, B:80:0x008d, B:81:0x0091, B:83:0x0097, B:86:0x00a0, B:90:0x00a5, B:101:0x0023, B:103:0x0027, B:104:0x0031, B:106:0x0035, B:107:0x0127, B:108:0x0139), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[Catch: all -> 0x013a, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:31:0x00cc, B:32:0x00d0, B:34:0x00d6, B:36:0x00e0, B:41:0x00e8, B:44:0x00ec, B:47:0x00f2, B:55:0x00c8, B:69:0x0068, B:70:0x006c, B:72:0x0072, B:76:0x007f, B:78:0x0083, B:80:0x008d, B:81:0x0091, B:83:0x0097, B:86:0x00a0, B:90:0x00a5, B:101:0x0023, B:103:0x0027, B:104:0x0031, B:106:0x0035, B:107:0x0127, B:108:0x0139), top: B:7:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(defpackage.arxs r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxw.E(arxs, java.lang.Object):java.lang.Object");
    }

    public final Object F() {
        Object G = G();
        if (!(G instanceof arxi)) {
            if (!(G instanceof arvx)) {
                return arxx.b(G);
            }
            throw ((arvx) G).b;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final Object G() {
        return this.d.a;
    }

    public final Object H(Object obj) {
        Object e;
        arvx arvxVar;
        do {
            e = e(G(), obj);
            if (e == arxx.a) {
                String cd = a.cd(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                Throwable th = null;
                if (obj instanceof arvx) {
                    arvxVar = (arvx) obj;
                } else {
                    arvxVar = null;
                }
                if (arvxVar != null) {
                    th = arvxVar.b;
                }
                throw new IllegalStateException(cd, th);
            }
        } while (e == arxx.c);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CancellationException I(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = g();
            }
            cancellationException = new arxn(str, th, this);
        }
        return cancellationException;
    }

    public final arvt J() {
        return (arvt) this.a.a;
    }

    public final arvu K(asfe asfeVar) {
        while (asfeVar.hf()) {
            asfeVar = asfeVar.i();
        }
        while (true) {
            asfeVar = asfeVar.h();
            if (!asfeVar.hf()) {
                if (asfeVar instanceof arvu) {
                    return (arvu) asfeVar;
                }
                if (asfeVar instanceof aryb) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.arwu L(boolean r5, defpackage.arxp r6) {
        /*
            r4 = this;
            r6.d = r4
        L2:
            java.lang.Object r0 = r4.G()
            boolean r1 = r0 instanceof defpackage.arww
            if (r1 == 0) goto L1e
            r1 = r0
            arww r1 = (defpackage.arww) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L1a
            arve r1 = r4.d
            boolean r0 = r1.d(r0, r6)
            if (r0 == 0) goto L2
            goto L5e
        L1a:
            r4.n(r1)
            goto L2
        L1e:
            boolean r1 = r0 instanceof defpackage.arxi
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            arxi r1 = (defpackage.arxi) r1
            aryb r3 = r1.hc()
            if (r3 != 0) goto L35
            r0.getClass()
            arxp r0 = (defpackage.arxp) r0
            r4.o(r0)
            goto L2
        L35:
            boolean r0 = r6.b()
            if (r0 == 0) goto L57
            boolean r0 = r1 instanceof defpackage.arxs
            if (r0 == 0) goto L42
            arxs r1 = (defpackage.arxs) r1
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L49
            java.lang.Throwable r2 = r1.d()
        L49:
            if (r2 != 0) goto L51
            r0 = 5
            boolean r0 = r3.l(r6, r0)
            goto L5c
        L51:
            if (r5 == 0) goto L74
            r6.a(r2)
            goto L74
        L57:
            r0 = 1
            boolean r0 = r3.l(r6, r0)
        L5c:
            if (r0 == 0) goto L2
        L5e:
            return r6
        L5f:
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.G()
            boolean r0 = r5 instanceof defpackage.arvx
            if (r0 == 0) goto L6c
            arvx r5 = (defpackage.arvx) r5
            goto L6d
        L6c:
            r5 = r2
        L6d:
            if (r5 == 0) goto L71
            java.lang.Throwable r2 = r5.b
        L71:
            r6.a(r2)
        L74:
            aryd r5 = defpackage.aryd.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxw.L(boolean, arxp):arwu");
    }

    public void M(Throwable th) {
        Q(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void N(arxm arxmVar) {
        boolean z = arwh.a;
        if (arxmVar == null) {
            P(aryd.a);
            return;
        }
        arxmVar.A();
        arvt ho = arxmVar.ho(this);
        P(ho);
        if (z()) {
            ho.hd();
            P(aryd.a);
        }
    }

    public final void P(arvt arvtVar) {
        this.a.c(arvtVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r0 = defpackage.arxx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r1 == defpackage.arxx.b) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r0 = e(r0, new defpackage.arvx(f(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 == defpackage.arxx.c) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r1 != defpackage.arxx.a) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r3 = G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r3 instanceof defpackage.arxs) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if ((r3 instanceof defpackage.arxi) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r1 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        r1 = f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r4 = (defpackage.arxi) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r0 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r4.he() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        r4 = e(r3, new defpackage.arvx(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r4 == defpackage.arxx.a) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r4 == defpackage.arxx.c) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r0 = G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        java.util.Objects.toString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        throw new java.lang.IllegalStateException("Cannot happen in ".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r3 = defpackage.arwh.a;
        r3 = i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        if (r3 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        if (r7.d.d(r4, new defpackage.arxs(r3, r1)) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r0 instanceof defpackage.arxi) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        l(r3, r1);
        r1 = defpackage.arxx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        r1 = defpackage.arxx.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0048, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0049, code lost:
    
        r4 = (defpackage.arxs) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0052, code lost:
    
        if (r4.c() != defpackage.arxx.e) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0054, code lost:
    
        r1 = defpackage.arxx.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0056, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        r5 = r4.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005d, code lost:
    
        if (r8 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005f, code lost:
    
        if (r5 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0061, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0066, code lost:
    
        r1 = f(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006a, code lost:
    
        r4.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r8 = r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if ((r0 instanceof defpackage.arxs) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
    
        if (true != r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0075, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0076, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0078, code lost:
    
        l(((defpackage.arxs) r3).a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007f, code lost:
    
        r1 = defpackage.arxx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0064, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00dd, code lost:
    
        if (r1 != defpackage.arxx.a) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e2, code lost:
    
        if (r1 != defpackage.arxx.b) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e7, code lost:
    
        if (r1 != defpackage.arxx.d) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00eb, code lost:
    
        hl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ee, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (((defpackage.arxs) r0).h() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Q(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxw.Q(java.lang.Object):boolean");
    }

    public boolean R(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (Q(th) && hb()) {
            return true;
        }
        return false;
    }

    protected boolean S(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T(java.lang.Object r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3.G()
            java.lang.Object r0 = r3.e(r0, r4)
            asfn r1 = defpackage.arxx.a
            if (r0 != r1) goto Le
            r4 = 0
            return r4
        Le:
            asfn r1 = defpackage.arxx.b
            r2 = 1
            if (r0 == r1) goto L1a
            asfn r1 = defpackage.arxx.c
            if (r0 == r1) goto L0
            r3.hl(r0)
        L1a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxw.T(java.lang.Object):boolean");
    }

    public final boolean U(arxs arxsVar, arvu arvuVar, Object obj) {
        while (arwi.u(arvuVar.a, false, new arxr(this, arxsVar, arvuVar, obj)) == aryd.a) {
            arvuVar = K(arvuVar);
            if (arvuVar == null) {
                return false;
            }
        }
        return true;
    }

    public final asqe W() {
        arxu arxuVar = arxu.a;
        arsd.g(arxuVar, 3);
        arxv arxvVar = arxv.a;
        arsd.g(arxvVar, 3);
        return new asqe((Object) this, (arqw) arxuVar, (arqw) arxvVar);
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this, r, arqvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String g() {
        return "Job was cancelled";
    }

    @Override // defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this, arphVar);
    }

    @Override // defpackage.arpg
    public final arph<?> getKey() {
        return arxm.c;
    }

    public String h() {
        return arwi.a(this);
    }

    public boolean hb() {
        return true;
    }

    public final Object hk(arpe arpeVar) {
        Object G;
        arwu u;
        do {
            G = G();
            if (!(G instanceof arxi)) {
                if (G instanceof arvx) {
                    Throwable th = ((arvx) G).b;
                    if (arwh.b) {
                        if (!(arpeVar instanceof arpt)) {
                            throw th;
                        }
                        throw asfm.a(th, (arpt) arpeVar);
                    }
                    throw th;
                }
                return arxx.b(G);
            }
        } while (C(G) < 0);
        arxq arxqVar = new arxq(arhi.i(arpeVar), this);
        arxqVar.A();
        u = arwi.u(this, true, new aryf(arxqVar));
        arrn.F(arxqVar, u);
        Object l = arxqVar.l();
        if (l == arpl.a) {
            arpeVar.getClass();
        }
        return l;
    }

    public boolean hm() {
        return false;
    }

    protected boolean hn() {
        return false;
    }

    @Override // defpackage.arxm
    public final arvt ho(arxw arxwVar) {
        arvx arvxVar;
        arvx arvxVar2;
        arvu arvuVar = new arvu(arxwVar);
        arvuVar.d = this;
        while (true) {
            Object G = G();
            if (G instanceof arww) {
                arww arwwVar = (arww) G;
                if (arwwVar.a) {
                    if (this.d.d(G, arvuVar)) {
                        break;
                    }
                } else {
                    n(arwwVar);
                }
            } else {
                Throwable th = null;
                if (G instanceof arxi) {
                    aryb hc = ((arxi) G).hc();
                    if (hc == null) {
                        G.getClass();
                        o((arxp) G);
                    } else if (!hc.l(arvuVar, 7)) {
                        boolean l = hc.l(arvuVar, 3);
                        Object G2 = G();
                        if (G2 instanceof arxs) {
                            th = ((arxs) G2).d();
                        } else {
                            boolean z = arwh.a;
                            if (G2 instanceof arvx) {
                                arvxVar2 = (arvx) G2;
                            } else {
                                arvxVar2 = null;
                            }
                            if (arvxVar2 != null) {
                                th = arvxVar2.b;
                            }
                        }
                        arvuVar.a(th);
                        if (l) {
                            boolean z2 = arwh.a;
                        } else {
                            return aryd.a;
                        }
                    }
                } else {
                    Object G3 = G();
                    if (G3 instanceof arvx) {
                        arvxVar = (arvx) G3;
                    } else {
                        arvxVar = null;
                    }
                    if (arvxVar != null) {
                        th = arvxVar.b;
                    }
                    arvuVar.a(th);
                    return aryd.a;
                }
            }
        }
        return arvuVar;
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return arhi.m(this, arphVar);
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arhi.n(this, arpiVar);
    }

    @Override // defpackage.arxm
    public final Object q(arpe arpeVar) {
        Object G;
        arwu u;
        do {
            G = G();
            if (!(G instanceof arxi)) {
                arwi.y(arpeVar.u());
                return arnb.a;
            }
        } while (C(G) < 0);
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        u = arwi.u(this, true, new aryg(arvpVar));
        arrn.F(arvpVar, u);
        Object l = arvpVar.l();
        arpl arplVar = arpl.a;
        if (l == arplVar) {
            arpeVar.getClass();
        }
        if (l != arplVar) {
            l = arnb.a;
        }
        if (l == arplVar) {
            return l;
        }
        return arnb.a;
    }

    @Override // defpackage.arxm
    public final CancellationException r() {
        Object G = G();
        if (G instanceof arxs) {
            Throwable d = ((arxs) G).d();
            if (d != null) {
                return I(d, String.valueOf(arwi.a(this)).concat(" is cancelling"));
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        if (!(G instanceof arxi)) {
            if (G instanceof arvx) {
                return I(((arvx) G).b, null);
            }
            return new arxn(String.valueOf(arwi.a(this)).concat(" has completed normally"), null, this);
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.arxm
    public final arwu s(arqr arqrVar) {
        return L(true, new arxl(arqrVar));
    }

    @Override // defpackage.arxm
    public final arwu t(boolean z, boolean z2, arqr arqrVar) {
        arxp arxlVar;
        if (z) {
            arxlVar = new arxk(arqrVar);
        } else {
            arxlVar = new arxl(arqrVar);
        }
        return L(z2, arxlVar);
    }

    public final String toString() {
        return (h() + "{" + u(G()) + "}") + "@" + arwi.b(this);
    }

    @Override // defpackage.arxm
    public void v(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new arxn(g(), null, this);
        }
        M(cancellationException);
    }

    @Override // defpackage.arxm
    public final boolean x() {
        Object G = G();
        if ((G instanceof arxi) && ((arxi) G).he()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arxm
    public final boolean y() {
        Object G = G();
        if (G instanceof arvx) {
            return true;
        }
        if ((G instanceof arxs) && ((arxs) G).g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arxm
    public final boolean z() {
        if (!(G() instanceof arxi)) {
            return true;
        }
        return false;
    }

    protected void O() {
    }

    public void hi(Throwable th) {
        throw th;
    }

    protected void hj(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hl(Object obj) {
    }
}
