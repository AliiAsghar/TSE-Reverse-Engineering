package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bw extends cg implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler ag;
    private boolean am;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    public Dialog d;
    private final Runnable ah = new bo(this, 3, null);
    private final DialogInterface.OnCancelListener ai = new bs(this);
    public final DialogInterface.OnDismissListener a = new bt(this);
    private int aj = 0;
    public int b = 0;
    private boolean ak = true;
    public boolean c = true;
    private int al = -1;
    private final enz an = new bu(this);
    public boolean e = false;

    private final void aM(boolean z, boolean z2, boolean z3) {
        if (this.ap) {
            return;
        }
        this.ap = true;
        this.aq = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.ag.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.ag.post(this.ah);
                }
            }
        }
        this.ao = true;
        if (this.al >= 0) {
            if (z3) {
                da H = H();
                int i = this.al;
                if (i >= 0) {
                    H.ad(null, i, 1);
                } else {
                    throw new IllegalArgumentException(a.bV(i, "Bad id: "));
                }
            } else {
                da H2 = H();
                int i2 = this.al;
                if (i2 >= 0) {
                    H2.I(new cy(H2, i2), z);
                } else {
                    throw new IllegalArgumentException(a.bV(i2, "Bad id: "));
                }
            }
            this.al = -1;
            return;
        }
        bd bdVar = new bd(H());
        bdVar.y();
        bdVar.n(this);
        if (z3) {
            bdVar.b();
        } else if (z) {
            bdVar.j();
        } else {
            bdVar.i();
        }
    }

    public void d() {
        aM(false, false, false);
    }

    public final void dismissAllowingStateLoss() {
        aM(true, false, false);
    }

    public final void e() {
        aM(false, false, true);
    }

    @Override // defpackage.cg
    public void f(Context context) {
        super.f(context);
        this.ab.e(this.an);
        if (!this.aq) {
            this.ap = false;
        }
    }

    @Override // defpackage.cg
    public void g(Bundle bundle) {
        boolean z;
        super.g(bundle);
        this.ag = new Handler();
        if (this.G == 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (bundle != null) {
            this.aj = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ak = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.al = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog gM(Bundle bundle) {
        if (da.Y(3)) {
            toString();
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new rf(y(), this.b);
    }

    public final Dialog getDialog() {
        return this.d;
    }

    public final boolean getShowsDialog() {
        return this.c;
    }

    @Override // defpackage.cg
    public LayoutInflater gl(Bundle bundle) {
        LayoutInflater aD = aD();
        if (this.c && !this.am) {
            if (!this.e) {
                try {
                    this.am = true;
                    Dialog gM = gM(bundle);
                    this.d = gM;
                    if (this.c) {
                        o(gM, this.aj);
                        Context x = x();
                        if (x instanceof Activity) {
                            this.d.setOwnerActivity((Activity) x);
                        }
                        this.d.setCancelable(this.ak);
                        this.d.setOnCancelListener(this.ai);
                        this.d.setOnDismissListener(this.a);
                        this.e = true;
                    } else {
                        this.d = null;
                    }
                } finally {
                    this.am = false;
                }
            }
            if (da.Y(2)) {
                Log.d("FragmentManager", a.cc(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            Dialog dialog = this.d;
            if (dialog != null) {
                return aD.cloneInContext(dialog.getContext());
            }
        } else if (da.Y(2)) {
            toString();
            String concat = "getting layout inflater for DialogFragment ".concat(toString());
            if (!this.c) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(concat));
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: ".concat(concat));
            }
        }
        return aD;
    }

    @Override // defpackage.cg
    public final cl gm() {
        return new bv(this, new bz(this));
    }

    @Override // defpackage.cg
    public void h() {
        super.h();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ao = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.ap) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.cg
    public void i() {
        super.i();
        if (!this.aq && !this.ap) {
            this.ap = true;
        }
        this.ab.i(this.an);
    }

    @Override // defpackage.cg
    public void j(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.aj;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ak) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.al;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.cg
    public void k() {
        super.k();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ao = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            dyx.d(decorView, this);
            dyy.o(decorView, this);
            gvf.bm(decorView, this);
        }
    }

    @Override // defpackage.cg
    public void l() {
        super.l();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.cg
    public final void m(Bundle bundle) {
        Bundle bundle2;
        super.m(bundle);
        if (this.d != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.d.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.cg
    public final void n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.n(layoutInflater, viewGroup, bundle);
        if (this.Q == null && this.d != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.d.onRestoreInstanceState(bundle2);
        }
    }

    public void o(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ao) {
            if (da.Y(3)) {
                toString();
                Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
            }
            aM(true, true, false);
        }
    }

    public final void p(da daVar, String str) {
        this.ap = false;
        this.aq = true;
        bd bdVar = new bd(daVar);
        bdVar.y();
        bdVar.s(this, str);
        bdVar.i();
    }

    public final void q(da daVar, String str) {
        this.ap = false;
        this.aq = true;
        bd bdVar = new bd(daVar);
        bdVar.y();
        bdVar.s(this, str);
        bdVar.b();
    }

    public final void r() {
        this.ak = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
