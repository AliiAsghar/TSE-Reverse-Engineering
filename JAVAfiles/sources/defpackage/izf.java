package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.material.tabs.TabLayout;
import defpackage.apxm;
import defpackage.iyn;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izf extends iyy implements akkh, apxq, akkf, aklk, akrw, akwc {
    private boolean ag;
    private izh d;
    private Context e;
    public final eno a = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public izf() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return izh.class;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        tay g;
        akfk akfkVar;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            izh E = E();
            if (true != ((ansy) ((nog) E.m).a.b()).e("bugle.fix_cropped_rbm_hero_image")) {
                i = R.layout.legacy_info_and_options_fragment;
            } else {
                i = R.layout.info_and_options_fragment;
            }
            int i2 = 0;
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            iyl iylVar = (iyl) E.e.G().e("conversation_settings_base_fragment");
            if (iylVar == null) {
                iym iymVar = E.k.c;
                if (iymVar == null) {
                    iymVar = iym.a;
                }
                iyl iylVar2 = new iyl();
                apxh.e(iylVar2);
                aklt.a(iylVar2, iymVar);
                bd bdVar = new bd(E.e.G());
                bdVar.r(0, iylVar2, "conversation_settings_base_fragment");
                bdVar.b();
                iylVar = iylVar2;
            }
            if (inflate == null) {
                inflate = null;
            } else {
                E.o = (ContactIconView) inflate.findViewById(R.id.business_icon);
                E.p = (TextView) inflate.findViewById(R.id.business_name);
                E.q = (TextView) inflate.findViewById(R.id.business_description);
                E.r = (TabLayout) inflate.findViewById(R.id.info_and_options_tabs);
                E.s = (ImageView) inflate.findViewById(R.id.business_hero);
                aohs aohsVar = E.t;
                iyn E2 = iylVar.E();
                eno enoVar = E.e.a;
                final tby tbyVar = (tby) E2.o.b();
                final ConversationIdType conversationIdType = E2.x;
                snf e = sni.e();
                e.w("getOptionsListDataSource");
                e.h(new ivi(conversationIdType, 9));
                final sne b = e.b();
                b.F(enoVar, new izq(tbyVar));
                if (((Boolean) tbyVar.g.b()).booleanValue()) {
                    g = ush.i(conversationIdType);
                } else {
                    g = ush.g(conversationIdType);
                }
                final tay tayVar = g;
                tayVar.F(enoVar, new izr(tbyVar));
                int i3 = 2;
                if (((okf) tbyVar.c.b()).a()) {
                    final sml b2 = ush.e(conversationIdType).b();
                    b2.F(enoVar, new izs(tbyVar));
                    akfkVar = new akfk((ansy) tbyVar.r, new ancu() { // from class: izn
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
                        @Override // defpackage.ancu
                        public final andc a(ahmn ahmnVar) {
                            akul c;
                            tby tbyVar2 = tby.this;
                            rur rurVar = (rur) tbyVar2.f.b();
                            ConversationIdType conversationIdType2 = conversationIdType;
                            conversationIdType2.getClass();
                            c = qjh.c(rurVar.f, arpj.a, arwf.a, new rdx(rurVar, conversationIdType2, (arpe) null, 9, (char[]) null));
                            return new andc(tbyVar2.a(conversationIdType2, b, c.i(new ikd(tbyVar2, b2, 7), tbyVar2.l)));
                        }
                    }, "OPTIONS_LIST_KEY", 2);
                } else {
                    final skz b3 = ush.d(conversationIdType).b();
                    b3.F(enoVar, new izt(tbyVar));
                    akfkVar = new akfk((ansy) tbyVar.r, new ancu() { // from class: izo
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.Executor, java.lang.Object] */
                        @Override // defpackage.ancu
                        public final andc a(ahmn ahmnVar) {
                            skz skzVar = b3;
                            akul s = tayVar.s();
                            akul s2 = skzVar.s();
                            ahmn ap = aktp.ap(s2, s);
                            tby tbyVar2 = tby.this;
                            return new andc(tbyVar2.a(conversationIdType, b, ap.h(new hbd(tbyVar2, s, s2, 3), tbyVar2.d)));
                        }
                    }, "OPTIONS_LIST_KEY", 2);
                }
                aohsVar.C(akfkVar, new iyn.b(new ixj(E, i3), new ixj(iylVar.E(), 3)));
                aohs aohsVar2 = E.t;
                ize izeVar = (ize) E.h.b();
                String str = E.k.d;
                aohsVar2.C(new akfk(izeVar.f, new izd(izeVar, str, i2), "INFO_AND_OPTIONS_".concat(String.valueOf(str)), 2), E.n);
            }
            if (inflate == null) {
                hlc.W(this, E());
            }
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
        return this.a;
    }

    @Override // defpackage.iyy, defpackage.aiuc, defpackage.cg
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
            hlc.W(this, E());
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

    @Override // defpackage.iyy
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.iyy, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.d == null) {
                    try {
                        Object aS = aS();
                        krv krvVar = ((kqm) aS).a;
                        apya apyaVar = krvVar.xy;
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof izf) {
                            izf izfVar = (izf) cgVar;
                            qya qyaVar = (qya) krvVar.jc.b();
                            ksm ksmVar = (ksm) ((kqm) aS).a.a.fP.b();
                            znj A = ((kqm) aS).A();
                            znj z = ((kqm) aS).z();
                            znj y = ((kqm) aS).y();
                            lzv lzvVar = (lzv) ((kqm) aS).a.yJ.b();
                            aohs aohsVar = (aohs) ((kqm) aS).r.b();
                            apya apyaVar2 = ((kqm) aS).s;
                            krv krvVar2 = ((kqm) aS).a;
                            apya apyaVar3 = krvVar2.a.f9do;
                            apya apyaVar4 = krvVar2.fm;
                            msk mskVar = (msk) krvVar2.dd.b();
                            try {
                                nog nogVar = new nog(((kqm) aS).a.a.a.bN);
                                Bundle a = ((kqm) aS).a();
                                aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                                d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                                izg izgVar = (izg) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", izg.a, aozsVar);
                                izgVar.getClass();
                                this.d = new izh(apyaVar, izfVar, qyaVar, ksmVar, A, z, y, lzvVar, aohsVar, apyaVar2, apyaVar3, apyaVar4, mskVar, nogVar, izgVar);
                                this.Z.c(new akli(this.c, this.a));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    akqj.p();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, izh.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
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
    public final izh E() {
        izh izhVar = this.d;
        if (izhVar != null) {
            if (!this.ag) {
                return izhVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.iyy, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
