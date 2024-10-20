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
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwp extends uwv implements akkh, apxq, akkf, aklk, akrw {
    private uwq ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public uwp() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return uwq.class;
    }

    @Override // defpackage.aiub, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            View K = super.K(layoutInflater, viewGroup, bundle);
            akqj.p();
            return K;
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

    @Override // defpackage.aiub, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.cg
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

    @Override // defpackage.uwv, defpackage.aiub, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.cg
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

    @Override // defpackage.akkh
    /* renamed from: aM, reason: merged with bridge method [inline-methods] */
    public final uwq E() {
        uwq uwqVar = this.ah;
        if (uwqVar != null) {
            if (!this.al) {
                return uwqVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.uwv
    protected final /* synthetic */ apxh aN() {
        return new aklt(this);
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

    @Override // defpackage.aiub, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.cg
    public final void af() {
        aksa b = this.ak.b();
        try {
            super.af();
            uwq E = E();
            if (!E.f) {
                E.f = true;
                E.a("Bugle.UI.GaiaAuthFailureDialog.Seen");
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

    @Override // defpackage.aiub, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.bw
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

    @Override // defpackage.uwv, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        this.ak.k();
        try {
            if (!this.al) {
                super.f(context);
                if (this.ah == null) {
                    try {
                        Object aS = aS();
                        apya apyaVar = ((kqm) aS).U;
                        krv krvVar = ((kqm) aS).a;
                        this.ah = new uwq(apyaVar, krvVar.vo, krvVar.bB, krvVar.at);
                        this.Z.c(new akli(this.ak, this.aj));
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
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        this.ak.k();
        try {
            super.g(bundle);
            uwq E = E();
            Bundle bundle2 = ((uwp) E.b.b()).m;
            boolean z = false;
            if (bundle2 != null) {
                Intent intent = (Intent) bundle2.getParcelable("error_intent");
                if (intent != null) {
                    E.d = intent;
                    int i = bundle2.getInt("entry_point_key", 1);
                    arsn arsnVar = E.e;
                    artm artmVar = uwq.a[0];
                    Integer valueOf = Integer.valueOf(i);
                    artmVar.getClass();
                    ((arsl) arsnVar).a = valueOf;
                } else {
                    throw new IllegalStateException("Error intent should have been passed along");
                }
            }
            if (bundle != null) {
                z = bundle.getBoolean("dialog_seen");
            }
            E.f = z;
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

    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        super.gM(bundle);
        uwq E = E();
        ajgi ajgiVar = new ajgi(((uwp) E.b.b()).y());
        ajgiVar.m(R.string.gaia_auth_failure_dialog_body);
        ajgiVar.x(R.string.gaia_auth_failure_dialog_title);
        int i = 8;
        ajgiVar.t(R.string.prompt_button_action_sign_in, new aabt((aksr) E.c.b(), "GaiaAuthFailureDialogFragment Sign in button", new ivs(E, 5), i));
        ajgiVar.o(R.string.prompt_button_action_not_now, new aabt((aksr) E.c.b(), "GaiaAuthFailureDialogFragment Not now button", new ivs(E, 6), i));
        ev create = ajgiVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // defpackage.uwv, defpackage.bw, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
    public final void j(Bundle bundle) {
        this.ak.k();
        try {
            super.j(bundle);
            bundle.putBoolean("dialog_seen", E().f);
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

    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
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

    @Override // defpackage.aiub, defpackage.bw, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        aksa i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
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

    @Override // defpackage.uwv, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
