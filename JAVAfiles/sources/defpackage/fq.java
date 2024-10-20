package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fq extends rf implements ey {
    private fa a;
    private final ecz c;

    public fq(Context context, int i) {
        super(context, a(context, i));
        this.c = new ecz() { // from class: fp
            @Override // defpackage.ecz
            public final boolean i(KeyEvent keyEvent) {
                return fq.this.e(keyEvent);
            }
        };
        fa d = d();
        ((fo) d).I = a(context, i);
        d.p();
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    private final void b() {
        dyx.d(getWindow().getDecorView(), this);
        gvf.bm(getWindow().getDecorView(), this);
        a.bT(getWindow().getDecorView(), this);
    }

    @Override // defpackage.rf, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().d(view, layoutParams);
    }

    public final fa d() {
        if (this.a == null) {
            int i = fa.b;
            this.a = new fo(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return eda.a(this.c, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f() {
        d().q(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return d().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rf, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().e();
        super.onCreate(bundle);
        d().p();
    }

    @Override // defpackage.rf, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        d().h();
    }

    @Override // defpackage.rf, android.app.Dialog
    public void setContentView(int i) {
        b();
        d().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().m(getContext().getString(i));
    }

    @Override // defpackage.rf, android.app.Dialog
    public void setContentView(View view) {
        b();
        d().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    @Override // defpackage.rf, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().l(view, layoutParams);
    }

    @Override // defpackage.ey
    public final void gP() {
    }

    @Override // defpackage.ey
    public final void l(hm hmVar) {
    }
}
