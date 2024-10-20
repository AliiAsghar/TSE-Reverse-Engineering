package defpackage;

import defpackage.cfq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atx implements aty {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final boolean e;
    public final int f;
    public final int[] g;
    public int h;
    public int i;
    private final cfq.b j;
    private final cfq.c k;
    private final drk l;

    public atx(int i, List list, long j, Object obj, ahp ahpVar, cfq.b bVar, cfq.c cVar, drk drkVar) {
        boolean z;
        int i2;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.j = bVar;
        this.k = cVar;
        this.l = drkVar;
        if (ahpVar == ahp.a) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            cvc cvcVar = (cvc) list.get(i4);
            if (!this.e) {
                i2 = cvcVar.b;
            } else {
                i2 = cvcVar.a;
            }
            i3 = Math.max(i3, i2);
        }
        this.f = i3;
        int size2 = this.b.size();
        this.g = new int[size2 + size2];
        this.i = Integer.MIN_VALUE;
    }

    @Override // defpackage.aty
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aty
    public final int b() {
        return this.h;
    }

    public final void c(int i) {
        this.h += i;
        int i2 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i2 < iArr.length) {
                if (this.e) {
                    if (i2 % 2 != 1) {
                        i2++;
                    }
                    iArr[i2] = iArr[i2] + i;
                    i2++;
                } else {
                    if (i2 % 2 != 0) {
                        i2++;
                    }
                    iArr[i2] = iArr[i2] + i;
                    i2++;
                }
            } else {
                return;
            }
        }
    }

    public final void d(int i, int i2, int i3) {
        int i4;
        int i5;
        this.h = i;
        if (true != this.e) {
            i4 = i2;
        } else {
            i4 = i3;
        }
        this.i = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            cvc cvcVar = (cvc) list.get(i6);
            int i7 = i6 + i6;
            int i8 = i7 + 1;
            if (this.e) {
                this.g[i7] = this.j.a(cvcVar.a, i2, this.l);
                this.g[i8] = i;
                i5 = cvcVar.b;
            } else {
                int[] iArr = this.g;
                iArr[i7] = i;
                cfq.c cVar = this.k;
                if (cVar != null) {
                    iArr[i8] = cVar.a(cvcVar.b, i3);
                    i5 = cvcVar.a;
                } else {
                    aju.a("null verticalAlignment");
                    throw new armj();
                }
            }
            i += i5;
        }
    }
}
