package defpackage;

import defpackage.ccu;
import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cce<K, V> extends arnk<K, V> implements Map<K, V>, cbn {
    public static final cce a = new cce(ccu.a, 0);
    public final ccu b;
    public final int c;

    public cce(ccu ccuVar, int i) {
        this.b = ccuVar;
        this.c = i;
    }

    @Override // defpackage.arnk, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.b.l(i, obj, 0);
    }

    @Override // defpackage.arnk
    public final int e() {
        return this.c;
    }

    public final cce f(Object obj, Object obj2) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        ccu.a d = this.b.d(i, obj, obj2, 0);
        if (d == null) {
            return this;
        }
        return new cce(d.a, e() + d.b);
    }

    @Override // defpackage.arnk
    public final /* synthetic */ Collection g() {
        return new ccs(this);
    }

    @Override // defpackage.arnk, java.util.Map
    public Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.b.k(i, obj, 0);
    }

    @Override // defpackage.arnk
    public final Set h() {
        return new cco(this);
    }

    @Override // defpackage.arnk
    public final /* synthetic */ Set i() {
        return new ccq(this);
    }
}
