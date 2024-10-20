package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alns extends alnt {
    public Object[] a;
    public int b;
    boolean c;

    public alns(int i) {
        albo.x(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void g(int i) {
        int length = this.a.length;
        int f = f(length, this.b + i);
        if (f <= length && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, f);
        this.c = false;
    }

    public final void a(Object[] objArr, int i) {
        alzz.Z(objArr, i);
        g(i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void b(Object obj) {
        obj.getClass();
        g(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.alnt
    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void d(Object... objArr) {
        a(objArr, objArr.length);
    }

    @Override // defpackage.alnt
    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(collection.size());
            if (collection instanceof alnu) {
                this.b = ((alnu) collection).c(this.a, this.b);
                return;
            }
        }
        super.e(iterable);
    }
}
