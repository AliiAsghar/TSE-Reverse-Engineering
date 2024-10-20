package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kx implements DialogInterface.OnClickListener, lc {
    ev a;
    final /* synthetic */ ld b;
    private ListAdapter c;
    private CharSequence d;

    public kx(ld ldVar) {
        this.b = ldVar;
    }

    @Override // defpackage.lc
    public final int a() {
        return 0;
    }

    @Override // defpackage.lc
    public final int b() {
        return 0;
    }

    @Override // defpackage.lc
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.lc
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.lc
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.lc
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.lc
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.lc
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.lc
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.lc
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.lc
    public final void k() {
        ev evVar = this.a;
        if (evVar != null) {
            evVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.lc
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        eu euVar = new eu(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            euVar.setTitle(charSequence);
        }
        euVar.e(this.c, this.b.getSelectedItemPosition(), this);
        ev create = euVar.create();
        this.a = create;
        ListView b = create.b();
        b.setTextDirection(i);
        b.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.lc
    public final boolean u() {
        ev evVar = this.a;
        if (evVar != null) {
            return evVar.isShowing();
        }
        return false;
    }
}
