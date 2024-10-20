package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbw<T> extends cbp<T> implements ListIterator<T>, arse {
    private final cbu c;
    private int d;
    private cbz e;
    private int f;

    public cbw(cbu cbuVar, int i) {
        super(i, cbuVar.d);
        this.c = cbuVar;
        this.d = cbuVar.b();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d == this.c.b()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f != -1) {
        } else {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        cbu cbuVar = this.c;
        this.b = cbuVar.d;
        this.d = cbuVar.b();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final void f() {
        cbu cbuVar = this.c;
        Object[] objArr = cbuVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int b = cca.b(cbuVar.d);
        int s = arrn.s(this.a, b);
        int i = cbuVar.a / 5;
        cbz cbzVar = this.e;
        int i2 = i + 1;
        if (cbzVar == null) {
            this.e = new cbz(objArr, s, b, i2);
            return;
        }
        cbzVar.a = s;
        cbzVar.b = b;
        cbzVar.c = i2;
        if (cbzVar.d.length < i2) {
            cbzVar.d = new Object[i2];
        }
        ?? r6 = 0;
        cbzVar.d[0] = objArr;
        if (s == b) {
            r6 = 1;
        }
        cbzVar.e = r6;
        cbzVar.c(s - r6, 1);
    }

    @Override // defpackage.cbp, java.util.ListIterator
    public final void add(Object obj) {
        c();
        this.c.add(this.a, obj);
        this.a++;
        e();
    }

    @Override // defpackage.cbp, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        cbz cbzVar = this.e;
        if (cbzVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i];
        }
        if (cbzVar.hasNext()) {
            this.a = i2;
            return cbzVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i - cbzVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        cbz cbzVar = this.e;
        if (cbzVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = cbzVar.b;
        if (i > i3) {
            Object[] objArr2 = this.c.c;
            this.a = i2;
            return objArr2[i2 - i3];
        }
        this.a = i2;
        return cbzVar.previous();
    }

    @Override // defpackage.cbp, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.cbp, java.util.ListIterator
    public final void set(Object obj) {
        c();
        d();
        this.c.set(this.f, obj);
        this.d = this.c.b();
        f();
    }
}
