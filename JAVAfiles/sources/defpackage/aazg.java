package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazg extends aazl implements akkh, apxq, akkf, aklk, akrw {
    private aazh ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public aazg() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aazh.class;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View.OnClickListener aaxcVar;
        View.OnClickListener aaxcVar2;
        this.ak.k();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            aazh E = E();
            E.g.a(R.id.terms_and_conditions_data, ((whs) E.i.b()).a(E.b), new isj(E, 12));
            if (true != ((pcl) E.h.b()).a()) {
                i = R.layout.carriertos_popup_fragment;
            } else {
                i = R.layout.carriertos_popup_fragment_v2;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            ((LottieAnimationView) inflate.findViewById(R.id.carrier_tos_popup_animation)).e(E.c.x().getString(R.string.rcs_tos_animation_json));
            Button button = (Button) inflate.findViewById(R.id.conversation_list_carrier_tos_popup_positive_button);
            if (((pcl) E.h.b()).a()) {
                aaxcVar = new akwb(E.j, "Explicit Carrier Tos Accept", new aaxc(E, 15), 1);
            } else {
                aaxcVar = new aaxc(E, 16);
            }
            button.setOnClickListener(aaxcVar);
            TextView textView = (TextView) inflate.findViewById(R.id.conversation_list_carrier_tos_popup_negative_button);
            if (((pcl) E.h.b()).a()) {
                aaxcVar2 = new akwb(E.j, "Explicit Carrier Tos Decline", new aaxc(E, 17), 1);
            } else {
                aaxcVar2 = new aaxc(E, 18);
            }
            textView.setOnClickListener(aaxcVar2);
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

    @Override // defpackage.aazl, defpackage.aiuh, defpackage.cg
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
    public final aazh E() {
        aazh aazhVar = this.ah;
        if (aazhVar != null) {
            if (!this.al) {
                return aazhVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.aazl
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

    @Override // defpackage.aiuh, defpackage.cg
    public final void aa() {
        aksa b = this.ak.b();
        try {
            super.aa();
            aazh E = E();
            aazk aazkVar = E.l;
            if (aazkVar != null) {
                aazkVar.a = null;
                E.l = null;
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
            E();
            ((LottieAnimationView) view.findViewById(R.id.carrier_tos_popup_animation)).c();
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

    @Override // defpackage.aazl, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        this.ak.k();
        try {
            if (!this.al) {
                super.f(context);
                if (this.ah == null) {
                    try {
                        Object aS = aS();
                        String c = ((kqm) aS).c();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof aazg) {
                            aazg aazgVar = (aazg) cgVar;
                            krv krvVar = ((kqm) aS).a;
                            apya apyaVar = krvVar.gD;
                            apya apyaVar2 = krvVar.dt;
                            apya apyaVar3 = krvVar.gJ;
                            apya apyaVar4 = krvVar.gL;
                            apya apyaVar5 = krvVar.sR;
                            akbo akboVar = (akbo) ((kqm) aS).o.b();
                            akgu akguVar = (akgu) ((kqm) aS).T.b();
                            krv krvVar2 = ((kqm) aS).a;
                            this.ah = new aazh(c, aazgVar, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, akboVar, akguVar, krvVar2.hs, krvVar2.ht, (aksr) krvVar2.at.b(), ((kqm) aS).ag);
                            this.Z.c(new akli(this.ak, this.aj));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aazh.class));
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
            aazh E = E();
            E.f.b(E.k);
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
        aazh E = E();
        ajek ajekVar = new ajek(E.c.x());
        ajekVar.setOnShowListener(new aazi(0));
        ajekVar.b.b(ajekVar, new aazj(E, ajekVar));
        return ajekVar;
    }

    @Override // defpackage.aazl, defpackage.bw, defpackage.cg
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

    @Override // defpackage.aiuh, defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aazh E = E();
        if (E.l != null) {
            if (configuration.orientation == 2) {
                E.l.e();
            } else {
                E.l.j();
            }
        }
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

    @Override // defpackage.aazl, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
