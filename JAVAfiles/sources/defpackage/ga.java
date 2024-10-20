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
public final class ga extends hm implements ih {
    public final ij a;
    public hl b;
    final /* synthetic */ gb c;
    private final Context f;
    private WeakReference g;

    public ga(gb gbVar, Context context, hl hlVar) {
        this.c = gbVar;
        this.f = context;
        this.b = hlVar;
        ij ijVar = new ij(context);
        ijVar.D();
        this.a = ijVar;
        ijVar.b = this;
    }

    @Override // defpackage.ih
    public final void G(ij ijVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.n();
    }

    @Override // defpackage.ih
    public final boolean K(ij ijVar, MenuItem menuItem) {
        hl hlVar = this.b;
        if (hlVar != null) {
            return hlVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.hm
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.hm
    public final MenuInflater b() {
        return new ht(this.f);
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
        return this.c.d.h;
    }

    @Override // defpackage.hm
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.hm
    public final void f() {
        gb gbVar = this.c;
        if (gbVar.f != this) {
            return;
        }
        if (!gb.d(gbVar.k, gbVar.l, false)) {
            gbVar.g = this;
            gbVar.h = this.b;
        } else {
            this.b.a(this);
        }
        this.b = null;
        this.c.a(false);
        ActionBarContextView actionBarContextView = this.c.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        gb gbVar2 = this.c;
        gbVar2.b.l(gbVar2.n);
        this.c.f = null;
    }

    @Override // defpackage.hm
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.hm
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.hm
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.hm
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.hm
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.hm
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.hm
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.hm
    public final boolean n() {
        return this.c.d.j;
    }
}
