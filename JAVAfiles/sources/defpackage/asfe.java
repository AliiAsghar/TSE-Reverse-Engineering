package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asfe {
    public final arve e = new arve(this, arvf.a);
    public final arve f;
    public final arve g;

    public asfe() {
        arvf arvfVar = arvf.a;
        this.f = new arve(this, arvfVar);
        this.g = new arve(null, arvfVar);
    }

    public final Object f() {
        return this.e.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r3.e.d(r2, ((defpackage.asfi) r4).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.asfe g() {
        /*
            r7 = this;
        L0:
            arve r0 = r7.f
            java.lang.Object r0 = r0.a
            asfe r0 = (defpackage.asfe) r0
            r1 = 0
            r2 = r0
        L8:
            r3 = r1
        L9:
            arve r4 = r2.e
            java.lang.Object r4 = r4.a
            if (r4 != r7) goto L1b
            if (r0 != r2) goto L12
            return r2
        L12:
            arve r1 = r7.f
            boolean r0 = r1.d(r0, r2)
            if (r0 == 0) goto L0
            return r2
        L1b:
            boolean r5 = r7.hf()
            if (r5 == 0) goto L22
            return r1
        L22:
            boolean r5 = r4 instanceof defpackage.asfi
            if (r5 == 0) goto L3d
            if (r3 == 0) goto L36
            asfi r4 = (defpackage.asfi) r4
            asfe r4 = r4.a
            arve r5 = r3.e
            boolean r2 = r5.d(r2, r4)
            if (r2 == 0) goto L0
            r2 = r3
            goto L8
        L36:
            arve r2 = r2.f
            java.lang.Object r2 = r2.a
            asfe r2 = (defpackage.asfe) r2
            goto L9
        L3d:
            r4.getClass()
            r3 = r4
            asfe r3 = (defpackage.asfe) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asfe.g():asfe");
    }

    public final asfe h() {
        asfi asfiVar;
        Object f = f();
        if (f instanceof asfi) {
            asfiVar = (asfi) f;
        } else {
            asfiVar = null;
        }
        if (asfiVar != null) {
            return asfiVar.a;
        }
        f.getClass();
        return (asfe) f;
    }

    public boolean hf() {
        return f() instanceof asfi;
    }

    public final asfe i() {
        asfe g = g();
        if (g == null) {
            Object obj = this.f.a;
            while (true) {
                asfe asfeVar = (asfe) obj;
                if (!asfeVar.hf()) {
                    return asfeVar;
                }
                obj = asfeVar.f.a;
            }
        } else {
            return g;
        }
    }

    public final void j(int i) {
        l(new asfb(i), i);
    }

    public final void k(asfe asfeVar) {
        asfe asfeVar2;
        do {
            asfeVar2 = (asfe) asfeVar.f.a;
            if (f() != asfeVar) {
                return;
            }
        } while (!asfeVar.f.d(asfeVar2, this));
        if (hf()) {
            asfeVar.g();
        }
    }

    public final boolean l(asfe asfeVar, int i) {
        asfe i2;
        do {
            i2 = i();
            if (i2 instanceof asfb) {
                if ((((asfb) i2).a & i) == 0 && i2.l(asfeVar, i)) {
                    return true;
                }
                return false;
            }
            asfeVar.f.b(i2);
            asfeVar.e.b(this);
        } while (!i2.e.d(this, asfeVar));
        asfeVar.k(this);
        return true;
    }

    public String toString() {
        return new arru(this) { // from class: asfd
            @Override // defpackage.arru
            public final Object b() {
                return arwi.a(this.e);
            }
        } + "@" + arwi.b(this);
    }
}
