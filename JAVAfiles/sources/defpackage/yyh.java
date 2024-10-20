package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyh extends yye implements akkh, apxq, akkf, aklk, akrw {
    private yyj ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public yyh() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return yyj.class;
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

    @Override // defpackage.yye, defpackage.aiub, defpackage.cg
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

    @Override // defpackage.yye
    protected final /* synthetic */ apxh aN() {
        return new aklt(this);
    }

    @Override // defpackage.akkh
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final yyj E() {
        yyj yyjVar = this.ah;
        if (yyjVar != null) {
            if (!this.al) {
                return yyjVar;
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

    @Override // defpackage.yye, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        this.ak.k();
        try {
            if (!this.al) {
                super.f(context);
                if (this.ah == null) {
                    try {
                        Object aS = aS();
                        apya apyaVar = ((kqm) aS).bh.e;
                        krv krvVar = ((kqm) aS).a;
                        apya apyaVar2 = krvVar.at;
                        apya apyaVar3 = ((kqm) aS).d;
                        apya apyaVar4 = krvVar.jN;
                        apya apyaVar5 = krvVar.dw;
                        apya apyaVar6 = krvVar.yJ;
                        arwe arweVar = (arwe) krvVar.bQ.b();
                        apya apyaVar7 = ((kqm) aS).a.ci;
                        Bundle a = ((kqm) aS).a();
                        aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                        d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        yyk yykVar = (yyk) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", yyk.a, aozsVar);
                        yykVar.getClass();
                        this.ah = new yyj(apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, arweVar, apyaVar7, yykVar);
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
        yyj E = E();
        ajgi ajgiVar = new ajgi((Context) E.a.b());
        if (E.g.e) {
            Drawable drawable = ((Context) E.a.b()).getDrawable(R.drawable.gs_report_fill1_vd_theme_24);
            if (drawable != null) {
                drawable.setTint(ahnz.f((Context) E.a.b(), R.attr.colorErrorVariant, "ScreenDetectionListener"));
            }
            ajgiVar.y(((cj) E.a.b()).getString(R.string.safe_url_dialog_spam_folder_title));
            ajgiVar.n(((cj) E.a.b()).getString(R.string.safe_url_dialog_spam_folder_message));
            ajgiVar.k(drawable);
            ajgiVar.t(android.R.string.cancel, E.a());
            ajgiVar.k(drawable);
        } else {
            ajgiVar.x(R.string.safe_url_dialog_non_contact_title);
            ajgiVar.m(R.string.safe_url_dialog_non_contact_message);
            String str = "SafeUrlDialogFragmentPeer#openLinkClickListener";
            ajgiVar.t(R.string.safe_url_dialog_positive, new aabt((aksr) E.b.b(), str, new ivs(E, 8), 8));
            ajgiVar.o(android.R.string.cancel, E.a());
        }
        E.b(true);
        E.h = ajgiVar.create();
        ev evVar = E.h;
        evVar.getClass();
        return evVar;
    }

    @Override // defpackage.yye, defpackage.bw, defpackage.cg
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

    @Override // defpackage.yye, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
