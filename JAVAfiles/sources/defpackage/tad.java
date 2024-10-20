package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tad extends aglz implements agma {
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public String H;
    public tqr I;
    public String J;
    public byte[] K;
    public long L;
    public boolean M;
    public boolean N;
    public String O;
    public xxw P;
    public ndp V;
    public String a;
    public long c;
    public String d;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public long t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public String z;
    public Instant b = Instant.EPOCH;
    public qwe e = null;
    public qwe f = null;
    public mta Q = mta.b(0);
    public rxg R = rxg.a;
    public vox S = vox.b(0);
    public vox T = vox.b(0);
    public vov U = vov.b(0);

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        String valueOf15 = String.valueOf(this.o);
        String valueOf16 = String.valueOf(this.p);
        String valueOf17 = String.valueOf(this.q);
        String valueOf18 = String.valueOf(this.r);
        String valueOf19 = String.valueOf(this.s);
        String valueOf20 = String.valueOf(this.t);
        String valueOf21 = String.valueOf(this.u);
        String valueOf22 = String.valueOf(this.v);
        String valueOf23 = String.valueOf(this.w);
        String valueOf24 = String.valueOf(this.x);
        String valueOf25 = String.valueOf(this.y);
        String valueOf26 = String.valueOf(this.z);
        String valueOf27 = String.valueOf(this.A);
        String valueOf28 = String.valueOf(this.B);
        String valueOf29 = String.valueOf(this.C);
        String valueOf30 = String.valueOf(this.D);
        String valueOf31 = String.valueOf(this.E);
        String valueOf32 = String.valueOf(this.F);
        String valueOf33 = String.valueOf(this.G);
        String valueOf34 = String.valueOf(this.H);
        String valueOf35 = String.valueOf(this.I);
        String valueOf36 = String.valueOf(this.J);
        byte[] bArr = this.K;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "ParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  participant_id: %s,\n  my_identity_token: %s,\n  my_identity_token_foreign_key: %s,\n  sub_id: %s,\n  sim_slot_id: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  comparable_destination: %s,\n  country_code: %s,\n  recipient_id: %s,\n  recipient_canonical_address: %s,\n  full_name: %s,\n  first_name: %s,\n  profile_photo_uri: %s,\n  contact_photo_uri: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  blocked: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  contact_destination: %s,\n  participant_type: %s,\n  video_reachability: %s,\n  alias: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  cms_id: %s,\n  latest_verification_status: %s,\n  profile_photo_blob_id: %s,\n  profile_photo_encryption_key: %s,\n  directory_id: %s,\n  is_check_constraint_enabled_via_phenotype: %s,\n  is_valid_phone_number_data: %s,\n  duplicate_of: %s,\n  cms_life_cycle: %s,\n  norm_ui_status: %s,\n  last_modified_by_key: %s,\n  name_source: %s,\n  photo_source: %s,\n  profile_photo_user_preference: %s,\n  contact_metadata: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, "BLOB".concat(String.valueOf(str)), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(uzz.k(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        agnc.r(contentValues, "participant_id", this.d);
        if (intValue >= 59930) {
            qwe qweVar = this.e;
            if (qweVar == null) {
                contentValues.putNull("my_identity_token");
            } else {
                contentValues.put("my_identity_token", riw.n(qweVar));
            }
        }
        if (intValue >= 60160) {
            qwe qweVar2 = this.f;
            if (qweVar2 != null && !qweVar2.equals(null)) {
                contentValues.put("my_identity_token_foreign_key", riw.n(this.f));
            } else {
                contentValues.putNull("my_identity_token_foreign_key");
            }
        }
        contentValues.put("sub_id", Integer.valueOf(this.g));
        contentValues.put("sim_slot_id", Integer.valueOf(this.h));
        agnc.r(contentValues, "normalized_destination", this.i);
        agnc.r(contentValues, "send_destination", this.j);
        agnc.r(contentValues, "display_destination", this.k);
        agnc.r(contentValues, "comparable_destination", this.l);
        agnc.r(contentValues, "country_code", this.m);
        contentValues.put("recipient_id", Long.valueOf(this.n));
        agnc.r(contentValues, "recipient_canonical_address", this.o);
        agnc.r(contentValues, "full_name", this.p);
        agnc.r(contentValues, "first_name", this.q);
        Uri uri = this.r;
        if (uri == null) {
            contentValues.putNull("profile_photo_uri");
        } else {
            contentValues.put("profile_photo_uri", uri.toString());
        }
        if (intValue >= 59850) {
            Uri uri2 = this.s;
            if (uri2 == null) {
                contentValues.putNull("contact_photo_uri");
            } else {
                contentValues.put("contact_photo_uri", uri2.toString());
            }
        }
        contentValues.put("contact_id", Long.valueOf(this.t));
        agnc.r(contentValues, "lookup_key", this.u);
        contentValues.put("color_palette_index", Integer.valueOf(this.v));
        contentValues.put("color_type", Integer.valueOf(this.w));
        contentValues.put("extended_color", Integer.valueOf(this.x));
        contentValues.put("blocked", Boolean.valueOf(this.y));
        agnc.r(contentValues, "subscription_name", this.z);
        contentValues.put("subscription_color", Integer.valueOf(this.A));
        agnc.r(contentValues, "contact_destination", this.B);
        contentValues.put("participant_type", Integer.valueOf(this.C));
        contentValues.put("video_reachability", Integer.valueOf(this.D));
        agnc.r(contentValues, "alias", this.E);
        contentValues.put("is_spam", Boolean.valueOf(this.F));
        contentValues.put("is_spam_source", Integer.valueOf(this.G));
        agnc.r(contentValues, "cms_id", this.H);
        tqr tqrVar = this.I;
        if (tqrVar == null) {
            contentValues.putNull("latest_verification_status");
        } else {
            contentValues.put("latest_verification_status", Integer.valueOf(tqrVar.ordinal()));
        }
        agnc.r(contentValues, "profile_photo_blob_id", this.J);
        contentValues.put("profile_photo_encryption_key", this.K);
        contentValues.put("directory_id", Long.valueOf(this.L));
        contentValues.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(this.M));
        contentValues.put("is_valid_phone_number_data", Boolean.valueOf(this.N));
        agnc.r(contentValues, "duplicate_of", this.O);
        xxw xxwVar = this.P;
        if (xxwVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
        }
        mta mtaVar = this.Q;
        if (mtaVar == null) {
            contentValues.putNull("norm_ui_status");
        } else {
            contentValues.put("norm_ui_status", Integer.valueOf(mtaVar.a()));
        }
        if (intValue >= 59440) {
            rxg rxgVar = this.R;
            if (rxgVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", vcp.n(rxgVar));
            }
        }
        if (intValue >= 59550) {
            vox voxVar = this.S;
            if (voxVar == null) {
                contentValues.putNull("name_source");
            } else {
                contentValues.put("name_source", Integer.valueOf(voxVar.a()));
            }
        }
        if (intValue >= 59550) {
            vox voxVar2 = this.T;
            if (voxVar2 == null) {
                contentValues.putNull("photo_source");
            } else {
                contentValues.put("photo_source", Integer.valueOf(voxVar2.a()));
            }
        }
        if (intValue >= 60060) {
            vov vovVar = this.U;
            if (vovVar == null) {
                contentValues.putNull("profile_photo_user_preference");
            } else {
                contentValues.put("profile_photo_user_preference", Integer.valueOf(vovVar.a()));
            }
        }
        if (intValue >= 60070) {
            ndp ndpVar = this.V;
            if (ndpVar == null) {
                contentValues.putNull("contact_metadata");
            } else {
                contentValues.put("contact_metadata", ndpVar.toByteArray());
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        taj tajVar = (taj) agmqVar;
        aq();
        this.cJ = tajVar.dx();
        if (tajVar.db(0)) {
            this.a = tajVar.M();
            fE(0);
        }
        if (tajVar.db(1)) {
            this.b = tajVar.C();
            fE(1);
        }
        if (tajVar.db(2)) {
            this.c = tajVar.o();
            fE(2);
        }
        if (tajVar.db(3)) {
            this.d = tajVar.P();
            fE(3);
        }
        if (tajVar.db(4)) {
            this.e = tajVar.u();
            fE(4);
        }
        if (tajVar.db(5)) {
            this.f = tajVar.v();
            fE(5);
        }
        if (tajVar.db(6)) {
            this.g = tajVar.j();
            fE(6);
        }
        if (tajVar.db(7)) {
            this.h = tajVar.i();
            fE(7);
        }
        if (tajVar.db(8)) {
            this.i = tajVar.O();
            fE(8);
        }
        if (tajVar.db(9)) {
            this.j = tajVar.S();
            fE(9);
        }
        if (tajVar.db(10)) {
            this.k = tajVar.I();
            fE(10);
        }
        if (tajVar.db(11)) {
            this.l = tajVar.F();
            fE(11);
        }
        if (tajVar.db(12)) {
            this.m = tajVar.H();
            fE(12);
        }
        if (tajVar.db(13)) {
            this.n = tajVar.p();
            fE(13);
        }
        if (tajVar.db(14)) {
            this.o = tajVar.R();
            fE(14);
        }
        if (tajVar.db(15)) {
            this.p = tajVar.L();
            fE(15);
        }
        if (tajVar.db(16)) {
            this.q = tajVar.K();
            fE(16);
        }
        if (tajVar.db(17)) {
            this.r = tajVar.r();
            fE(17);
        }
        if (tajVar.db(18)) {
            this.s = tajVar.q();
            fE(18);
        }
        if (tajVar.db(19)) {
            this.t = tajVar.m();
            fE(19);
        }
        if (tajVar.db(20)) {
            this.u = tajVar.N();
            fE(20);
        }
        if (tajVar.db(21)) {
            this.v = tajVar.c();
            fE(21);
        }
        if (tajVar.db(22)) {
            this.w = tajVar.e();
            fE(22);
        }
        if (tajVar.db(23)) {
            this.x = tajVar.f();
            fE(23);
        }
        if (tajVar.db(24)) {
            this.y = tajVar.U();
            fE(24);
        }
        if (tajVar.db(25)) {
            this.z = tajVar.T();
            fE(25);
        }
        if (tajVar.db(26)) {
            this.A = tajVar.k();
            fE(26);
        }
        if (tajVar.db(27)) {
            this.B = tajVar.G();
            fE(27);
        }
        if (tajVar.db(28)) {
            this.C = tajVar.h();
            fE(28);
        }
        if (tajVar.db(29)) {
            this.D = tajVar.l();
            fE(29);
        }
        if (tajVar.db(30)) {
            this.E = tajVar.D();
            fE(30);
        }
        if (tajVar.db(31)) {
            this.F = tajVar.W();
            fE(31);
        }
        if (tajVar.db(32)) {
            this.G = tajVar.g();
            fE(32);
        }
        if (tajVar.db(33)) {
            this.H = tajVar.E();
            fE(33);
        }
        if (tajVar.db(34)) {
            this.I = tajVar.x();
            fE(34);
        }
        if (tajVar.db(35)) {
            this.J = tajVar.Q();
            fE(35);
        }
        if (tajVar.db(36)) {
            this.K = tajVar.Y();
            fE(36);
        }
        if (tajVar.db(37)) {
            this.L = tajVar.n();
            fE(37);
        }
        if (tajVar.db(38)) {
            this.M = tajVar.V();
            fE(38);
        }
        if (tajVar.db(39)) {
            this.N = tajVar.X();
            fE(39);
        }
        if (tajVar.db(40)) {
            this.O = tajVar.J();
            fE(40);
        }
        if (tajVar.db(41)) {
            this.P = tajVar.B();
            fE(41);
        }
        if (tajVar.db(42)) {
            this.Q = tajVar.s();
            fE(42);
        }
        if (tajVar.db(43)) {
            this.R = tajVar.w();
            fE(43);
        }
        if (tajVar.db(44)) {
            this.S = tajVar.z();
            fE(44);
        }
        if (tajVar.db(45)) {
            this.T = tajVar.A();
            fE(45);
        }
        if (tajVar.db(46)) {
            this.U = tajVar.y();
            fE(46);
        }
        if (tajVar.db(47)) {
            this.V = tajVar.t();
            fE(47);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tad)) {
            return false;
        }
        tad tadVar = (tad) obj;
        if (super.aC(tadVar.cJ) && Objects.equals(this.a, tadVar.a) && Objects.equals(this.b, tadVar.b) && this.c == tadVar.c && Objects.equals(this.d, tadVar.d) && Objects.equals(this.e, tadVar.e) && Objects.equals(this.f, tadVar.f) && this.g == tadVar.g && this.h == tadVar.h && Objects.equals(this.i, tadVar.i) && Objects.equals(this.j, tadVar.j) && Objects.equals(this.k, tadVar.k) && Objects.equals(this.l, tadVar.l) && Objects.equals(this.m, tadVar.m) && this.n == tadVar.n && Objects.equals(this.o, tadVar.o) && Objects.equals(this.p, tadVar.p) && Objects.equals(this.q, tadVar.q) && Objects.equals(this.r, tadVar.r) && Objects.equals(this.s, tadVar.s) && this.t == tadVar.t && Objects.equals(this.u, tadVar.u) && this.v == tadVar.v && this.w == tadVar.w && this.x == tadVar.x && this.y == tadVar.y && Objects.equals(this.z, tadVar.z) && this.A == tadVar.A && Objects.equals(this.B, tadVar.B) && this.C == tadVar.C && this.D == tadVar.D && Objects.equals(this.E, tadVar.E) && this.F == tadVar.F && this.G == tadVar.G && Objects.equals(this.H, tadVar.H) && this.I == tadVar.I && Objects.equals(this.J, tadVar.J) && Arrays.equals(this.K, tadVar.K) && this.L == tadVar.L && this.M == tadVar.M && this.N == tadVar.N && Objects.equals(this.O, tadVar.O) && this.P == tadVar.P && this.Q == tadVar.Q && Objects.equals(this.R, tadVar.R) && this.S == tadVar.S && this.T == tadVar.T && this.U == tadVar.U && Objects.equals(this.V, tadVar.V)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants_audit_log", agnc.j(new String[]{"operation_datetime", "operation_type", "participant_id", "my_identity_token", "my_identity_token_foreign_key", "sub_id", "sim_slot_id", "normalized_destination", "send_destination", "display_destination", "comparable_destination", "country_code", "recipient_id", "recipient_canonical_address", "full_name", "first_name", "profile_photo_uri", "contact_photo_uri", "contact_id", "lookup_key", "color_palette_index", "color_type", "extended_color", "blocked", "subscription_name", "subscription_color", "contact_destination", "participant_type", "video_reachability", "alias", "is_spam", "is_spam_source", "cms_id", "latest_verification_status", "profile_photo_blob_id", "profile_photo_encryption_key", "directory_id", "is_check_constraint_enabled_via_phenotype", "is_valid_phone_number_data", "duplicate_of", "cms_life_cycle", "norm_ui_status", "last_modified_by_key", "name_source", "photo_source", "profile_photo_user_preference", "contact_metadata"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        String str = this.a;
        Instant instant = this.b;
        Long valueOf = Long.valueOf(this.c);
        String str2 = this.d;
        qwe qweVar = this.e;
        qwe qweVar2 = this.f;
        Integer valueOf2 = Integer.valueOf(this.g);
        Integer valueOf3 = Integer.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        String str7 = this.m;
        Long valueOf4 = Long.valueOf(this.n);
        String str8 = this.o;
        String str9 = this.p;
        String str10 = this.q;
        Uri uri = this.r;
        Uri uri2 = this.s;
        Long valueOf5 = Long.valueOf(this.t);
        String str11 = this.u;
        Integer valueOf6 = Integer.valueOf(this.v);
        Integer valueOf7 = Integer.valueOf(this.w);
        Integer valueOf8 = Integer.valueOf(this.x);
        Boolean valueOf9 = Boolean.valueOf(this.y);
        String str12 = this.z;
        Integer valueOf10 = Integer.valueOf(this.A);
        String str13 = this.B;
        Integer valueOf11 = Integer.valueOf(this.C);
        Integer valueOf12 = Integer.valueOf(this.D);
        String str14 = this.E;
        Boolean valueOf13 = Boolean.valueOf(this.F);
        Integer valueOf14 = Integer.valueOf(this.G);
        String str15 = this.H;
        tqr tqrVar = this.I;
        if (tqrVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqrVar.ordinal();
        }
        Integer valueOf15 = Integer.valueOf(ordinal);
        String str16 = this.J;
        Integer valueOf16 = Integer.valueOf(Arrays.hashCode(this.K));
        Long valueOf17 = Long.valueOf(this.L);
        Boolean valueOf18 = Boolean.valueOf(this.M);
        Boolean valueOf19 = Boolean.valueOf(this.N);
        String str17 = this.O;
        xxw xxwVar = this.P;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        return Objects.hash(adayVar, str, instant, valueOf, str2, qweVar, qweVar2, valueOf2, valueOf3, str3, str4, str5, str6, str7, valueOf4, str8, str9, str10, uri, uri2, valueOf5, str11, valueOf6, valueOf7, valueOf8, valueOf9, str12, valueOf10, str13, valueOf11, valueOf12, str14, valueOf13, valueOf14, str15, valueOf15, str16, valueOf16, valueOf17, valueOf18, valueOf19, str17, Integer.valueOf(ordinal2), this.Q, this.R, this.S, this.T, this.U, this.V, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "participants_audit_log";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        String uri2;
        Long l;
        String str;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        Object valueOf4;
        Object valueOf5;
        Object valueOf6;
        Long valueOf7 = Long.valueOf(uzz.k(this.b));
        Long valueOf8 = Long.valueOf(this.c);
        String str2 = this.d;
        String n = riw.n(this.e);
        Object obj = new swc(this, 18).get();
        Integer valueOf9 = Integer.valueOf(this.g);
        Integer valueOf10 = Integer.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        String str7 = this.m;
        Long valueOf11 = Long.valueOf(this.n);
        String str8 = this.o;
        String str9 = this.p;
        String str10 = this.q;
        Uri uri3 = this.r;
        byte[] bArr = null;
        if (uri3 == null) {
            uri = null;
        } else {
            uri = uri3.toString();
        }
        Uri uri4 = this.s;
        if (uri4 == null) {
            l = valueOf11;
            str = str8;
            uri2 = null;
        } else {
            uri2 = uri4.toString();
            l = valueOf11;
            str = str8;
        }
        Long valueOf12 = Long.valueOf(this.t);
        String str11 = this.u;
        Integer valueOf13 = Integer.valueOf(this.v);
        Integer valueOf14 = Integer.valueOf(this.w);
        Integer valueOf15 = Integer.valueOf(this.x);
        Integer valueOf16 = Integer.valueOf(this.y ? 1 : 0);
        String str12 = this.z;
        Integer valueOf17 = Integer.valueOf(this.A);
        String str13 = this.B;
        Integer valueOf18 = Integer.valueOf(this.C);
        Integer valueOf19 = Integer.valueOf(this.D);
        String str14 = this.E;
        Integer valueOf20 = Integer.valueOf(this.F ? 1 : 0);
        Integer valueOf21 = Integer.valueOf(this.G);
        String str15 = this.H;
        tqr tqrVar = this.I;
        if (tqrVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqrVar.ordinal());
        }
        Object obj2 = valueOf;
        String str16 = this.J;
        byte[] bArr2 = this.K;
        Long valueOf22 = Long.valueOf(this.L);
        Integer valueOf23 = Integer.valueOf(this.M ? 1 : 0);
        Integer valueOf24 = Integer.valueOf(this.N ? 1 : 0);
        String str17 = this.O;
        xxw xxwVar = this.P;
        if (xxwVar == null) {
            valueOf2 = 0;
        } else {
            valueOf2 = String.valueOf(xxwVar.ordinal());
        }
        Object obj3 = valueOf2;
        mta mtaVar = this.Q;
        if (mtaVar == null) {
            valueOf3 = 0;
        } else {
            valueOf3 = String.valueOf(mtaVar.a());
        }
        Object obj4 = valueOf3;
        String n2 = vcp.n(this.R);
        vox voxVar = this.S;
        if (voxVar == null) {
            valueOf4 = 0;
        } else {
            valueOf4 = String.valueOf(voxVar.a());
        }
        Object obj5 = valueOf4;
        vox voxVar2 = this.T;
        if (voxVar2 == null) {
            valueOf5 = 0;
        } else {
            valueOf5 = String.valueOf(voxVar2.a());
        }
        Object obj6 = valueOf5;
        vov vovVar = this.U;
        if (vovVar == null) {
            valueOf6 = 0;
        } else {
            valueOf6 = String.valueOf(vovVar.a());
        }
        Object obj7 = valueOf6;
        ndp ndpVar = this.V;
        if (ndpVar != null) {
            bArr = ndpVar.toByteArray();
        }
        Object[] objArr = {valueOf7, valueOf8, str2, n, obj, valueOf9, valueOf10, str3, str4, str5, str6, str7, l, str, str9, str10, uri, uri2, valueOf12, str11, valueOf13, valueOf14, valueOf15, valueOf16, str12, valueOf17, str13, valueOf18, valueOf19, str14, valueOf20, valueOf21, str15, obj2, str16, bArr2, valueOf22, valueOf23, valueOf24, str17, obj3, obj4, n2, obj5, obj6, obj7, bArr};
        sb.append('(');
        for (int i = 0; i < 47; i++) {
            Object obj8 = objArr[i];
            if (obj8 instanceof Number) {
                sb.append(String.valueOf(obj8));
            } else {
                if (obj8 instanceof String) {
                    String str18 = (String) obj8;
                    if (str18.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str18));
                    }
                }
                list.add(obj8);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ParticipantsAuditLogTable -- REDACTED");
        }
        return a();
    }
}
