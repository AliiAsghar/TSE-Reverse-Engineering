package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwz extends kxd implements akkh, apxq, akkf, aklk, akrw {
    private kxb ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public kwz() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return kxb.class;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            kxb E = E();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.group_upgrade_bottom_sheet, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.group_upgrade_popup_description);
            findViewById.getClass();
            TextView textView = (TextView) findViewById;
            Context y = E.b.y();
            String string = y.getString(R.string.group_upgrade_about_rcs_link);
            string.getClass();
            String string2 = y.getString(R.string.group_upgrade_popup_description, string);
            string2.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            int ai = arsd.ai(string2, string);
            spannableStringBuilder.setSpan(new kxa(E), ai, string.length() + ai, 17);
            textView.setText(spannableStringBuilder);
            ahnz.s(textView);
            ahnz.t(textView);
            ((ImageButton) inflate.findViewById(R.id.group_upgrade_close_btn)).setOnClickListener(new klx(E, 18));
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

    @Override // defpackage.kxd, defpackage.aiuh, defpackage.cg
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

    @Override // defpackage.akkh
    /* renamed from: aM, reason: merged with bridge method [inline-methods] */
    public final kxb E() {
        kxb kxbVar = this.ah;
        if (kxbVar != null) {
            if (!this.al) {
                return kxbVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.kxd
    protected final /* bridge */ /* synthetic */ aklw aN() {
        return new akls(this, true);
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

    @Override // defpackage.kxd, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        this.ak.k();
        try {
            if (!this.al) {
                super.f(context);
                if (this.ah == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        if (cgVar instanceof kwz) {
                            this.ah = new kxb((kwz) cgVar, ((kql) aS).ej.ag);
                            this.Z.c(new akli(this.ak, this.aj));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, kxb.class));
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

    @Override // defpackage.ajel, defpackage.fr, defpackage.bw
    public final Dialog gM(Bundle bundle) {
        super.gM(bundle);
        return new ajek(E().b.y(), R.style.GroupUpgradeBottomSheetTheme);
    }

    @Override // defpackage.kxd, defpackage.bw, defpackage.cg
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

    @Override // defpackage.kxd, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
