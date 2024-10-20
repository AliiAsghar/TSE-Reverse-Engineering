package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class op extends ecl {
    final oq a;
    public final Map b = new WeakHashMap();

    public op(oq oqVar) {
        this.a = oqVar;
    }

    @Override // defpackage.ecl
    public final ega a(View view) {
        ecl eclVar = (ecl) this.b.get(view);
        if (eclVar != null) {
            return eclVar.a(view);
        }
        return super.a(view);
    }

    @Override // defpackage.ecl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ecl eclVar = (ecl) this.b.get(view);
        if (eclVar != null) {
            eclVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        nw nwVar;
        if (!this.a.k() && (nwVar = this.a.a.m) != null) {
            nwVar.aU(view, efxVar);
            ecl eclVar = (ecl) this.b.get(view);
            if (eclVar != null) {
                eclVar.c(view, efxVar);
                return;
            } else {
                super.c(view, efxVar);
                return;
            }
        }
        super.c(view, efxVar);
    }

    @Override // defpackage.ecl
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        ecl eclVar = (ecl) this.b.get(view);
        if (eclVar != null) {
            eclVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ecl
    public final void e(View view, int i) {
        ecl eclVar = (ecl) this.b.get(view);
        if (eclVar != null) {
            eclVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.ecl
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        ecl eclVar = (ecl) this.b.get(view);
        if (eclVar != null) {
            eclVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ecl
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        ecl eclVar = (ecl) this.b.get(view);
        if (eclVar != null) {
            return eclVar.g(view, accessibilityEvent);
        }
        return super.g(view, accessibilityEvent);
    }

    @Override // defpackage.ecl
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        ecl eclVar = (ecl) this.b.get(viewGroup);
        if (eclVar != null) {
            return eclVar.h(viewGroup, view, accessibilityEvent);
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (!this.a.k() && this.a.a.m != null) {
            ecl eclVar = (ecl) this.b.get(view);
            if (eclVar != null) {
                if (eclVar.i(view, i, bundle)) {
                    return true;
                }
            } else if (super.i(view, i, bundle)) {
                return true;
            }
            RecyclerView recyclerView = this.a.a.m.u;
            od odVar = recyclerView.e;
            ol olVar = recyclerView.M;
            return false;
        }
        return super.i(view, i, bundle);
    }
}
