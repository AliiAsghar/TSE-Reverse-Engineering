package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes.dex */
class ia {
    final Context a;
    public vl b;
    public vl c;

    public ia(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof ebe) {
            ebe ebeVar = (ebe) menuItem;
            if (this.b == null) {
                this.b = new vl();
            }
            MenuItem menuItem2 = (MenuItem) this.b.get(ebeVar);
            if (menuItem2 == null) {
                ir irVar = new ir(this.a, ebeVar);
                this.b.put(ebeVar, irVar);
                return irVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu b(SubMenu subMenu) {
        if (subMenu instanceof ebf) {
            ebf ebfVar = (ebf) subMenu;
            if (this.c == null) {
                this.c = new vl();
            }
            SubMenu subMenu2 = (SubMenu) this.c.get(ebfVar);
            if (subMenu2 == null) {
                jd jdVar = new jd(this.a, ebfVar);
                this.c.put(ebfVar, jdVar);
                return jdVar;
            }
            return subMenu2;
        }
        return subMenu;
    }
}
