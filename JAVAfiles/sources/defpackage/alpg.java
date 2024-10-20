package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alpg<K, V> extends allo<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient alor<K, ? extends alnu<V>> map;
    final transient int size;

    public alpg(alor alorVar, int i) {
        this.map = alorVar;
        this.size = i;
    }

    public abstract alnu a(Object obj);

    @Override // defpackage.alrz
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.alrz
    public final int e() {
        return this.size;
    }

    @Override // defpackage.alli
    public final /* synthetic */ Collection f() {
        return new alpd(this);
    }

    @Override // defpackage.alli
    public final /* synthetic */ Collection h() {
        return new alpf(this);
    }

    @Override // defpackage.alli, defpackage.alrz
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public alnu r() {
        return (alnu) super.r();
    }

    @Override // defpackage.alli
    public final /* synthetic */ Iterator j() {
        return new alpa(this);
    }

    @Override // defpackage.alli, defpackage.alrz
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final alpt u() {
        return this.map.keySet();
    }

    @Override // defpackage.alli
    public final Map m() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.alli
    public final Set n() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.alrz
    @Deprecated
    public final void o() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alli, defpackage.alrz
    @Deprecated
    public final void q(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.alli, defpackage.alrz
    public final /* bridge */ /* synthetic */ Collection s() {
        return (alnu) super.s();
    }

    @Override // defpackage.alli, defpackage.alrz
    public /* synthetic */ Map t() {
        return this.map;
    }

    @Override // defpackage.alli, defpackage.alrz
    public final boolean w(Object obj) {
        if (obj != null && super.w(obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alli, defpackage.alrz
    @Deprecated
    public final boolean y(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
