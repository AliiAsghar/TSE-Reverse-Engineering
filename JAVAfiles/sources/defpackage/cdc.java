package defpackage;

import j$.util.Set;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdc<E> extends arnp<E> implements Set<E>, cbo {
    public static final cdc a;
    private final Object b;
    private final Object c;
    private final cce d;

    static {
        cdf cdfVar = cdf.a;
        a = new cdc(cdfVar, cdfVar, cce.a);
    }

    public cdc(Object obj, Object obj2, cce cceVar) {
        this.b = obj;
        this.c = obj2;
        this.d = cceVar;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.d.e();
    }

    @Override // defpackage.cbo
    public final cbo b(Object obj) {
        if (this.d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            cce cceVar = this.d;
            cdf cdfVar = cdf.a;
            return new cdc(obj, obj, cceVar.f(obj, new cdb(cdfVar, cdfVar)));
        }
        Object obj2 = this.c;
        Object obj3 = this.d.get(obj2);
        obj3.getClass();
        return new cdc(this.b, obj, this.d.f(obj2, ((cdb) obj3).a(obj)).f(obj, new cdb(obj2, cdf.a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cbo
    public final cbo c(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        cdb cdbVar = (cdb) this.d.get(obj);
        if (cdbVar == null) {
            return this;
        }
        cce cceVar = this.d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        ccu j = cceVar.b.j(i, obj, 0);
        if (cceVar.b != j) {
            if (j == null) {
                cceVar = cce.a;
            } else {
                cceVar = new cce(j, cceVar.e() - 1);
            }
        }
        if (cdbVar.c()) {
            V v = cceVar.get(cdbVar.a);
            v.getClass();
            cceVar = cceVar.f(cdbVar.a, ((cdb) v).a(cdbVar.b));
        }
        if (cdbVar.b()) {
            V v2 = cceVar.get(cdbVar.b);
            v2.getClass();
            cceVar = cceVar.f(cdbVar.b, new cdb(cdbVar.a, ((cdb) v2).b));
        }
        if (!cdbVar.c()) {
            obj2 = cdbVar.b;
        } else {
            obj2 = this.b;
        }
        if (!cdbVar.b()) {
            obj3 = cdbVar.a;
        } else {
            obj3 = this.c;
        }
        return new cdc(obj2, obj3, cceVar);
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.arnp, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new cdd(this.b, this.d);
    }
}
