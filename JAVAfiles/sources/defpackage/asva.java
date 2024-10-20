package defpackage;

import java.security.SecureRandom;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class asva {
    protected static final asuy[] a = new asuy[0];
    public final asuw b;
    protected final asuy c;
    protected final asuy d;
    protected final asuy[] e;
    public Hashtable f = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public asva(asuw asuwVar, asuy asuyVar, asuy asuyVar2, asuy[] asuyVarArr) {
        this.b = asuwVar;
        this.c = asuyVar;
        this.d = asuyVar2;
        this.e = asuyVarArr;
    }

    public abstract boolean a();

    public boolean b() {
        throw null;
    }

    public asuy c() {
        throw null;
    }

    public abstract asva d(asva asvaVar);

    public abstract asva e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof asva)) {
            return false;
        }
        return l((asva) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f() {
        return this.b.h;
    }

    public final asuy g() {
        k();
        return this.c;
    }

    protected final asva h(asuy asuyVar, asuy asuyVar2) {
        asuy asuyVar3 = this.d;
        return new asuz(this.b, this.c.g(asuyVar), asuyVar3.g(asuyVar2));
    }

    public final int hashCode() {
        int i = ~this.b.hashCode();
        if (!m()) {
            asva i2 = i();
            return (i ^ (i2.c.hashCode() * 17)) ^ (i2.c().hashCode() * 257);
        }
        return i;
    }

    public final asva i() {
        int f;
        if (!m() && (f = f()) != 0 && f != 5) {
            asuy o = o();
            if (!o.m()) {
                a.bE(assw.a, assw.b);
                asuo asuoVar = (asuo) assw.a.get();
                if (((ThreadLocal) asuoVar.a).get() == null) {
                    ((ThreadLocal) asuoVar.a).set(new SecureRandom());
                }
                SecureRandom secureRandom = (SecureRandom) ((ThreadLocal) asuoVar.a).get();
                asuv asuvVar = (asuv) this.b;
                int i = asuvVar.a;
                asuy g = asuvVar.c(asuv.a(secureRandom, i)).g(asuvVar.c(asuv.a(secureRandom, i)));
                return j(o.g(g).f().g(g));
            }
        }
        return this;
    }

    final asva j(asuy asuyVar) {
        int f = f();
        if (f != 1) {
            if (f != 2 && f != 3 && f != 4) {
                if (f != 6) {
                    throw new IllegalStateException("not a projective coordinate system");
                }
            } else {
                asuy j = asuyVar.j();
                return h(j, j.g(asuyVar));
            }
        }
        return h(asuyVar, asuyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        if (n()) {
        } else {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public final boolean l(asva asvaVar) {
        if (asvaVar != null) {
            asuw asuwVar = this.b;
            boolean m = m();
            asuw asuwVar2 = asvaVar.b;
            boolean m2 = asvaVar.m();
            if (!m && !m2) {
                if (!asuwVar.f(asuwVar2)) {
                    return false;
                }
                asva[] asvaVarArr = new asva[2];
                asvaVarArr[0] = this;
                asvaVarArr[1] = asuwVar.e(asvaVar);
                for (int i = 0; i < 2; i++) {
                    asva asvaVar2 = asvaVarArr[i];
                    if (asvaVar2 != null && asuwVar != asvaVar2.b) {
                        throw new IllegalArgumentException("'points' entries must be null or on this curve");
                    }
                }
                int i2 = asuwVar.h;
                if (i2 != 0 && i2 != 5) {
                    asuy[] asuyVarArr = new asuy[2];
                    int[] iArr = new int[2];
                    int i3 = 0;
                    for (int i4 = 0; i4 < 2; i4++) {
                        asva asvaVar3 = asvaVarArr[i4];
                        if (asvaVar3 != null && !asvaVar3.n()) {
                            asuyVarArr[i3] = asvaVar3.o();
                            iArr[i3] = i4;
                            i3++;
                        }
                    }
                    if (i3 != 0) {
                        asuy[] asuyVarArr2 = new asuy[i3];
                        asuyVarArr2[0] = asuyVarArr[0];
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            if (i6 >= i3) {
                                break;
                            }
                            asuyVarArr2[i6] = asuyVarArr2[i5].g(asuyVarArr[i6]);
                            i5 = i6;
                        }
                        asuy f = asuyVarArr2[i5].f();
                        while (i5 > 0) {
                            int i7 = i5 - 1;
                            asuy asuyVar = asuyVarArr[i5];
                            asuyVarArr[i5] = asuyVarArr2[i7].g(f);
                            f = f.g(asuyVar);
                            i5 = i7;
                        }
                        asuyVarArr[0] = f;
                        for (int i8 = 0; i8 < i3; i8++) {
                            int i9 = iArr[i8];
                            asvaVarArr[i9] = asvaVarArr[i9].j(asuyVarArr[i8]);
                        }
                    }
                }
                asva asvaVar4 = asvaVarArr[0];
                asva asvaVar5 = asvaVarArr[1];
                if (!asvaVar4.c.equals(asvaVar5.c) || !asvaVar4.c().equals(asvaVar5.c())) {
                    return false;
                }
                return true;
            }
            if (m && m2 && asuwVar.f(asuwVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        if (this.c == null || this.d == null) {
            return true;
        }
        asuy[] asuyVarArr = this.e;
        if (asuyVarArr.length > 0 && asuyVarArr[0].n()) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        int f = f();
        if (f != 0 && f != 5 && !m() && !this.e[0].m()) {
            return false;
        }
        return true;
    }

    public final asuy o() {
        asuy[] asuyVarArr = this.e;
        if (asuyVarArr.length <= 0) {
            return null;
        }
        return asuyVarArr[0];
    }

    public final String toString() {
        if (m()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.c);
        stringBuffer.append(',');
        stringBuffer.append(this.d);
        for (int i = 0; i < this.e.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.e[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
