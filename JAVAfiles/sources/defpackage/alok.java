package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alok {
    Object[] a;
    int b;
    asqe c;

    public alok() {
        this(4);
    }

    private final alor a(boolean z) {
        asqe asqeVar;
        asqe asqeVar2;
        if (z && (asqeVar2 = this.c) != null) {
            throw asqeVar2.m();
        }
        altc u = altc.u(this.b, this.a, this);
        if (z && (asqeVar = this.c) != null) {
            throw asqeVar.m();
        }
        return u;
    }

    private final void c(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, alnt.f(length, i2));
        }
    }

    public alor b() {
        return a(true);
    }

    @Deprecated
    public final alor f() {
        return b();
    }

    public final alor g() {
        return a(false);
    }

    public void h(Object obj, Object obj2) {
        c(this.b + 1);
        albo.v(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void i(Map.Entry entry) {
        h(entry.getKey(), entry.getValue());
    }

    public final void j(alok alokVar) {
        alokVar.getClass();
        c(this.b + alokVar.b);
        Object[] objArr = alokVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = alokVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += alokVar.b;
    }

    public final void k(Iterable iterable) {
        if (iterable instanceof Collection) {
            c(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i((Map.Entry) it.next());
        }
    }

    public final void l(Map map) {
        k(map.entrySet());
    }

    public alok(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
