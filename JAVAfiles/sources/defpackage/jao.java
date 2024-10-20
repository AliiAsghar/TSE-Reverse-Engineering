package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jao extends jai implements akkh, apxq, akkf, aklk, akrw, akwc {
    private boolean ag;
    private jar d;
    private Context e;
    public final eno a = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public jao() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return jar.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            jar E = E();
            if (wsm.a()) {
                E.k = (SimPickerView) layoutInflater.inflate(R.layout.sim_picker_view_with_scheduled_send, viewGroup, false);
            } else {
                E.k = (SimPickerView) layoutInflater.inflate(R.layout.sim_picker_view, viewGroup, false);
            }
            E.k.setOnClickListener(new akwb(E.e, "Close SimPicker click", new klx(E, 1), 1));
            if (((okf) E.m.b()).a()) {
                E.r.C(((uac) E.i.b()).e(((DefaultConversation) ((mlu) E.n.b()).a(new BugleConversationId(E.b), miv.MINIMAL)).f, "SimPicker::localSelfIdentities", E.c.a), new jaq(E));
            } else {
                E.r.C(((iks) E.p.a(iks.class)).f().a(), new jap(E));
            }
            SimPickerView simPickerView = E.k;
            if (simPickerView == null) {
                hlc.U(this, E());
            }
            akqj.p();
            return simPickerView;
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
        return this.a;
    }

    @Override // defpackage.jai, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
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

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.e == null) {
            this.e = new aklm(this, super.x());
        }
        return this.e;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            hlc.U(this, E());
            bf(view, bundle);
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

    @Override // defpackage.jai
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.jai, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.d == null) {
                    try {
                        Object aS = aS();
                        String c = ((kqm) aS).c();
                        eoy eoyVar = (eoy) ((kqm) aS).x.b();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof jao) {
                            jao jaoVar = (jao) cgVar;
                            ryg rygVar = (ryg) ((kqm) aS).a.dm.b();
                            uie uieVar = (uie) ((kqm) aS).a.kE.b();
                            krv krvVar = ((kqm) aS).a;
                            this.d = new jar(c, eoyVar, jaoVar, rygVar, uieVar, krvVar.dA, krvVar.nu, ((kqm) aS).y, (aohs) ((kqm) aS).r.b(), (aksr) ((kqm) aS).a.at.b());
                            this.Z.c(new akli(this.c, this.a));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, jar.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new apxm.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
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

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.akkh
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final jar E() {
        jar jarVar = this.d;
        if (jarVar != null) {
            if (!this.ag) {
                return jarVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.jai, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
