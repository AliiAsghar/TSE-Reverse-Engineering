package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.aday;
import defpackage.aglo;
import defpackage.aglz;
import defpackage.agma;
import defpackage.agmq;
import defpackage.agnc;
import defpackage.agnw;
import defpackage.agpk;
import defpackage.agpo;
import defpackage.akec;
import defpackage.alob;
import defpackage.alok;
import defpackage.alor;
import defpackage.aozs;
import defpackage.apag;
import defpackage.mta;
import defpackage.ndp;
import defpackage.qwe;
import defpackage.riw;
import defpackage.rxg;
import defpackage.rxi;
import defpackage.sdr;
import defpackage.sho;
import defpackage.smq;
import defpackage.spl;
import defpackage.swc;
import defpackage.sym;
import defpackage.tap;
import defpackage.tar;
import defpackage.tas;
import defpackage.tav;
import defpackage.tay;
import defpackage.taz;
import defpackage.tbb;
import defpackage.tbd;
import defpackage.tbe;
import defpackage.tqr;
import defpackage.vcp;
import defpackage.vov;
import defpackage.vox;
import defpackage.xxw;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParticipantsTable extends aglo {
    public static final String[] a = {"participants._id", "participants.my_identity_token", "participants.my_identity_token_foreign_key", "participants.sub_id", "participants.sim_slot_id", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.comparable_destination", "participants.country_code", "participants.recipient_id", "participants.recipient_canonical_address", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.subscription_name", "participants.subscription_color", "participants.contact_destination", "participants.participant_type", "participants.video_reachability", "participants.alias", "participants.is_spam", "participants.is_spam_source", "participants.cms_id", "participants.latest_verification_status", "participants.profile_photo_blob_id", "participants.profile_photo_encryption_key", "participants.directory_id", "participants.is_check_constraint_enabled_via_phenotype", "participants.is_valid_phone_number_data", "participants.duplicate_of", "participants.cms_life_cycle", "participants.norm_ui_status", "participants.last_modified_by_key", "participants.name_source", "participants.photo_source", "participants.profile_photo_user_preference", "participants.contact_metadata"};
    public static final alor b;
    public static final tar c;
    public static final int[] d;
    public static final int[] e;

    static {
        alok alokVar = new alok();
        alokVar.h("participants.my_identity_token", 59930);
        alokVar.h("participants.my_identity_token_foreign_key", 60160);
        alokVar.h("participants.sim_slot_id", 2000);
        alokVar.h("participants.comparable_destination", 54040);
        alokVar.h("participants.country_code", 54040);
        alokVar.h("participants.recipient_id", 58090);
        alokVar.h("participants.recipient_canonical_address", 58090);
        alokVar.h("participants.contact_photo_uri", 59850);
        alokVar.h("participants.color_type", 1000);
        alokVar.h("participants.extended_color", 10027);
        alokVar.h("participants.subscription_name", 2000);
        alokVar.h("participants.subscription_color", 2000);
        alokVar.h("participants.contact_destination", 4000);
        alokVar.h("participants.participant_type", 12001);
        alokVar.h("participants.video_reachability", 13050);
        alokVar.h("participants.alias", 20060);
        alokVar.h("participants.is_spam", 24060);
        alokVar.h("participants.is_spam_source", 30000);
        alokVar.h("participants.cms_id", 31020);
        alokVar.h("participants.latest_verification_status", 31030);
        alokVar.h("participants.profile_photo_blob_id", 33000);
        alokVar.h("participants.profile_photo_encryption_key", 33060);
        alokVar.h("participants.directory_id", 35010);
        alokVar.h("participants.is_check_constraint_enabled_via_phenotype", 55010);
        alokVar.h("participants.is_valid_phone_number_data", 55010);
        alokVar.h("participants.duplicate_of", 58090);
        alokVar.h("participants.cms_life_cycle", 58210);
        alokVar.h("participants.norm_ui_status", 58620);
        alokVar.h("participants.last_modified_by_key", 59440);
        alokVar.h("participants.name_source", 59550);
        alokVar.h("participants.photo_source", 59550);
        alokVar.h("participants.profile_photo_user_preference", 60060);
        alokVar.h("participants.contact_metadata", 60070);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("my_identity_token", "index_participants_my_identity_token");
        alokVar2.h("my_identity_token_foreign_key", "index_participants_my_identity_token_foreign_key");
        alokVar2.h("sub_id", "index_participants_sub_id");
        alokVar2.h("comparable_destination", "index_participants_comparable_destination");
        alokVar2.h("recipient_id", "index_participants_recipient_id");
        alokVar2.h("blocked", "index_participants_blocked_is_one");
        alokVar2.h("cms_id", "index_participants_cms_id");
        alokVar2.h("latest_verification_status", "index_participants_latest_verification_status_is_not_zero");
        alokVar2.h("duplicate_of", "index_participants_duplicate_of");
        alokVar2.b();
        c = new tar();
        d = new int[]{1000, 2000, 4000, 10027, 12001, 13050, 20060, 24060, 29030, 30000, 31020, 31030, 33000, 33060, 35010, 54040, 55010, 58090, 58190, 58200, 58210, 58620, 59160, 59300, 59440, 59550, 59850, 59930, 60060, 60070, 60160};
        e = new int[]{57070};
    }

    public static BindData a(String str) {
        taz e2 = e();
        e2.w("participants.queryOnId");
        tbd tbdVar = new tbd();
        tbdVar.h(str);
        e2.f(tbdVar);
        return (BindData) agnc.b(e2.b());
    }

    public static BindData b(String str) {
        int i = sho.a;
        BindData a2 = a(str);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("row not found");
    }

    public static tap c() {
        int i = sym.a;
        return new tap();
    }

    public static tap d() {
        int i = sym.a;
        tap tapVar = new tap();
        tapVar.aD();
        return tapVar;
    }

    public static final taz e() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("participants._id");
            if (valueOf.intValue() >= 59930) {
                alobVar.h("participants.my_identity_token");
            }
            if (valueOf.intValue() >= 60160) {
                alobVar.h("participants.my_identity_token_foreign_key");
            }
            alobVar.h("participants.sub_id");
            if (valueOf.intValue() >= 2000) {
                alobVar.h("participants.sim_slot_id");
            }
            alobVar.h("participants.normalized_destination");
            alobVar.h("participants.send_destination");
            alobVar.h("participants.display_destination");
            if (valueOf.intValue() >= 54040) {
                alobVar.h("participants.comparable_destination");
            }
            if (valueOf.intValue() >= 54040) {
                alobVar.h("participants.country_code");
            }
            if (valueOf.intValue() >= 58090) {
                alobVar.h("participants.recipient_id");
            }
            if (valueOf.intValue() >= 58090) {
                alobVar.h("participants.recipient_canonical_address");
            }
            alobVar.h("participants.full_name");
            alobVar.h("participants.first_name");
            alobVar.h("participants.profile_photo_uri");
            if (valueOf.intValue() >= 59850) {
                alobVar.h("participants.contact_photo_uri");
            }
            alobVar.h("participants.contact_id");
            alobVar.h("participants.lookup_key");
            alobVar.h("participants.color_palette_index");
            if (valueOf.intValue() >= 1000) {
                alobVar.h("participants.color_type");
            }
            if (valueOf.intValue() >= 10027) {
                alobVar.h("participants.extended_color");
            }
            alobVar.h("participants.blocked");
            if (valueOf.intValue() >= 2000) {
                alobVar.h("participants.subscription_name");
            }
            if (valueOf.intValue() >= 2000) {
                alobVar.h("participants.subscription_color");
            }
            if (valueOf.intValue() >= 4000) {
                alobVar.h("participants.contact_destination");
            }
            if (valueOf.intValue() >= 12001) {
                alobVar.h("participants.participant_type");
            }
            if (valueOf.intValue() >= 13050) {
                alobVar.h("participants.video_reachability");
            }
            if (valueOf.intValue() >= 20060) {
                alobVar.h("participants.alias");
            }
            if (valueOf.intValue() >= 24060) {
                alobVar.h("participants.is_spam");
            }
            if (valueOf.intValue() >= 30000) {
                alobVar.h("participants.is_spam_source");
            }
            if (valueOf.intValue() >= 31020) {
                alobVar.h("participants.cms_id");
            }
            if (valueOf.intValue() >= 31030) {
                alobVar.h("participants.latest_verification_status");
            }
            if (valueOf.intValue() >= 33000) {
                alobVar.h("participants.profile_photo_blob_id");
            }
            if (valueOf.intValue() >= 33060) {
                alobVar.h("participants.profile_photo_encryption_key");
            }
            if (valueOf.intValue() >= 35010) {
                alobVar.h("participants.directory_id");
            }
            if (valueOf.intValue() >= 55010) {
                alobVar.h("participants.is_check_constraint_enabled_via_phenotype");
            }
            if (valueOf.intValue() >= 55010) {
                alobVar.h("participants.is_valid_phone_number_data");
            }
            if (valueOf.intValue() >= 58090) {
                alobVar.h("participants.duplicate_of");
            }
            if (valueOf.intValue() >= 58210) {
                alobVar.h("participants.cms_life_cycle");
            }
            if (valueOf.intValue() >= 58620) {
                alobVar.h("participants.norm_ui_status");
            }
            if (valueOf.intValue() >= 59440) {
                alobVar.h("participants.last_modified_by_key");
            }
            if (valueOf.intValue() >= 59550) {
                alobVar.h("participants.name_source");
            }
            if (valueOf.intValue() >= 59550) {
                alobVar.h("participants.photo_source");
            }
            if (valueOf.intValue() >= 60060) {
                alobVar.h("participants.profile_photo_user_preference");
            }
            if (valueOf.intValue() >= 60070) {
                alobVar.h("participants.contact_metadata");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new taz(strArr);
    }

    public static tbb f() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        tbb tbbVar = new tbb();
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() >= 59440) {
            rxg m = vcp.m();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue = valueOf2.intValue();
            valueOf3 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf3.intValue();
            if (intValue2 < 59440) {
                agnc.t("last_modified_by_key", intValue2);
            }
            if (intValue >= 59440) {
                tbbVar.a.put("last_modified_by_key", vcp.n(m));
            }
            tbbVar.e.c().c("last_modified_by_key");
        }
        return tbbVar;
    }

    public static Optional g(String str) {
        return Optional.ofNullable(a(str));
    }

    public static Object h(String str, Function function) {
        Object apply;
        BindData a2 = a(str);
        if (a2 == null) {
            return null;
        }
        apply = function.apply(a2);
        return apply;
    }

    public static String i(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (i >= 59930) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT DEFAULT(-2)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("comparable_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("country_code TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_id INTEGER");
        }
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_canonical_address TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("full_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_uri TEXT");
        if (i >= 59850) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_photo_uri TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_palette_index INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extended_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blocked INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("video_reachability INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("alias TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_rcs_available INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam_source INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_verification_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("directory_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_check_constraint_enabled_via_phenotype INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_valid_phone_number_data INT DEFAULT(1)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duplicate_of INTEGER REFERENCES participants(_id)  ");
        }
        if (i >= 58210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_life_cycle INT DEFAULT(0)");
        }
        if (i >= 58620) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("norm_ui_status INT DEFAULT(1)");
        }
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("name_source INT DEFAULT(1)");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("photo_source INT DEFAULT(1)");
        }
        if (i >= 60060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_photo_user_preference INT DEFAULT(1)");
        }
        if (i >= 60070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_metadata BLOB");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(normalized_destination,sub_id) ON CONFLICT FAIL");
        sb.append(", CHECK (" + new agpk("(NOT $R) OR (NOT $R) OR $R <> -2 OR ( $R IS NOT NULL AND $R IS NOT NULL AND $R IS NOT NULL  AND length($R) > 0 AND length($R) > 0 AND length($R) > 0 )", new Object[]{"is_valid_phone_number_data", "is_check_constraint_enabled_via_phenotype", "sub_id", "normalized_destination", "display_destination", "send_destination", "normalized_destination", "display_destination", "send_destination"}).ad(agpo.b()) + ")");
        sb.append(");");
        return sb.toString();
    }

    public static void j(agnw agnwVar, int i) {
        agnc.F(agnwVar, "participants", i(i, "TEMP___participants"), a, k(i));
    }

    public static String[] k(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_participants_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_comparable_destination");
            arrayList.add("CREATE UNIQUE INDEX index_participants_comparable_destination ON participants(comparable_destination);");
        }
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_recipient_id");
            arrayList.add("CREATE UNIQUE INDEX index_participants_recipient_id ON participants(recipient_id);");
        }
        if (i >= 58190) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_latest_verification_status_is_not_zero");
            arrayList.add("CREATE INDEX index_participants_latest_verification_status_is_not_zero ON participants(latest_verification_status) WHERE latest_verification_status <> 0;");
        }
        if (i >= 58200) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_blocked_is_one");
            arrayList.add("CREATE INDEX index_participants_blocked_is_one ON participants(blocked) WHERE blocked = 1;");
        }
        if (i >= 59160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_duplicate_of");
            arrayList.add("CREATE INDEX index_participants_duplicate_of ON participants(duplicate_of) WHERE duplicate_of NOT NULL;");
        }
        if (i >= 59300) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_sub_id");
            arrayList.add("CREATE INDEX index_participants_sub_id ON participants(sub_id);");
        }
        if (i >= 59930) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_my_identity_token");
            arrayList.add("CREATE INDEX index_participants_my_identity_token ON participants(my_identity_token);");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_my_identity_token_foreign_key");
            arrayList.add("CREATE INDEX index_participants_my_identity_token_foreign_key ON participants(my_identity_token_foreign_key);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static abstract class BindData extends aglz<tav, tay, taz, BindData, tas> implements Parcelable, agma {
        public static final Parcelable.Creator<BindData> CREATOR = new sdr(5);
        public String B;
        public String E;
        public String G;
        public byte[] H;
        public String L;
        public vox P;
        public vox Q;
        public vov R;
        public ndp S;
        public String a;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public long k;
        public String l;
        public String m;
        public String n;
        public Uri o;
        public Uri p;
        public String r;
        public String w;
        public String y;
        public qwe b = null;
        public qwe c = null;
        public int d = -2;
        public int e = -1;
        public long q = -1;
        public int s = -1;
        public int t = 0;
        public int u = 0;
        public boolean v = false;
        public int x = 0;
        public int z = 0;
        public int A = 0;
        public boolean C = false;
        public int D = 0;
        public tqr F = tqr.VERIFICATION_NA;
        public long I = -1;
        public boolean J = riw.j();
        public boolean K = true;
        public xxw M = xxw.UNKNOWN;
        public mta N = mta.NOT_MODIFIED;
        public rxg O = rxi.a();

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData() {
            vox voxVar = vox.PROFILE_CONTACT_SOURCE;
            this.P = voxVar;
            this.Q = voxVar;
            this.R = vov.PREFER_PROFILE_PHOTO;
        }

        public final tqr A() {
            ao(31, "latest_verification_status");
            return this.F;
        }

        public final vox B() {
            ao(41, "name_source");
            return this.P;
        }

        public final vox C() {
            ao(42, "photo_source");
            return this.Q;
        }

        @Deprecated
        public final Long D() {
            agnw d;
            agnw d2;
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            return Long.valueOf(agnc.a(d2, "participants", this, new tbe(d, 1), new smq(this, 15)));
        }

        public final Long E() {
            agnw d;
            agnw d2;
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            return Long.valueOf(agnc.a(d2, "participants", this, new spl(d, 20), new smq(this, 16)));
        }

        public final String F() {
            ao(27, "alias");
            return this.B;
        }

        public final String G() {
            ao(8, "comparable_destination");
            return this.i;
        }

        public final String H() {
            ao(24, "contact_destination");
            return this.y;
        }

        public final String I() {
            ao(9, "country_code");
            return this.j;
        }

        public final String J() {
            ao(7, "display_destination");
            return this.h;
        }

        public final String K() {
            ao(13, "first_name");
            return this.n;
        }

        public final String L() {
            ao(12, "full_name");
            return this.m;
        }

        public final String M() {
            ao(0, "_id");
            return this.a;
        }

        public final String N() {
            ao(17, "lookup_key");
            return this.r;
        }

        public final String O() {
            ao(5, "normalized_destination");
            return this.f;
        }

        public final String P() {
            ao(6, "send_destination");
            return this.g;
        }

        public final String Q() {
            ao(22, "subscription_name");
            return this.w;
        }

        public final boolean R() {
            ao(21, "blocked");
            return this.v;
        }

        public final boolean S() {
            ao(35, "is_check_constraint_enabled_via_phenotype");
            return this.J;
        }

        public final boolean T() {
            ao(28, "is_spam");
            return this.C;
        }

        public final boolean U() {
            ao(36, "is_valid_phone_number_data");
            return this.K;
        }

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
            byte[] bArr = this.H;
            if (bArr != null) {
                str = String.valueOf(bArr.length);
            } else {
                str = "NULL";
            }
            return String.format(locale, "ParticipantsTable [_id: %s,\n  my_identity_token: %s,\n  my_identity_token_foreign_key: %s,\n  sub_id: %s,\n  sim_slot_id: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  comparable_destination: %s,\n  country_code: %s,\n  recipient_id: %s,\n  recipient_canonical_address: %s,\n  full_name: %s,\n  first_name: %s,\n  profile_photo_uri: %s,\n  contact_photo_uri: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  blocked: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  contact_destination: %s,\n  participant_type: %s,\n  video_reachability: %s,\n  alias: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  cms_id: %s,\n  latest_verification_status: %s,\n  profile_photo_blob_id: %s,\n  profile_photo_encryption_key: %s,\n  directory_id: %s,\n  is_check_constraint_enabled_via_phenotype: %s,\n  is_valid_phone_number_data: %s,\n  duplicate_of: %s,\n  cms_life_cycle: %s,\n  norm_ui_status: %s,\n  last_modified_by_key: %s,\n  name_source: %s,\n  photo_source: %s,\n  profile_photo_user_preference: %s,\n  contact_metadata: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, "BLOB".concat(String.valueOf(str)), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S));
        }

        @Override // defpackage.aglz
        public final void b(ContentValues contentValues) {
            Integer valueOf;
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            if (intValue >= 59930) {
                qwe qweVar = this.b;
                if (qweVar == null) {
                    contentValues.putNull("my_identity_token");
                } else {
                    contentValues.put("my_identity_token", riw.n(qweVar));
                }
            }
            if (intValue >= 60160) {
                qwe qweVar2 = this.c;
                if (qweVar2 != null && !qweVar2.equals(null)) {
                    contentValues.put("my_identity_token_foreign_key", riw.n(this.c));
                } else {
                    contentValues.putNull("my_identity_token_foreign_key");
                }
            }
            contentValues.put("sub_id", Integer.valueOf(this.d));
            if (intValue >= 2000) {
                contentValues.put("sim_slot_id", Integer.valueOf(this.e));
            }
            agnc.r(contentValues, "normalized_destination", this.f);
            agnc.r(contentValues, "send_destination", this.g);
            agnc.r(contentValues, "display_destination", this.h);
            if (intValue >= 54040) {
                agnc.r(contentValues, "comparable_destination", this.i);
            }
            if (intValue >= 54040) {
                agnc.r(contentValues, "country_code", this.j);
            }
            if (intValue >= 58090) {
                agnc.q(contentValues, "recipient_id", this.k);
            }
            if (intValue >= 58090) {
                agnc.r(contentValues, "recipient_canonical_address", this.l);
            }
            agnc.r(contentValues, "full_name", this.m);
            agnc.r(contentValues, "first_name", this.n);
            Uri uri = this.o;
            if (uri == null) {
                contentValues.putNull("profile_photo_uri");
            } else {
                contentValues.put("profile_photo_uri", uri.toString());
            }
            if (intValue >= 59850) {
                Uri uri2 = this.p;
                if (uri2 == null) {
                    contentValues.putNull("contact_photo_uri");
                } else {
                    contentValues.put("contact_photo_uri", uri2.toString());
                }
            }
            contentValues.put("contact_id", Long.valueOf(this.q));
            agnc.r(contentValues, "lookup_key", this.r);
            contentValues.put("color_palette_index", Integer.valueOf(this.s));
            if (intValue >= 1000) {
                contentValues.put("color_type", Integer.valueOf(this.t));
            }
            if (intValue >= 10027) {
                contentValues.put("extended_color", Integer.valueOf(this.u));
            }
            contentValues.put("blocked", Boolean.valueOf(this.v));
            if (intValue >= 2000) {
                agnc.r(contentValues, "subscription_name", this.w);
            }
            if (intValue >= 2000) {
                contentValues.put("subscription_color", Integer.valueOf(this.x));
            }
            if (intValue >= 4000) {
                agnc.r(contentValues, "contact_destination", this.y);
            }
            if (intValue >= 12001) {
                contentValues.put("participant_type", Integer.valueOf(this.z));
            }
            if (intValue >= 13050) {
                contentValues.put("video_reachability", Integer.valueOf(this.A));
            }
            if (intValue >= 20060) {
                agnc.r(contentValues, "alias", this.B);
            }
            if (intValue >= 24060) {
                contentValues.put("is_spam", Boolean.valueOf(this.C));
            }
            if (intValue >= 30000) {
                contentValues.put("is_spam_source", Integer.valueOf(this.D));
            }
            if (intValue >= 31020) {
                agnc.r(contentValues, "cms_id", this.E);
            }
            if (intValue >= 31030) {
                tqr tqrVar = this.F;
                if (tqrVar == null) {
                    contentValues.putNull("latest_verification_status");
                } else {
                    contentValues.put("latest_verification_status", Integer.valueOf(tqrVar.ordinal()));
                }
            }
            if (intValue >= 33000) {
                agnc.r(contentValues, "profile_photo_blob_id", this.G);
            }
            if (intValue >= 33060) {
                contentValues.put("profile_photo_encryption_key", this.H);
            }
            if (intValue >= 35010) {
                contentValues.put("directory_id", Long.valueOf(this.I));
            }
            if (intValue >= 55010) {
                contentValues.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(this.J));
            }
            if (intValue >= 55010) {
                contentValues.put("is_valid_phone_number_data", Boolean.valueOf(this.K));
            }
            if (intValue >= 58090) {
                agnc.r(contentValues, "duplicate_of", this.L);
            }
            if (intValue >= 58210) {
                xxw xxwVar = this.M;
                if (xxwVar == null) {
                    contentValues.putNull("cms_life_cycle");
                } else {
                    contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
                }
            }
            if (intValue >= 58620) {
                mta mtaVar = this.N;
                if (mtaVar == null) {
                    contentValues.putNull("norm_ui_status");
                } else {
                    contentValues.put("norm_ui_status", Integer.valueOf(mtaVar.a()));
                }
            }
            if (intValue >= 59440) {
                rxg rxgVar = this.O;
                if (rxgVar == null) {
                    contentValues.putNull("last_modified_by_key");
                } else {
                    contentValues.put("last_modified_by_key", vcp.n(rxgVar));
                }
            }
            if (intValue >= 59550) {
                vox voxVar = this.P;
                if (voxVar == null) {
                    contentValues.putNull("name_source");
                } else {
                    contentValues.put("name_source", Integer.valueOf(voxVar.a()));
                }
            }
            if (intValue >= 59550) {
                vox voxVar2 = this.Q;
                if (voxVar2 == null) {
                    contentValues.putNull("photo_source");
                } else {
                    contentValues.put("photo_source", Integer.valueOf(voxVar2.a()));
                }
            }
            if (intValue >= 60060) {
                vov vovVar = this.R;
                if (vovVar == null) {
                    contentValues.putNull("profile_photo_user_preference");
                } else {
                    contentValues.put("profile_photo_user_preference", Integer.valueOf(vovVar.a()));
                }
            }
            if (intValue >= 60070) {
                ndp ndpVar = this.S;
                if (ndpVar == null) {
                    contentValues.putNull("contact_metadata");
                } else {
                    contentValues.put("contact_metadata", ndpVar.toByteArray());
                }
            }
        }

        @Override // defpackage.aglz
        public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
            tav tavVar = (tav) agmqVar;
            aq();
            this.cJ = tavVar.dx();
            if (tavVar.db(0)) {
                this.a = tavVar.K();
                fE(0);
            }
            if (tavVar.db(1)) {
                this.b = tavVar.t();
                fE(1);
            }
            if (tavVar.db(2)) {
                this.c = tavVar.u();
                fE(2);
            }
            if (tavVar.db(3)) {
                this.d = tavVar.j();
                fE(3);
            }
            if (tavVar.db(4)) {
                this.e = tavVar.i();
                fE(4);
            }
            if (tavVar.db(5)) {
                this.f = tavVar.M();
                fE(5);
            }
            if (tavVar.db(6)) {
                this.g = tavVar.P();
                fE(6);
            }
            if (tavVar.db(7)) {
                this.h = tavVar.G();
                fE(7);
            }
            if (tavVar.db(8)) {
                this.i = tavVar.D();
                fE(8);
            }
            if (tavVar.db(9)) {
                this.j = tavVar.F();
                fE(9);
            }
            if (tavVar.db(10)) {
                this.k = tavVar.o();
                fE(10);
            }
            if (tavVar.db(11)) {
                this.l = tavVar.O();
                fE(11);
            }
            if (tavVar.db(12)) {
                this.m = tavVar.J();
                fE(12);
            }
            if (tavVar.db(13)) {
                this.n = tavVar.I();
                fE(13);
            }
            if (tavVar.db(14)) {
                this.o = tavVar.q();
                fE(14);
            }
            if (tavVar.db(15)) {
                this.p = tavVar.p();
                fE(15);
            }
            if (tavVar.db(16)) {
                this.q = tavVar.m();
                fE(16);
            }
            if (tavVar.db(17)) {
                this.r = tavVar.L();
                fE(17);
            }
            if (tavVar.db(18)) {
                this.s = tavVar.c();
                fE(18);
            }
            if (tavVar.db(19)) {
                this.t = tavVar.e();
                fE(19);
            }
            if (tavVar.db(20)) {
                this.u = tavVar.f();
                fE(20);
            }
            if (tavVar.db(21)) {
                this.v = tavVar.R();
                fE(21);
            }
            if (tavVar.db(22)) {
                this.w = tavVar.Q();
                fE(22);
            }
            if (tavVar.db(23)) {
                this.x = tavVar.k();
                fE(23);
            }
            if (tavVar.db(24)) {
                this.y = tavVar.E();
                fE(24);
            }
            if (tavVar.db(25)) {
                this.z = tavVar.h();
                fE(25);
            }
            if (tavVar.db(26)) {
                this.A = tavVar.l();
                fE(26);
            }
            if (tavVar.db(27)) {
                this.B = tavVar.B();
                fE(27);
            }
            if (tavVar.db(28)) {
                this.C = tavVar.T();
                fE(28);
            }
            if (tavVar.db(29)) {
                this.D = tavVar.g();
                fE(29);
            }
            if (tavVar.db(30)) {
                this.E = tavVar.C();
                fE(30);
            }
            if (tavVar.db(31)) {
                this.F = tavVar.w();
                fE(31);
            }
            if (tavVar.db(32)) {
                this.G = tavVar.N();
                fE(32);
            }
            if (tavVar.db(33)) {
                this.H = tavVar.V();
                fE(33);
            }
            if (tavVar.db(34)) {
                this.I = tavVar.n();
                fE(34);
            }
            if (tavVar.db(35)) {
                this.J = tavVar.S();
                fE(35);
            }
            if (tavVar.db(36)) {
                this.K = tavVar.U();
                fE(36);
            }
            if (tavVar.db(37)) {
                this.L = tavVar.H();
                fE(37);
            }
            if (tavVar.db(38)) {
                this.M = tavVar.A();
                fE(38);
            }
            if (tavVar.db(39)) {
                this.N = tavVar.r();
                fE(39);
            }
            if (tavVar.db(40)) {
                this.O = tavVar.v();
                fE(40);
            }
            if (tavVar.db(41)) {
                this.P = tavVar.y();
                fE(41);
            }
            if (tavVar.db(42)) {
                this.Q = tavVar.z();
                fE(42);
            }
            if (tavVar.db(43)) {
                this.R = tavVar.x();
                fE(43);
            }
            if (tavVar.db(44)) {
                this.S = tavVar.s();
                fE(44);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            if (super.aC(bindData.cJ) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && this.d == bindData.d && this.e == bindData.e && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && Objects.equals(this.r, bindData.r) && this.s == bindData.s && this.t == bindData.t && this.u == bindData.u && this.v == bindData.v && Objects.equals(this.w, bindData.w) && this.x == bindData.x && Objects.equals(this.y, bindData.y) && this.z == bindData.z && this.A == bindData.A && Objects.equals(this.B, bindData.B) && this.C == bindData.C && this.D == bindData.D && Objects.equals(this.E, bindData.E) && this.F == bindData.F && Objects.equals(this.G, bindData.G) && Arrays.equals(this.H, bindData.H) && this.I == bindData.I && this.J == bindData.J && this.K == bindData.K && Objects.equals(this.L, bindData.L) && this.M == bindData.M && this.N == bindData.N && Objects.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && this.R == bindData.R && Objects.equals(this.S, bindData.S)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.agma
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants", agnc.j(new String[]{"my_identity_token", "my_identity_token_foreign_key", "sub_id", "sim_slot_id", "normalized_destination", "send_destination", "display_destination", "comparable_destination", "country_code", "recipient_id", "recipient_canonical_address", "full_name", "first_name", "profile_photo_uri", "contact_photo_uri", "contact_id", "lookup_key", "color_palette_index", "color_type", "extended_color", "blocked", "subscription_name", "subscription_color", "contact_destination", "participant_type", "video_reachability", "alias", "is_spam", "is_spam_source", "cms_id", "latest_verification_status", "profile_photo_blob_id", "profile_photo_encryption_key", "directory_id", "is_check_constraint_enabled_via_phenotype", "is_valid_phone_number_data", "duplicate_of", "cms_life_cycle", "norm_ui_status", "last_modified_by_key", "name_source", "photo_source", "profile_photo_user_preference", "contact_metadata"}));
        }

        @Override // defpackage.aglz
        protected final void fo(Parcel parcel) {
            Uri parse;
            Uri parse2;
            boolean z;
            boolean z2;
            boolean z3;
            ndp ndpVar;
            this.a = parcel.readString();
            this.b = riw.m(parcel.readString());
            this.c = riw.m(parcel.readString());
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readLong();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            String readString = parcel.readString();
            if (readString == null) {
                parse = null;
            } else {
                parse = Uri.parse(readString);
            }
            this.o = parse;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(readString2);
            }
            this.p = parse2;
            this.q = parcel.readLong();
            this.r = parcel.readString();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            boolean z4 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.v = z;
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readString();
            this.z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readString();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.C = z2;
            this.D = parcel.readInt();
            this.E = parcel.readString();
            tqr[] values = tqr.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt < values.length) {
                    this.F = values[readInt];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.G = parcel.readString();
            this.H = parcel.createByteArray();
            this.I = parcel.readLong();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.J = z3;
            if (parcel.readInt() == 1) {
                z4 = true;
            }
            this.K = z4;
            this.L = parcel.readString();
            xxw[] values2 = xxw.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 < values2.length) {
                    this.M = values2[readInt2];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.N = mta.b(parcel.readInt());
            this.O = vcp.l(parcel.readString());
            this.P = vox.b(parcel.readInt());
            this.Q = vox.b(parcel.readInt());
            this.R = vov.b(parcel.readInt());
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                ndpVar = null;
            } else {
                try {
                    ndpVar = (ndp) apag.parseFrom(ndp.a, createByteArray, aozs.a());
                } catch (Throwable unused) {
                    this.S = null;
                    return;
                }
            }
            this.S = ndpVar;
        }

        @Override // defpackage.aglz
        protected final void fp(Parcel parcel) {
            String uri;
            String uri2;
            int ordinal;
            int ordinal2;
            int a;
            int a2;
            int a3;
            parcel.writeString(this.a);
            parcel.writeString(riw.n(this.b));
            parcel.writeString(riw.n(this.c));
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeLong(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            Uri uri3 = this.o;
            byte[] bArr = null;
            if (uri3 == null) {
                uri = null;
            } else {
                uri = uri3.toString();
            }
            parcel.writeString(uri);
            Uri uri4 = this.p;
            if (uri4 == null) {
                uri2 = null;
            } else {
                uri2 = uri4.toString();
            }
            parcel.writeString(uri2);
            parcel.writeLong(this.q);
            parcel.writeString(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeString(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeString(this.B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D);
            parcel.writeString(this.E);
            tqr tqrVar = this.F;
            int i = -1;
            if (tqrVar == null) {
                ordinal = -1;
            } else {
                ordinal = tqrVar.ordinal();
            }
            parcel.writeInt(ordinal);
            parcel.writeString(this.G);
            parcel.writeByteArray(this.H);
            parcel.writeLong(this.I);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeString(this.L);
            xxw xxwVar = this.M;
            if (xxwVar == null) {
                ordinal2 = -1;
            } else {
                ordinal2 = xxwVar.ordinal();
            }
            parcel.writeInt(ordinal2);
            mta mtaVar = this.N;
            if (mtaVar == null) {
                a = -1;
            } else {
                a = mtaVar.a();
            }
            parcel.writeInt(a);
            parcel.writeString(vcp.n(this.O));
            vox voxVar = this.P;
            if (voxVar == null) {
                a2 = -1;
            } else {
                a2 = voxVar.a();
            }
            parcel.writeInt(a2);
            vox voxVar2 = this.Q;
            if (voxVar2 == null) {
                a3 = -1;
            } else {
                a3 = voxVar2.a();
            }
            parcel.writeInt(a3);
            vov vovVar = this.R;
            if (vovVar != null) {
                i = vovVar.a();
            }
            parcel.writeInt(i);
            ndp ndpVar = this.S;
            if (ndpVar != null) {
                bArr = ndpVar.toByteArray();
            }
            parcel.writeByteArray(bArr);
        }

        @Override // defpackage.agma
        public final String g() {
            return "_id";
        }

        public final int h() {
            ao(18, "color_palette_index");
            return this.s;
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
            qwe qweVar = this.b;
            qwe qweVar2 = this.c;
            Integer valueOf = Integer.valueOf(this.d);
            Integer valueOf2 = Integer.valueOf(this.e);
            String str2 = this.f;
            String str3 = this.g;
            String str4 = this.h;
            String str5 = this.i;
            String str6 = this.j;
            Long valueOf3 = Long.valueOf(this.k);
            String str7 = this.l;
            String str8 = this.m;
            String str9 = this.n;
            Uri uri = this.o;
            Uri uri2 = this.p;
            Long valueOf4 = Long.valueOf(this.q);
            String str10 = this.r;
            Integer valueOf5 = Integer.valueOf(this.s);
            Integer valueOf6 = Integer.valueOf(this.t);
            Integer valueOf7 = Integer.valueOf(this.u);
            Boolean valueOf8 = Boolean.valueOf(this.v);
            String str11 = this.w;
            Integer valueOf9 = Integer.valueOf(this.x);
            String str12 = this.y;
            Integer valueOf10 = Integer.valueOf(this.z);
            Integer valueOf11 = Integer.valueOf(this.A);
            String str13 = this.B;
            Boolean valueOf12 = Boolean.valueOf(this.C);
            Integer valueOf13 = Integer.valueOf(this.D);
            String str14 = this.E;
            tqr tqrVar = this.F;
            if (tqrVar == null) {
                ordinal = 0;
            } else {
                ordinal = tqrVar.ordinal();
            }
            Integer valueOf14 = Integer.valueOf(ordinal);
            String str15 = this.G;
            Integer valueOf15 = Integer.valueOf(Arrays.hashCode(this.H));
            Long valueOf16 = Long.valueOf(this.I);
            Boolean valueOf17 = Boolean.valueOf(this.J);
            Boolean valueOf18 = Boolean.valueOf(this.K);
            String str16 = this.L;
            xxw xxwVar = this.M;
            if (xxwVar == null) {
                ordinal2 = 0;
            } else {
                ordinal2 = xxwVar.ordinal();
            }
            return Objects.hash(adayVar, str, qweVar, qweVar2, valueOf, valueOf2, str2, str3, str4, str5, str6, valueOf3, str7, str8, str9, uri, uri2, valueOf4, str10, valueOf5, valueOf6, valueOf7, valueOf8, str11, valueOf9, str12, valueOf10, valueOf11, str13, valueOf12, valueOf13, str14, valueOf14, str15, valueOf15, valueOf16, valueOf17, valueOf18, str16, Integer.valueOf(ordinal2), this.N, this.O, this.P, this.Q, this.R, this.S, null);
        }

        @Override // defpackage.agma
        public final String i() {
            return "participants";
        }

        @Override // defpackage.agma
        public final void j(StringBuilder sb, List list) {
            String uri;
            String uri2;
            String str;
            String str2;
            Object valueOf;
            Object valueOf2;
            Object valueOf3;
            Object valueOf4;
            Object valueOf5;
            Object valueOf6;
            String n = riw.n(this.b);
            Object obj = new swc(this, 19).get();
            Integer valueOf7 = Integer.valueOf(this.d);
            Integer valueOf8 = Integer.valueOf(this.e);
            String str3 = this.f;
            String str4 = this.g;
            String str5 = this.h;
            String str6 = this.i;
            String str7 = this.j;
            Long valueOf9 = Long.valueOf(this.k);
            String str8 = this.l;
            String str9 = this.m;
            String str10 = this.n;
            Uri uri3 = this.o;
            byte[] bArr = null;
            if (uri3 == null) {
                uri = null;
            } else {
                uri = uri3.toString();
            }
            Uri uri4 = this.p;
            if (uri4 == null) {
                str = str9;
                str2 = str10;
                uri2 = null;
            } else {
                uri2 = uri4.toString();
                str = str9;
                str2 = str10;
            }
            Long valueOf10 = Long.valueOf(this.q);
            String str11 = this.r;
            Integer valueOf11 = Integer.valueOf(this.s);
            Integer valueOf12 = Integer.valueOf(this.t);
            Integer valueOf13 = Integer.valueOf(this.u);
            Integer valueOf14 = Integer.valueOf(this.v ? 1 : 0);
            String str12 = this.w;
            Integer valueOf15 = Integer.valueOf(this.x);
            String str13 = this.y;
            Integer valueOf16 = Integer.valueOf(this.z);
            Integer valueOf17 = Integer.valueOf(this.A);
            String str14 = this.B;
            Integer valueOf18 = Integer.valueOf(this.C ? 1 : 0);
            Integer valueOf19 = Integer.valueOf(this.D);
            String str15 = this.E;
            tqr tqrVar = this.F;
            if (tqrVar == null) {
                valueOf = 0;
            } else {
                valueOf = String.valueOf(tqrVar.ordinal());
            }
            Object obj2 = valueOf;
            String str16 = this.G;
            byte[] bArr2 = this.H;
            Long valueOf20 = Long.valueOf(this.I);
            Integer valueOf21 = Integer.valueOf(this.J ? 1 : 0);
            Integer valueOf22 = Integer.valueOf(this.K ? 1 : 0);
            String str17 = this.L;
            xxw xxwVar = this.M;
            if (xxwVar == null) {
                valueOf2 = 0;
            } else {
                valueOf2 = String.valueOf(xxwVar.ordinal());
            }
            Object obj3 = valueOf2;
            mta mtaVar = this.N;
            if (mtaVar == null) {
                valueOf3 = 0;
            } else {
                valueOf3 = String.valueOf(mtaVar.a());
            }
            Object obj4 = valueOf3;
            String n2 = vcp.n(this.O);
            vox voxVar = this.P;
            if (voxVar == null) {
                valueOf4 = 0;
            } else {
                valueOf4 = String.valueOf(voxVar.a());
            }
            Object obj5 = valueOf4;
            vox voxVar2 = this.Q;
            if (voxVar2 == null) {
                valueOf5 = 0;
            } else {
                valueOf5 = String.valueOf(voxVar2.a());
            }
            Object obj6 = valueOf5;
            vov vovVar = this.R;
            if (vovVar == null) {
                valueOf6 = 0;
            } else {
                valueOf6 = String.valueOf(vovVar.a());
            }
            Object obj7 = valueOf6;
            ndp ndpVar = this.S;
            if (ndpVar != null) {
                bArr = ndpVar.toByteArray();
            }
            Object[] objArr = {n, obj, valueOf7, valueOf8, str3, str4, str5, str6, str7, valueOf9, str8, str, str2, uri, uri2, valueOf10, str11, valueOf11, valueOf12, valueOf13, valueOf14, str12, valueOf15, str13, valueOf16, valueOf17, str14, valueOf18, valueOf19, str15, obj2, str16, bArr2, valueOf20, valueOf21, valueOf22, str17, obj3, obj4, n2, obj5, obj6, obj7, bArr};
            sb.append('(');
            for (int i = 0; i < 44; i++) {
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

        public final int k() {
            ao(19, "color_type");
            return this.t;
        }

        public final int l() {
            ao(20, "extended_color");
            return this.u;
        }

        public final int m() {
            ao(29, "is_spam_source");
            return this.D;
        }

        public final int n() {
            ao(25, "participant_type");
            return this.z;
        }

        public final int o() {
            ao(4, "sim_slot_id");
            return this.e;
        }

        public final int p() {
            ao(3, "sub_id");
            return this.d;
        }

        public final int q() {
            ao(23, "subscription_color");
            return this.x;
        }

        public final int r() {
            ao(26, "video_reachability");
            return this.A;
        }

        public final long s() {
            ao(16, "contact_id");
            return this.q;
        }

        public final long t() {
            ao(34, "directory_id");
            return this.I;
        }

        public final String toString() {
            if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
                return String.format(Locale.US, "%s", "ParticipantsTable -- REDACTED");
            }
            return a();
        }

        public final Uri u() {
            ao(15, "contact_photo_uri");
            return this.p;
        }

        public final Uri v() {
            ao(14, "profile_photo_uri");
            return this.o;
        }

        public final mta w() {
            ao(39, "norm_ui_status");
            return this.N;
        }

        public final ndp x() {
            ao(44, "contact_metadata");
            return this.S;
        }

        public final qwe y() {
            ao(1, "my_identity_token");
            return this.b;
        }

        public final tap z() {
            BitSet bitSet;
            int i = sym.a;
            tap tapVar = new tap();
            BitSet bitSet2 = this.cE;
            if (bitSet2 == null) {
                bitSet = null;
            } else {
                bitSet = (BitSet) bitSet2.clone();
            }
            tapVar.ax = bitSet;
            BitSet bitSet3 = tapVar.ax;
            if (bitSet3 == null || bitSet3.get(0)) {
                tapVar.a = M();
            }
            BitSet bitSet4 = tapVar.ax;
            if (bitSet4 == null || bitSet4.get(1)) {
                tapVar.b = y();
            }
            BitSet bitSet5 = tapVar.ax;
            if (bitSet5 == null || bitSet5.get(2)) {
                ao(2, "my_identity_token_foreign_key");
                tapVar.c = this.c;
            }
            BitSet bitSet6 = tapVar.ax;
            if (bitSet6 == null || bitSet6.get(3)) {
                tapVar.d = p();
            }
            BitSet bitSet7 = tapVar.ax;
            if (bitSet7 == null || bitSet7.get(4)) {
                tapVar.e = o();
            }
            BitSet bitSet8 = tapVar.ax;
            if (bitSet8 == null || bitSet8.get(5)) {
                tapVar.f = O();
            }
            BitSet bitSet9 = tapVar.ax;
            if (bitSet9 == null || bitSet9.get(6)) {
                tapVar.g = P();
            }
            BitSet bitSet10 = tapVar.ax;
            if (bitSet10 == null || bitSet10.get(7)) {
                tapVar.h = J();
            }
            BitSet bitSet11 = tapVar.ax;
            if (bitSet11 == null || bitSet11.get(8)) {
                tapVar.i = G();
            }
            BitSet bitSet12 = tapVar.ax;
            if (bitSet12 == null || bitSet12.get(9)) {
                tapVar.j = I();
            }
            BitSet bitSet13 = tapVar.ax;
            if (bitSet13 == null || bitSet13.get(10)) {
                ao(10, "recipient_id");
                tapVar.k = this.k;
            }
            BitSet bitSet14 = tapVar.ax;
            if (bitSet14 == null || bitSet14.get(11)) {
                ao(11, "recipient_canonical_address");
                tapVar.l = this.l;
            }
            BitSet bitSet15 = tapVar.ax;
            if (bitSet15 == null || bitSet15.get(12)) {
                tapVar.m = L();
            }
            BitSet bitSet16 = tapVar.ax;
            if (bitSet16 == null || bitSet16.get(13)) {
                tapVar.n = K();
            }
            BitSet bitSet17 = tapVar.ax;
            if (bitSet17 == null || bitSet17.get(14)) {
                tapVar.o = v();
            }
            BitSet bitSet18 = tapVar.ax;
            if (bitSet18 == null || bitSet18.get(15)) {
                tapVar.p = u();
            }
            BitSet bitSet19 = tapVar.ax;
            if (bitSet19 == null || bitSet19.get(16)) {
                tapVar.q = s();
            }
            BitSet bitSet20 = tapVar.ax;
            if (bitSet20 == null || bitSet20.get(17)) {
                tapVar.r = N();
            }
            BitSet bitSet21 = tapVar.ax;
            if (bitSet21 == null || bitSet21.get(18)) {
                tapVar.s = h();
            }
            BitSet bitSet22 = tapVar.ax;
            if (bitSet22 == null || bitSet22.get(19)) {
                tapVar.t = k();
            }
            BitSet bitSet23 = tapVar.ax;
            if (bitSet23 == null || bitSet23.get(20)) {
                tapVar.u = l();
            }
            BitSet bitSet24 = tapVar.ax;
            if (bitSet24 == null || bitSet24.get(21)) {
                tapVar.v = R();
            }
            BitSet bitSet25 = tapVar.ax;
            if (bitSet25 == null || bitSet25.get(22)) {
                tapVar.w = Q();
            }
            BitSet bitSet26 = tapVar.ax;
            if (bitSet26 == null || bitSet26.get(23)) {
                tapVar.x = q();
            }
            BitSet bitSet27 = tapVar.ax;
            if (bitSet27 == null || bitSet27.get(24)) {
                tapVar.y = H();
            }
            BitSet bitSet28 = tapVar.ax;
            if (bitSet28 == null || bitSet28.get(25)) {
                tapVar.z = n();
            }
            BitSet bitSet29 = tapVar.ax;
            if (bitSet29 == null || bitSet29.get(26)) {
                tapVar.A = r();
            }
            BitSet bitSet30 = tapVar.ax;
            if (bitSet30 == null || bitSet30.get(27)) {
                tapVar.B = F();
            }
            BitSet bitSet31 = tapVar.ax;
            if (bitSet31 == null || bitSet31.get(28)) {
                tapVar.C = T();
            }
            BitSet bitSet32 = tapVar.ax;
            if (bitSet32 == null || bitSet32.get(29)) {
                tapVar.D = m();
            }
            BitSet bitSet33 = tapVar.ax;
            if (bitSet33 == null || bitSet33.get(30)) {
                ao(30, "cms_id");
                tapVar.E = this.E;
            }
            BitSet bitSet34 = tapVar.ax;
            if (bitSet34 == null || bitSet34.get(31)) {
                tapVar.F = A();
            }
            BitSet bitSet35 = tapVar.ax;
            if (bitSet35 == null || bitSet35.get(32)) {
                ao(32, "profile_photo_blob_id");
                tapVar.G = this.G;
            }
            BitSet bitSet36 = tapVar.ax;
            if (bitSet36 == null || bitSet36.get(33)) {
                ao(33, "profile_photo_encryption_key");
                tapVar.H = this.H;
            }
            BitSet bitSet37 = tapVar.ax;
            if (bitSet37 == null || bitSet37.get(34)) {
                tapVar.I = t();
            }
            BitSet bitSet38 = tapVar.ax;
            if (bitSet38 == null || bitSet38.get(35)) {
                tapVar.J = S();
            }
            BitSet bitSet39 = tapVar.ax;
            if (bitSet39 == null || bitSet39.get(36)) {
                tapVar.K = U();
            }
            BitSet bitSet40 = tapVar.ax;
            if (bitSet40 == null || bitSet40.get(37)) {
                ao(37, "duplicate_of");
                tapVar.L = this.L;
            }
            BitSet bitSet41 = tapVar.ax;
            if (bitSet41 == null || bitSet41.get(38)) {
                ao(38, "cms_life_cycle");
                tapVar.M = this.M;
            }
            BitSet bitSet42 = tapVar.ax;
            if (bitSet42 == null || bitSet42.get(39)) {
                tapVar.N = w();
            }
            BitSet bitSet43 = tapVar.ax;
            if (bitSet43 == null || bitSet43.get(40)) {
                ao(40, "last_modified_by_key");
                tapVar.O = this.O;
            }
            BitSet bitSet44 = tapVar.ax;
            if (bitSet44 == null || bitSet44.get(41)) {
                tapVar.P = B();
            }
            BitSet bitSet45 = tapVar.ax;
            if (bitSet45 == null || bitSet45.get(42)) {
                tapVar.Q = C();
            }
            BitSet bitSet46 = tapVar.ax;
            if (bitSet46 == null || bitSet46.get(43)) {
                ao(43, "profile_photo_user_preference");
                tapVar.R = this.R;
            }
            BitSet bitSet47 = tapVar.ax;
            if (bitSet47 == null || bitSet47.get(44)) {
                tapVar.S = x();
            }
            return tapVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData(Parcel parcel) {
            vox voxVar = vox.PROFILE_CONTACT_SOURCE;
            this.P = voxVar;
            this.Q = voxVar;
            this.R = vov.PREFER_PROFILE_PHOTO;
            ap(parcel);
        }
    }
}
