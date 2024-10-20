package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgj implements arvn, arys {
    public final arpi a;
    public Object c;
    public final arve b = new arve(asgk.b, arvf.a);
    private List e = new ArrayList(2);
    private int f = -1;
    public Object d = asgk.e;

    public asgj(arpi arpiVar) {
        this.a = arpiVar;
    }

    public static /* synthetic */ Object c(asgj asgjVar, arpe arpeVar) {
        if (asgjVar.b.a instanceof asgg) {
            return asgjVar.j(arpeVar);
        }
        return asgjVar.d(arpeVar);
    }

    public static /* synthetic */ void h(asgj asgjVar, asgg asggVar) {
        asgjVar.f(asggVar, false);
    }

    private final Object j(arpe arpeVar) {
        boolean z = arwh.a;
        Object obj = this.b.a;
        obj.getClass();
        asgg asggVar = (asgg) obj;
        Object obj2 = this.d;
        List<asgg> list = this.e;
        if (list != null) {
            for (asgg asggVar2 : list) {
                if (asggVar2 != asggVar) {
                    asggVar2.c();
                }
            }
            this.b.c(asgk.c);
            this.d = asgk.e;
            this.e = null;
        }
        if (!arwh.b) {
            return asggVar.a(asggVar.b(obj2), arpeVar);
        }
        return e(asggVar, obj2, arpeVar);
    }

    private final asgg k(Object obj) {
        List list = this.e;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((asgg) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        asgg asggVar = (asgg) obj2;
        if (asggVar != null) {
            return asggVar;
        }
        throw new IllegalStateException(a.cc(obj, "Clause with object ", " is not found"));
    }

    @Override // defpackage.arys
    public final void F(aseo aseoVar, int i) {
        this.c = aseoVar;
        this.f = i;
    }

    public final int a(Object obj, Object obj2) {
        while (true) {
            Object obj3 = this.b.a;
            if (obj3 instanceof arvo) {
                asgg k = k(obj);
                if (k != null && this.b.d(obj3, k)) {
                    arvo arvoVar = (arvo) obj3;
                    this.d = obj2;
                    Object k2 = arvoVar.k(arnb.a, null);
                    if (k2 == null) {
                        this.d = asgk.e;
                        return 2;
                    }
                    arvoVar.a(k2);
                    return 0;
                }
            } else if (!d.F(obj3, asgk.c) && !(obj3 instanceof asgg)) {
                if (d.F(obj3, asgk.d)) {
                    return 2;
                }
                if (d.F(obj3, asgk.b)) {
                    if (this.b.d(obj3, aqjn.y(obj))) {
                        return 1;
                    }
                } else if (obj3 instanceof List) {
                    if (this.b.d(obj3, aqjn.ar((Collection) obj3, obj))) {
                        return 1;
                    }
                } else {
                    Objects.toString(obj3);
                    throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(obj3)));
                }
            } else {
                return 3;
            }
        }
    }

    @Override // defpackage.arvn
    public final void b(Throwable th) {
        arve arveVar;
        Object obj;
        do {
            arveVar = this.b;
            obj = arveVar.a;
            if (obj == asgk.c) {
                return;
            }
        } while (!arveVar.d(obj, asgk.d));
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((asgg) it.next()).c();
            }
            this.d = asgk.e;
            this.e = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b3 A[PHI: r10
  0x00b3: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:17:0x00b0, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.asgh
            if (r0 == 0) goto L13
            r0 = r10
            asgh r0 = (defpackage.asgh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asgh r0 = new asgh
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.aqil.P(r10)
            goto Lb3
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            asgj r2 = r0.d
            defpackage.aqil.P(r10)
            goto La8
        L3a:
            defpackage.aqil.P(r10)
            r0.d = r9
            r0.c = r5
            arvp r10 = new arvp
            arpe r2 = defpackage.arhi.i(r0)
            r10.<init>(r2, r5)
            r10.A()
            arve r2 = r9.b
        L4f:
            java.lang.Object r6 = r2.a
            asfn r7 = defpackage.asgk.b
            if (r6 != r7) goto L61
            arve r7 = r9.b
            boolean r6 = r7.d(r6, r10)
            if (r6 == 0) goto L4f
            r10.B(r9)
            goto L9b
        L61:
            boolean r8 = r6 instanceof java.util.List
            if (r8 == 0) goto L90
            arve r8 = r9.b
            boolean r7 = r8.d(r6, r7)
            if (r7 == 0) goto L4f
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4f
            java.lang.Object r7 = r6.next()
            asgg r7 = r9.k(r7)
            r7.getClass()
            r7.d = r4
            r8 = -1
            r7.e = r8
            r9.f(r7, r5)
            goto L76
        L90:
            boolean r2 = r6 instanceof defpackage.asgg
            if (r2 == 0) goto Lb5
            arnb r2 = defpackage.arnb.a
            asgg r6 = (defpackage.asgg) r6
            r10.f(r2, r4)
        L9b:
            java.lang.Object r10 = r10.l()
            arpl r2 = defpackage.arpl.a
            if (r10 == r2) goto La5
            arnb r10 = defpackage.arnb.a
        La5:
            if (r10 == r1) goto Lb4
            r2 = r9
        La8:
            r0.d = r4
            r0.c = r3
            java.lang.Object r10 = r2.j(r0)
            if (r10 != r1) goto Lb3
            return r1
        Lb3:
            return r10
        Lb4:
            return r1
        Lb5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "unexpected state: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asgj.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.asgg r5, java.lang.Object r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.asgi
            if (r0 == 0) goto L13
            r0 = r7
            asgi r0 = (defpackage.asgi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asgi r0 = new asgi
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r7)
            java.lang.Object r6 = r5.b(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            return r7
        L42:
            boolean r6 = defpackage.arwh.b
            if (r6 != 0) goto L47
            throw r5
        L47:
            java.lang.Throwable r5 = defpackage.asfm.a(r5, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asgj.e(asgg, java.lang.Object, arpe):java.lang.Object");
    }

    public final void f(asgg asggVar, boolean z) {
        boolean z2 = arwh.a;
        if (this.b.a instanceof asgg) {
            return;
        }
        if (!z) {
            Object obj = asggVar.a;
            List list = this.e;
            list.getClass();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((asgg) it.next()).a == obj) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        asggVar.b.a(asggVar.a, this, asggVar.c);
        if (this.d == asgk.e) {
            if (!z) {
                List list2 = this.e;
                list2.getClass();
                list2.add(asggVar);
            }
            asggVar.d = this.c;
            asggVar.e = this.f;
            this.c = null;
            this.f = -1;
            return;
        }
        this.b.c(asggVar);
    }

    public final boolean g(Object obj, Object obj2) {
        if (a(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, arqw] */
    public final void i(asqe asqeVar, arqv arqvVar) {
        f(new asgg(asqeVar.c, asqeVar.b, asqeVar.a, null, arqvVar), false);
    }
}
