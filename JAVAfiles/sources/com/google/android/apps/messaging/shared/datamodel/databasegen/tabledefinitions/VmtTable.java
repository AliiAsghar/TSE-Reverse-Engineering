package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aday;
import defpackage.aglo;
import defpackage.aglz;
import defpackage.agma;
import defpackage.agmq;
import defpackage.agnc;
import defpackage.agnw;
import defpackage.akec;
import defpackage.alok;
import defpackage.alor;
import defpackage.nht;
import defpackage.sdr;
import defpackage.toe;
import defpackage.tpu;
import defpackage.tpv;
import defpackage.tpw;
import defpackage.tpx;
import defpackage.tpy;
import defpackage.zai;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VmtTable extends aglo {
    public static final String[] a = {"vmt.part_id", "vmt.vmt_status", "vmt.text", "vmt.locale"};
    public static final alor b;
    public static final int[] c;
    public static final zai d;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static abstract class BindData extends aglz<tpw, tpx, tpy, BindData, tpv> implements Parcelable, agma {
        public static final Parcelable.Creator<BindData> CREATOR = new sdr(8);
        public String a;
        public nht b = nht.VMT_STATUS_UNKNOWN;
        public String c;
        public String d;

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData() {
        }

        @Override // defpackage.aglz
        public final String a() {
            return String.format(Locale.US, "VmtTable [part_id: %s,\n  vmt_status: %s,\n  text: %s,\n  locale: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
        }

        @Override // defpackage.aglz
        public final void b(ContentValues contentValues) {
            agnc.r(contentValues, "part_id", this.a);
            nht nhtVar = this.b;
            if (nhtVar == null) {
                contentValues.putNull("vmt_status");
            } else {
                contentValues.put("vmt_status", Integer.valueOf(nhtVar.a()));
            }
            agnc.r(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.c);
            agnc.r(contentValues, "locale", this.d);
        }

        @Override // defpackage.aglz
        public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
            tpw tpwVar = (tpw) agmqVar;
            aq();
            this.cJ = tpwVar.dx();
            if (tpwVar.db(0)) {
                this.a = tpwVar.f();
                fE(0);
            }
            if (tpwVar.db(1)) {
                this.b = tpwVar.c();
                fE(1);
            }
            if (tpwVar.db(2)) {
                this.c = tpwVar.g();
                fE(2);
            }
            if (tpwVar.db(3)) {
                this.d = tpwVar.e();
                fE(3);
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
            if (super.aC(bindData.cJ) && Objects.equals(this.a, bindData.a) && this.b == bindData.b && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.agma
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "vmt", agnc.j(new String[]{"part_id", "vmt_status", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "locale"}));
        }

        @Override // defpackage.aglz
        protected final void fo(Parcel parcel) {
            this.a = parcel.readString();
            this.b = nht.b(parcel.readInt());
            this.c = parcel.readString();
            this.d = parcel.readString();
        }

        @Override // defpackage.aglz
        protected final void fp(Parcel parcel) {
            int a;
            parcel.writeString(this.a);
            nht nhtVar = this.b;
            if (nhtVar == null) {
                a = -1;
            } else {
                a = nhtVar.a();
            }
            parcel.writeInt(a);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }

        @Override // defpackage.agma
        public final String g() {
            return null;
        }

        public final nht h() {
            ao(1, "vmt_status");
            return this.b;
        }

        public final int hashCode() {
            aday adayVar;
            aday adayVar2 = this.cJ;
            if (adayVar2 != null && !adayVar2.Y()) {
                adayVar = this.cJ;
            } else {
                adayVar = null;
            }
            return Objects.hash(adayVar, this.a, this.b, this.c, this.d, null);
        }

        @Override // defpackage.agma
        public final String i() {
            return "vmt";
        }

        @Override // defpackage.agma
        public final void j(StringBuilder sb, List list) {
            Object valueOf;
            String str = this.a;
            nht nhtVar = this.b;
            if (nhtVar == null) {
                valueOf = 0;
            } else {
                valueOf = String.valueOf(nhtVar.a());
            }
            Object[] objArr = {str, valueOf, this.c, this.d};
            sb.append('(');
            for (int i = 0; i < 4; i++) {
                Object obj = objArr[i];
                if (obj instanceof Number) {
                    sb.append(String.valueOf(obj));
                } else {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (str2.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str2));
                        }
                    }
                    list.add(obj);
                    sb.append('?');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        public final String k() {
            ao(2, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            return this.c;
        }

        public final String toString() {
            if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
                return String.format(Locale.US, "%s", "VmtTable -- REDACTED");
            }
            return a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BindData(Parcel parcel) {
            ap(parcel);
        }
    }

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("part_id", "index_vmt_part_id");
        alokVar.b();
        d = new zai();
        c = new int[]{58990};
    }

    public static tpu a() {
        int i = toe.a;
        tpu tpuVar = new tpu();
        tpuVar.aD();
        return tpuVar;
    }

    public static void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("part_id INTEGER REFERENCES parts(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("vmt_status INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("locale TEXT");
        sb.insert(0, "CREATE TABLE vmt (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_vmt_part_id");
        arrayList.add("CREATE UNIQUE INDEX index_vmt_part_id ON vmt(part_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
