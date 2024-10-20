package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvl extends xvk implements akkh, apxq, akkf, aklk, akrw {
    private xvn ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public xvl() {
        aiut.c();
    }

    public static xvl aP(apnf apnfVar) {
        xvl xvlVar = new xvl();
        apxh.e(xvlVar);
        aklt.a(xvlVar, apnfVar);
        return xvlVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return xvn.class;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            xvn E = E();
            View inflate = layoutInflater.inflate(R.layout.message_failure_options_bottom_modal_fragment, viewGroup, false);
            if (!apne.SENT_OPTIONS.equals(E.d)) {
                if (!apne.SENDING_OPTIONS.equals(E.d)) {
                    if (apne.ERROR_OPTIONS.equals(E.d)) {
                        E.c(inflate);
                    } else if (apne.ERROR_NO_RETRY_NO_FALLBACK_OPTIONS.equals(E.d)) {
                        E.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
                    } else if (apne.SEND_TIMEOUT_OPTIONS.equals(E.d)) {
                        E.c(inflate);
                    } else if (apne.ERROR_RECIPIENT_LOST_ENCRYPTION_OPTIONS.equals(E.d)) {
                        E.g(inflate);
                        E.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
                    } else if (apne.XMS_STUCK_IN_SENDING_OPTIONS.equals(E.d)) {
                        E.i(inflate, inflate.getResources().getString(R.string.resend_now_xms_message));
                        E.b(inflate, inflate.getResources().getString(R.string.stop_sending_and_delete));
                    } else if (apne.XMS_FAILED_TO_SEND_OPTIONS.equals(E.d)) {
                        E.i(inflate, inflate.getResources().getString(R.string.resend_xms_message));
                        E.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
                    } else if (((trz) E.l.b()).i() && apne.ERROR_GROUP_FTD_OPTIONS.equals(E.d)) {
                        E.h(inflate);
                    } else {
                        xyo e = xvn.a.e();
                        e.H("Bottom sheet has unexpected option");
                        e.z("option", E.d);
                        e.q();
                        E.d(inflate, inflate.getResources().getString(R.string.fail_to_send_fallback_description));
                    }
                } else {
                    if (E.m()) {
                        uac uacVar = E.p;
                        String string = inflate.getResources().getString(R.string.still_sending_v2);
                        if (E.e && ttd.f()) {
                            string = ((Context) uacVar.a).getString(R.string.still_sending_e2ee_v2);
                        }
                        xvn.f(inflate, string);
                    } else {
                        E.e(inflate);
                    }
                    E.d(inflate, inflate.getResources().getString(R.string.fail_to_send_fallback_description));
                    E.b(inflate, inflate.getResources().getString(R.string.stop_sending_and_delete));
                }
            } else {
                if (!E.l()) {
                    E.j(inflate);
                } else if (tvu.e(E.g)) {
                    xvn.f(inflate, inflate.getResources().getString(R.string.group_recipient_offline_description));
                } else if (!E.f) {
                    xvn.f(inflate, inflate.getResources().getString(R.string.recipient_offline_description_v2, E.c));
                }
                E.d(inflate, inflate.getResources().getString(R.string.fail_to_send_fallback_description));
                if (E.k() && E.f) {
                    E.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
                }
            }
            Dialog dialog = E.h.d;
            if (dialog != null) {
                dialog.setOnShowListener(new uab(inflate, 2));
            }
            E.o = inflate;
            akqj.p();
            return inflate;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.aj;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void W(Bundle bundle) {
        this.ak.k();
        try {
            super.W(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.ak.f();
        try {
            super.X(i, i2, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xvk, defpackage.aiuh, defpackage.cg
    public final void Y(Activity activity) {
        this.ak.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        aksa j = this.ak.j();
        try {
            boolean aC = super.aC(menuItem);
            j.close();
            return aC;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.cg
    public final void aH(int i, int i2) {
        this.ak.h(i, i2);
        akqj.p();
    }

    @Override // defpackage.xvk
    protected final /* synthetic */ apxh aN() {
        return new aklt(this);
    }

    @Override // defpackage.akkh
    /* renamed from: aQ, reason: merged with bridge method [inline-methods] */
    public final xvn E() {
        xvn xvnVar = this.ah;
        if (xvnVar != null) {
            if (!this.al) {
                return xvnVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.ai == null) {
            this.ai = new aklm(this, super.x());
        }
        return this.ai;
    }

    @Override // defpackage.akrw
    public final aktr aW() {
        return this.ak.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.ak.e(aktrVar, z);
    }

    @Override // defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.ak.b = aktrVar;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void aa() {
        aksa b = this.ak.b();
        try {
            super.aa();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void ad() {
        this.ak.k();
        try {
            super.ad();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void af() {
        aksa b = this.ak.b();
        try {
            super.af();
            try {
                BottomSheetBehavior.N((View) E().o.getParent()).V(3);
            } catch (IllegalArgumentException e) {
                xyo a = xvn.a.a();
                a.H("Failed to set behavior");
                a.r(e);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.ak.k();
        try {
            super.ag(view, bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.ajel, defpackage.bw
    public final void d() {
        aksa k = akqj.k();
        try {
            super.d();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xvk, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        this.ak.k();
        try {
            if (!this.al) {
                super.f(context);
                if (this.ah == null) {
                    try {
                        Object aS = aS();
                        Bundle a = ((kqm) aS).a();
                        aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                        d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        apnf apnfVar = (apnf) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", apnf.a, aozsVar);
                        apnfVar.getClass();
                        Context context2 = (Context) ((kqm) aS).bh.c.b();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof xvl) {
                            xvl xvlVar = (xvl) cgVar;
                            wpp wppVar = (wpp) ((kqm) aS).a.Ci.b();
                            rja rjaVar = (rja) ((kqm) aS).a.Ch.b();
                            aksr aksrVar = (aksr) ((kqm) aS).a.at.b();
                            mbl mblVar = (mbl) ((kqm) aS).a.bB.b();
                            uac uacVar = (uac) ((kqm) aS).a.ed.b();
                            xyt xytVar = (xyt) ((kqm) aS).a.dS.b();
                            krv krvVar = ((kqm) aS).a;
                            this.ah = new xvn(apnfVar, context2, xvlVar, wppVar, rjaVar, aksrVar, mblVar, uacVar, xytVar, krvVar.dt, krvVar.dm, krvVar.a.gr, krvVar.ee, (nzq) krvVar.xC.b(), ((kqm) aS).a.ml);
                            this.Z.c(new akli(this.ak, this.aj));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, xvn.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = this.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = this.ak;
                    if (akqfVar.a == null) {
                        akqfVar.e(((akrw) eozVar).aW(), true);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } finally {
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        this.ak.k();
        try {
            super.g(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xvk, defpackage.bw, defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.ak.k();
        try {
            LayoutInflater gl = super.gl(bundle);
            LayoutInflater cloneInContext = gl.cloneInContext(new aklm(this, gl));
            akqj.p();
            return cloneInContext;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void h() {
        aksa b = this.ak.b();
        try {
            super.h();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void i() {
        aksa a = this.ak.a();
        try {
            super.i();
            this.al = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void j(Bundle bundle) {
        this.ak.k();
        try {
            super.j(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void k() {
        this.ak.k();
        try {
            super.k();
            aktp.O(this);
            if (this.c) {
                aktp.N(this);
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void l() {
        this.ak.k();
        try {
            super.l();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ak.g().close();
    }

    @Override // defpackage.bw, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        aksa i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            xvn E = E();
            E.j.e("Bugle.Message.Tap.Action.Cancel.Counts", E.a());
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xvk, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
