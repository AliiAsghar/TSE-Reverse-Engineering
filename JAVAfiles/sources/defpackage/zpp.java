package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpp extends no {
    private final ahmn e;
    private final List d = new ArrayList();
    public final SparseArray c = new SparseArray();

    public zpp(ahmn ahmnVar) {
        this.e = ahmnVar;
    }

    private final zjm H(int i) {
        for (zjm zjmVar : this.d) {
            if (i < ((no) zjmVar.a).b()) {
                return zjmVar;
            }
            i -= ((no) zjmVar.a).b();
        }
        throw new IllegalArgumentException(a.bV(i, "position not in adapter "));
    }

    public final void F(no noVar, int[] iArr) {
        zjm zjmVar = new zjm(noVar);
        for (int i : iArr) {
            if (this.c.indexOfKey(i) < 0) {
                this.c.put(i, zjmVar);
            } else {
                throw new IllegalArgumentException(a.cq(i, " already mapped to a partition"));
            }
        }
        ((no) zjmVar.a).D(new zpo(this, zjmVar));
        this.d.add(zjmVar);
        int G = G(zjmVar);
        int b = noVar.b();
        if (b > 0) {
            w(G, b);
        }
    }

    public final int G(zjm zjmVar) {
        return m((no) zjmVar.a);
    }

    @Override // defpackage.no
    public final int b() {
        Iterator it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((no) ((zjm) it.next()).a).b();
        }
        return i;
    }

    @Override // defpackage.no
    public final int c(int i) {
        zjm H = H(i);
        int G = G(H);
        return ((no) H.a).c(i - G);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        zjm zjmVar = (zjm) this.c.get(i);
        return new ajbx(zjmVar, ((no) zjmVar.a).e(viewGroup, i));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        ajbx ajbxVar = (ajbx) ooVar;
        aksa m = this.e.m("CompositeRecyclerViewAdapter onBindViewHolder");
        try {
            int G = i - G(H(i));
            ((no) ((zjm) ajbxVar.t).a).g((oo) ajbxVar.s, G);
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.no
    public final /* synthetic */ void gH(oo ooVar) {
        ajbx ajbxVar = (ajbx) ooVar;
        ((no) ((zjm) ajbxVar.t).a).gH((oo) ajbxVar.s);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        zjm H = H(i);
        int G = G(H);
        return ((no) H.a).gI(i - G);
    }

    @Override // defpackage.no
    public final void gJ(RecyclerView recyclerView) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((no) ((zjm) it.next()).a).gJ(recyclerView);
        }
    }

    @Override // defpackage.no
    public final void gK(RecyclerView recyclerView) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((no) ((zjm) it.next()).a).gK(recyclerView);
        }
    }

    @Override // defpackage.no
    public final /* synthetic */ void j(oo ooVar) {
        ajbx ajbxVar = (ajbx) ooVar;
        ((no) ((zjm) ajbxVar.t).a).j((oo) ajbxVar.s);
    }

    @Override // defpackage.no
    public final /* synthetic */ void k(oo ooVar) {
        ajbx ajbxVar = (ajbx) ooVar;
        ((no) ((zjm) ajbxVar.t).a).k((oo) ajbxVar.s);
    }

    @Override // defpackage.no
    public final /* synthetic */ boolean l(oo ooVar) {
        ajbx ajbxVar = (ajbx) ooVar;
        return ((no) ((zjm) ajbxVar.t).a).l((oo) ajbxVar.s);
    }

    public final int m(no noVar) {
        Iterator it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = ((zjm) it.next()).a;
            if (obj == noVar) {
                return i;
            }
            i += ((no) obj).b();
        }
        throw new IllegalStateException("Partition not in adapter ".concat(toString()));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void z(oo ooVar, int i, List list) {
        ajbx ajbxVar = (ajbx) ooVar;
        aksa m = this.e.m("CompositeRecyclerViewAdapter onBindViewHolder");
        try {
            int G = i - G(H(i));
            ((no) ((zjm) ajbxVar.t).a).z((oo) ajbxVar.s, G, list);
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
