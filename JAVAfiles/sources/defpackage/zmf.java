package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import defpackage.apxm;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmf extends zjb implements akkh, apxq, akkf, aklk, akrw {
    private zmh aj;
    private Context ak;
    private final eno al = new eno(this);
    private final akqf an = new akqf(this);
    private boolean ao;

    @Deprecated
    public zmf() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zmh.class;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
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
        return this.al;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void W(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.aiua, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.an.f();
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

    @Override // defpackage.zjb, defpackage.aiua, defpackage.cg
    public final void Y(Activity activity) {
        this.an.k();
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

    @Override // defpackage.aiua, defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        aksa j = this.an.j();
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
        this.an.h(i, i2);
        akqj.p();
    }

    @Override // defpackage.gfl
    public final void aN(Bundle bundle) {
        zmh E = E();
        if (yig.b()) {
            zmj zmjVar = E.a;
            zmjVar.getClass();
            zmjVar.f();
            return;
        }
        E.b.b.f("bugle");
        E.b.fR(R.xml.smarts_preferences);
        E.b.d().ag();
        Optional b = E.b(R.string.suggested_stickers_enabled_pref_key);
        int i = 7;
        if (!((Boolean) yig.p.e()).booleanValue()) {
            PreferenceScreen d = E.b.d();
            d.getClass();
            b.ifPresent(new zmg(d, i));
        }
        int i2 = 5;
        if (!((Boolean) yig.C.e()).booleanValue()) {
            Optional b2 = E.b(R.string.smart_compose_enabled_pref_key);
            PreferenceScreen d2 = E.b.d();
            d2.getClass();
            b2.ifPresent(new zmg(d2, i));
        } else {
            zmf zmfVar = E.b;
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) zmfVar.a(zmfVar.S(R.string.smart_compose_enabled_pref_key));
            switchPreferenceCompat.getClass();
            E.h = switchPreferenceCompat;
            E.h.G(false);
            E.h.N(false);
            E.h.n = new akvd(E.g, "SmartsSettingsFragmentPeer:toggleSmartComposeEnabled", new zkp(E, i2));
        }
        Optional b3 = E.b(R.string.mc_enabled_pref_key);
        PreferenceScreen d3 = E.b.d();
        d3.getClass();
        b3.ifPresent(new zmg(d3, i));
        Optional b4 = E.b(R.string.experiment_badge_pref_key);
        PreferenceScreen d4 = E.b.d();
        d4.getClass();
        b4.ifPresent(new zmg(d4, i));
        Optional b5 = E.b(R.string.smart_action_example_key);
        Optional b6 = E.b(R.string.smart_reply_suggestion_example_key);
        Optional b7 = E.b(R.string.smart_action_settings_parent_pref);
        Optional b8 = E.b(R.string.spotlights_settings_parent_pref);
        Optional b9 = E.b(R.string.smart_actions_enabled_pref_key);
        int i3 = 3;
        int i4 = 9;
        int i5 = 8;
        if (((Boolean) ((utz) zfl.a.get()).e()).booleanValue()) {
            PreferenceScreen d5 = E.b.d();
            d5.getClass();
            b9.ifPresent(new zmg(d5, i));
            PreferenceScreen d6 = E.b.d();
            d6.getClass();
            b5.ifPresent(new zmg(d6, i4));
            b7.ifPresent(new zmg(E, i3));
        } else {
            PreferenceScreen d7 = E.b.d();
            d7.getClass();
            b7.ifPresent(new zmg(d7, i5));
        }
        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
            b8.ifPresent(new zmg(E, 4));
        } else {
            PreferenceScreen d8 = E.b.d();
            d8.getClass();
            b8.ifPresent(new zmg(d8, i5));
        }
        Resources z = E.b.z();
        int i6 = 1;
        if (((Boolean) ((utz) zfl.b.get()).e()).booleanValue()) {
            PreferenceScreen d9 = E.b.d();
            d9.getClass();
            b5.ifPresent(new zmg(d9, i4));
            PreferenceScreen d10 = E.b.d();
            d10.getClass();
            b6.ifPresent(new zmg(d10, i4));
        } else {
            alob alobVar = new alob();
            if (E.f.a()) {
                aozy createBuilder = aqcz.a.createBuilder();
                aqbi aqbiVar = aqbi.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aqcz aqczVar = (aqcz) createBuilder.b;
                aqbiVar.getClass();
                aqczVar.d = aqbiVar;
                aqczVar.c = 19;
                aozy createBuilder2 = aqcy.b.createBuilder();
                aqbc aqbcVar = aqbc.CALENDAR;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((aqcy) createBuilder2.b).k = aqbcVar.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aqcz aqczVar2 = (aqcz) createBuilder.b;
                aqcy aqcyVar = (aqcy) createBuilder2.s();
                aqcyVar.getClass();
                aqczVar2.e = aqcyVar;
                aqczVar2.b |= 1;
                alobVar.h(new SmartSuggestionItemSuggestionData((aqcz) createBuilder.s()));
            }
            if (E.f.e()) {
                aozy createBuilder3 = aqcz.a.createBuilder();
                aqcs aqcsVar = aqcs.a;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                aqcz aqczVar3 = (aqcz) createBuilder3.b;
                aqcsVar.getClass();
                aqczVar3.d = aqcsVar;
                aqczVar3.c = 17;
                aozy createBuilder4 = aqcy.b.createBuilder();
                aqbc aqbcVar2 = aqbc.RECENT_IMAGE;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((aqcy) createBuilder4.b).k = aqbcVar2.a();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                aqcz aqczVar4 = (aqcz) createBuilder3.b;
                aqcy aqcyVar2 = (aqcy) createBuilder4.s();
                aqcyVar2.getClass();
                aqczVar4.e = aqcyVar2;
                aqczVar4.b |= 1;
                alobVar.h(new SmartSuggestionItemSuggestionData((aqcz) createBuilder3.s()));
            }
            if (E.f.b()) {
                aozy createBuilder5 = aqcz.a.createBuilder();
                aqbo aqboVar = aqbo.a;
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                aqcz aqczVar5 = (aqcz) createBuilder5.b;
                aqboVar.getClass();
                aqczVar5.d = aqboVar;
                aqczVar5.c = 14;
                aozy createBuilder6 = aqcy.b.createBuilder();
                aqbc aqbcVar3 = aqbc.DUO_CALL;
                if (!createBuilder6.b.isMutable()) {
                    createBuilder6.u();
                }
                ((aqcy) createBuilder6.b).k = aqbcVar3.a();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                aqcz aqczVar6 = (aqcz) createBuilder5.b;
                aqcy aqcyVar3 = (aqcy) createBuilder6.s();
                aqcyVar3.getClass();
                aqczVar6.e = aqcyVar3;
                aqczVar6.b |= 1;
                alobVar.h(new SmartSuggestionItemSuggestionData((aqcz) createBuilder5.s()));
            }
            if (E.f.d()) {
                aozy createBuilder7 = aqcz.a.createBuilder();
                aqct aqctVar = aqct.a;
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                aqcz aqczVar7 = (aqcz) createBuilder7.b;
                aqctVar.getClass();
                aqczVar7.d = aqctVar;
                aqczVar7.c = 3;
                aozy createBuilder8 = aqcy.b.createBuilder();
                aqbc aqbcVar4 = aqbc.LOCATION;
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                ((aqcy) createBuilder8.b).k = aqbcVar4.a();
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                aqcz aqczVar8 = (aqcz) createBuilder7.b;
                aqcy aqcyVar4 = (aqcy) createBuilder8.s();
                aqcyVar4.getClass();
                aqczVar8.e = aqcyVar4;
                aqczVar8.b |= 1;
                alobVar.h(new SmartSuggestionItemSuggestionData((aqcz) createBuilder7.s()));
            }
            if (E.f.c()) {
                String string = z.getString(R.string.example_gif_search_action_text);
                aozy createBuilder9 = aqcz.a.createBuilder();
                aozy createBuilder10 = aqbt.a.createBuilder();
                if (!createBuilder10.b.isMutable()) {
                    createBuilder10.u();
                }
                aqbt aqbtVar = (aqbt) createBuilder10.b;
                string.getClass();
                aqbtVar.b = string;
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                aqcz aqczVar9 = (aqcz) createBuilder9.b;
                aqbt aqbtVar2 = (aqbt) createBuilder10.s();
                aqbtVar2.getClass();
                aqczVar9.d = aqbtVar2;
                aqczVar9.c = 5;
                aozy createBuilder11 = aqcy.b.createBuilder();
                aqbc aqbcVar5 = aqbc.GIF;
                if (!createBuilder11.b.isMutable()) {
                    createBuilder11.u();
                }
                ((aqcy) createBuilder11.b).k = aqbcVar5.a();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                aqcz aqczVar10 = (aqcz) createBuilder9.b;
                aqcy aqcyVar5 = (aqcy) createBuilder11.s();
                aqcyVar5.getClass();
                aqczVar10.e = aqcyVar5;
                aqczVar10.b |= 1;
                alobVar.h(new SmartSuggestionItemSuggestionData((aqcz) createBuilder9.s()));
            }
            b5.ifPresent(new zmg(alobVar, 10));
            alob alobVar2 = new alob();
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text1)));
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text2)));
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text3)));
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text4)));
            b6.ifPresent(new zmg(alobVar2, 11));
            PreferenceScreen d11 = E.b.d();
            d11.getClass();
            b8.ifPresent(new zmg(d11, 8));
        }
        E.i = E.b(R.string.nudge_settings_parent_pref);
        if (!yig.e()) {
            Optional optional = E.i;
            PreferenceScreen d12 = E.b.d();
            d12.getClass();
            optional.ifPresent(new zmg(d12, 8));
        } else {
            E.i.ifPresent(new zmg(E, 6));
        }
        if (((Boolean) ((utz) zfl.b.get()).e()).booleanValue()) {
            E.b(R.string.assistant_enabled_pref_key).ifPresent(new zmg(E, 12));
            E.b(R.string.p2p_conversation_suggestions_enabled_pref_key).ifPresent(new zjo(E, 19));
            b.ifPresent(new zjo(E, 20));
            E.i.ifPresent(new zmg(E, i6));
            if (((Boolean) ((utz) zfl.a.get()).e()).booleanValue()) {
                b7.ifPresent(new zmg(E, 0));
            } else {
                b9.ifPresent(new zmg(E, 2));
            }
        }
        Optional b10 = E.b(R.string.smarts_learn_more_pref_key);
        if (b10.isEmpty()) {
            return;
        }
        ((Preference) b10.get()).o = new lpi(E, 15);
        Preference preference = (Preference) b10.get();
        zmf zmfVar2 = E.b;
        String S = zmfVar2.S(R.string.smarts_learn_more);
        preference.M(aabr.af(E.b.fe(), Html.fromHtml(zmfVar2.T(R.string.smarts_preference_info_text, S)).toString(), S));
    }

    @Override // defpackage.zjb
    protected final /* synthetic */ apxh aQ() {
        return new aklt(this);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.ak == null) {
            this.ak = new aklm(this, super.x());
        }
        return this.ak;
    }

    @Override // defpackage.akkh
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final zmh E() {
        zmh zmhVar = this.aj;
        if (zmhVar != null) {
            if (!this.ao) {
                return zmhVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.akrw
    public final aktr aW() {
        return this.an.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.an.e(aktrVar, z);
    }

    @Override // defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.an.b = aktrVar;
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void aa() {
        aksa b = this.an.b();
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

    @Override // defpackage.aiua, defpackage.cg
    public final void ad() {
        this.an.k();
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

    @Override // defpackage.aiua, defpackage.cg
    public final void af() {
        aksa b = this.an.b();
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

    @Override // defpackage.lzh, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.lzh
    protected final boolean ba() {
        return true;
    }

    @Override // defpackage.zjb, defpackage.cg
    public final void f(Context context) {
        this.an.k();
        try {
            if (!this.ao) {
                super.f(context);
                if (this.aj == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof zmf) {
                            this.aj = new zmh((zmf) cgVar, (lzv) ((kqm) aS).a.yJ.b(), (aohs) ((kqm) aS).r.b(), (akbo) ((kqm) aS).o.b(), Optional.empty(), (yio) ((kqm) aS).a.oD.b(), (akvf) ((kqm) aS).R.b(), ((kqm) aS).al);
                            this.Z.c(new akli(this.an, this.al));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, zmh.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = this.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = this.an;
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

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void g(Bundle bundle) {
        this.an.k();
        try {
            super.g(bundle);
            zmh E = E();
            if (yig.b()) {
                zmj zmjVar = E.a;
                zmjVar.getClass();
                zmjVar.e();
            } else if (((Boolean) yig.C.e()).booleanValue()) {
                E.d.b(E.k);
                E.e.ifPresent(new zmg(E, 5));
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

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void h() {
        aksa b = this.an.b();
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

    @Override // defpackage.aiua, defpackage.cg
    public final void i() {
        aksa a = this.an.a();
        try {
            super.i();
            this.ao = true;
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

    @Override // defpackage.aiua, defpackage.cg
    public final void j(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void k() {
        this.an.k();
        try {
            super.k();
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

    @Override // defpackage.aiua, defpackage.gfl, defpackage.cg
    public final void l() {
        this.an.k();
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

    @Override // defpackage.zjb, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
