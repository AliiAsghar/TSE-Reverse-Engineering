package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rf extends Dialog implements enm, ro, gjz {
    private eno a;
    public final rm b;
    private final ico c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(Context context, int i) {
        super(context, i);
        context.getClass();
        this.c = gvf.bH(this);
        this.b = new rm(new ou(this, 11, null));
    }

    private final eno a() {
        eno enoVar = this.a;
        if (enoVar == null) {
            eno enoVar2 = new eno(this);
            this.a = enoVar2;
            return enoVar2;
        }
        return enoVar;
    }

    public static final void h(rf rfVar) {
        super.onBackPressed();
    }

    @Override // defpackage.enm
    public final enh N() {
        return a();
    }

    @Override // defpackage.gjz
    public final iba aK() {
        return (iba) this.c.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        g();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ro
    public final rm c() {
        return this.b;
    }

    public final void g() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        dyx.d(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        a.bT(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        gvf.bm(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            rm rmVar = this.b;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            rmVar.e(onBackInvokedDispatcher);
        }
        this.c.w(bundle);
        a().e(enf.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.c.x(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().e(enf.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        a().e(enf.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        g();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        g();
        super.setContentView(view);
    }

    public /* synthetic */ rf(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        g();
        super.setContentView(view, layoutParams);
    }
}
