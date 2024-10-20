package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqa extends alok {
    private transient Object[] d;
    private transient Object[] e;
    private final Comparator f;

    public alqa(Comparator comparator) {
        comparator.getClass();
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // defpackage.alok
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final alqc b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object[] copyOf = Arrays.copyOf(this.d, i);
                Arrays.sort(copyOf, this.f);
                Object[] objArr = new Object[this.b];
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (this.f.compare(copyOf[i3], copyOf[i2]) == 0) {
                            throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + String.valueOf(copyOf[i3]) + " and " + String.valueOf(copyOf[i2]));
                        }
                    }
                    Object obj = this.d[i2];
                    obj.getClass();
                    int binarySearch = Arrays.binarySearch(copyOf, obj, this.f);
                    Object obj2 = this.e[i2];
                    obj2.getClass();
                    objArr[binarySearch] = obj2;
                }
                return new alqc(new alth(alog.h(copyOf), this.f), alog.h(objArr));
            }
            Comparator comparator = this.f;
            Object obj3 = this.d[0];
            obj3.getClass();
            Object obj4 = this.e[0];
            obj4.getClass();
            return alqc.x(comparator, obj3, obj4);
        }
        return alqc.u(this.f);
    }

    @Override // defpackage.alok
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void h(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.d.length;
        if (i > length) {
            int f = alnt.f(length, i);
            this.d = Arrays.copyOf(this.d, f);
            this.e = Arrays.copyOf(this.e, f);
        }
        albo.v(obj, obj2);
        Object[] objArr = this.d;
        int i2 = this.b;
        objArr[i2] = obj;
        this.e[i2] = obj2;
        this.b = i2 + 1;
    }
}
