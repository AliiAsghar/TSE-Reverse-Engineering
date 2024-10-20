package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asfr {
    private final arvc a = new arvc(0, arvf.a);
    public asfs[] b;

    private final void h(int i, int i2) {
        asfs[] asfsVarArr = this.b;
        asfsVarArr.getClass();
        asfs asfsVar = asfsVarArr[i2];
        asfsVar.getClass();
        asfs asfsVar2 = asfsVarArr[i];
        asfsVar2.getClass();
        asfsVarArr[i] = asfsVar;
        asfsVarArr[i2] = asfsVar2;
        asfsVar.e(i);
        asfsVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final asfs b() {
        asfs[] asfsVarArr = this.b;
        if (asfsVarArr != null) {
            return asfsVarArr[0];
        }
        return null;
    }

    public final asfs c() {
        asfs b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (((java.lang.Comparable) r5).compareTo(r6) < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.asfs d(int r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.arwh.a
            asfs[] r0 = r7.b
            r0.getClass()
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.e(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L7e
            int r1 = r7.a()
            r7.h(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L3c
            int r1 = r1 / 2
            r3 = r0[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.h(r8, r1)
            r7.f(r1)
            goto L7e
        L3c:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L7e
            asfs[] r4 = r7.b
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L66
            r5 = r4[r1]
            r5.getClass()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            r3 = r4[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L7e
            r7.h(r8, r1)
            r8 = r1
            goto L3c
        L7e:
            int r8 = r7.a()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r2 = r7.a()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asfr.d(int):asfs");
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            asfs[] asfsVarArr = this.b;
            asfsVarArr.getClass();
            int i2 = (i - 1) >> 1;
            asfs asfsVar = asfsVarArr[i2];
            asfsVar.getClass();
            asfs asfsVar2 = asfsVarArr[i];
            asfsVar2.getClass();
            if (((Comparable) asfsVar).compareTo(asfsVar2) > 0) {
                h(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        if (a() == 0) {
            return true;
        }
        return false;
    }
}
