package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class im implements ebe {
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public Intent e;
    public char f;
    public char h;
    public final ij j;
    public jc k;
    public CharSequence l;
    public CharSequence m;
    public int n;
    public eco o;
    private final int q;
    private CharSequence r;
    private Drawable s;
    private MenuItem.OnMenuItemClickListener u;
    public int g = 4096;
    public int i = 4096;
    private int t = 0;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 16;
    public boolean p = false;

    public im(ij ijVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.j = ijVar;
        this.a = i2;
        this.b = i;
        this.q = i3;
        this.c = i4;
        this.d = charSequence;
        this.n = i5;
    }

    public static void g(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private final Drawable v(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = drawable.mutate();
            if (this.x) {
                drawable.setTintList(this.v);
            }
            if (this.y) {
                drawable.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    @Override // defpackage.ebe
    public final eco a() {
        return this.o;
    }

    @Override // defpackage.ebe
    public final void b(CharSequence charSequence) {
        this.l = charSequence;
        this.j.l(false);
    }

    @Override // defpackage.ebe
    public final void c(eco ecoVar) {
        eco ecoVar2 = this.o;
        if (ecoVar2 != null) {
            ecoVar2.reset();
        }
        this.B = null;
        this.o = ecoVar;
        this.j.l(true);
        eco ecoVar3 = this.o;
        if (ecoVar3 != null) {
            ecoVar3.setVisibilityListener(new il(this));
        }
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.n & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.j.t(this);
    }

    @Override // defpackage.ebe
    public final void d(CharSequence charSequence) {
        this.m = charSequence;
        this.j.l(false);
    }

    public final char e() {
        if (this.j.x()) {
            return this.h;
        }
        return this.f;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final boolean expandActionView() {
        if (m()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.j.v(this);
        }
        return false;
    }

    public final CharSequence f(iw iwVar) {
        if (iwVar.e()) {
            return getTitleCondensed();
        }
        return this.d;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final View getActionView() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        eco ecoVar = this.o;
        if (ecoVar != null) {
            View onCreateActionView = ecoVar.onCreateActionView(this);
            this.B = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.h;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return v(drawable);
        }
        int i = this.t;
        if (i != 0) {
            Drawable f = d.f(this.j.a, i);
            this.t = 0;
            this.s = f;
            return v(f);
        }
        return null;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.e;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.k;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r;
        if (charSequence != null) {
            return charSequence;
        }
        return this.d;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.m;
    }

    public final void h(boolean z) {
        this.p = z;
        this.j.l(false);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    final void i(boolean z) {
        int i;
        int i2 = this.A;
        int i3 = i2 & (-3);
        if (true != z) {
            i = 0;
        } else {
            i = 2;
        }
        int i4 = i | i3;
        this.A = i4;
        if (i2 != i4) {
            this.j.l(false);
        }
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.A & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.A & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.A & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        eco ecoVar = this.o;
        if (ecoVar != null && ecoVar.overridesItemVisibility()) {
            if ((this.A & 8) == 0 && this.o.isVisible()) {
                return true;
            }
            return false;
        }
        if ((this.A & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void j(boolean z) {
        int i;
        int i2 = this.A & (-5);
        if (true != z) {
            i = 0;
        } else {
            i = 4;
        }
        this.A = i | i2;
    }

    public final void k(boolean z) {
        int i;
        if (z) {
            i = this.A | 32;
        } else {
            i = this.A & (-33);
        }
        this.A = i;
    }

    public final void l(jc jcVar) {
        this.k = jcVar;
        jcVar.setHeaderTitle(this.d);
    }

    public final boolean m() {
        eco ecoVar;
        if ((this.n & 8) != 0) {
            if (this.B == null && (ecoVar = this.o) != null) {
                this.B = ecoVar.onCreateActionView(this);
            }
            if (this.B != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        ij ijVar = this.j;
        if (ijVar.u(ijVar, this)) {
            return true;
        }
        Intent intent = this.e;
        if (intent != null) {
            try {
                this.j.a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        eco ecoVar = this.o;
        if (ecoVar != null && ecoVar.onPerformDefaultAction()) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if ((this.A & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.A & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.n & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if ((this.n & 2) == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(boolean z) {
        int i;
        int i2 = this.A;
        int i3 = i2 & (-9);
        if (true != z) {
            i = 8;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.A = i4;
        if (i2 == i4) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.j.a;
        u(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = Character.toLowerCase(c);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.A;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A = i2;
        if (i != i2) {
            this.j.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        if ((this.A & 4) != 0) {
            ij ijVar = this.j;
            int i = this.b;
            int size = ijVar.c.size();
            ijVar.s();
            for (int i2 = 0; i2 < size; i2++) {
                im imVar = (im) ijVar.c.get(i2);
                if (imVar.b == i && imVar.p() && imVar.isCheckable()) {
                    if (imVar == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    imVar.i(z2);
                }
            }
            ijVar.r();
        } else {
            i(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i;
        if (z) {
            i = this.A | 16;
        } else {
            i = this.A & (-17);
        }
        this.A = i;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.s = null;
        this.t = i;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.e = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f == c) {
            return this;
        }
        this.f = c;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f = c;
        this.h = Character.toLowerCase(c2);
        this.j.l(false);
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.n = i;
        this.j.B();
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.j.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r = charSequence;
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        d(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (s(z)) {
            this.j.C();
        }
        return this;
    }

    public final boolean t() {
        if (this.j.y() && e() != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void u(View view) {
        int i;
        this.B = view;
        this.o = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.j.B();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.j.l(false);
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f == c && this.g == i) {
            return this;
        }
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(i);
        this.j.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        this.j.l(false);
        jc jcVar = this.k;
        if (jcVar != null) {
            jcVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        u(view);
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = Character.toLowerCase(c);
        this.i = KeyEvent.normalizeMetaState(i);
        this.j.l(false);
        return this;
    }

    @Override // defpackage.ebe, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f = c;
        this.g = KeyEvent.normalizeMetaState(i);
        this.h = Character.toLowerCase(c2);
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j.l(false);
        return this;
    }
}
