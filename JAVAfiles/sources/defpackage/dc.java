package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dc extends eor {
    public static final eov a = new epm(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public dc(boolean z) {
        this.e = z;
    }

    private final void g(String str, boolean z) {
        dc dcVar = (dc) this.c.get(str);
        if (dcVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(dcVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dcVar.c((String) arrayList.get(i), true);
                }
            }
            dcVar.gi();
            this.c.remove(str);
        }
        efu efuVar = (efu) this.d.get(str);
        if (efuVar != null) {
            efuVar.z();
            this.d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cg cgVar) {
        if (this.g) {
            if (da.Y(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.b.containsKey(cgVar.l)) {
            this.b.put(cgVar.l, cgVar);
            if (da.Y(2)) {
                Objects.toString(cgVar);
                Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(String.valueOf(cgVar)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(cg cgVar, boolean z) {
        if (da.Y(3)) {
            Objects.toString(cgVar);
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(cgVar)));
        }
        g(cgVar.l, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, boolean z) {
        if (da.Y(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(String.valueOf(str)));
        }
        g(str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(cg cgVar) {
        if (this.g) {
            if (da.Y(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.b.remove(cgVar.l) != null && da.Y(2)) {
            Objects.toString(cgVar);
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(cgVar)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dc dcVar = (dc) obj;
            if (this.b.equals(dcVar.b) && this.c.equals(dcVar.c) && this.d.equals(dcVar.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(cg cgVar) {
        if (this.b.containsKey(cgVar.l) && this.e) {
            return this.f;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eor
    public final void gi() {
        if (da.Y(3)) {
            toString();
            Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f = true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
