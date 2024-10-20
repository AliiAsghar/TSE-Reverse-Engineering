package defpackage;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzy implements PopupMenu.OnMenuItemClickListener {
    final /* synthetic */ arvo a;
    final /* synthetic */ afzx[] b;

    public afzy(arvo arvoVar, afzx[] afzxVarArr) {
        this.a = arvoVar;
        this.b = afzxVarArr;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        afzx afzxVar;
        int i = 0;
        while (true) {
            if (i < 2) {
                afzxVar = this.b[i];
                if (afzxVar.a == menuItem.getItemId()) {
                    break;
                }
                i++;
            } else {
                afzxVar = null;
                break;
            }
        }
        if (afzxVar != null) {
            this.a.w(afzxVar.b);
            return true;
        }
        Objects.toString(menuItem);
        throw new IllegalStateException("Unhandled menu item ".concat(String.valueOf(menuItem)));
    }
}
