package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iq implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ir a;
    private final MenuItem.OnMenuItemClickListener b;

    public iq(ir irVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = irVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
