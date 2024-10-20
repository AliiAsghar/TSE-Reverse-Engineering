package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaik extends aaie implements akkh, apxq, akkf, aklk, akrw {
    private aain ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public aaik() {
        aiut.c();
    }

    public static aaik aP() {
        aaik aaikVar = new aaik();
        apxh.e(aaikVar);
        return aaikVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aain.class;
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

    @Override // defpackage.aaie, defpackage.aiub, defpackage.cg
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

    @Override // defpackage.aaie
    protected final /* synthetic */ apxh aN() {
        return new aklt(this);
    }

    @Override // defpackage.akkh
    /* renamed from: aQ, reason: merged with bridge method [inline-methods] */
    public final aain E() {
        aain aainVar = this.ah;
        if (aainVar != null) {
            if (!this.al) {
                return aainVar;
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
            E().g.f();
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

    @Override // defpackage.aaie, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        this.ak.k();
        try {
            if (!this.al) {
                super.f(context);
                if (this.ah == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof aaik) {
                            apya apyaVar = ((kqm) aS).aB;
                            apya apyaVar2 = ((kqm) aS).aD;
                            apya apyaVar3 = ((kqm) aS).aE;
                            krv krvVar = ((kqm) aS).a;
                            aain aainVar = new aain((aaik) cgVar, apyaVar, apyaVar2, apyaVar3, krvVar.a.cQ, krvVar.f8if, krvVar.at);
                            this.ah = aainVar;
                            aainVar.p = this;
                            this.Z.c(new akli(this.ak, this.aj));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aain.class));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    @Override // defpackage.aiub, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        this.ak.k();
        try {
            super.g(bundle);
            aain E = E();
            ((kor) E.e.b()).g(mgw.b, E.n.incrementAndGet());
            cj fe = E.a.fe();
            if (fe instanceof aaim) {
                E.k = (aaim) fe;
            } else if (fe instanceof akkh) {
                Object E2 = ((akkh) fe).E();
                if (E2 instanceof aaim) {
                    E.k = (aaim) E2;
                }
            }
            rrb rrbVar = E.g;
            gqg gqgVar = (gqg) E.c.b();
            uye uyeVar = uye.HOME;
            ?? r2 = gqgVar.c;
            ?? r3 = gqgVar.b;
            uac uacVar = (uac) gqgVar.a.b();
            uacVar.getClass();
            ?? r5 = gqgVar.d;
            ?? r6 = gqgVar.e;
            fe.getClass();
            uyeVar.getClass();
            rrbVar.c(new rrt(r2, r3, uacVar, r5, r6, fe, E, uyeVar, Optional.of(true), Optional.of(false)));
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

    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        amwf b;
        super.gM(bundle);
        aain E = E();
        cj fe = E.a.fe();
        View inflate = fe.getLayoutInflater().inflate(R.layout.share_intent_conversation_list_view, (ViewGroup) null);
        E.j = (ListEmptyView) inflate.findViewById(R.id.no_conversations_view);
        E.j.c(R.drawable.ic_oobe_conv_list);
        aail aailVar = new aail();
        rrt rrtVar = (rrt) E.g.a();
        aaik aaikVar = E.a;
        rrb rrbVar = E.g;
        epj a = epj.a(aaikVar);
        rrt.a.l("init loader");
        rrtVar.f = new Bundle();
        rrtVar.f.putString("bindingId", rrbVar.b());
        rrtVar.e = a;
        int i = 1;
        rrtVar.e.d(1, rrtVar.f, rrtVar);
        zhi zhiVar = (zhi) E.d.b();
        ?? r1 = zhiVar.b;
        ?? r2 = zhiVar.a;
        ahmn ahmnVar = (ahmn) zhiVar.c.b();
        ahmnVar.getClass();
        fe.getClass();
        E.o = new zpu(r1, r2, ahmnVar, fe, E);
        E.o.A(true);
        E.i = (RecyclerView) inflate.findViewById(android.R.id.list);
        E.i.aj(aailVar);
        E.i.aF();
        E.i.ag(E.o);
        E.i.getViewTreeObserver().addOnGlobalLayoutListener(new afvv((aksr) E.f.b(), new ja(E, 10), 2));
        ajgi ajgiVar = new ajgi(fe);
        ajgiVar.z(inflate);
        ajgiVar.x(E.k.a());
        Bundle bundle2 = E.a.m;
        if ((bundle2 == null || !bundle2.getBoolean("hide_conv_button_key")) && (!((ohi) E.h.b()).a() || !fe.getIntent().getBooleanExtra("via_home_activity", false))) {
            ajgiVar.t(R.string.share_new_message, new aajo(E, i));
        }
        if (bundle2 != null && (b = amwf.b(bundle2.getInt("intent_source", 0))) != null) {
            E.m = b;
        }
        ajgiVar.o(R.string.share_cancel, null);
        int dimensionPixelSize = fe.getResources().getDimensionPixelSize(R.dimen.share_dialog_vertical_padding);
        ajgiVar.b.top = dimensionPixelSize;
        ajgiVar.b.bottom = dimensionPixelSize;
        ev create = ajgiVar.create();
        create.setOnShowListener(new uab(E, 5));
        return create;
    }

    @Override // defpackage.aaie, defpackage.bw, defpackage.cg
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
        cj fe;
        aksa i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            aain E = E();
            if (!E.l && (fe = E.a.fe()) != null && !fe.isChangingConfigurations()) {
                fe.finish();
            }
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

    @Override // defpackage.aaie, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
