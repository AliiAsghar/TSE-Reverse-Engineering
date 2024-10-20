package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhw extends zhx implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final xze a = xze.g("Bugle", "ApplicationSettingsFragmentPeer");
    public static final xze b = xze.g("BugleCms", "ApplicationSettingsFragmentPeer");
    public static final alwo c = alwo.o("BugleSettings");
    public final Optional B;
    public final Optional C;
    public final armf D;
    public final armf E;
    public final atsg F;
    public final armf G;
    public final armf H;
    public final armf I;
    public final armf J;
    public final armf K;
    public final armf L;
    public final armf M;
    public final armf N;
    public final Optional O;
    public final armf P;
    public final Optional Q;
    public final owm R;
    public akbp S;
    public akbp T;
    public String U;
    public Optional V;
    public String W;
    public Optional X;
    public Optional Y;
    public Optional Z;
    public Optional aa;
    public Optional ab;
    public Optional ac;
    public Optional ad;
    public Optional ae;
    public Optional af;
    public Optional ag;
    public Optional ah;
    public Optional ai;
    public Optional aj;
    public Optional ak;
    public Optional al;
    public Optional am;
    public Optional an;
    public rw ao;
    public final kor ap;
    public final adve aq;
    public final ansy ar;
    public final aohs as;
    private final yju au;
    private final yjr av;
    public final ajwt d;
    public final zho f;
    public final armf g;
    public final ykw h;
    public final yhu i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final ytk m;
    public final Optional n;
    public final yck o;
    public final armf p;
    public final akgu q;
    public final akbo r;
    public final Optional s;
    public final Optional t;
    public final akvf u;
    public final armf v;
    public final armf w;
    public final armf x;
    public final apwt y;
    public final armf z;
    public final xvv e = new xvv("enableConversationScaleSetting", new isd(6));
    public final b A = new b();

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class b implements akgh<zxk> {
        public b() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            zhw.this.ah.ifPresent(new xyh(15));
            ((alwl) ((alwl) zhw.c.i()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$LoadPinchZoomCallback", "onError", 1548, "ApplicationSettingsFragmentPeer.java")).q("Failed to load pinch to zoom");
        }

        @Override // defpackage.akgh
        public final void b() {
            zhw.this.ah.ifPresent(new xyh(14));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            zhw.this.ah.ifPresent(new zhp((zxk) obj, 17));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class c implements akgh<Boolean> {
        public c() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            zhw.this.af.ifPresent(new xyh(17));
            zhw.a.m("Failed to load reminder setting data");
        }

        @Override // defpackage.akgh
        public final void b() {
            zhw.this.af.ifPresent(new xyh(16));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            Boolean bool = (Boolean) obj;
            zhw.this.af.ifPresent(new zhp(bool, 18));
            zhw.this.V.ifPresent(new zhp(bool, 19));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class d implements akbp<Boolean, Void> {
        public d() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            int i = 20;
            zhw.this.af.ifPresent(new zhp((Boolean) obj, i));
            zhw.this.af.ifPresent(new xyh(i));
            zhw.a.m("Failed to save reminder action setting");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            zhw.this.af.ifPresent(new xyh(18));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zhw.this.af.ifPresent(new xyh(19));
        }
    }

    public zhw(ajwt ajwtVar, zho zhoVar, armf armfVar, ykw ykwVar, yhu yhuVar, armf armfVar2, yju yjuVar, yjr yjrVar, armf armfVar3, armf armfVar4, ytk ytkVar, Optional optional, yck yckVar, armf armfVar5, aohs aohsVar, akgu akguVar, ansy ansyVar, akbo akboVar, Optional optional2, Optional optional3, akvf akvfVar, adve adveVar, armf armfVar6, armf armfVar7, armf armfVar8, kor korVar, apwt apwtVar, armf armfVar9, Optional optional4, Optional optional5, atsg atsgVar, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, Optional optional6, Optional optional7, owm owmVar) {
        this.d = ajwtVar;
        this.f = zhoVar;
        this.g = armfVar;
        this.h = ykwVar;
        this.i = yhuVar;
        this.j = armfVar2;
        this.au = yjuVar;
        this.av = yjrVar;
        this.k = armfVar3;
        this.l = armfVar4;
        this.m = ytkVar;
        this.n = optional;
        this.o = yckVar;
        this.p = armfVar5;
        this.as = aohsVar;
        this.q = akguVar;
        this.ar = ansyVar;
        this.r = akboVar;
        this.s = optional2;
        this.t = optional3;
        this.u = akvfVar;
        this.aq = adveVar;
        this.v = armfVar6;
        this.w = armfVar7;
        this.x = armfVar8;
        this.ap = korVar;
        this.y = apwtVar;
        this.z = armfVar9;
        this.B = optional4;
        this.C = optional5;
        this.D = armfVar10;
        this.E = armfVar11;
        this.F = atsgVar;
        this.G = armfVar12;
        this.H = armfVar13;
        this.I = armfVar14;
        this.J = armfVar15;
        this.K = armfVar16;
        this.L = armfVar17;
        this.M = armfVar19;
        this.N = armfVar20;
        this.O = optional6;
        this.P = armfVar18;
        this.Q = optional7;
        this.R = owmVar;
    }

    public static boolean f() {
        return ((Boolean) vjk.a.e()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional a(int i) {
        zho zhoVar = this.f;
        return Optional.ofNullable(zhoVar.a(zhoVar.S(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional b(String str) {
        return Optional.ofNullable(this.f.a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        String displayCountry;
        String e = this.aq.e();
        cj fe = this.f.fe();
        if (yyb.an(e)) {
            String c2 = this.au.c();
            if (!TextUtils.isEmpty(c2)) {
                displayCountry = this.f.T(R.string.auto_selected_country_summary, new Locale("", c2).getDisplayCountry(dzf.c(fe.getResources().getConfiguration()).f(0)));
            } else {
                displayCountry = null;
            }
        } else {
            displayCountry = new Locale("", e).getDisplayCountry(dzf.c(fe.getResources().getConfiguration()).f(0));
        }
        if (this.Y.isPresent()) {
            ((Preference) this.Y.get()).n(albo.ag(displayCountry));
        } else {
            a.o("currentCountryPreference was not found");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Optional optional = this.V;
        if (optional != null && !optional.isEmpty()) {
            ((Preference) this.V.get()).G(this.av.y());
        } else {
            a.o("notificationsPreference was not found");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(SharedPreferences sharedPreferences) {
        Optional optional = this.X;
        if (optional != null && !optional.isEmpty()) {
            String string = ((Preference) this.X.get()).j.getString(R.string.silent_ringtone);
            String string2 = sharedPreferences.getString(this.W, null);
            if (string2 == null) {
                string2 = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(this.W, string2);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Ringtone ringtone = RingtoneManager.getRingtone(((Preference) this.X.get()).j, Uri.parse(string2));
                    if (ringtone != null) {
                        string = ringtone.getTitle(((Preference) this.X.get()).j);
                    }
                } catch (SecurityException unused) {
                    string = this.f.S(R.string.unknown_ringtone_pref_display_value);
                }
            }
            ((Preference) this.X.get()).n(string);
            return;
        }
        a.o("ringtonePreference was not found");
    }

    public final void g() {
        if (kpt.a() && xxy.a()) {
            this.B.isPresent();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.U)) {
            d();
        } else if (str.equals(this.W)) {
            e(sharedPreferences);
        } else if (str.equals(this.aq.f())) {
            c();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akbp<Intent, ajwt> {
        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            Intent intent = (Intent) obj;
            if (th instanceof qyp) {
                ajwt ajwtVar = zhw.this.d;
                ajwtVar.getClass();
                ajya.c(intent, ajwtVar);
                aktp.Q(zhw.this.f, intent);
            } else {
                xyo e = zhw.b.e();
                e.H("Failed to load linked CMS Account");
                e.r(th);
            }
            zhw.this.ak.ifPresent(new xyh(12));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Intent intent = (Intent) obj;
            ajwt ajwtVar = (ajwt) obj2;
            ajwtVar.getClass();
            ajya.c(intent, ajwtVar);
            aktp.Q(zhw.this.f, intent);
            zhw.this.ak.ifPresent(new xyh(13));
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
