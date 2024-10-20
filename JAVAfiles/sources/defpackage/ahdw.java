package defpackage;

import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdw implements ahci, ahdu {
    public final anat a;
    public final List b;
    public final List c;
    public final SparseIntArray d;
    private final alog e;

    public ahdw(anat anatVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = anatVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        DesugarCollections.unmodifiableList(list3);
        d.t(!list.isEmpty(), "Must have at least one graft");
        d.t(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.e = alog.r(ahji.aF((ahdv) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d.s(ahji.aF((ahdv) it.next()).equals(this.e.get(0)));
        }
    }

    @Override // defpackage.ahdu
    public final /* synthetic */ ahcw a() {
        return ahji.aF(this);
    }

    @Override // defpackage.ahdu
    public final List b() {
        return this.e;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        anas anasVar = ahji.aF(this).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        aj.f("rootVeId", anasVar.d);
        anas anasVar2 = ahji.aG(this).d;
        if (anasVar2 == null) {
            anasVar2 = anas.a;
        }
        aj.f("targetVeId", anasVar2.d);
        return aj.toString();
    }
}
