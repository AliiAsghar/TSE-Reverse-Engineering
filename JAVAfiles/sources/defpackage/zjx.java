package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import defpackage.zjx;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjx implements SharedPreferences.OnSharedPreferenceChangeListener {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public final xcd F;
    public final Optional G;
    public final Optional H;
    public final mbl I;
    public final xbf J;
    public final yjy K;
    public final yjr L;
    public final anen M;
    public final lzv N;
    public final armf O;
    public final akbo P;
    public final akvf Q;
    public final abbu R;
    public final Optional S;
    public final armf T;
    public final Optional U;
    public final armf V;
    public final armf W;
    public final Optional X;
    public final ihr Y;
    public final armf Z;
    private final zbl aA;
    public final oat aa;
    public final ajwt ab;
    public final qyo ac;
    public h ad;
    public akbp ae;
    public final armf af;
    public final armf ag;
    public final lzh ah;
    public final rft ai;
    public final zas aj;
    public final zbl ak;
    public final ahiy al;
    public final zxy am;
    public final zfh an;
    public final aohs ao;
    private Preference aq;
    private final armf ar;
    private final armf as;
    private final Optional at;
    private final armf au;
    private final armf av;
    private final Object aw = new Object();
    private final armf ax;
    private zke ay;
    private final zlc az;
    public PreferenceScreen f;
    public PhoneNumberPreference g;
    public PhoneNumberPreference h;
    public PhoneNumberPreference i;
    public Preference j;
    public String k;
    public String l;
    public int m;
    public xbe n;
    public String o;
    public ykw p;
    public boolean q;
    public zkb r;
    public boolean s;
    public String t;
    public Optional u;
    public zij v;
    public akbp w;
    public akbp x;
    public String y;
    public String z;
    public static final uuf a = uuh.r(181632590, "hide_fi_settings_when_satellite_enabled");
    public static final uuf b = uuh.r(187729732, "go_fi_settings_when_acct_linked_nothing_is_on");
    public static final alhr c = uuh.w("get_mms_group_phone_number_in_data_service");
    private static final uuf ap = uuh.r(169244616, "enableXmsConfigsChangedCallback");
    public static final alwo d = alwo.o("BugleSettings");
    public static final xze e = xze.g("BugleCms", "PerSubscriptionSettingsFragmentPeer");

    public zjx(Optional optional, Optional optional2, mbl mblVar, xcd xcdVar, rft rftVar, zfh zfhVar, xbf xbfVar, yjy yjyVar, yjr yjrVar, zxy zxyVar, anen anenVar, lzv lzvVar, zas zasVar, armf armfVar, zlc zlcVar, zbl zblVar, aohs aohsVar, akbo akboVar, zbl zblVar2, akvf akvfVar, armf armfVar2, abbu abbuVar, ahiy ahiyVar, Optional optional3, Optional optional4, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, Optional optional5, armf armfVar7, armf armfVar8, Optional optional6, ihr ihrVar, oat oatVar, armf armfVar9, ajwt ajwtVar, zju zjuVar, qyo qyoVar, armf armfVar10, armf armfVar11, armf armfVar12) {
        this.ab = ajwtVar;
        this.ah = zjuVar;
        this.G = optional;
        this.H = optional2;
        this.I = mblVar;
        this.F = xcdVar;
        this.ai = rftVar;
        this.an = zfhVar;
        this.J = xbfVar;
        this.K = yjyVar;
        this.L = yjrVar;
        this.am = zxyVar;
        this.M = anenVar;
        this.N = lzvVar;
        this.aj = zasVar;
        this.ar = armfVar;
        this.az = zlcVar;
        this.ak = zblVar;
        this.ao = aohsVar;
        this.al = ahiyVar;
        this.O = armfVar5;
        this.P = akboVar;
        this.aA = zblVar2;
        this.Q = akvfVar;
        this.as = armfVar2;
        this.R = abbuVar;
        this.at = optional3;
        this.S = optional4;
        this.au = armfVar3;
        this.av = armfVar4;
        this.T = armfVar6;
        this.U = optional5;
        this.V = armfVar7;
        this.W = armfVar8;
        this.X = optional6;
        this.Y = ihrVar;
        this.aa = oatVar;
        this.Z = armfVar9;
        this.ac = qyoVar;
        this.af = armfVar10;
        this.ax = armfVar11;
        this.ag = armfVar12;
    }

    private final void r(String str) {
        Preference a2 = this.ah.a(str);
        if (a2 != null) {
            a2.G(false);
        }
    }

    private final void s(String str, boolean z, gfa gfaVar) {
        SwitchPreferenceCompat a2 = a(str);
        a2.k(z);
        a2.n = new akvd(this.Q, "PerSubscriptionSettingsFragmentPeer:changeBooleanPreference", gfaVar);
    }

    private final void t(String str) {
        if (((Boolean) ap.e()).booleanValue()) {
            a(str).n = new lqp(this, 19, null);
        }
    }

    private final void u(String str, boolean z) {
        a(str).k(this.p.q(str, z));
    }

    public final SwitchPreferenceCompat a(String str) {
        Preference a2 = this.ah.a(str);
        a2.getClass();
        return (SwitchPreferenceCompat) a2;
    }

    public final zke b() {
        zke zkeVar;
        synchronized (this.aw) {
            if (this.ay == null) {
                this.ay = this.aA.a(this.m);
            }
            zkeVar = this.ay;
        }
        return zkeVar;
    }

    public final PhoneNumberPreference c(String str) {
        Preference a2 = this.ah.a(str);
        a2.getClass();
        return (PhoneNumberPreference) a2;
    }

    public final void d() {
        lzh lzhVar = this.ah;
        Optional ofNullable = Optional.ofNullable((PreferenceScreen) lzhVar.a(lzhVar.S(R.string.etouffee_pref_key)));
        if (ofNullable.isEmpty()) {
            return;
        }
        int i = 0;
        if (this.S.isPresent() && ((trz) this.au.b()).w()) {
            cj fe = this.ah.fe();
            fe.getClass();
            zjv zjvVar = new zjv(this, fe, i);
            PreferenceScreen preferenceScreen = (PreferenceScreen) ofNullable.get();
            preferenceScreen.L(R.string.user_toggle_for_etouffee);
            ((PreferenceScreen) ofNullable.get()).o = zjvVar;
            ((PreferenceScreen) ofNullable.get()).N(true);
            return;
        }
        ((PreferenceScreen) ofNullable.get()).N(false);
        ((PreferenceScreen) ofNullable.get()).o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARN: Type inference failed for: r0v43, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46, types: [msh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjx.e():void");
    }

    public final void f() {
        lzh lzhVar = this.ah;
        Optional ofNullable = Optional.ofNullable((PreferenceScreen) lzhVar.a(lzhVar.S(R.string.security_pref_key)));
        if (ofNullable.isEmpty()) {
            return;
        }
        if (this.S.isPresent() && ((trz) this.au.b()).o()) {
            cj fe = this.ah.fe();
            fe.getClass();
            zjv zjvVar = new zjv(this, fe, 1);
            PreferenceScreen preferenceScreen = (PreferenceScreen) ofNullable.get();
            preferenceScreen.L(R.string.etouffee_to_telephony_setting);
            ((PreferenceScreen) ofNullable.get()).o = zjvVar;
            ((PreferenceScreen) ofNullable.get()).N(true);
            return;
        }
        ((PreferenceScreen) ofNullable.get()).N(false);
        ((PreferenceScreen) ofNullable.get()).o = null;
    }

    public final void g(int i) {
        this.I.e("Bugle.Cms.Fi.Entry.Flow.Count", i);
    }

    public final void h(String str) {
        Preference a2 = this.ah.a(str);
        if (a2 != null) {
            a2.N(true);
        }
    }

    public final void i() {
        if (((Boolean) ap.e()).booleanValue()) {
            this.at.ifPresent(new zih(8));
        }
    }

    public final void j(boolean z) {
        if (z) {
            xzb.n("Bugle", "WAP Push SI enabled but no permission to receive. Requesting.");
            ((yjl) this.ar.b()).d(new zgs(this, 2));
        }
    }

    public final void k(PhoneNumberPreference phoneNumberPreference, String str) {
        if (((Boolean) new mst(16).get()).booleanValue()) {
            phoneNumberPreference.ab(((msk) this.Z.b()).t(str, this.m));
        } else {
            phoneNumberPreference.d = str;
        }
    }

    public final void l(PhoneNumberPreference phoneNumberPreference, int i) {
        String string = this.ah.z().getString(i);
        if (((Boolean) new mst(16).get()).booleanValue()) {
            phoneNumberPreference.f = ((msk) this.Z.b()).n(string);
        } else {
            phoneNumberPreference.g = string;
        }
    }

    public final void m(PhoneNumberPreference phoneNumberPreference) {
        phoneNumberPreference.c = this.ah.z().getString(R.string.smsc_number_pref_summary);
        phoneNumberPreference.n = new zkr(new lqp(this, 17), (aksr) this.as.b(), 3);
        phoneNumberPreference.o = new lpi(this, 8);
        phoneNumberPreference.F = new ahjj(this);
        phoneNumberPreference.D = true;
    }

    public final void n() {
        boolean z;
        int i;
        if (this.s) {
            zkb zkbVar = this.r;
            if ((zkbVar.b & 64) != 0) {
                z = zkbVar.i;
            } else {
                z = this.n.n();
            }
        } else {
            z = this.ah.d().q().getBoolean(this.k, this.n.n());
            i();
        }
        Preference preference = this.aq;
        if (true != z) {
            i = R.string.disable_group_mms;
        } else {
            i = R.string.enable_group_mms;
        }
        preference.J(i);
    }

    public final boolean o() {
        if (!this.n.b.getBoolean("allowEnablingWapPushSI", false) && !this.n.m()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [msk, java.lang.Object] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String u;
        Object obj;
        if (str.equals(this.k)) {
            n();
            return;
        }
        if (str.equals(this.l)) {
            if (((Boolean) new mst(16).get()).booleanValue()) {
                PhoneNumberPreference phoneNumberPreference = this.g;
                if (!phoneNumberPreference.h) {
                    obj = Optional.of(phoneNumberPreference.a.b().n(phoneNumberPreference.u(phoneNumberPreference.k())));
                } else {
                    if (phoneNumberPreference.E == null) {
                        phoneNumberPreference.E = abul.d(phoneNumberPreference.e);
                    }
                    obj = phoneNumberPreference.E.b;
                }
                if (!this.s) {
                    ykw x = this.am.x(this.m);
                    String str2 = (String) ((Optional) obj).map(new yug(19)).orElse("");
                    if (TextUtils.isEmpty(str2)) {
                        x.n(this.l);
                    } else {
                        x.l(this.ah.S(R.string.mms_phone_number_pref_key), str2);
                    }
                }
            } else {
                PhoneNumberPreference phoneNumberPreference2 = this.g;
                if (phoneNumberPreference2.h) {
                    if (phoneNumberPreference2.b == null) {
                        phoneNumberPreference2.b = zno.a(phoneNumberPreference2.k());
                    }
                    u = phoneNumberPreference2.b.a;
                } else {
                    u = phoneNumberPreference2.u(phoneNumberPreference2.k());
                }
                if (!this.s) {
                    ykw x2 = this.am.x(this.m);
                    if (TextUtils.isEmpty(u)) {
                        x2.n(this.l);
                    } else {
                        x2.l(this.ah.S(R.string.mms_phone_number_pref_key), u);
                    }
                }
            }
            this.al.q(aktp.ag(null), "SIM_SELECTION_SETTINGS_DATASERVICE_KEY");
            this.ai.b().J();
        }
    }

    public final boolean p(String str) {
        return this.ah.a(str) instanceof SwitchPreferenceCompat;
    }

    public final boolean q() {
        if (this.n.b.getBoolean("smsEncodingChangeable", true) || this.n.w()) {
            return true;
        }
        return false;
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class b implements akgh<Boolean> {
        public b() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            xzb.n("BugleCms", "Error getting Fi setting status");
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
        
            if (((defpackage.kpb) ((j$.util.Optional) r0.a).get()).b() != false) goto L14;
         */
        @Override // defpackage.akgh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ void c(java.lang.Object r5) {
            /*
                r4 = this;
                zjx r0 = defpackage.zjx.this
                j$.util.Optional r0 = r0.G
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r0 = r0.isPresent()
                if (r0 == 0) goto L5f
                zjx r0 = defpackage.zjx.this
                uuf r1 = defpackage.zjx.a
                java.lang.Object r1 = r1.e()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L3a
                armf r0 = r0.T
                apxx r0 = (defpackage.apxx) r0
                java.lang.Object r1 = r0.a
                j$.util.Optional r1 = (j$.util.Optional) r1
                boolean r1 = r1.isPresent()
                if (r1 == 0) goto L3a
                java.lang.Object r0 = r0.a
                j$.util.Optional r0 = (j$.util.Optional) r0
                java.lang.Object r0 = r0.get()
                kpb r0 = (defpackage.kpb) r0
                boolean r0 = r0.b()
                if (r0 != 0) goto L5f
            L3a:
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L5f
                zjx r5 = defpackage.zjx.this
                androidx.preference.PreferenceScreen r5 = r5.f
                r0 = 1
                r5.N(r0)
                zjx r5 = defpackage.zjx.this
                androidx.preference.PreferenceScreen r0 = r5.f
                lpi r1 = new lpi
                r2 = 9
                r1.<init>(r5, r2)
                akve r2 = new akve
                akvf r5 = r5.Q
                java.lang.String r3 = "Fi Entry clicked"
                r2.<init>(r5, r3, r1)
                r0.o = r2
                return
            L5f:
                zjx r5 = defpackage.zjx.this
                lzh r0 = r5.ah
                androidx.preference.PreferenceScreen r0 = r0.d()
                androidx.preference.PreferenceScreen r5 = r5.f
                r0.af(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zjx.b.c(java.lang.Object):void");
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class e implements akgh<Optional<msh>> {
        public e() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            xzb.d("Bugle", "Error getting phone number for subId(%s)", Integer.valueOf(zjx.this.m));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            ((Optional) obj).ifPresent(new Consumer() { // from class: zjz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    msh mshVar = (msh) obj2;
                    boolean booleanValue = ((Boolean) new mst(16).get()).booleanValue();
                    zjx.e eVar = zjx.e.this;
                    if (booleanValue) {
                        zjx.this.g.ab(mshVar);
                    } else {
                        zjx.this.g.d = albo.ag(mshVar.o(((Boolean) new mst(10).get()).booleanValue()));
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class f implements akgh<zkb> {
        public f() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            xzb.h("Bugle", "Error getting per subscription settings for subId(%s)", Integer.valueOf(zjx.this.m));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            zjx zjxVar = zjx.this;
            zjxVar.r = (zkb) obj;
            zjxVar.e();
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class g implements akgh<String> {
        public g() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            xzb.d("Bugle", "Error getting SMSC for subId(%s)", Integer.valueOf(zjx.this.m));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            zjx zjxVar = zjx.this;
            String str = (String) obj;
            if (!zjxVar.an.l(zjxVar.m) && !yhx.d) {
                return;
            }
            if (yhx.d) {
                if (albo.ah(str)) {
                    zjx zjxVar2 = zjx.this;
                    yjy yjyVar = zjxVar2.K;
                    PhoneNumberPreference phoneNumberPreference = zjxVar2.i;
                    String z = yjyVar.h(zjxVar2.m).z();
                    zjxVar2.k(phoneNumberPreference, z);
                    phoneNumberPreference.ac();
                    zjxVar2.o = z;
                } else {
                    zjx zjxVar3 = zjx.this;
                    zjxVar3.k(zjxVar3.i, str);
                    zjx.this.i.ac();
                }
            } else {
                zjx zjxVar4 = zjx.this;
                zjxVar4.k(zjxVar4.h, str);
                zjx.this.h.ac();
            }
            zjx.this.o = str;
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akbp<Void, apdj<ihs>> {
        public a() {
        }

        private final void d() {
            zjx.e.l("Fi Entry point launching Fi Account activity");
            Context x = zjx.this.ah.x();
            x.getClass();
            ihk ihkVar = (ihk) zjx.this.G.get();
            Context context = zjx.this.ah.d().j;
            Intent a = ihkVar.a();
            a.putExtra("entry_point", 1);
            akto.n(x, a);
        }

        private final void e() {
            zjx.e.l("Fi Entry point launching Fi Settings activity");
            Context x = zjx.this.ah.x();
            x.getClass();
            Intent b = ((ihk) zjx.this.G.get()).b();
            b.putExtra("entry_point", 1);
            akto.n(x, b);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zjx.this.g(5);
            ((uvi) zjx.this.V.b()).b(th).k(qiu.b(), andi.a);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            int i;
            switch (((ihs) ((apdj) obj2).a(ihs.a, aozs.a())).b) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                i = 1;
            }
            switch (i - 2) {
                case 1:
                    d();
                    return;
                case 2:
                    zjx.this.g(1);
                    zjx.e.q("User tries to turn on MD when B&R is ON from existing Fi entry point in Advanced Settings while on a non-B&R build, launching the Fi Account Activity");
                    d();
                    return;
                case 3:
                    zjx.this.g(0);
                    e();
                    return;
                case 4:
                    zjx.this.g(2);
                    if (((Boolean) zjx.b.e()).booleanValue()) {
                        e();
                        return;
                    } else {
                        zjx.e.q("User encounters ACCT_LINKED_NOTHING_IS_ON");
                        throw new IllegalStateException("Cms account linked, but nothing is on");
                    }
                case 5:
                    zjx.this.g(3);
                    e();
                    return;
                case 6:
                    if (((Boolean) xxy.e.e()).booleanValue()) {
                        zjx.e.l("Fi Entry point launching Fi Settings redirect activity");
                        zjx zjxVar = zjx.this;
                        zjxVar.P.c(new ahlp(zjxVar.ac.a()), zjx.this.ae);
                        return;
                    }
                    break;
            }
            zjx.this.g(4);
            if (zjx.this.aa.a()) {
                alvg alvgVar = (alvg) xxq.a.h();
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsError", 32, "CmsFeedbackLogger.kt")).q("FLOW_UNSPECIFIED: Not expected to happen");
                return;
            }
            ((uvi) zjx.this.V.b()).b(new IllegalStateException("FLOW_UNSPECIFIED: Not expected to happen")).k(qiu.b(), andi.a);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class c implements akbp<String, Void> {
        public c() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            String str;
            Optional optional;
            String str2 = (String) obj;
            zjx.this.R.k(R.string.error_failed_to_save_setting);
            boolean z = false;
            xzb.h("Bugle", "Error saving per subscription settings for subId(%s), preference key(%s), error: %s", Integer.valueOf(zjx.this.m), str2, th.getMessage());
            if (zjx.this.p(str2)) {
                zjx zjxVar = zjx.this;
                zke b = zjxVar.b();
                if (str2.equals(zjxVar.y)) {
                    z = ((Boolean) b.h().orElse(Boolean.valueOf(zjxVar.n.v()))).booleanValue();
                } else if (str2.equals(zjxVar.B)) {
                    z = ((Boolean) b.k().orElse(Boolean.valueOf(zjxVar.n.w()))).booleanValue();
                } else if (str2.equals(zjxVar.z)) {
                    z = ((Boolean) b.e().orElse(Boolean.valueOf(zjxVar.n.p()))).booleanValue();
                } else if (str2.equals(zjxVar.A)) {
                    z = ((Boolean) b.f().orElse(Boolean.valueOf(zjxVar.n.q()))).booleanValue();
                } else if (str2.equals(zjxVar.C)) {
                    z = ((Boolean) b.i().orElse(Boolean.valueOf(zjxVar.n.m()))).booleanValue();
                } else if (str2.equals(zjxVar.E)) {
                    if (zjxVar.X.isEmpty() || ((wla) zjxVar.X.get()).b()) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("handleBooleanPreferenceChangeOnFailure called for unexpected preference key ".concat(String.valueOf(str2)));
                }
                SwitchPreferenceCompat a = zjxVar.a(str2);
                a.k(z);
                a.G(true);
                return;
            }
            if (str2.equals(zjx.this.l)) {
                PhoneNumberPreference c = zjx.this.c(str2);
                if (((Boolean) new mst(16).get()).booleanValue()) {
                    zjx zjxVar2 = zjx.this;
                    if ((zjxVar2.r.b & 32) != 0) {
                        msk mskVar = (msk) zjxVar2.Z.b();
                        zjx zjxVar3 = zjx.this;
                        optional = Optional.of(mskVar.t(zjxVar3.r.h, zjxVar3.m));
                    } else {
                        optional = zjxVar2.u;
                    }
                    abul abulVar = c.E;
                    if (abulVar == null) {
                        c.E = abul.d(optional);
                    } else {
                        abulVar.c(optional);
                    }
                } else {
                    zjx zjxVar4 = zjx.this;
                    zkb zkbVar = zjxVar4.r;
                    if ((zkbVar.b & 32) != 0) {
                        str = zkbVar.h;
                    } else {
                        str = zjxVar4.t;
                    }
                    zno znoVar = c.b;
                    if (znoVar == null) {
                        c.b = zno.a(str);
                    } else {
                        znoVar.b(str);
                    }
                }
                zjx.this.c(str2).G(true);
                return;
            }
            if (str2.equals(zjx.this.k)) {
                zjx.this.n();
            } else {
                xzb.o("Bugle", "handlePreferenceChangedCallback.onFailure called for unexpected preference key %s", str2);
            }
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            String str = (String) obj;
            if (zjx.this.p(str)) {
                zjx.this.a(str).G(true);
            } else if (str.equals(zjx.this.l)) {
                zjx.this.al.q(aktp.ag(null), "SIM_SELECTION_SETTINGS_DATASERVICE_KEY");
                zjx.this.c(str).G(true);
                zjx.this.ai.b().J();
            } else if (str.equals(zjx.this.k)) {
                zjx.this.n();
            } else {
                xzb.o("Bugle", "handlePreferenceChangedCallback.onSuccess called for unexpected preference key %s", str);
            }
            zjx.this.i();
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class d implements akbp<Void, ajwt> {
        public d() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            if (th instanceof qyp) {
                if (zjx.this.G.isPresent()) {
                    Context x = zjx.this.ah.x();
                    x.getClass();
                    Intent c = ((ihk) zjx.this.G.get()).c();
                    ajya.c(c, zjx.this.ab);
                    akto.n(x, c);
                    return;
                }
                return;
            }
            xyo e = zjx.e.e();
            e.H("Failed to load linked CMS Account");
            e.r(th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ajwt ajwtVar = (ajwt) obj2;
            Context x = zjx.this.ah.x();
            x.getClass();
            if (zjx.this.G.isPresent()) {
                Intent c = ((ihk) zjx.this.G.get()).c();
                ajya.c(c, ajwtVar);
                akto.n(x, c);
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class h implements akbp<String, Boolean> {
        public h() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            xzb.p("Bugle", th, "Error setting SMSC address");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            String str;
            String str2 = (String) obj;
            xzb.j("Bugle", "Successfully set SMSC address");
            zjx zjxVar = zjx.this;
            if (Objects.equals(zjxVar.o, str2)) {
                str = "Bugle.Preference.Smsc.Editor.Closed.Unmodified";
            } else if (str2 == null) {
                str = "Bugle.Preference.Smsc.Editor.Closed.Clear";
            } else {
                str = "Bugle.Preference.Smsc.Editor.Closed.Modified";
            }
            zjxVar.I.c(str);
            zjx.this.o = str2;
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
