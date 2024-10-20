package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jc extends ij implements SubMenu {
    public final ij k;
    public final im l;

    public jc(Context context, ij ijVar, im imVar) {
        super(context);
        this.k = ijVar;
        this.l = imVar;
    }

    @Override // defpackage.ij
    public final ij a() {
        return this.k.a();
    }

    @Override // defpackage.ij
    public final String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return a.bV(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.ij
    public final void p(ih ihVar) {
        this.k.p(ihVar);
    }

    @Override // defpackage.ij, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.ij, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.ij
    public final boolean t(im imVar) {
        return this.k.t(imVar);
    }

    @Override // defpackage.ij
    public final boolean u(ij ijVar, MenuItem menuItem) {
        if (!super.u(ijVar, menuItem) && !this.k.u(ijVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ij
    public final boolean v(im imVar) {
        return this.k.v(imVar);
    }

    @Override // defpackage.ij
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.ij
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.ij
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }
}
