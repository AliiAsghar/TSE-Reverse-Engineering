package defpackage;

import android.app.Dialog;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iwq implements MenuItem.OnActionExpandListener {
    final /* synthetic */ ixd a;

    public iwq(ixd ixdVar) {
        this.a = ixdVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_search) {
            ixd ixdVar = this.a;
            ixdVar.aE.ifPresent(new ivn(18));
            MenuItem menuItem2 = this.a.s;
            if (menuItem2 != null) {
                menuItem2.setShowAsAction(1);
            }
            MenuItem menuItem3 = this.a.t;
            if (menuItem3 != null) {
                menuItem3.setShowAsAction(1);
            }
        }
        ixd ixdVar2 = this.a;
        ixdVar2.bP = null;
        ixdVar2.N();
        this.a.Y();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_search) {
            ixd ixdVar = this.a;
            int h = ixdVar.ao.h(ixdVar.q(), 12200000);
            if (h == 0) {
                menuItem.setVisible(false);
                MenuItem menuItem2 = this.a.s;
                if (menuItem2 != null) {
                    menuItem2.setShowAsAction(0);
                }
                MenuItem menuItem3 = this.a.t;
                if (menuItem3 != null) {
                    menuItem3.setShowAsAction(0);
                    return true;
                }
                return true;
            }
            Dialog a = ixdVar.ao.a(ixdVar.q(), h, 0, null);
            a.getClass();
            a.show();
            return false;
        }
        return true;
    }
}
