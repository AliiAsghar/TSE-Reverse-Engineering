package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghj implements ghg {
    public final ghh a;
    public final ggq b;
    public ghd c;
    public final qdq d;
    public final qdq e;
    private final List f;

    public ghj() {
        throw null;
    }

    @Override // defpackage.ghg
    public final void a() {
        h();
        this.c = null;
    }

    @Override // defpackage.ghg
    public final boolean b() {
        if (!i() && !j()) {
            return false;
        }
        return true;
    }

    public final void c() {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            e(it.next(), false);
        }
        this.a.b();
    }

    public final void d() {
        this.c = null;
        c();
    }

    public final void e(Object obj, boolean z) {
        boolean z2;
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((gvf) this.f.get(size)).a(obj, z);
            } else {
                return;
            }
        }
    }

    public final void f() {
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
            } else {
                return;
            }
        }
    }

    public final void g() {
        if (this.a.d()) {
            Log.d("DefaultSelectionTracker", "Ignoring onDataSetChange. No active selection.");
            return;
        }
        this.a.b();
        for (int size = this.f.size() - 1; size >= 0; size--) {
        }
        Iterator it = this.a.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.e.A(next) != -1) {
                for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                    ((gvf) this.f.get(size2)).a(next, true);
                }
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i = 0; i < size3; i++) {
                l(arrayList.get(i));
            }
        }
        f();
    }

    public final boolean h() {
        if (!i()) {
            return false;
        }
        c();
        if (i()) {
            this.c = null;
            ghh ghhVar = new ghh();
            if (i()) {
                ghh ghhVar2 = this.a;
                ghhVar.a.clear();
                ghhVar.a.addAll(ghhVar2.a);
                ghhVar.b.clear();
                ghhVar.b.addAll(ghhVar2.b);
                this.a.a.clear();
            }
            Iterator it = ghhVar.a.iterator();
            while (it.hasNext()) {
                e(it.next(), false);
            }
            Iterator it2 = ghhVar.b.iterator();
            while (it2.hasNext()) {
                e(it2.next(), false);
            }
            f();
        }
        Iterator it3 = this.f.iterator();
        while (it3.hasNext()) {
            ((gvf) it3.next()).b();
        }
        return true;
    }

    public final boolean i() {
        if (!this.a.d()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean k(Object obj) {
        return this.a.c(obj);
    }

    public final void l(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (this.a.c(obj)) {
            this.a.a.remove(obj);
            e(obj, false);
            f();
            if (this.a.d() && j()) {
                d();
            }
        }
    }

    public final void m(gvf gvfVar) {
        boolean z;
        if (gvfVar != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.f.add(gvfVar);
    }

    public ghj(qdq qdqVar) {
        this.a = new ghh();
        this.f = new ArrayList(1);
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        d.s(true);
        this.e = qdqVar;
        this.d = new qdq(this, null);
        this.b = new ggq(this);
    }
}
