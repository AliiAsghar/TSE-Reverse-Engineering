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
import defpackage.akec;
import defpackage.alob;
import defpackage.alok;
import defpackage.alor;
import defpackage.aozs;
import defpackage.apag;
import defpackage.nda;
import defpackage.sdr;
import defpackage.tde;
import defpackage.tdf;
import defpackage.tdh;
import defpackage.tdi;
import defpackage.tdj;
import defpackage.voz;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProfilesTable extends aglo {
    public static final String[] a = {"profiles_table._id", "profiles_table.participant_id", "profiles_table.person_id", "profiles_table.profile_access_token", "profiles_table.sending_self_profile_interaction_state", "profiles_table.self_profile_sharing_metadata", "profiles_table.first_name", "profiles_table.last_name", "profiles_table.display_name", "profiles_table.photo_uri", "profiles_table.sender_last_updated_time", "profiles_table.sender_last_updated_time_from_rcs", "profiles_table.contact_lookup_key", "profiles_table.phone_number", "profiles_table.is_self_profile_shareable", "profiles_table.has_shared_access_token_with_user", "profiles_table.name_timestamp", "profiles_table.photo_timestamp", "profiles_table.belongs_to_self_gaia", "profiles_table.gaia_update_timestamp"};
    public static final alor b;
    public static final tde c;
    public static final int[] d;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static abstract class BindData extends aglz<tdh, tdi, tdj, BindData, tdf> implements Parcelable, agma {
        public static final Parcelable.Creator<BindData> CREATOR = new sdr(7);
        public long a;
        public long b;
        public String c;
        public String d;
        public voz f;
        public String g;
        public String h;
        public String i;
        public Uri j;
        public String k;
        public String l;
        public String m;
        public String n;
        public nda e = nda.a;
        public boolean o = true;
        public boolean p = false;
        public long q = 0;
        public long r = 0;
        public boolean s = false;
        public long t = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData() {
        }

        @Override // defpackage.aglz
        public final String a() {
            return String.format(Locale.US, "ProfilesTable [_id: %s,\n  participant_id: %s,\n  person_id: %s,\n  profile_access_token: %s,\n  sending_self_profile_interaction_state: %s,\n  self_profile_sharing_metadata: %s,\n  first_name: %s,\n  last_name: %s,\n  display_name: %s,\n  photo_uri: %s,\n  sender_last_updated_time: %s,\n  sender_last_updated_time_from_rcs: %s,\n  contact_lookup_key: %s,\n  phone_number: %s,\n  is_self_profile_shareable: %s,\n  has_shared_access_token_with_user: %s,\n  name_timestamp: %s,\n  photo_timestamp: %s,\n  belongs_to_self_gaia: %s,\n  gaia_update_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t));
        }

        @Override // defpackage.aglz
        public final void b(ContentValues contentValues) {
            Integer valueOf;
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            agnc.q(contentValues, "participant_id", this.b);
            if (intValue >= 60170) {
                agnc.r(contentValues, "person_id", this.c);
            }
            if (intValue >= 60170) {
                agnc.r(contentValues, "profile_access_token", this.d);
            }
            if (intValue >= 60200) {
                nda ndaVar = this.e;
                if (ndaVar == null) {
                    contentValues.putNull("sending_self_profile_interaction_state");
                } else {
                    contentValues.put("sending_self_profile_interaction_state", Integer.valueOf(ndaVar.ordinal()));
                }
            }
            if (intValue >= 60340) {
                voz vozVar = this.f;
                if (vozVar == null) {
                    contentValues.putNull("self_profile_sharing_metadata");
                } else {
                    contentValues.put("self_profile_sharing_metadata", vozVar.toByteArray());
                }
            }
            agnc.r(contentValues, "first_name", this.g);
            agnc.r(contentValues, "last_name", this.h);
            agnc.r(contentValues, "display_name", this.i);
            Uri uri = this.j;
            if (uri == null) {
                contentValues.putNull("photo_uri");
            } else {
                contentValues.put("photo_uri", uri.toString());
            }
            if (intValue >= 60170) {
                agnc.r(contentValues, "sender_last_updated_time", this.k);
            }
            if (intValue >= 60200) {
                agnc.r(contentValues, "sender_last_updated_time_from_rcs", this.l);
            }
            agnc.r(contentValues, "contact_lookup_key", this.m);
            agnc.r(contentValues, "phone_number", this.n);
            if (intValue >= 60400) {
                contentValues.put("is_self_profile_shareable", Boolean.valueOf(this.o));
            }
            if (intValue >= 60170) {
                contentValues.put("has_shared_access_token_with_user", Boolean.valueOf(this.p));
            }
            contentValues.put("name_timestamp", Long.valueOf(this.q));
            contentValues.put("photo_timestamp", Long.valueOf(this.r));
            if (intValue >= 59940) {
                contentValues.put("belongs_to_self_gaia", Boolean.valueOf(this.s));
            }
            if (intValue >= 59940) {
                contentValues.put("gaia_update_timestamp", Long.valueOf(this.t));
            }
        }

        @Override // defpackage.aglz
        public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
            tdh tdhVar = (tdh) agmqVar;
            aq();
            this.cJ = tdhVar.dx();
            if (tdhVar.db(0)) {
                this.a = tdhVar.e();
                fE(0);
            }
            if (tdhVar.db(1)) {
                this.b = tdhVar.g();
                fE(1);
            }
            if (tdhVar.db(2)) {
                this.c = tdhVar.p();
                fE(2);
            }
            if (tdhVar.db(3)) {
                this.d = tdhVar.r();
                fE(3);
            }
            if (tdhVar.db(4)) {
                this.e = tdhVar.j();
                fE(4);
            }
            if (tdhVar.db(5)) {
                this.f = tdhVar.k();
                fE(5);
            }
            if (tdhVar.db(6)) {
                this.g = tdhVar.n();
                fE(6);
            }
            if (tdhVar.db(7)) {
                this.h = tdhVar.o();
                fE(7);
            }
            if (tdhVar.db(8)) {
                this.i = tdhVar.m();
                fE(8);
            }
            if (tdhVar.db(9)) {
                this.j = tdhVar.i();
                fE(9);
            }
            if (tdhVar.db(10)) {
                this.k = tdhVar.s();
                fE(10);
            }
            if (tdhVar.db(11)) {
                this.l = tdhVar.t();
                fE(11);
            }
            if (tdhVar.db(12)) {
                this.m = tdhVar.l();
                fE(12);
            }
            if (tdhVar.db(13)) {
                this.n = tdhVar.q();
                fE(13);
            }
            if (tdhVar.db(14)) {
                this.o = tdhVar.w();
                fE(14);
            }
            if (tdhVar.db(15)) {
                this.p = tdhVar.v();
                fE(15);
            }
            if (tdhVar.db(16)) {
                this.q = tdhVar.f();
                fE(16);
            }
            if (tdhVar.db(17)) {
                this.r = tdhVar.h();
                fE(17);
            }
            if (tdhVar.db(18)) {
                this.s = tdhVar.u();
                fE(18);
            }
            if (tdhVar.db(19)) {
                this.t = tdhVar.c();
                fE(19);
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
            if (super.aC(bindData.cJ) && this.a == bindData.a && this.b == bindData.b && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && Objects.equals(this.k, bindData.k) && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && this.o == bindData.o && this.p == bindData.p && this.q == bindData.q && this.r == bindData.r && this.s == bindData.s && this.t == bindData.t) {
                return true;
            }
            return false;
        }

        @Override // defpackage.agma
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "profiles_table", agnc.j(new String[]{"participant_id", "person_id", "profile_access_token", "sending_self_profile_interaction_state", "self_profile_sharing_metadata", "first_name", "last_name", "display_name", "photo_uri", "sender_last_updated_time", "sender_last_updated_time_from_rcs", "contact_lookup_key", "phone_number", "is_self_profile_shareable", "has_shared_access_token_with_user", "name_timestamp", "photo_timestamp", "belongs_to_self_gaia", "gaia_update_timestamp"}));
        }

        @Override // defpackage.aglz
        protected final void fo(Parcel parcel) {
            voz vozVar;
            boolean z;
            boolean z2;
            this.a = parcel.readLong();
            this.b = parcel.readLong();
            this.c = parcel.readString();
            this.d = parcel.readString();
            nda[] values = nda.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt < values.length) {
                    this.e = values[readInt];
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] createByteArray = parcel.createByteArray();
            Uri uri = null;
            if (createByteArray == null) {
                vozVar = null;
            } else {
                try {
                    vozVar = (voz) apag.parseFrom(voz.a, createByteArray, aozs.a());
                } catch (Throwable unused) {
                    this.f = null;
                }
            }
            this.f = vozVar;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            String readString = parcel.readString();
            if (readString != null) {
                uri = Uri.parse(readString);
            }
            this.j = uri;
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.o = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.p = z2;
            this.q = parcel.readLong();
            this.r = parcel.readLong();
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            this.s = z3;
            this.t = parcel.readLong();
        }

        @Override // defpackage.aglz
        protected final void fp(Parcel parcel) {
            int ordinal;
            byte[] byteArray;
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            nda ndaVar = this.e;
            if (ndaVar == null) {
                ordinal = -1;
            } else {
                ordinal = ndaVar.ordinal();
            }
            parcel.writeInt(ordinal);
            voz vozVar = this.f;
            String str = null;
            if (vozVar == null) {
                byteArray = null;
            } else {
                byteArray = vozVar.toByteArray();
            }
            parcel.writeByteArray(byteArray);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            Uri uri = this.j;
            if (uri != null) {
                str = uri.toString();
            }
            parcel.writeString(str);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p ? 1 : 0);
            parcel.writeLong(this.q);
            parcel.writeLong(this.r);
            parcel.writeInt(this.s ? 1 : 0);
            parcel.writeLong(this.t);
        }

        @Override // defpackage.agma
        public final String g() {
            return "_id";
        }

        public final long h() {
            ao(1, "participant_id");
            return this.b;
        }

        public final int hashCode() {
            aday adayVar;
            int ordinal;
            aday adayVar2 = this.cJ;
            if (adayVar2 != null && !adayVar2.Y()) {
                adayVar = this.cJ;
            } else {
                adayVar = null;
            }
            Long valueOf = Long.valueOf(this.a);
            Long valueOf2 = Long.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            nda ndaVar = this.e;
            if (ndaVar == null) {
                ordinal = 0;
            } else {
                ordinal = ndaVar.ordinal();
            }
            return Objects.hash(adayVar, valueOf, valueOf2, str, str2, Integer.valueOf(ordinal), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Boolean.valueOf(this.o), Boolean.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(this.r), Boolean.valueOf(this.s), Long.valueOf(this.t), null);
        }

        @Override // defpackage.agma
        public final String i() {
            return "profiles_table";
        }

        @Override // defpackage.agma
        public final void j(StringBuilder sb, List list) {
            Object valueOf;
            byte[] byteArray;
            Long valueOf2 = Long.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            nda ndaVar = this.e;
            if (ndaVar == null) {
                valueOf = 0;
            } else {
                valueOf = String.valueOf(ndaVar.ordinal());
            }
            voz vozVar = this.f;
            String str3 = null;
            if (vozVar == null) {
                byteArray = null;
            } else {
                byteArray = vozVar.toByteArray();
            }
            String str4 = this.g;
            String str5 = this.h;
            String str6 = this.i;
            Uri uri = this.j;
            if (uri != null) {
                str3 = uri.toString();
            }
            Object[] objArr = {valueOf2, str, str2, valueOf, byteArray, str4, str5, str6, str3, this.k, this.l, this.m, this.n, Integer.valueOf(this.o ? 1 : 0), Integer.valueOf(this.p ? 1 : 0), Long.valueOf(this.q), Long.valueOf(this.r), Integer.valueOf(this.s ? 1 : 0), Long.valueOf(this.t)};
            sb.append('(');
            for (int i = 0; i < 19; i++) {
                Object obj = objArr[i];
                if (obj instanceof Number) {
                    sb.append(String.valueOf(obj));
                } else {
                    if (obj instanceof String) {
                        String str7 = (String) obj;
                        if (str7.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str7));
                        }
                    }
                    list.add(obj);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        public final Uri k() {
            ao(9, "photo_uri");
            return this.j;
        }

        public final String l() {
            ao(8, "display_name");
            return this.i;
        }

        public final String m() {
            ao(6, "first_name");
            return this.g;
        }

        public final String n() {
            ao(7, "last_name");
            return this.h;
        }

        public final String toString() {
            if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
                return String.format(Locale.US, "%s", "ProfilesTable -- REDACTED");
            }
            return a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData(Parcel parcel) {
            ap(parcel);
        }
    }

    static {
        alok alokVar = new alok();
        alokVar.h("profiles_table.person_id", 60170);
        alokVar.h("profiles_table.profile_access_token", 60170);
        alokVar.h("profiles_table.sending_self_profile_interaction_state", 60200);
        alokVar.h("profiles_table.self_profile_sharing_metadata", 60340);
        alokVar.h("profiles_table.sender_last_updated_time", 60170);
        alokVar.h("profiles_table.sender_last_updated_time_from_rcs", 60200);
        alokVar.h("profiles_table.is_self_profile_shareable", 60400);
        alokVar.h("profiles_table.has_shared_access_token_with_user", 60170);
        alokVar.h("profiles_table.belongs_to_self_gaia", 59940);
        alokVar.h("profiles_table.gaia_update_timestamp", 59940);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("participant_id", "index_profiles_table_participant_id");
        alokVar2.h("contact_lookup_key", "index_profiles_table_contact_lookup_key");
        alokVar2.h("phone_number", "index_profiles_table_phone_number");
        alokVar2.b();
        c = new tde();
        d = new int[]{59710, 59730, 59940, 60170, 60200, 60340, 60400};
    }

    public static final tdj a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("profiles_table._id");
            alobVar.h("profiles_table.participant_id");
            if (valueOf.intValue() >= 60170) {
                alobVar.h("profiles_table.person_id");
            }
            if (valueOf.intValue() >= 60170) {
                alobVar.h("profiles_table.profile_access_token");
            }
            if (valueOf.intValue() >= 60200) {
                alobVar.h("profiles_table.sending_self_profile_interaction_state");
            }
            if (valueOf.intValue() >= 60340) {
                alobVar.h("profiles_table.self_profile_sharing_metadata");
            }
            alobVar.h("profiles_table.first_name");
            alobVar.h("profiles_table.last_name");
            alobVar.h("profiles_table.display_name");
            alobVar.h("profiles_table.photo_uri");
            if (valueOf.intValue() >= 60170) {
                alobVar.h("profiles_table.sender_last_updated_time");
            }
            if (valueOf.intValue() >= 60200) {
                alobVar.h("profiles_table.sender_last_updated_time_from_rcs");
            }
            alobVar.h("profiles_table.contact_lookup_key");
            alobVar.h("profiles_table.phone_number");
            if (valueOf.intValue() >= 60400) {
                alobVar.h("profiles_table.is_self_profile_shareable");
            }
            if (valueOf.intValue() >= 60170) {
                alobVar.h("profiles_table.has_shared_access_token_with_user");
            }
            alobVar.h("profiles_table.name_timestamp");
            alobVar.h("profiles_table.photo_timestamp");
            if (valueOf.intValue() >= 59940) {
                alobVar.h("profiles_table.belongs_to_self_gaia");
            }
            if (valueOf.intValue() >= 59940) {
                alobVar.h("profiles_table.gaia_update_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tdj(strArr);
    }

    public static void b(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER REFERENCES participants(_id) ON DELETE CASCADE ");
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("person_id TEXT");
        }
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_access_token TEXT");
        }
        if (i >= 60200) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sending_self_profile_interaction_state INTEGER DEFAULT(0)");
        }
        if (i >= 60340) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("self_profile_sharing_metadata BLOB");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_uri TEXT");
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sender_last_updated_time TEXT");
        }
        if (i >= 60200) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sender_last_updated_time_from_rcs TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT NOT NULL");
        if (i >= 60400) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_self_profile_shareable INT DEFAULT(1)");
        }
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("has_shared_access_token_with_user INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_timestamp INT DEFAULT(0)");
        if (i >= 59940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("belongs_to_self_gaia INT DEFAULT(0)");
        }
        if (i >= 59940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("gaia_update_timestamp INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE profiles_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_profiles_table_contact_lookup_key");
        arrayList.add("CREATE INDEX index_profiles_table_contact_lookup_key ON profiles_table(contact_lookup_key) WHERE contact_lookup_key NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_profiles_table_phone_number");
        arrayList.add("CREATE INDEX index_profiles_table_phone_number ON profiles_table(phone_number);");
        if (i >= 59730) {
            arrayList.add("DROP INDEX IF EXISTS index_profiles_table_participant_id");
            arrayList.add("CREATE INDEX index_profiles_table_participant_id ON profiles_table(participant_id) WHERE participant_id NOT NULL;");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
