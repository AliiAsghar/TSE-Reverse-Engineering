package defpackage;

import defpackage.bxd;
import defpackage.ces;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfc {
    public final arqr a;
    public boolean c;
    public a f;
    private cep i;
    public final AtomicReference b = new AtomicReference(null);
    private final arqv g = new AnonymousClass1();
    private final arqr h = new AnonymousClass2();
    public final cbh d = new cbh(new a[16]);
    public final Object e = new Object();
    private long j = -1;

    /* compiled from: PG */
    /* renamed from: cfc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<Set<? extends Object>, ces, arnb> {
        public AnonymousClass1() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cfc cfcVar;
            Object obj3;
            Object aq;
            Set set = (Set) obj;
            do {
                cfcVar = cfc.this;
                obj3 = cfcVar.b.get();
                if (obj3 == null) {
                    aq = set;
                } else if (obj3 instanceof Set) {
                    aq = aqjn.B(obj3, set);
                } else if (obj3 instanceof List) {
                    aq = aqjn.aq((Collection) obj3, aqjn.y(set));
                } else {
                    cfc.g();
                    throw new armj();
                }
            } while (!defpackage.a.bC(cfcVar.b, obj3, aq));
            if (cfc.this.f()) {
                cfc cfcVar2 = cfc.this;
                cfcVar2.a.a(new cfd(cfcVar2));
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cfc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Object, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cfc cfcVar = cfc.this;
            synchronized (cfcVar.e) {
                a aVar = cfcVar.f;
                aVar.getClass();
                Object obj2 = aVar.b;
                obj2.getClass();
                int i = aVar.c;
                uv uvVar = aVar.h;
                if (uvVar == null) {
                    uvVar = new uv((byte[]) null);
                    aVar.h = uvVar;
                    aVar.j.j(obj2, uvVar);
                }
                aVar.c(obj, i, obj2, uvVar);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final arqr a;
        public Object b;
        public int f;
        public uv h;
        public int c = -1;
        public final ve i = new ve((byte[]) null);
        public final ve j = new ve((byte[]) null);
        public final vh k = new vh((byte[]) null);
        public final cbh d = new cbh(new bxe[16]);
        public final bxf e = new bxf() { // from class: cfc.a.1
            @Override // defpackage.bxf
            public final void a() {
                a aVar = a.this;
                aVar.f--;
            }

            @Override // defpackage.bxf
            public final void b() {
                a.this.f++;
            }
        };
        public final ve l = new ve((byte[]) null);
        public final HashMap g = new HashMap();

        public a(arqr arqrVar) {
            this.a = arqrVar;
        }

        public final void a(Object obj, Object obj2) {
            cbk.c(this.i, obj2, obj);
            if ((obj2 instanceof bxe) && !ve.e(this.i, obj2)) {
                cbk.b(this.l, obj2);
                this.g.remove(obj2);
            }
        }

        public final boolean b() {
            return this.j.d();
        }

        public final void c(Object obj, int i, Object obj2, uv uvVar) {
            int i2;
            if (this.f <= 0) {
                int h = uvVar.h(obj, i);
                if ((obj instanceof bxe) && h != i) {
                    bxd.a aVar = (bxd.a) ((bxe) obj).c();
                    this.g.put(obj, aVar.e);
                    uv uvVar2 = aVar.d;
                    ve veVar = this.l;
                    cbk.b(veVar, obj);
                    Object[] objArr = uvVar2.b;
                    long[] jArr = uvVar2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = ~(i3 - length);
                                int i5 = 0;
                                while (true) {
                                    i2 = 8 - (i4 >>> 31);
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        cfg cfgVar = (cfg) objArr[(i3 << 3) + i5];
                                        if (cfgVar instanceof cfh) {
                                            ((cfh) cfgVar).k(2);
                                        }
                                        cbk.a(veVar, cfgVar, obj);
                                    }
                                    j >>= 8;
                                    i5++;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i3 == length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (h == -1) {
                    if (obj instanceof cfh) {
                        ((cfh) obj).k(2);
                    }
                    cbk.a(this.i, obj, obj2);
                }
            }
        }
    }

    public cfc(arqr arqrVar) {
        this.a = arqrVar;
    }

    public static final void g() {
        bwp.g("Unexpected notification");
        throw new armj();
    }

    public final void a() {
        synchronized (this.e) {
            cbh cbhVar = this.d;
            int i = cbhVar.b;
            if (i > 0) {
                Object[] objArr = cbhVar.a;
                int i2 = 0;
                do {
                    a aVar = (a) objArr[i2];
                    aVar.i.i();
                    aVar.j.i();
                    aVar.l.i();
                    aVar.g.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0078, B:11:0x007e, B:13:0x008b, B:15:0x0083, B:18:0x0022, B:21:0x002e, B:23:0x0043, B:24:0x0046, B:26:0x0051, B:28:0x005b, B:30:0x0067, B:36:0x0071, B:39:0x0091), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.e
            monitor-enter(r2)
            cbh r3 = r1.d     // Catch: java.lang.Throwable -> L9d
            int r4 = r3.b     // Catch: java.lang.Throwable -> L9d
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L91
            java.lang.Object[] r8 = r3.a     // Catch: java.lang.Throwable -> L9d
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L9d
            cfc$a r8 = (cfc.a) r8     // Catch: java.lang.Throwable -> L9d
            ve r9 = r8.j     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> L9d
            uv r9 = (defpackage.uv) r9     // Catch: java.lang.Throwable -> L9d
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L78
        L22:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L9d
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L9d
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L9d
            int r12 = r9.length     // Catch: java.lang.Throwable -> L9d
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L9d
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L9d
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L6f
            int r5 = r13 - r12
            r6 = 0
        L46:
            int r1 = ~r5     // Catch: java.lang.Throwable -> L9d
            int r1 = r1 >>> 31
            r17 = r5
            r5 = 8
            int r1 = 8 - r1
            if (r6 >= r1) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 >= 0) goto L67
            int r1 = r13 << 3
            int r1 = r1 + r6
            r5 = r10[r1]     // Catch: java.lang.Throwable -> L9d
            r1 = r11[r1]     // Catch: java.lang.Throwable -> L9d
            r8.a(r0, r5)     // Catch: java.lang.Throwable -> L9d
            r5 = 8
        L67:
            long r14 = r14 >> r5
            int r6 = r6 + 1
            r5 = r17
            goto L46
        L6d:
            if (r1 != r5) goto L78
        L6f:
            if (r13 == r12) goto L78
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L78:
            boolean r1 = r8.b()     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L81
            int r7 = r7 + 1
            goto L8b
        L81:
            if (r7 <= 0) goto L8b
            java.lang.Object[] r1 = r3.a     // Catch: java.lang.Throwable -> L9d
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L9d
            r1[r6] = r5     // Catch: java.lang.Throwable -> L9d
        L8b:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L91:
            java.lang.Object[] r0 = r3.a     // Catch: java.lang.Throwable -> L9d
            int r1 = r4 - r7
            r5 = 0
            defpackage.aqil.d(r0, r5, r1, r4)     // Catch: java.lang.Throwable -> L9d
            r3.b = r1     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r2)
            return
        L9d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfc.b(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    public final void c(Object obj, arqr arqrVar, arqg arqgVar) {
        a aVar;
        long j;
        long[] jArr;
        Object obj2;
        int i;
        long[] jArr2;
        char c;
        synchronized (this.e) {
            cbh cbhVar = this.d;
            int i2 = cbhVar.b;
            a aVar2 = null;
            if (i2 > 0) {
                ?? r4 = cbhVar.a;
                int i3 = 0;
                while (true) {
                    ?? r9 = r4[i3];
                    if (((a) r9).a == arqrVar) {
                        aVar2 = r9;
                        break;
                    } else {
                        i3++;
                        if (i3 >= i2) {
                            break;
                        }
                    }
                }
            }
            aVar = aVar2;
            if (aVar == null) {
                arqrVar.getClass();
                arsd.g(arqrVar, 1);
                aVar = new a(arqrVar);
                this.d.n(aVar);
            }
        }
        a aVar3 = this.f;
        long j2 = this.j;
        if (j2 != -1 && j2 != cdu.a()) {
            byy.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + cdu.a() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f = aVar;
            this.j = cdu.a();
            arqr arqrVar2 = this.h;
            Object obj3 = aVar.b;
            uv uvVar = aVar.h;
            int i4 = aVar.c;
            aVar.b = obj;
            aVar.h = (uv) aVar.j.a(obj);
            if (aVar.c == -1) {
                aVar.c = cex.b().v();
            }
            bxf bxfVar = aVar.e;
            cbh a2 = cal.a();
            try {
                a2.n(bxfVar);
                ces.a.d(arqrVar2, arqgVar);
                a2.c(a2.b - 1);
                Object obj4 = aVar.b;
                obj4.getClass();
                int i5 = aVar.c;
                uv uvVar2 = aVar.h;
                if (uvVar2 != null) {
                    try {
                        long[] jArr3 = uvVar2.a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j3 = jArr3[i6];
                                j = j2;
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = ~(i6 - length);
                                    int i8 = 0;
                                    while (true) {
                                        int i9 = i7;
                                        i = 8 - (i7 >>> 31);
                                        if (i8 >= i) {
                                            break;
                                        }
                                        if ((j3 & 255) < 128) {
                                            int i10 = (i6 << 3) + i8;
                                            try {
                                                Object obj5 = uvVar2.b[i10];
                                                jArr2 = jArr3;
                                                if (uvVar2.c[i10] != i5) {
                                                    aVar.a(obj4, obj5);
                                                    uvVar2.f(i10);
                                                }
                                                c = '\b';
                                            } catch (Throwable th) {
                                                th = th;
                                                j2 = j;
                                                this.f = aVar3;
                                                this.j = j2;
                                                throw th;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            c = '\b';
                                        }
                                        j3 >>= c;
                                        i8++;
                                        jArr3 = jArr2;
                                        i7 = i9;
                                    }
                                    jArr = jArr3;
                                    if (i != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr3;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                j2 = j;
                                jArr3 = jArr;
                            }
                            obj2 = obj3;
                            aVar.b = obj2;
                            aVar.h = uvVar;
                            aVar.c = i4;
                            this.f = aVar3;
                            this.j = j;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        this.f = aVar3;
                        this.j = j2;
                        throw th;
                    }
                }
                j = j2;
                obj2 = obj3;
                aVar.b = obj2;
                aVar.h = uvVar;
                aVar.c = i4;
                this.f = aVar3;
                this.j = j;
            } catch (Throwable th3) {
                a2.c(a2.b - 1);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void d() {
        this.i = ces.a.e(this.g);
    }

    public final void e() {
        cep cepVar = this.i;
        if (cepVar != null) {
            cepVar.a();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfc.f():boolean");
    }
}
