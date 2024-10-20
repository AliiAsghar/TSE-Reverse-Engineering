package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbf extends cbg {
    public int b;
    public int d;
    public int f;
    public int g;
    public int h;
    public cbb[] a = new cbb[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements cbc {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        @Override // defpackage.cbc
        public final int a(int i) {
            return cbf.this.c[this.b + i];
        }

        @Override // defpackage.cbc
        public final Object b(int i) {
            return cbf.this.e[this.c + i];
        }

        public final cbb c() {
            cbb cbbVar = cbf.this.a[this.a];
            cbbVar.getClass();
            return cbbVar;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        public static final void a(cbf cbfVar, int i, int i2) {
            int i3 = 1 << i;
            if ((cbfVar.g & i3) != 0) {
                byy.b("Already pushed argument ".concat(cbfVar.a().a(i)));
            }
            cbfVar.g |= i3;
            cbfVar.c[(cbfVar.d - cbfVar.a().b) + i] = i2;
        }

        public static final void b(cbf cbfVar, int i, Object obj) {
            int i2 = 1 << i;
            if ((cbfVar.h & i2) != 0) {
                byy.b("Already pushed argument ".concat(cbfVar.a().c(i)));
            }
            cbfVar.h |= i2;
            cbfVar.e[(cbfVar.f - cbfVar.a().c) + i] = obj;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final int h(int i) {
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    private static final int i(int i, int i2) {
        return arrn.r(i + arrn.s(i, 1024), i2);
    }

    public final cbb a() {
        cbb cbbVar = this.a[this.b - 1];
        cbbVar.getClass();
        return cbbVar;
    }

    public final void b() {
        this.b = 0;
        this.d = 0;
        aqil.d(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void c(bwc bwcVar, cae caeVar, bzs bzsVar) {
        int i;
        if (g()) {
            a aVar = new a();
            do {
                aVar.c().b(aVar, bwcVar, caeVar, bzsVar);
                if (aVar.a >= cbf.this.b) {
                    break;
                }
                cbb c = aVar.c();
                aVar.b += c.b;
                aVar.c += c.c;
                i = aVar.a + 1;
                aVar.a = i;
            } while (i < cbf.this.b);
        }
        b();
    }

    public final void d(cbb cbbVar) {
        if (cbbVar.b != 0 || cbbVar.c != 0) {
            byy.a("Cannot push " + cbbVar + " without arguments because it expects " + cbbVar.b + " ints and " + cbbVar.c + " objects.");
        }
        e(cbbVar);
    }

    public final void e(cbb cbbVar) {
        this.g = 0;
        this.h = 0;
        int i = this.b;
        cbb[] cbbVarArr = this.a;
        if (i == cbbVarArr.length) {
            Object[] copyOf = Arrays.copyOf(cbbVarArr, i + arrn.s(i, 1024));
            copyOf.getClass();
            this.a = (cbb[]) copyOf;
        }
        int i2 = this.d + cbbVar.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            int[] copyOf2 = Arrays.copyOf(iArr, i(length, i2));
            copyOf2.getClass();
            this.c = copyOf2;
        }
        int i3 = this.f + cbbVar.c;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i3 > length2) {
            Object[] copyOf3 = Arrays.copyOf(objArr, i(length2, i3));
            copyOf3.getClass();
            this.e = copyOf3;
        }
        cbb[] cbbVarArr2 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        cbbVarArr2[i4] = cbbVar;
        this.d += cbbVar.b;
        this.f += cbbVar.c;
    }

    public final boolean f() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }
}
