package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class od {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public oc g;
    public final /* synthetic */ RecyclerView h;

    public od(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.h.M.a()) {
            RecyclerView recyclerView = this.h;
            if (!recyclerView.M.g) {
                return i;
            }
            return recyclerView.V.a(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.h.M.a() + this.h.o());
    }

    public final oc b() {
        if (this.g == null) {
            this.g = new oc();
            f();
        }
        return this.g;
    }

    public final View c(int i) {
        return q(i, Long.MAX_VALUE).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(oo ooVar, boolean z) {
        ecl eclVar;
        RecyclerView.y(ooVar);
        RecyclerView recyclerView = this.h;
        View view = ooVar.a;
        oq oqVar = recyclerView.Q;
        if (oqVar != null) {
            ecl j = oqVar.j();
            if (j instanceof op) {
                eclVar = (ecl) ((op) j).b.remove(view);
            } else {
                eclVar = null;
            }
            eek.n(view, eclVar);
        }
        if (z) {
            int size = this.h.n.size();
            for (int i = 0; i < size; i++) {
                ((oe) this.h.n.get(i)).a();
            }
            no noVar = this.h.l;
            if (noVar != null) {
                noVar.k(ooVar);
            }
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2.M != null) {
                recyclerView2.W.z(ooVar);
            }
        }
        ooVar.r = null;
        ooVar.q = null;
        b().e(ooVar);
    }

    public final void e() {
        this.a.clear();
        j();
    }

    public final void f() {
        RecyclerView recyclerView;
        no noVar;
        oc ocVar = this.g;
        if (ocVar != null && (noVar = (recyclerView = this.h).l) != null && recyclerView.p) {
            ocVar.c.add(noVar);
        }
    }

    public final void g(no noVar) {
        h(noVar, false);
    }

    public final void h(no noVar, boolean z) {
        oc ocVar = this.g;
        if (ocVar != null) {
            ocVar.c.remove(noVar);
            if (ocVar.c.size() == 0 && !z) {
                for (int i = 0; i < ocVar.a.size(); i++) {
                    SparseArray sparseArray = ocVar.a;
                    ArrayList arrayList = ((ob) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ego.b(((oo) arrayList.get(i2)).a);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(View view) {
        oo k = RecyclerView.k(view);
        k.m = null;
        k.n = false;
        k.i();
        m(k);
    }

    public final void j() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                k(size);
            }
        }
        this.c.clear();
        if (RecyclerView.b) {
            this.h.L.b();
        }
    }

    public final void k(int i) {
        int i2 = RecyclerView.aa;
        d((oo) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void l(View view) {
        oo k = RecyclerView.k(view);
        if (k.x()) {
            this.h.removeDetachedView(view, false);
        }
        if (k.w()) {
            k.p();
        } else if (k.B()) {
            k.i();
        }
        m(k);
        if (this.h.C != null && !k.u()) {
            this.h.C.g(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r6.h.L.d(r7.c) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r3 < 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r6.h.L.d(((defpackage.oo) r6.c.get(r3)).c) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.oo r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od.m(oo):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(View view) {
        nt ntVar;
        oo k = RecyclerView.k(view);
        if (!k.q(12) && k.y() && (ntVar = this.h.C) != null && !ntVar.o(k, k.gf())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            k.o(this, true);
            this.b.add(k);
            return;
        }
        if (k.t() && !k.v()) {
            RecyclerView recyclerView = this.h;
            if (!recyclerView.l.a) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.o()));
            }
        }
        k.o(this, false);
        this.a.add(k);
    }

    public final void o(oo ooVar) {
        if (ooVar.n) {
            this.b.remove(ooVar);
        } else {
            this.a.remove(ooVar);
        }
        ooVar.m = null;
        ooVar.n = false;
        ooVar.i();
    }

    public final void p() {
        int i;
        nw nwVar = this.h.m;
        if (nwVar != null) {
            i = nwVar.B;
        } else {
            i = 0;
        }
        this.f = this.e + i;
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0 && this.c.size() > this.f) {
                k(size);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03ff, code lost:
    
        if ((r4 + r9) >= r20) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:
    
        if (r18.h.M.g == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:
    
        if (r8.e != r9.gI(r8.c)) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oo q(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od.q(int, long):oo");
    }
}
