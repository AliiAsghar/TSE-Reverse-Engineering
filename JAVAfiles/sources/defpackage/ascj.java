package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ascj extends asdg implements ascc, asai, asdv {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public ascj(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    private final int c() {
        return (int) ((f() + this.h) - this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [asaj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object g(defpackage.ascj r19, defpackage.asaj r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ascj.g(ascj, asaj, arpe):java.lang.Object");
    }

    private final int p() {
        return this.h + this.i;
    }

    private final long q() {
        return f() + this.h;
    }

    private final long r() {
        return f() + this.h + this.i;
    }

    private final long s(ascl asclVar) {
        long j = asclVar.a;
        if (j < q()) {
            return j;
        }
        if (this.g > 0 || j > f() || this.i == 0) {
            return -1L;
        }
        return j;
    }

    private final void t() {
        asdi[] asdiVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        asck.b(objArr, f(), null);
        this.h--;
        long f = f() + 1;
        if (this.b < f) {
            this.b = f;
        }
        if (this.c < f) {
            if (this.e != 0 && (asdiVarArr = this.d) != null) {
                for (asdi asdiVar : asdiVarArr) {
                    if (asdiVar != null) {
                        ascl asclVar = (ascl) asdiVar;
                        long j = asclVar.a;
                        if (j >= 0 && j < f) {
                            asclVar.a = f;
                        }
                    }
                }
            }
            this.c = f;
        }
        boolean z = arwh.a;
    }

    private final void u(Object obj) {
        int p = p();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = x(null, 0, 2);
        } else {
            int length = objArr.length;
            if (p >= length) {
                objArr = x(objArr, p, length + length);
            }
        }
        asck.b(objArr, f() + p, obj);
    }

    private final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        boolean z = arwh.a;
        for (long f = f(); f < min; f++) {
            Object[] objArr = this.a;
            objArr.getClass();
            asck.b(objArr, f, null);
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - min);
        this.i = (int) (j4 - j3);
    }

    private final boolean w(Object obj) {
        if (this.e == 0) {
            boolean z = arwh.a;
            if (this.f != 0) {
                u(obj);
                int i = this.h + 1;
                this.h = i;
                if (i > this.f) {
                    t();
                }
                this.c = f() + this.h;
            }
            return true;
        }
        if (this.h >= this.g && this.c <= this.b) {
            int i2 = this.j;
            if (i2 != 0) {
                int i3 = i2 - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return true;
                        }
                        throw new armm();
                    }
                } else {
                    return false;
                }
            } else {
                throw null;
            }
        }
        u(obj);
        int i4 = this.h + 1;
        this.h = i4;
        if (i4 > this.g) {
            t();
        }
        if (c() > this.f) {
            v(this.b + 1, this.c, q(), r());
        }
        return true;
    }

    private final Object[] x(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.a = objArr2;
            if (objArr != null) {
                long f = f();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + f;
                    asck.b(objArr2, j, asck.a(objArr, j));
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object[], java.lang.Object] */
    private final arpe[] y(arpe[] arpeVarArr) {
        asdi[] asdiVarArr;
        ascl asclVar;
        arpe arpeVar;
        if (this.e != 0 && (asdiVarArr = this.d) != null) {
            int length = arpeVarArr.length;
            int i = 0;
            arpeVarArr = arpeVarArr;
            while (i < asdiVarArr.length) {
                asdi asdiVar = asdiVarArr[i];
                if (asdiVar != null && (arpeVar = (asclVar = (ascl) asdiVar).b) != null && s(asclVar) >= 0) {
                    int length2 = arpeVarArr.length;
                    arpeVarArr = arpeVarArr;
                    if (length >= length2) {
                        ?? copyOf = Arrays.copyOf(arpeVarArr, Math.max(2, length2 + length2));
                        copyOf.getClass();
                        arpeVarArr = copyOf;
                    }
                    arpeVarArr[length] = arpeVar;
                    asclVar.b = null;
                    length++;
                }
                i++;
                arpeVarArr = arpeVarArr;
            }
        }
        return arpeVarArr;
    }

    @Override // defpackage.ascg, defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        return g(this, asajVar, arpeVar);
    }

    @Override // defpackage.ascg
    public final List d() {
        synchronized (this) {
            int c = c();
            if (c == 0) {
                return arnv.a;
            }
            ArrayList arrayList = new ArrayList(c);
            Object[] objArr = this.a;
            objArr.getClass();
            for (int i = 0; i < c; i++) {
                arrayList.add(asck.a(objArr, this.b + i));
            }
            return arrayList;
        }
    }

    @Override // defpackage.ascc
    public final void e() {
        synchronized (this) {
            v(q(), this.c, q(), r());
        }
    }

    public final long f() {
        return Math.min(this.c, this.b);
    }

    @Override // defpackage.ascc, defpackage.asaj
    public final Object fv(Object obj, arpe arpeVar) {
        arpe[] arpeVarArr;
        asch aschVar;
        if (h(obj)) {
            return arnb.a;
        }
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        arpe[] arpeVarArr2 = asdh.a;
        synchronized (this) {
            if (w(obj)) {
                arvpVar.w(arnb.a);
                arpeVarArr = y(arpeVarArr2);
                aschVar = null;
            } else {
                asch aschVar2 = new asch(this, p() + f(), obj, arvpVar);
                u(aschVar2);
                this.i++;
                if (this.g == 0) {
                    arpeVarArr2 = y(arpeVarArr2);
                }
                arpeVarArr = arpeVarArr2;
                aschVar = aschVar2;
            }
        }
        if (aschVar != null) {
            arrn.F(arvpVar, aschVar);
        }
        for (arpe arpeVar2 : arpeVarArr) {
            if (arpeVar2 != null) {
                arpeVar2.w(arnb.a);
            }
        }
        Object l = arvpVar.l();
        arpl arplVar = arpl.a;
        if (l == arplVar) {
            arpeVar.getClass();
        }
        if (l != arplVar) {
            l = arnb.a;
        }
        if (l != arplVar) {
            return arnb.a;
        }
        return l;
    }

    @Override // defpackage.ascc
    public final boolean h(Object obj) {
        int i;
        boolean z;
        arpe[] arpeVarArr = asdh.a;
        synchronized (this) {
            if (w(obj)) {
                arpeVarArr = y(arpeVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (arpe arpeVar : arpeVarArr) {
            if (arpeVar != null) {
                arpeVar.w(arnb.a);
            }
        }
        return z;
    }

    @Override // defpackage.asdv
    public final asai hp(arpi arpiVar, int i, int i2) {
        return asck.c(this, arpiVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object i() {
        Object[] objArr = this.a;
        objArr.getClass();
        return asck.a(objArr, (this.b + c()) - 1);
    }

    @Override // defpackage.asdg
    public final /* synthetic */ asdi j() {
        return new ascl();
    }

    public final void k() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0 && asck.a(objArr, (f() + p()) - 1) == asck.a) {
                this.i--;
                asck.b(objArr, f() + p(), null);
            }
        }
    }

    public final arpe[] l(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        asdi[] asdiVarArr;
        boolean z = arwh.a;
        if (j <= this.c) {
            long f = f();
            long j7 = this.h + f;
            if (this.g == 0 && this.i > 0) {
                j7++;
            }
            int i2 = 0;
            if (this.e != 0 && (asdiVarArr = this.d) != null) {
                for (asdi asdiVar : asdiVarArr) {
                    if (asdiVar != null) {
                        long j8 = ((ascl) asdiVar).a;
                        if (j8 >= 0 && j8 < j7) {
                            j7 = j8;
                        }
                    }
                }
            }
            if (j7 > this.c) {
                long q = q();
                if (this.e > 0) {
                    i = Math.min(this.i, this.g - ((int) (q - j7)));
                } else {
                    i = this.i;
                }
                arpe[] arpeVarArr = asdh.a;
                long j9 = this.i + q;
                if (i > 0) {
                    arpeVarArr = new arpe[i];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = q;
                    while (true) {
                        if (q < j9) {
                            Object a = asck.a(objArr, q);
                            j2 = j7;
                            asfn asfnVar = asck.a;
                            if (a != asfnVar) {
                                a.getClass();
                                int i3 = i2 + 1;
                                asch aschVar = (asch) a;
                                j3 = j9;
                                arpeVarArr[i2] = aschVar.d;
                                asck.b(objArr, q, asfnVar);
                                asck.b(objArr, j4, aschVar.c);
                                j6 = 1;
                                j4++;
                                if (i3 >= i) {
                                    break;
                                }
                                i2 = i3;
                            } else {
                                j3 = j9;
                                j6 = 1;
                            }
                            q += j6;
                            j7 = j2;
                            j9 = j3;
                        } else {
                            j2 = j7;
                            j3 = j9;
                            break;
                        }
                    }
                } else {
                    j2 = j7;
                    j3 = j9;
                    j4 = q;
                }
                arpe[] arpeVarArr2 = arpeVarArr;
                long j10 = j4 - f;
                if (this.e == 0) {
                    j5 = j4;
                } else {
                    j5 = j2;
                }
                long max = Math.max(this.b, j4 - Math.min(this.f, (int) j10));
                if (this.g == 0 && max < j3) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (d.F(asck.a(objArr2, max), asck.a)) {
                        j4++;
                        max++;
                    }
                }
                v(max, j5, j4, j3);
                k();
                if (arpeVarArr2.length == 0) {
                    return arpeVarArr2;
                }
                return y(arpeVarArr2);
            }
        }
        return asdh.a;
    }

    @Override // defpackage.asdg
    public final /* bridge */ /* synthetic */ asdi[] m() {
        return new ascl[2];
    }
}
