package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aluj extends aluk implements alrz {
    private static final long serialVersionUID = 0;
    transient Map a;

    public aluj(alrz alrzVar) {
        super(alrzVar, null);
    }

    final alrz a() {
        return (alrz) this.f;
    }

    @Override // defpackage.alrz
    /* renamed from: b */
    public final Collection z(Object obj) {
        Collection A;
        synchronized (this.g) {
            A = alzz.A(a().z(obj), this.g);
        }
        return A;
    }

    @Override // defpackage.alrz
    public final int e() {
        throw null;
    }

    @Override // defpackage.alrz
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // defpackage.alrz
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.alrz
    public final void o() {
        throw null;
    }

    @Override // defpackage.alrz
    public final void q(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.alrz
    public final Collection r() {
        throw null;
    }

    @Override // defpackage.alrz
    public final Collection s() {
        throw null;
    }

    @Override // defpackage.alrz
    public final Map t() {
        Map map;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new alua(a().t(), this.g);
            }
            map = this.a;
        }
        return map;
    }

    @Override // defpackage.alrz
    public final Set u() {
        throw null;
    }

    @Override // defpackage.alrz
    public final boolean v(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.alrz
    public final boolean w(Object obj) {
        throw null;
    }

    @Override // defpackage.alrz
    public final boolean x() {
        throw null;
    }

    @Override // defpackage.alrz
    public final boolean y(Object obj, Object obj2) {
        throw null;
    }
}
