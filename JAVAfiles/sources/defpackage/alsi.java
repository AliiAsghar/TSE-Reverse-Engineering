package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class alsi extends alli {
    final alrz a;
    final alrs b;

    public alsi(alrz alrzVar, alrs alrsVar) {
        alrzVar.getClass();
        this.a = alrzVar;
        this.b = alrsVar;
    }

    public Collection a(Object obj, Collection collection) {
        alre alreVar = new alre(this.b, obj);
        if (collection instanceof List) {
            return alzz.as((List) collection, alreVar);
        }
        return new allu(collection, alreVar);
    }

    @Override // defpackage.alrz
    /* renamed from: b */
    public Collection z(Object obj) {
        return a(obj, this.a.z(obj));
    }

    @Override // defpackage.alrz
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.alli
    public final Collection f() {
        return new alsf(this);
    }

    @Override // defpackage.alli
    public final Collection h() {
        return new allu(this.a.r(), new alrg(this.b, 1));
    }

    @Override // defpackage.alli
    public final Iterator j() {
        return alzz.aC(this.a.r().iterator(), alzz.ad(this.b));
    }

    @Override // defpackage.alli
    public final Map m() {
        return new alrw(this.a.t(), new alrs() { // from class: alsh
            @Override // defpackage.alrs
            public final Object a(Object obj, Object obj2) {
                return alsi.this.a(obj, (Collection) obj2);
            }
        });
    }

    @Override // defpackage.alli
    public final Set n() {
        return this.a.u();
    }

    @Override // defpackage.alrz
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.alli, defpackage.alrz
    public final void q(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.alli, defpackage.alrz
    public final boolean x() {
        throw null;
    }

    @Override // defpackage.alli, defpackage.alrz
    public final boolean y(Object obj, Object obj2) {
        return z(obj).remove(obj2);
    }
}
