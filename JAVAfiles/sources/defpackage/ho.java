package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ho extends hm implements ih {
    public final ij a;
    private final Context b;
    private final ActionBarContextView c;
    private final hl f;
    private WeakReference g;
    private boolean h;

    public ho(Context context, ActionBarContextView actionBarContextView, hl hlVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = hlVar;
        ij ijVar = new ij(actionBarContextView.getContext());
        ijVar.D();
        this.a = ijVar;
        ijVar.b = this;
    }

    @Override // defpackage.ih
    public final void G(ij ijVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.ih
    public final boolean K(ij ijVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.hm
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.hm
    public final MenuInflater b() {
        return new ht(this.c.getContext());
    }

    @Override // defpackage.hm
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.hm
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.hm
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.hm
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.hm
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.hm
    public final void h(View view) {
        WeakReference weakReference;
        this.c.j(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.g = weakReference;
    }

    @Override // defpackage.hm
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.hm
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.hm
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.hm
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.hm
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.hm
    public final boolean n() {
        return this.c.j;
    }
}
