package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hs {
    eco A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    final /* synthetic */ ht F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public hs(ht htVar, Menu menu) {
        this.F = htVar;
        this.a = menu;
        c();
    }

    public static final char e(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    public final SubMenu a() {
        this.h = true;
        SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        d(addSubMenu.getItem());
        return addSubMenu;
    }

    public final Object b(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(MenuItem menuItem) {
        boolean z;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z2 = false;
        if (this.r > 0) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.z != null) {
            if (!this.F.e.isRestricted()) {
                ht htVar = this.F;
                if (htVar.f == null) {
                    htVar.f = htVar.a(htVar.e);
                }
                menuItem.setOnMenuItemClickListener(new hr(htVar.f, this.z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof im) {
                ((im) menuItem).j(true);
            } else if (menuItem instanceof ir) {
                ir irVar = (ir) menuItem;
                try {
                    if (irVar.e == null) {
                        irVar.e = irVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    irVar.e.invoke(irVar.d, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) b(str, ht.a, this.F.c));
            z2 = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (!z2) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        eco ecoVar = this.A;
        if (ecoVar != null) {
            if (menuItem instanceof ebe) {
                ((ebe) menuItem).c(ecoVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        dyf.d(menuItem, this.B);
        CharSequence charSequence = this.C;
        boolean z3 = menuItem instanceof ebe;
        if (!z3) {
            menuItem.setTooltipText(charSequence);
        } else {
            ((ebe) menuItem).d(charSequence);
        }
        char c = this.n;
        int i3 = this.o;
        if (!z3) {
            menuItem.setAlphabeticShortcut(c, i3);
        } else {
            ((ebe) menuItem).setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (!z3) {
            menuItem.setNumericShortcut(c2, i4);
        } else {
            ((ebe) menuItem).setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (!z3) {
                menuItem.setIconTintMode(mode);
            } else {
                ((ebe) menuItem).setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            dyf.e(menuItem, colorStateList);
        }
    }
}
