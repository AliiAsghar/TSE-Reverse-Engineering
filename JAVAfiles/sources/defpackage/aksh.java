package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aksh implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ aksr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MenuItem.OnMenuItemClickListener c;

    public /* synthetic */ aksh(aksr aksrVar, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = aksrVar;
        this.b = str;
        this.c = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        aksr aksrVar = this.a;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.c;
        akrc b = aksrVar.b(this.b);
        try {
            boolean onMenuItemClick = onMenuItemClickListener.onMenuItemClick(menuItem);
            b.close();
            return onMenuItemClick;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
