package defpackage;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxp extends alxr {
    public final int[] a;
    public final int b;
    private final alxa c;
    private final alxa d;

    public alxp(alxa alxaVar, alxa alxaVar2) {
        boolean z;
        int h;
        int i;
        this.c = alxaVar;
        this.d = alxaVar2;
        int b = alxaVar.b() + alxaVar2.b();
        int i2 = 0;
        if (b <= 28) {
            z = true;
        } else {
            z = false;
        }
        alzz.c(z, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            alvz e = e(i2);
            long j2 = e.d | j;
            if (j2 == j && (h = h(e, iArr, i3)) != -1) {
                if (e.b) {
                    i = iArr[h] | (1 << (i2 + 4));
                } else {
                    i = i2;
                }
                iArr[h] = i;
            } else {
                iArr[i3] = i2;
                i3++;
            }
            i2++;
            j = j2;
        }
        this.b = i3;
    }

    private final int h(alvz alvzVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (alvzVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.alxr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.alxr
    public final Object b(alvz alvzVar) {
        alzz.c(!alvzVar.b, "key must be single valued");
        int h = h(alvzVar, this.a, this.b);
        if (h >= 0) {
            return alvzVar.c(f(this.a[h]));
        }
        return null;
    }

    @Override // defpackage.alxr
    public final Set c() {
        return new alxn(this);
    }

    @Override // defpackage.alxr
    public final void d(alxh alxhVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            alvz e = e(i2 & 31);
            if (!e.b) {
                alxhVar.a(e, e.c(f(i2)), obj);
            } else {
                alxhVar.b(e, new alxo(this, e, i2), obj);
            }
        }
    }

    public final alvz e(int i) {
        int b = this.c.b();
        if (i >= b) {
            return this.d.c(i - b);
        }
        return this.c.c(i);
    }

    public final Object f(int i) {
        int b = this.c.b();
        if (i >= b) {
            return this.d.e(i - b);
        }
        return this.c.e(i);
    }
}
