package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnc extends aglz implements agma {
    public String A;
    public xxw B;
    public String C;
    public long D;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public String i;
    public String j;
    public int k;
    public String l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public apwq z;
    public MessageIdType a = rvc.a;
    public Optional b = rvg.a;
    public qwe c = null;
    public ConversationIdType g = ruy.a;
    public int t = -1;
    public rve y = rve.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupMessagesTable [_id: %s,\n  message_persistence_id: %s,\n  my_identity: %s,\n  message_status: %s,\n  seen: %s,\n  read: %s,\n  conversation_id: %s,\n  sender_participant_id: %s,\n  sender_send_destination: %s,\n  msisdn_receiving_rcs_message: %s,\n  self_participant_id: %s,\n  mms_subject: %s,\n  received_timestamp: %s,\n  sent_timestamp: %s,\n  protocol: %s,\n  message_priority: %s,\n  rcs_encryption_status: %s,\n  cloud_sync_id: %s,\n  correlation_id: %s,\n  sms_error_code: %s,\n  sms_error_desc_map_name: %s,\n  mms_transaction_id: %s,\n  mms_content_location: %s,\n  is_hidden: %s,\n  rcs_message_id: %s,\n  custom_headers: %s,\n  cms_id: %s,\n  cms_life_cycle: %s,\n  cms_correlation_id: %s,\n  cms_last_mod_seq: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        int intValue = rnm.b().intValue();
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("_id");
        }
        if (intValue >= 120) {
            Optional optional = this.b;
            if (optional != null && !optional.equals(rvg.a)) {
                contentValues.put("message_persistence_id", rvg.b(this.b));
            } else {
                contentValues.putNull("message_persistence_id");
            }
        }
        if (intValue >= 110) {
            qwe qweVar = this.c;
            if (qweVar != null && !qweVar.equals(null)) {
                contentValues.put("my_identity", riw.n(this.c));
            } else {
                contentValues.putNull("my_identity");
            }
        }
        contentValues.put("message_status", Integer.valueOf(this.d));
        contentValues.put("seen", Boolean.valueOf(this.e));
        contentValues.put("read", Boolean.valueOf(this.f));
        ConversationIdType conversationIdType = this.g;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.g)));
        } else {
            contentValues.putNull("conversation_id");
        }
        contentValues.put("sender_participant_id", Integer.valueOf(this.h));
        if (intValue >= 80) {
            agnc.r(contentValues, "sender_send_destination", this.i);
        }
        if (intValue >= 80) {
            agnc.r(contentValues, "msisdn_receiving_rcs_message", this.j);
        }
        contentValues.put("self_participant_id", Integer.valueOf(this.k));
        agnc.r(contentValues, "mms_subject", this.l);
        contentValues.put("received_timestamp", Long.valueOf(this.m));
        contentValues.put("sent_timestamp", Long.valueOf(this.n));
        contentValues.put("protocol", Integer.valueOf(this.o));
        contentValues.put("message_priority", Integer.valueOf(this.p));
        contentValues.put("rcs_encryption_status", Integer.valueOf(this.q));
        agnc.r(contentValues, "cloud_sync_id", this.r);
        agnc.r(contentValues, "correlation_id", this.s);
        contentValues.put("sms_error_code", Integer.valueOf(this.t));
        agnc.r(contentValues, "sms_error_desc_map_name", this.u);
        agnc.r(contentValues, "mms_transaction_id", this.v);
        agnc.r(contentValues, "mms_content_location", this.w);
        contentValues.put("is_hidden", Boolean.valueOf(this.x));
        rve rveVar = this.y;
        if (rveVar == null) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", rve.d(rveVar));
        }
        if (intValue >= 50) {
            apwq apwqVar = this.z;
            if (apwqVar == null) {
                contentValues.putNull("custom_headers");
            } else {
                contentValues.put("custom_headers", apwqVar.toByteArray());
            }
        }
        agnc.r(contentValues, "cms_id", this.A);
        xxw xxwVar = this.B;
        if (xxwVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
        }
        agnc.r(contentValues, "cms_correlation_id", this.C);
        contentValues.put("cms_last_mod_seq", Long.valueOf(this.D));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rnh rnhVar = (rnh) agmqVar;
        aq();
        this.cJ = rnhVar.dx();
        if (rnhVar.db(0)) {
            this.a = rnhVar.p();
            fE(0);
        }
        if (rnhVar.db(1)) {
            this.b = rnhVar.t();
            fE(1);
        }
        if (rnhVar.db(2)) {
            this.c = rnhVar.n();
            fE(2);
        }
        if (rnhVar.db(3)) {
            this.d = rnhVar.e();
            fE(3);
        }
        if (rnhVar.db(4)) {
            this.e = rnhVar.G();
            fE(4);
        }
        if (rnhVar.db(5)) {
            this.f = rnhVar.F();
            fE(5);
        }
        if (rnhVar.db(6)) {
            this.g = rnhVar.o();
            fE(6);
        }
        if (rnhVar.db(7)) {
            this.h = rnhVar.i();
            fE(7);
        }
        if (rnhVar.db(8)) {
            this.i = rnhVar.C();
            fE(8);
        }
        if (rnhVar.db(9)) {
            this.j = rnhVar.B();
            fE(9);
        }
        if (rnhVar.db(10)) {
            this.k = rnhVar.h();
            fE(10);
        }
        if (rnhVar.db(11)) {
            this.l = rnhVar.z();
            fE(11);
        }
        if (rnhVar.db(12)) {
            this.m = rnhVar.l();
            fE(12);
        }
        if (rnhVar.db(13)) {
            this.n = rnhVar.m();
            fE(13);
        }
        if (rnhVar.db(14)) {
            this.o = rnhVar.f();
            fE(14);
        }
        if (rnhVar.db(15)) {
            this.p = rnhVar.c();
            fE(15);
        }
        if (rnhVar.db(16)) {
            this.q = rnhVar.g();
            fE(16);
        }
        if (rnhVar.db(17)) {
            this.r = rnhVar.u();
            fE(17);
        }
        if (rnhVar.db(18)) {
            this.s = rnhVar.x();
            fE(18);
        }
        if (rnhVar.db(19)) {
            this.t = rnhVar.j();
            fE(19);
        }
        if (rnhVar.db(20)) {
            this.u = rnhVar.D();
            fE(20);
        }
        if (rnhVar.db(21)) {
            this.v = rnhVar.A();
            fE(21);
        }
        if (rnhVar.db(22)) {
            this.w = rnhVar.y();
            fE(22);
        }
        if (rnhVar.db(23)) {
            this.x = rnhVar.E();
            fE(23);
        }
        if (rnhVar.db(24)) {
            this.y = rnhVar.q();
            fE(24);
        }
        if (rnhVar.db(25)) {
            this.z = rnhVar.s();
            fE(25);
        }
        if (rnhVar.db(26)) {
            this.A = rnhVar.w();
            fE(26);
        }
        if (rnhVar.db(27)) {
            this.B = rnhVar.r();
            fE(27);
        }
        if (rnhVar.db(28)) {
            this.C = rnhVar.v();
            fE(28);
        }
        if (rnhVar.db(29)) {
            this.D = rnhVar.k();
            fE(29);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rnc)) {
            return false;
        }
        rnc rncVar = (rnc) obj;
        if (super.aC(rncVar.cJ) && Objects.equals(this.a, rncVar.a) && Objects.equals(this.b, rncVar.b) && Objects.equals(this.c, rncVar.c) && this.d == rncVar.d && this.e == rncVar.e && this.f == rncVar.f && Objects.equals(this.g, rncVar.g) && this.h == rncVar.h && Objects.equals(this.i, rncVar.i) && Objects.equals(this.j, rncVar.j) && this.k == rncVar.k && Objects.equals(this.l, rncVar.l) && this.m == rncVar.m && this.n == rncVar.n && this.o == rncVar.o && this.p == rncVar.p && this.q == rncVar.q && Objects.equals(this.r, rncVar.r) && Objects.equals(this.s, rncVar.s) && this.t == rncVar.t && Objects.equals(this.u, rncVar.u) && Objects.equals(this.v, rncVar.v) && Objects.equals(this.w, rncVar.w) && this.x == rncVar.x && Objects.equals(this.y, rncVar.y) && Objects.equals(this.z, rncVar.z) && Objects.equals(this.A, rncVar.A) && this.B == rncVar.B && Objects.equals(this.C, rncVar.C) && this.D == rncVar.D) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages_backup", agnc.j(new String[]{"_id", "message_persistence_id", "my_identity", "message_status", "seen", "read", "conversation_id", "sender_participant_id", "sender_send_destination", "msisdn_receiving_rcs_message", "self_participant_id", "mms_subject", "received_timestamp", "sent_timestamp", "protocol", "message_priority", "rcs_encryption_status", "cloud_sync_id", "correlation_id", "sms_error_code", "sms_error_desc_map_name", "mms_transaction_id", "mms_content_location", "is_hidden", "rcs_message_id", "custom_headers", "cms_id", "cms_life_cycle", "cms_correlation_id", "cms_last_mod_seq"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
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
        MessageIdType messageIdType = this.a;
        Optional optional = this.b;
        qwe qweVar = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        Boolean valueOf2 = Boolean.valueOf(this.e);
        Boolean valueOf3 = Boolean.valueOf(this.f);
        ConversationIdType conversationIdType = this.g;
        Integer valueOf4 = Integer.valueOf(this.h);
        String str = this.i;
        String str2 = this.j;
        Integer valueOf5 = Integer.valueOf(this.k);
        String str3 = this.l;
        Long valueOf6 = Long.valueOf(this.m);
        Long valueOf7 = Long.valueOf(this.n);
        Integer valueOf8 = Integer.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        Integer valueOf10 = Integer.valueOf(this.q);
        String str4 = this.r;
        String str5 = this.s;
        Integer valueOf11 = Integer.valueOf(this.t);
        String str6 = this.u;
        String str7 = this.v;
        String str8 = this.w;
        Boolean valueOf12 = Boolean.valueOf(this.x);
        rve rveVar = this.y;
        apwq apwqVar = this.z;
        String str9 = this.A;
        xxw xxwVar = this.B;
        if (xxwVar == null) {
            ordinal = 0;
        } else {
            ordinal = xxwVar.ordinal();
        }
        return Objects.hash(adayVar, messageIdType, optional, qweVar, valueOf, valueOf2, valueOf3, conversationIdType, valueOf4, str, str2, valueOf5, str3, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, str4, str5, valueOf11, str6, str7, str8, valueOf12, rveVar, apwqVar, str9, Integer.valueOf(ordinal), this.C, Long.valueOf(this.D), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "messages_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        int i;
        Object valueOf;
        Object obj = new rnb((aglz) this, 0).get();
        Object obj2 = new rnb((aglz) this, 2).get();
        Object obj3 = new rnb((aglz) this, 3).get();
        Integer valueOf2 = Integer.valueOf(this.d);
        Integer valueOf3 = Integer.valueOf(this.e ? 1 : 0);
        Integer valueOf4 = Integer.valueOf(this.f ? 1 : 0);
        Object obj4 = new rnb((aglz) this, 4).get();
        Integer valueOf5 = Integer.valueOf(this.h);
        String str = this.i;
        String str2 = this.j;
        Integer valueOf6 = Integer.valueOf(this.k);
        String str3 = this.l;
        Long valueOf7 = Long.valueOf(this.m);
        Long valueOf8 = Long.valueOf(this.n);
        Integer valueOf9 = Integer.valueOf(this.o);
        Integer valueOf10 = Integer.valueOf(this.p);
        Integer valueOf11 = Integer.valueOf(this.q);
        String str4 = this.r;
        String str5 = this.s;
        Integer valueOf12 = Integer.valueOf(this.t);
        String str6 = this.u;
        String str7 = this.v;
        String str8 = this.w;
        Integer valueOf13 = Integer.valueOf(this.x ? 1 : 0);
        String d = rve.d(this.y);
        apwq apwqVar = this.z;
        if (apwqVar == null) {
            byteArray = null;
        } else {
            byteArray = apwqVar.toByteArray();
        }
        byte[] bArr = byteArray;
        String str9 = this.A;
        xxw xxwVar = this.B;
        if (xxwVar == null) {
            i = 0;
            valueOf = 0;
        } else {
            i = 0;
            valueOf = String.valueOf(xxwVar.ordinal());
        }
        Object obj5 = valueOf;
        String str10 = this.C;
        Long valueOf14 = Long.valueOf(this.D);
        Object[] objArr = new Object[30];
        objArr[i] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = valueOf2;
        objArr[4] = valueOf3;
        objArr[5] = valueOf4;
        objArr[6] = obj4;
        objArr[7] = valueOf5;
        objArr[8] = str;
        objArr[9] = str2;
        objArr[10] = valueOf6;
        objArr[11] = str3;
        objArr[12] = valueOf7;
        objArr[13] = valueOf8;
        objArr[14] = valueOf9;
        objArr[15] = valueOf10;
        objArr[16] = valueOf11;
        objArr[17] = str4;
        objArr[18] = str5;
        objArr[19] = valueOf12;
        objArr[20] = str6;
        objArr[21] = str7;
        objArr[22] = str8;
        objArr[23] = valueOf13;
        objArr[24] = d;
        objArr[25] = bArr;
        objArr[26] = str9;
        objArr[27] = obj5;
        objArr[28] = str10;
        objArr[29] = valueOf14;
        sb.append('(');
        for (int i2 = i; i2 < 30; i2++) {
            Object obj6 = objArr[i2];
            if (obj6 instanceof Number) {
                sb.append(String.valueOf(obj6));
            } else {
                if (obj6 instanceof String) {
                    String str11 = (String) obj6;
                    if (str11.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str11));
                    }
                }
                list.add(obj6);
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
            return String.format(Locale.US, "%s", "BackupMessagesTable -- REDACTED");
        }
        return a();
    }
}
