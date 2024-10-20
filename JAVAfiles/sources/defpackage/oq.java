package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oq extends ecl {
    final RecyclerView a;
    public final op b;

    public oq(RecyclerView recyclerView) {
        this.a = recyclerView;
        ecl j = j();
        if (j != null && (j instanceof op)) {
            this.b = (op) j;
        } else {
            this.b = new op(this);
        }
    }

    @Override // defpackage.ecl
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        nw nwVar;
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !k() && (nwVar = ((RecyclerView) view).m) != null) {
            nwVar.Z(accessibilityEvent);
        }
    }

    @Override // defpackage.ecl
    public void c(View view, efx efxVar) {
        nw nwVar;
        super.c(view, efxVar);
        if (!k() && (nwVar = this.a.m) != null) {
            RecyclerView recyclerView = nwVar.u;
            nwVar.m(recyclerView.e, recyclerView.M, efxVar);
        }
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        nw nwVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (!k() && (nwVar = this.a.m) != null) {
            return nwVar.u(i, bundle);
        }
        return false;
    }

    public ecl j() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.a.ax();
    }
}
