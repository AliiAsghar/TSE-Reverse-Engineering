package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khc implements khb {
    private final oja a;
    private final ascd b = ascy.a(new khd(arnv.a, khe.a, 12));

    public khc(oja ojaVar) {
        this.a = ojaVar;
    }

    private static final alog f(List list, List list2, boolean z) {
        List az = aqjn.az(list);
        ArrayList arrayList = new ArrayList(aqjn.J(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((miz) it.next()).b());
        }
        boolean Q = aqjn.Q(az, new kbt(arrayList, 12));
        boolean z2 = true;
        if ((!z || az.isEmpty()) && Q) {
            z2 = false;
        }
        if (z) {
            az.clear();
        }
        if (z2) {
            az.addAll(list2);
        }
        return alzz.aZ(az);
    }

    @Override // defpackage.khb
    public final /* synthetic */ asai a() {
        return this.b;
    }

    @Override // defpackage.khb
    public final void b() {
        this.b.f(new khd(arnv.a, khe.a, 12));
    }

    @Override // defpackage.khb
    public final void c(List list) {
        List list2 = ((khd) this.b.c()).a;
        boolean isEmpty = list2.isEmpty();
        alog f = f(list2, list, false);
        this.b.f(new khd(f, lga.bk(f), null, isEmpty));
    }

    @Override // defpackage.khb
    public final void d(miz mizVar, boolean z, khf khfVar) {
        boolean z2;
        alog aZ;
        List y;
        List list = ((khd) this.b.c()).a;
        boolean z3 = false;
        if (!z && !list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.a.a()) {
            if (mizVar instanceof kci) {
                y = ((kci) mizVar).a;
            } else {
                y = aqjn.y(mizVar);
            }
            aZ = f(list, y, z);
        } else {
            List az = aqjn.az(list);
            boolean removeIf = Collection.EL.removeIf(az, new isg(new kbt(mizVar, 11), 4));
            if ((z && !az.isEmpty()) || !removeIf) {
                z3 = true;
            }
            if (z) {
                az.clear();
            }
            if (z3) {
                az.add(mizVar);
            }
            aZ = alzz.aZ(az);
        }
        ascd ascdVar = this.b;
        if (true != z) {
            khfVar = null;
        }
        ascdVar.f(new khd(aZ, lga.bk(aZ), khfVar, z2));
    }

    @Override // defpackage.khb
    public final boolean e() {
        if (!((khd) this.b.c()).a.isEmpty()) {
            return true;
        }
        return false;
    }
}
