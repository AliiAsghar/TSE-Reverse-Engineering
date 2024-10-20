package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apbx implements apcj {
    private final apbt a;
    private final apcv b;
    private final boolean c;

    public apbx(apcv apcvVar, apbt apbtVar) {
        this.b = apcvVar;
        this.c = apbtVar instanceof apab;
        this.a = apbtVar;
    }

    @Override // defpackage.apcj
    public final int a(Object obj) {
        apcw f = apcv.f(obj);
        int i = f.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < f.b; i2++) {
                int a = apdh.a(f.c[i2]);
                aozb aozbVar = (aozb) f.d[i2];
                int Z = aozl.Z(1);
                i += Z + Z + aozl.aa(2, a) + aozl.G(3, aozbVar);
            }
            f.e = i;
        }
        if (this.c) {
            aozu c = aoue.c(obj);
            int i3 = c.b.b;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                i4 += c.c(c.b.d(i5));
            }
            Iterator it = c.b.a().iterator();
            while (it.hasNext()) {
                i4 += c.c((Map.Entry) it.next());
            }
            return i + i4;
        }
        return i;
    }

    @Override // defpackage.apcj
    public final int b(Object obj) {
        int hashCode = apcv.f(obj).hashCode();
        if (this.c) {
            return (hashCode * 53) + aoue.c(obj).hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.apcj
    public final Object e() {
        apbt apbtVar = this.a;
        if (apbtVar instanceof apag) {
            return ((apag) apbtVar).newMutableInstance();
        }
        return apbtVar.newBuilderForType().t();
    }

    @Override // defpackage.apcj
    public final void g(Object obj) {
        this.b.e(obj);
        aoue.f(obj);
    }

    @Override // defpackage.apcj
    public final void h(Object obj, Object obj2) {
        apck.o(obj, obj2);
        if (this.c) {
            apck.n(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[EDGE_INSN: B:24:0x00b8->B:25:0x00b8 BREAK  A[LOOP:1: B:10:0x0063->B:18:0x0063], SYNTHETIC] */
    @Override // defpackage.apcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.aoyp r15) {
        /*
            r10 = this;
            r0 = r11
            apag r0 = (defpackage.apag) r0
            apcw r1 = r0.unknownFields
            apcw r2 = defpackage.apcw.a
            if (r1 != r2) goto L10
            apcw r1 = new apcw
            r1.<init>()
            r0.unknownFields = r1
        L10:
            apab r11 = (defpackage.apab) r11
            aozu r11 = r11.a()
            r0 = 0
            r2 = r0
        L18:
            if (r13 >= r14) goto Lc4
            int r4 = defpackage.aoyq.t(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.apdh.a
            r5 = 2
            if (r13 == r3) goto L61
            int r3 = defpackage.apdh.b(r13)
            if (r3 != r5) goto L5c
            aozs r2 = r15.d
            apbt r3 = r10.a
            int r5 = defpackage.apdh.a(r13)
            apae r8 = r2.b(r3, r5)
            if (r8 == 0) goto L51
            apbt r13 = r8.c
            apcc r2 = defpackage.apcc.a
            java.lang.Class r13 = r13.getClass()
            apcj r13 = r2.a(r13)
            int r13 = defpackage.aoyq.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            apad r3 = r8.d
            r11.n(r3, r2)
            goto L5a
        L51:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.aoyq.s(r2, r3, r4, r5, r6, r7)
        L5a:
            r2 = r8
            goto L18
        L5c:
            int r13 = defpackage.aoyq.z(r13, r12, r4, r14, r15)
            goto L18
        L61:
            r13 = 0
            r3 = r0
        L63:
            if (r4 >= r14) goto Lb8
            int r4 = defpackage.aoyq.t(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.apdh.a(r6)
            int r8 = defpackage.apdh.b(r6)
            if (r7 == r5) goto L9e
            r9 = 3
            if (r7 == r9) goto L79
            goto Laf
        L79:
            if (r2 == 0) goto L93
            apbt r6 = r2.c
            apcc r7 = defpackage.apcc.a
            java.lang.Class r6 = r6.getClass()
            apcj r6 = r7.a(r6)
            int r4 = defpackage.aoyq.f(r6, r12, r4, r14, r15)
            java.lang.Object r6 = r15.c
            apad r7 = r2.d
            r11.n(r7, r6)
            goto L63
        L93:
            if (r8 != r5) goto Laf
            int r4 = defpackage.aoyq.c(r12, r4, r15)
            java.lang.Object r3 = r15.c
            aozb r3 = (defpackage.aozb) r3
            goto L63
        L9e:
            if (r8 != 0) goto Laf
            int r4 = defpackage.aoyq.t(r12, r4, r15)
            int r13 = r15.a
            aozs r2 = r15.d
            apbt r6 = r10.a
            apae r2 = r2.b(r6, r13)
            goto L63
        Laf:
            int r7 = defpackage.apdh.b
            if (r6 == r7) goto Lb8
            int r4 = defpackage.aoyq.z(r6, r12, r4, r14, r15)
            goto L63
        Lb8:
            if (r3 == 0) goto Lc1
            int r13 = defpackage.apdh.c(r13, r5)
            r1.f(r13, r3)
        Lc1:
            r13 = r4
            goto L18
        Lc4:
            if (r13 != r14) goto Lc7
            return
        Lc7:
            apba r11 = new apba
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbx.i(java.lang.Object, byte[], int, int, aoyp):void");
    }

    @Override // defpackage.apcj
    public final boolean j(Object obj, Object obj2) {
        if (!apcv.f(obj).equals(apcv.f(obj2))) {
            return false;
        }
        if (this.c) {
            return aoue.c(obj).equals(aoue.c(obj2));
        }
        return true;
    }

    @Override // defpackage.apcj
    public final boolean k(Object obj) {
        return aoue.c(obj).j();
    }

    @Override // defpackage.apcj
    public final void l(Object obj, aozh aozhVar, aozs aozsVar) {
        boolean P;
        apcv apcvVar = this.b;
        Object b = apcvVar.b(obj);
        aozu d = aoue.d(obj);
        while (aozhVar.c() != Integer.MAX_VALUE) {
            try {
                int i = aozhVar.a;
                if (i != apdh.a) {
                    if (apdh.b(i) == 2) {
                        apae b2 = aozsVar.b(this.a, apdh.a(i));
                        if (b2 != null) {
                            aoue.e(aozhVar, b2, aozsVar, d);
                        } else {
                            P = apcvVar.a(b, aozhVar, 0);
                        }
                    } else {
                        P = aozhVar.P();
                    }
                    if (!P) {
                        break;
                    }
                } else {
                    apae apaeVar = null;
                    aozb aozbVar = null;
                    int i2 = 0;
                    while (aozhVar.c() != Integer.MAX_VALUE) {
                        int i3 = aozhVar.a;
                        if (i3 == apdh.c) {
                            i2 = aozhVar.i();
                            apaeVar = aozsVar.b(this.a, i2);
                        } else if (i3 == apdh.d) {
                            if (apaeVar != null) {
                                aoue.e(aozhVar, apaeVar, aozsVar, d);
                            } else {
                                aozbVar = aozhVar.o();
                            }
                        } else if (!aozhVar.P()) {
                            break;
                        }
                    }
                    if (aozhVar.a == apdh.b) {
                        if (aozbVar != null) {
                            if (apaeVar != null) {
                                apbs newBuilderForType = apaeVar.c.newBuilderForType();
                                aozg l = aozbVar.l();
                                newBuilderForType.n(l, aozsVar);
                                d.n(apaeVar.d, newBuilderForType.t());
                                l.z(0);
                            } else {
                                apcvVar.c(b, i2, aozbVar);
                            }
                        }
                    } else {
                        throw new apba("Protocol message end-group tag did not match expected tag.");
                    }
                }
            } finally {
                apcv.g(obj, (apcw) b);
            }
        }
    }

    @Override // defpackage.apcj
    public final void m(Object obj, aojj aojjVar) {
        Iterator e = aoue.c(obj).e();
        while (e.hasNext()) {
            Map.Entry entry = (Map.Entry) e.next();
            apad apadVar = (apad) entry.getKey();
            if (apadVar.a() == apdg.MESSAGE && !apadVar.d && !apadVar.e) {
                if (entry instanceof apbd) {
                    aojjVar.o(apadVar.b, ((apbf) ((apbd) entry).a.getValue()).a());
                } else {
                    aojjVar.o(apadVar.b, entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        apcw f = apcv.f(obj);
        for (int i = 0; i < f.b; i++) {
            aojjVar.o(apdh.a(f.c[i]), f.d[i]);
        }
    }
}
