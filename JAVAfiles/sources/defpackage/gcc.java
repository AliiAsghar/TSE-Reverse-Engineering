package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcc {
    public final gdk a;
    public final gcn b;
    public final asai c;
    public final gdq d;
    public final arqg e;
    public final AtomicBoolean f;
    public final arzj g;
    public final asai h;
    public final ghw i;
    public final kkc j;
    private final Object k;
    private final arxo l;

    public gcc(Object obj, gdk gdkVar, gcn gcnVar, asai asaiVar, arqg arqgVar) {
        gdkVar.getClass();
        this.k = obj;
        this.a = gdkVar;
        this.b = gcnVar;
        this.c = asaiVar;
        this.d = null;
        this.e = arqgVar;
        if (gcnVar.f != Integer.MIN_VALUE && !gdkVar.d()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.i = new ghw((short[]) null);
        this.f = new AtomicBoolean(false);
        this.g = arhi.t(-2, 0, 6);
        this.j = new kkc(gcnVar);
        arxo arxoVar = new arxo(null);
        this.l = arxoVar;
        this.h = new akee((arqv) new gca(this, null, 0), nq.S(new gaf(arxoVar, new gca(this, null, 1, null), (arpe) null, 1)), 4);
    }

    private final gdg i(gbb gbbVar, Object obj) {
        int i;
        if (gbbVar == gbb.REFRESH) {
            i = this.b.d;
        } else {
            i = this.b.a;
        }
        gcn gcnVar = this.b;
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        boolean z = gcnVar.c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (obj != null) {
                        return new gdd(obj, i, z);
                    }
                    throw new IllegalArgumentException("key cannot be null for append");
                }
                throw new armm();
            }
            if (obj != null) {
                return new gde(obj, i, z);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        return new gdf(obj, i, z);
    }

    private final Object j(gcd gcdVar, gbb gbbVar, int i, int i2) {
        int i3;
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = gcdVar.f;
                } else {
                    throw new armm();
                }
            } else {
                i3 = gcdVar.e;
            }
            if (i != i3 || (gcdVar.j.b(gbbVar) instanceof gaw) || i2 >= this.b.b) {
                return null;
            }
            if (gbbVar == gbb.PREPEND) {
                return ((gdj) aqjn.X(gcdVar.c)).c;
            }
            return ((gdj) aqjn.ac(gcdVar.c)).d;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    private final Object k(gcd gcdVar, gbb gbbVar, gaw gawVar, arpe arpeVar) {
        if (!d.F(gcdVar.j.b(gbbVar), gawVar)) {
            gcdVar.j.e(gbbVar, gawVar);
            Object a = this.g.a(new gbh(gcdVar.j.c()), arpeVar);
            if (a == arpl.a) {
                return a;
            }
        }
        return arnb.a;
    }

    private final void l() {
        g();
        this.a.e();
    }

    private static final String m(gbb gbbVar, Object obj, dyi dyiVar) {
        if (dyiVar == null) {
            return a.ce(obj, gbbVar, "End ", " with loadkey ", ". Load CANCELLED.");
        }
        return "End " + gbbVar + " with loadKey " + obj + ". Returned " + dyiVar;
    }

    public final Object a(asai asaiVar, gbb gbbVar, arpe arpeVar) {
        Object a = armd.m(gai.a(gai.b(asaiVar, new gbm(null, this, gbbVar)), new igb(gbbVar, (arpe) null, 1))).a(new gcx(this, gbbVar, 1), arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gbq
            if (r0 == 0) goto L13
            r0 = r6
            gbq r0 = (defpackage.gbq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gbq r0 = new gbq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            asgm r1 = r0.e
            kkc r2 = r0.f
            gcc r0 = r0.d
            defpackage.aqil.P(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.aqil.P(r6)
            kkc r2 = r5.j
            r0.d = r5
            r0.f = r2
            java.lang.Object r6 = r2.c
            r4 = r6
            asgm r4 = (defpackage.asgm) r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r0 = r4.b(r0)
            if (r0 == r1) goto L6a
            r0 = r5
            r1 = r6
        L4f:
            java.lang.Object r6 = r2.a     // Catch: java.lang.Throwable -> L63
            ghw r0 = r0.i     // Catch: java.lang.Throwable -> L63
            ged r0 = r0.i()     // Catch: java.lang.Throwable -> L63
            gcd r6 = (defpackage.gcd) r6     // Catch: java.lang.Throwable -> L63
            gdl r6 = r6.d(r0)     // Catch: java.lang.Throwable -> L63
            asgm r1 = (defpackage.asgm) r1
            r1.d()
            return r6
        L63:
            r6 = move-exception
            asgm r1 = (defpackage.asgm) r1
            r1.d()
            throw r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcc.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0153, code lost:
    
        if (r14 == r1) goto L119;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0021. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195 A[Catch: all -> 0x0228, TryCatch #3 {all -> 0x0228, blocks: (B:66:0x0176, B:68:0x0195, B:69:0x01a1, B:71:0x01a5), top: B:65:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5 A[Catch: all -> 0x0228, TRY_LEAVE, TryCatch #3 {all -> 0x0228, blocks: (B:66:0x0176, B:68:0x0195, B:69:0x01a1, B:71:0x01a5), top: B:65:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcc.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x035a, code lost:
    
        r0 = r10.d;
        r8 = r15;
        r6 = r16;
        r15 = r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0857 A[Catch: all -> 0x086a, TRY_ENTER, TryCatch #7 {all -> 0x086a, blocks: (B:62:0x0575, B:105:0x0779, B:117:0x078e, B:118:0x07ba, B:124:0x0593, B:127:0x05a0, B:130:0x05b1, B:133:0x05b9, B:178:0x0857, B:179:0x0869), top: B:61:0x0575 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x050b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0320 A[Catch: all -> 0x0876, TRY_LEAVE, TryCatch #3 {all -> 0x0876, blocks: (B:263:0x030a, B:265:0x0320), top: B:262:0x030a }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x056a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x07e5 A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:69:0x07cd, B:71:0x07e5, B:73:0x07f2, B:75:0x07fb, B:76:0x0800, B:77:0x07fe, B:78:0x0803, B:240:0x0095, B:243:0x00ce), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x07fb A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:69:0x07cd, B:71:0x07e5, B:73:0x07f2, B:75:0x07fb, B:76:0x0800, B:77:0x07fe, B:78:0x0803, B:240:0x0095, B:243:0x00ce), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x07fe A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:69:0x07cd, B:71:0x07e5, B:73:0x07f2, B:75:0x07fb, B:76:0x0800, B:77:0x07fe, B:78:0x0803, B:240:0x0095, B:243:0x00ce), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0856 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0699 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.gbb r20, defpackage.gaj r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 2228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcc.d(gbb, gaj, arpe):java.lang.Object");
    }

    public final Object e(gbb gbbVar, gef gefVar, arpe arpeVar) {
        if (gbbVar.ordinal() != 0) {
            if (gefVar != null) {
                ghw ghwVar = this.i;
                gbbVar.getClass();
                if (gbbVar != gbb.PREPEND && gbbVar != gbb.APPEND) {
                    Objects.toString(gbbVar);
                    throw new IllegalArgumentException("invalid load type for reset: ".concat(gbbVar.toString()));
                }
                ((ibp) ghwVar.a).a(null, new ifn(gbbVar, gefVar, 1, null));
                return arnb.a;
            }
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        Object c = c(arpeVar);
        if (c == arpl.a) {
            return c;
        }
        return arnb.a;
    }

    public final Object f(gcd gcdVar, gbb gbbVar, arpe arpeVar) {
        if (!d.F(gcdVar.j.b(gbbVar), gax.a)) {
            gcdVar.j.e(gbbVar, gax.a);
            Object a = this.g.a(new gbh(gcdVar.j.c()), arpeVar);
            if (a == arpl.a) {
                return a;
            }
        }
        return arnb.a;
    }

    public final void g() {
        this.l.v(null);
    }

    public final void h(arwe arweVar) {
        if (this.b.f != Integer.MIN_VALUE) {
            arrn.J(arweVar, null, null, new eie(this, (arpe) null, 3), 3);
        }
        arrn.J(arweVar, null, null, new gcb(this, null, 1, null), 3);
        arrn.J(arweVar, null, null, new gcb(this, (arpe) null, 0), 3);
    }
}
