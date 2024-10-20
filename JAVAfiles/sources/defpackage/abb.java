package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abb<T> implements aaj<T> {
    private final b a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T> extends aba<T> {
        public final int c;

        public a(Object obj, aak aakVar) {
            super(obj, aakVar);
            this.c = 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(aVar.a, this.a) && d.F(aVar.b, this.b)) {
                int i = aVar.c;
                if (defpackage.a.bA(0, 0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 961) + this.b.hashCode();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b<T> extends abc<T, a<T>> {
        public final a a(Object obj, int i) {
            a aVar = new a(obj, aao.d);
            this.b.f(i, aVar);
            return aVar;
        }
    }

    public abb(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.aaj
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final acv a(acg acgVar) {
        long[] jArr;
        int i;
        long[] jArr2;
        char c;
        tv tvVar = new tv(this.a.b.e + 2);
        tx txVar = new tx(this.a.b.e);
        tx txVar2 = this.a.b;
        int[] iArr = txVar2.b;
        Object[] objArr = txVar2.c;
        long[] jArr3 = txVar2.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            a aVar = (a) objArr[i5];
                            tvVar.e(i6);
                            jArr2 = jArr3;
                            zz zzVar = (zz) acgVar.b().a(aVar.a);
                            aak aakVar = aVar.b;
                            int i7 = aVar.c;
                            txVar.f(i6, new acu(zzVar, aakVar));
                            c = '\b';
                        } else {
                            jArr2 = jArr3;
                            c = '\b';
                        }
                        j >>= c;
                        i4++;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        if (!this.a.b.b(0)) {
            if (tvVar.b < 0) {
                defpackage.a.bJ("Index must be between 0 and size");
            }
            tvVar.d(tvVar.b + 1);
            int[] iArr2 = tvVar.a;
            int i8 = tvVar.b;
            if (i8 != 0) {
                aqil.x(iArr2, iArr2, 1, 0, i8);
            }
            iArr2[0] = 0;
            tvVar.b++;
        }
        b bVar = this.a;
        if (!bVar.b.b(bVar.a)) {
            tvVar.e(this.a.a);
        }
        int i9 = tvVar.b;
        if (i9 != 0) {
            int[] iArr3 = tvVar.a;
            iArr3.getClass();
            Arrays.sort(iArr3, 0, i9);
        }
        return new acv(tvVar, txVar, this.a.a, aao.d);
    }
}
