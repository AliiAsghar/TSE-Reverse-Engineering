package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hp implements hl {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final vl d = new vl();

    public hp(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.hl
    public final void a(hm hmVar) {
        throw null;
    }

    @Override // defpackage.hl
    public final boolean b(hm hmVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.hl
    public final boolean c(hm hmVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.hl
    public final void d(hm hmVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(hm hmVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            hq hqVar = (hq) this.c.get(i);
            if (hqVar != null && hqVar.b == hmVar) {
                return hqVar;
            }
        }
        hq hqVar2 = new hq(this.b, hmVar);
        this.c.add(hqVar2);
        return hqVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 == null) {
            iy iyVar = new iy(this.b, menu);
            this.d.put(menu, iyVar);
            return iyVar;
        }
        return menu2;
    }
}
