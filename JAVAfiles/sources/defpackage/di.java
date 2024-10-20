package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class di {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public dc d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, Bundle bundle) {
        if (bundle != null) {
            return (Bundle) this.c.put(str, bundle);
        }
        return (Bundle) this.c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cg b(String str) {
        dg dgVar = (dg) this.b.get(str);
        if (dgVar != null) {
            return dgVar.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cg c(String str) {
        for (dg dgVar : this.b.values()) {
            if (dgVar != null) {
                cg cgVar = dgVar.a;
                if (!str.equals(cgVar.l)) {
                    cgVar = cgVar.D.b.c(str);
                }
                if (cgVar != null) {
                    return cgVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dg d(String str) {
        return (dg) this.b.get(str);
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (dg dgVar : this.b.values()) {
            if (dgVar != null) {
                arrayList.add(dgVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (dg dgVar : this.b.values()) {
            if (dgVar != null) {
                arrayList.add(dgVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List g() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(cg cgVar) {
        if (!this.a.contains(cgVar)) {
            synchronized (this.a) {
                this.a.add(cgVar);
            }
            cgVar.r = true;
            return;
        }
        Objects.toString(cgVar);
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(cgVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(dg dgVar) {
        cg cgVar = dgVar.a;
        if (!m(cgVar.l)) {
            this.b.put(cgVar.l, dgVar);
            if (cgVar.L) {
                if (cgVar.K) {
                    this.d.a(cgVar);
                } else {
                    this.d.e(cgVar);
                }
                cgVar.L = false;
            }
            if (da.Y(2)) {
                Objects.toString(cgVar);
                Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(cgVar)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(dg dgVar) {
        cg cgVar = dgVar.a;
        if (cgVar.K) {
            this.d.e(cgVar);
        }
        if (this.b.get(cgVar.l) == dgVar && ((dg) this.b.put(cgVar.l, null)) != null && da.Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(cgVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(cg cgVar) {
        synchronized (this.a) {
            this.a.remove(cgVar);
        }
        cgVar.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(String str) {
        if (this.b.get(str) != null) {
            return true;
        }
        return false;
    }
}
