package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ju implements ih {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ju(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ih
    public final void G(ij ijVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (!((Toolbar) this.a).a.j()) {
                    ((Toolbar) this.a).y.A(ijVar);
                }
                ih ihVar = ((Toolbar) this.a).w;
                if (ihVar != null) {
                    ihVar.G(ijVar);
                    return;
                }
                return;
            }
            if (((fv) this.a).c.q()) {
                ((fv) this.a).a.onPanelClosed(108, ijVar);
                return;
            } else {
                if (((fv) this.a).a.onPreparePanel(0, null, ijVar)) {
                    ((fv) this.a).a.onMenuOpened(108, ijVar);
                    return;
                }
                return;
            }
        }
        ih ihVar2 = ((ActionMenuView) this.a).d;
        if (ihVar2 != null) {
            ihVar2.G(ijVar);
        }
    }

    @Override // defpackage.ih
    public final boolean K(ij ijVar, MenuItem menuItem) {
        qdq qdqVar;
        if (this.b != 0 || (qdqVar = ((ActionMenuView) this.a).e) == null) {
            return false;
        }
        if (((Toolbar) qdqVar.a).y.B(menuItem)) {
            return true;
        }
        pz pzVar = ((Toolbar) qdqVar.a).s;
        if (pzVar == null || !pzVar.a(menuItem)) {
            return false;
        }
        return true;
    }
}
