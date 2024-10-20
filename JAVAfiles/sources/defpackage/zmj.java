package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmj {
    public final lzh a;
    public final lzv b;
    public final akbo c;
    public final Optional d;
    public final akvf e;
    public final Optional f;
    public final Optional g;
    public final armf h;
    public final Optional i;
    public SwitchPreferenceCompat j;
    public final akgh k = new akgh<aabr>() { // from class: zmj.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = zmj.this.j;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            if (zmj.this.j == null) {
            } else {
                throw null;
            }
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    };
    public final akbp l = new akbp<Boolean, Void>() { // from class: zmj.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            Boolean bool = (Boolean) obj;
            SwitchPreferenceCompat switchPreferenceCompat = zmj.this.j;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
                zmj.this.j.k(!bool.booleanValue());
            }
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            SwitchPreferenceCompat switchPreferenceCompat = zmj.this.j;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final aohs m;
    private final yio n;
    private final Optional o;
    private Optional p;

    public zmj(lzh lzhVar, lzv lzvVar, aohs aohsVar, akbo akboVar, Optional optional, yio yioVar, akvf akvfVar, Optional optional2, Optional optional3, Optional optional4, armf armfVar, Optional optional5) {
        this.a = lzhVar;
        this.b = lzvVar;
        this.m = aohsVar;
        this.c = akboVar;
        this.d = optional;
        this.n = yioVar;
        this.e = akvfVar;
        this.f = optional2;
        this.g = optional3;
        this.o = optional4;
        this.h = armfVar;
        this.i = optional5;
    }

    private final void g(int i, Preference preference) {
        String S = this.a.S(R.string.smarts_learn_more);
        preference.M(aabr.af(this.a.fe(), Html.fromHtml(this.a.T(i, S)).toString(), S));
    }

    public final Drawable a(int i) {
        Context x = this.a.x();
        x.getClass();
        Context x2 = this.a.x();
        x2.getClass();
        return yfo.h(x, i, ahnz.f(x2, R.attr.colorOnSurface, "SmartsSettingsFragmentPeer: failed to get color R.attr.colorOnSurfaceVariant"));
    }

    public final Optional b(int i) {
        lzh lzhVar = this.a;
        return Optional.ofNullable(lzhVar.a(lzhVar.S(i)));
    }

    public final void c(Preference preference, boolean z) {
        if (z) {
            preference.J(((jbx) this.f.get()).b());
        } else {
            preference.J(((jbx) this.f.get()).a());
        }
    }

    public final void d() {
        Optional b = b(R.string.smarts_learn_more_pref_key);
        if (b.isEmpty()) {
            return;
        }
        ((Preference) b.get()).o = new lpi(this, 16);
        if (yig.b() && !this.f.isEmpty() && !b(R.string.mc_enabled_pref_key).isEmpty()) {
            g(((jbx) this.f.get()).d(), (Preference) b.get());
        } else {
            g(R.string.smarts_preference_info_text, (Preference) b.get());
        }
    }

    public final void e() {
        if (((Boolean) yig.C.e()).booleanValue()) {
            this.c.b(this.l);
            this.d.ifPresent(new zmi(this, 2));
        }
        if (yig.b()) {
            this.o.ifPresent(new zmi(this, 5));
        }
    }

    public final void f() {
        this.a.b.f("bugle");
        this.a.fR(R.xml.smarts_preferences);
        this.a.d().ag();
        Optional b = b(R.string.suggested_stickers_enabled_pref_key);
        int i = 7;
        if (!((Boolean) yig.p.e()).booleanValue()) {
            PreferenceScreen d = this.a.d();
            d.getClass();
            b.ifPresent(new zmi(d, i));
        }
        int i2 = 6;
        if (!((Boolean) yig.C.e()).booleanValue()) {
            Optional b2 = b(R.string.smart_compose_enabled_pref_key);
            PreferenceScreen d2 = this.a.d();
            d2.getClass();
            b2.ifPresent(new zmi(d2, i));
        } else {
            lzh lzhVar = this.a;
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) lzhVar.a(lzhVar.S(R.string.smart_compose_enabled_pref_key));
            switchPreferenceCompat.getClass();
            this.j = switchPreferenceCompat;
            switchPreferenceCompat.G(false);
            this.j.N(false);
            this.j.n = new akvd(this.e, "SmartsSettingsFragmentPeer:toggleSmartComposeEnabled", new zkp(this, i2));
        }
        int i3 = 3;
        if (yig.b() && !this.f.isEmpty() && !this.o.isEmpty()) {
            b(R.string.mc_enabled_pref_key).ifPresent(new zmi(this, i3));
        } else {
            Optional b3 = b(R.string.mc_enabled_pref_key);
            PreferenceScreen d3 = this.a.d();
            d3.getClass();
            b3.ifPresent(new zmi(d3, i));
            Optional b4 = b(R.string.experiment_badge_pref_key);
            PreferenceScreen d4 = this.a.d();
            d4.getClass();
            b4.ifPresent(new zmi(d4, i));
        }
        Optional b5 = b(R.string.smart_action_example_key);
        Optional b6 = b(R.string.smart_reply_suggestion_example_key);
        Optional b7 = b(R.string.smart_action_settings_parent_pref);
        Optional b8 = b(R.string.spotlights_settings_parent_pref);
        Optional b9 = b(R.string.smart_actions_enabled_pref_key);
        int i4 = 13;
        int i5 = 9;
        if (((Boolean) ((utz) zfl.a.get()).e()).booleanValue()) {
            PreferenceScreen d5 = this.a.d();
            d5.getClass();
            b9.ifPresent(new zmi(d5, i));
            PreferenceScreen d6 = this.a.d();
            d6.getClass();
            b5.ifPresent(new zmg(d6, i4));
            b7.ifPresent(new zmi(this, 4));
        } else {
            PreferenceScreen d7 = this.a.d();
            d7.getClass();
            b7.ifPresent(new zmi(d7, i5));
        }
        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
            b8.ifPresent(new zmi(this, 8));
        } else {
            PreferenceScreen d8 = this.a.d();
            d8.getClass();
            b8.ifPresent(new zmi(d8, i5));
        }
        Resources z = this.a.z();
        int i6 = 1;
        if (((Boolean) ((utz) zfl.b.get()).e()).booleanValue()) {
            PreferenceScreen d9 = this.a.d();
            d9.getClass();
            b5.ifPresent(new zmg(d9, i4));
            PreferenceScreen d10 = this.a.d();
            d10.getClass();
            b6.ifPresent(new zmg(d10, i4));
        } else {
            alob alobVar = new alob();
            if (this.n.a()) {
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
            if (this.n.e()) {
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
            int i7 = 14;
            if (this.n.b()) {
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
            if (this.n.d()) {
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
            if (this.n.c()) {
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
            b5.ifPresent(new zmg(alobVar, i7));
            alob alobVar2 = new alob();
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text1)));
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text2)));
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text3)));
            alobVar2.h(zhg.a(z.getString(R.string.example_smart_reply_text4)));
            b6.ifPresent(new zmg(alobVar2, 15));
            PreferenceScreen d11 = this.a.d();
            d11.getClass();
            b8.ifPresent(new zmi(d11, 9));
        }
        this.p = b(R.string.nudge_settings_parent_pref);
        if (!yig.e()) {
            Optional optional = this.p;
            PreferenceScreen d12 = this.a.d();
            d12.getClass();
            optional.ifPresent(new zmi(d12, 9));
        } else {
            this.p.ifPresent(new zmi(this, 6));
        }
        if (((Boolean) ((utz) zfl.b.get()).e()).booleanValue()) {
            b(R.string.assistant_enabled_pref_key).ifPresent(new zmg(this, 16));
            b(R.string.p2p_conversation_suggestions_enabled_pref_key).ifPresent(new zmg(this, 17));
            b.ifPresent(new zmg(this, 18));
            this.p.ifPresent(new zmg(this, 19));
            if (yig.b() && this.g.isPresent()) {
                b(R.string.mc_enabled_pref_key).ifPresent(new zmg(this, 20));
            }
            if (((Boolean) ((utz) zfl.a.get()).e()).booleanValue()) {
                b7.ifPresent(new zmi(this, i6));
            } else {
                b9.ifPresent(new zmi(this, 0));
            }
        }
        d();
    }
}
