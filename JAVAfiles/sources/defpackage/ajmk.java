package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmk {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public View e;
    public TabLayout g;
    public ajmm h;
    public int d = -1;
    public final int f = 1;
    public int i = -1;

    public final CharSequence a() {
        ajmm ajmmVar = this.h;
        if (ajmmVar == null) {
            return null;
        }
        return ajmmVar.getContentDescription();
    }

    public final void b() {
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            tabLayout.l(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void c() {
        ajmm ajmmVar = this.h;
        if (ajmmVar != null) {
            ajmmVar.b();
        }
    }

    public final void d(CharSequence charSequence) {
        this.c = charSequence;
        c();
    }

    public final void e(Drawable drawable) {
        this.a = drawable;
        TabLayout tabLayout = this.g;
        if (tabLayout.u == 1 || tabLayout.x == 2) {
            tabLayout.u(true);
        }
        c();
    }

    public final void f(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.b = charSequence;
        c();
    }
}
