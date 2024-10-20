package defpackage;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezd extends erz {
    public final int b;
    public final erz[] c;
    public final Object[] d;
    private final int e;
    private final int f;
    private final int[] g;
    private final int[] h;
    private final HashMap i;
    private final kkc j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ezd(java.util.Collection r7, defpackage.kkc r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            erz[] r0 = new defpackage.erz[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            fas r4 = (defpackage.fas) r4
            int r5 = r3 + 1
            erz r4 = r4.a()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            fas r3 = (defpackage.fas) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.b()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezd.<init>(java.util.Collection, kkc):void");
    }

    private final int A(int i, boolean z) {
        if (z) {
            kkc kkcVar = this.j;
            int i2 = ((int[]) kkcVar.b)[i] + 1;
            int[] iArr = (int[]) kkcVar.c;
            if (i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }
        if (i >= this.e - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int B(int i, boolean z) {
        if (z) {
            kkc kkcVar = this.j;
            int i2 = ((int[]) kkcVar.b)[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return ((int[]) kkcVar.c)[i2];
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    public static Object r(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object s(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // defpackage.erz
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Object s = s(obj);
            Object r = r(obj);
            int t = t(s);
            if (t != -1 && (a = y(t).a(r)) != -1) {
                return w(t) + a;
            }
        }
        return -1;
    }

    @Override // defpackage.erz
    public final int b() {
        return this.f;
    }

    @Override // defpackage.erz
    public final int c() {
        return this.b;
    }

    @Override // defpackage.erz
    public final erx d(int i, erx erxVar, boolean z) {
        int u = u(i);
        int x = x(u);
        y(u).d(i - w(u), erxVar, z);
        erxVar.c += x;
        if (z) {
            Object z2 = z(u);
            Object obj = erxVar.b;
            dzg.g(obj);
            erxVar.b = Pair.create(z2, obj);
        }
        return erxVar;
    }

    @Override // defpackage.erz
    public final ery e(int i, ery eryVar, long j) {
        int v = v(i);
        int x = x(v);
        int w = w(v);
        y(v).e(i - x, eryVar, j);
        Object z = z(v);
        if (!ery.a.equals(eryVar.b)) {
            z = Pair.create(z, eryVar.b);
        }
        eryVar.b = z;
        eryVar.n += w;
        eryVar.o += w;
        return eryVar;
    }

    @Override // defpackage.erz
    public final Object f(int i) {
        int u = u(i);
        return Pair.create(z(u), y(u).f(i - w(u)));
    }

    @Override // defpackage.erz
    public final int g(boolean z) {
        if (this.e != 0) {
            int i = 0;
            if (z) {
                int[] iArr = (int[]) this.j.c;
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = -1;
                }
            }
            while (y(i).q()) {
                i = A(i, z);
                if (i == -1) {
                }
            }
            return x(i) + y(i).g(z);
        }
        return -1;
    }

    @Override // defpackage.erz
    public final int h(boolean z) {
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            if (z) {
                int[] iArr = (int[]) this.j.c;
                int length = iArr.length;
                if (length > 0) {
                    i = iArr[length - 1];
                } else {
                    i = -1;
                }
            } else {
                i = i2 - 1;
            }
            while (y(i).q()) {
                i = B(i, z);
                if (i == -1) {
                }
            }
            return x(i) + y(i).h(z);
        }
        return -1;
    }

    @Override // defpackage.erz
    public final int j(int i, int i2, boolean z) {
        int i3;
        int v = v(i);
        int x = x(v);
        erz y = y(v);
        int i4 = i - x;
        if (i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        int j = y.j(i4, i3, z);
        if (j != -1) {
            return x + j;
        }
        int A = A(v, z);
        while (A != -1 && y(A).q()) {
            A = A(A, z);
        }
        if (A != -1) {
            return x(A) + y(A).g(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return g(z);
    }

    @Override // defpackage.erz
    public final int k(int i, int i2, boolean z) {
        int i3;
        int v = v(i);
        int x = x(v);
        erz y = y(v);
        int i4 = i - x;
        if (i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        int k = y.k(i4, i3, z);
        if (k != -1) {
            return x + k;
        }
        int B = B(v, z);
        while (B != -1 && y(B).q()) {
            B = B(B, z);
        }
        if (B != -1) {
            return x(B) + y(B).h(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return h(z);
    }

    @Override // defpackage.erz
    public final erx o(Object obj, erx erxVar) {
        Object s = s(obj);
        Object r = r(obj);
        int t = t(s);
        int x = x(t);
        y(t).o(r, erxVar);
        erxVar.c += x;
        erxVar.b = obj;
        return erxVar;
    }

    protected final int t(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected final int u(int i) {
        return eul.b(this.g, i + 1, false, false);
    }

    protected final int v(int i) {
        return eul.b(this.h, i + 1, false, false);
    }

    protected final int w(int i) {
        return this.g[i];
    }

    protected final int x(int i) {
        return this.h[i];
    }

    protected final erz y(int i) {
        return this.c[i];
    }

    protected final Object z(int i) {
        return this.d[i];
    }

    public ezd(erz[] erzVarArr, Object[] objArr, kkc kkcVar) {
        this.j = kkcVar;
        this.e = kkcVar.v();
        this.c = erzVarArr;
        int length = erzVarArr.length;
        this.g = new int[length];
        this.h = new int[length];
        this.d = objArr;
        this.i = new HashMap();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < erzVarArr.length) {
            erz erzVar = erzVarArr[i];
            this.c[i4] = erzVar;
            this.h[i4] = i2;
            this.g[i4] = i3;
            i2 += erzVar.c();
            i3 += this.c[i4].b();
            this.i.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.b = i2;
        this.f = i3;
    }
}
