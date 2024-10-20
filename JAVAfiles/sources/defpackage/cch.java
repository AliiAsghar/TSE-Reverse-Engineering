package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cch<K, V, T> extends ccf<K, V, T> implements Iterator<T>, arse {
    public final ccg d;
    public int e;
    private Object f;
    private boolean g;

    public cch(ccg ccgVar, ccv[] ccvVarArr) {
        super(ccgVar.b, ccvVarArr);
        this.d = ccgVar;
        this.e = ccgVar.d;
    }

    public final void b(int i, ccu ccuVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            ccv ccvVar = this.a[i2];
            Object[] objArr = ccuVar.b;
            ccvVar.d(objArr, objArr.length, 0);
            while (!d.F(this.a[i2].a(), obj)) {
                this.a[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int a = 1 << ccy.a(i, i3);
        if (ccuVar.m(a)) {
            int b = ccuVar.b(a);
            ccv ccvVar2 = this.a[i2];
            Object[] objArr2 = ccuVar.b;
            int a2 = ccuVar.a();
            ccvVar2.d(objArr2, a2 + a2, b);
            this.b = i2;
            return;
        }
        int c = ccuVar.c(a);
        ccu i4 = ccuVar.i(c);
        ccv ccvVar3 = this.a[i2];
        Object[] objArr3 = ccuVar.b;
        int a3 = ccuVar.a();
        ccvVar3.d(objArr3, a3 + a3, c);
        b(i, i4, obj, i2 + 1);
    }

    @Override // defpackage.ccf, java.util.Iterator
    public final Object next() {
        if (this.d.d == this.e) {
            this.f = a();
            this.g = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // defpackage.ccf, java.util.Iterator
    public final void remove() {
        int i;
        if (this.g) {
            if (this.c) {
                Object a = a();
                ccg ccgVar = this.d;
                Object obj = this.f;
                arsd.i(ccgVar);
                ccgVar.remove(obj);
                if (a != null) {
                    i = a.hashCode();
                } else {
                    i = 0;
                }
                b(i, this.d.b, a, 0);
            } else {
                ccg ccgVar2 = this.d;
                Object obj2 = this.f;
                arsd.i(ccgVar2);
                ccgVar2.remove(obj2);
            }
            this.f = null;
            this.g = false;
            this.e = this.d.d;
            return;
        }
        throw new IllegalStateException();
    }
}
