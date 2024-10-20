package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbw extends aglz implements agma {
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public int j;
    public long k;
    public tqn l;
    public apwq m;
    public boolean n;
    public String o;
    public String p;
    public rve a = rve.a;
    public boolean q = false;
    public boolean r = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "PendingIncomingRcsMessageTable [rcs_message_id: %s,\n  remote_user_id: %s,\n  self_identity: %s,\n  raw_text: %s,\n  content_type: %s,\n  remote_instance: %s,\n  sent_timestamp: %s,\n  received_timestamp: %s,\n  sip_alias: %s,\n  spam_verdict: %s,\n  session_id: %s,\n  message_status: %s,\n  custom_headers: %s,\n  is_group: %s,\n  conversation_id: %s,\n  conference_uri: %s,\n  is_delivery_report_requested: %s,\n  is_display_report_requested: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        rve rveVar = this.a;
        if (rveVar != null && !rveVar.equals(rve.a)) {
            contentValues.put("rcs_message_id", rve.d(this.a));
        } else {
            contentValues.putNull("rcs_message_id");
        }
        agnc.r(contentValues, "remote_user_id", this.b);
        if (intValue >= 59410) {
            agnc.r(contentValues, "self_identity", this.c);
        }
        agnc.r(contentValues, "raw_text", this.d);
        agnc.r(contentValues, "content_type", this.e);
        agnc.r(contentValues, "remote_instance", this.f);
        contentValues.put("sent_timestamp", Long.valueOf(this.g));
        contentValues.put("received_timestamp", Long.valueOf(this.h));
        agnc.r(contentValues, "sip_alias", this.i);
        contentValues.put("spam_verdict", Integer.valueOf(this.j));
        contentValues.put("session_id", Long.valueOf(this.k));
        tqn tqnVar = this.l;
        if (tqnVar == null) {
            contentValues.putNull("message_status");
        } else {
            contentValues.put("message_status", Integer.valueOf(tqnVar.ordinal()));
        }
        if (intValue >= 44020) {
            apwq apwqVar = this.m;
            if (apwqVar == null) {
                contentValues.putNull("custom_headers");
            } else {
                contentValues.put("custom_headers", apwqVar.toByteArray());
            }
        }
        if (intValue >= 58820) {
            contentValues.put("is_group", Boolean.valueOf(this.n));
        }
        if (intValue >= 58820) {
            agnc.r(contentValues, "conversation_id", this.o);
        }
        if (intValue >= 58820) {
            agnc.r(contentValues, "conference_uri", this.p);
        }
        if (intValue >= 58870) {
            contentValues.put("is_delivery_report_requested", Boolean.valueOf(this.q));
        }
        if (intValue >= 58870) {
            contentValues.put("is_display_report_requested", Boolean.valueOf(this.r));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tca tcaVar = (tca) agmqVar;
        aq();
        this.cJ = tcaVar.dx();
        if (tcaVar.db(0)) {
            this.a = tcaVar.h();
            fE(0);
        }
        if (tcaVar.db(1)) {
            this.b = tcaVar.p();
            fE(1);
        }
        if (tcaVar.db(2)) {
            this.c = tcaVar.q();
            fE(2);
        }
        if (tcaVar.db(3)) {
            this.d = tcaVar.n();
            fE(3);
        }
        if (tcaVar.db(4)) {
            this.e = tcaVar.l();
            fE(4);
        }
        if (tcaVar.db(5)) {
            this.f = tcaVar.o();
            fE(5);
        }
        if (tcaVar.db(6)) {
            this.g = tcaVar.f();
            fE(6);
        }
        if (tcaVar.db(7)) {
            this.h = tcaVar.e();
            fE(7);
        }
        if (tcaVar.db(8)) {
            this.i = tcaVar.r();
            fE(8);
        }
        if (tcaVar.db(9)) {
            this.j = tcaVar.c();
            fE(9);
        }
        if (tcaVar.db(10)) {
            this.k = tcaVar.g();
            fE(10);
        }
        if (tcaVar.db(11)) {
            this.l = tcaVar.i();
            fE(11);
        }
        if (tcaVar.db(12)) {
            this.m = tcaVar.j();
            fE(12);
        }
        if (tcaVar.db(13)) {
            this.n = tcaVar.u();
            fE(13);
        }
        if (tcaVar.db(14)) {
            this.o = tcaVar.m();
            fE(14);
        }
        if (tcaVar.db(15)) {
            this.p = tcaVar.k();
            fE(15);
        }
        if (tcaVar.db(16)) {
            this.q = tcaVar.s();
            fE(16);
        }
        if (tcaVar.db(17)) {
            this.r = tcaVar.t();
            fE(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tbw)) {
            return false;
        }
        tbw tbwVar = (tbw) obj;
        if (super.aC(tbwVar.cJ) && Objects.equals(this.a, tbwVar.a) && Objects.equals(this.b, tbwVar.b) && Objects.equals(this.c, tbwVar.c) && Objects.equals(this.d, tbwVar.d) && Objects.equals(this.e, tbwVar.e) && Objects.equals(this.f, tbwVar.f) && this.g == tbwVar.g && this.h == tbwVar.h && Objects.equals(this.i, tbwVar.i) && this.j == tbwVar.j && this.k == tbwVar.k && this.l == tbwVar.l && Objects.equals(this.m, tbwVar.m) && this.n == tbwVar.n && Objects.equals(this.o, tbwVar.o) && Objects.equals(this.p, tbwVar.p) && this.q == tbwVar.q && this.r == tbwVar.r) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pending_incoming_message_rcs_table", agnc.j(new String[]{"rcs_message_id", "remote_user_id", "self_identity", "raw_text", "content_type", "remote_instance", "sent_timestamp", "received_timestamp", "sip_alias", "spam_verdict", "session_id", "message_status", "custom_headers", "is_group", "conversation_id", "conference_uri", "is_delivery_report_requested", "is_display_report_requested"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final rve h() {
        ao(0, "rcs_message_id");
        return this.a;
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
        rve rveVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Long valueOf = Long.valueOf(this.g);
        Long valueOf2 = Long.valueOf(this.h);
        String str6 = this.i;
        Integer valueOf3 = Integer.valueOf(this.j);
        Long valueOf4 = Long.valueOf(this.k);
        tqn tqnVar = this.l;
        if (tqnVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqnVar.ordinal();
        }
        return Objects.hash(adayVar, rveVar, str, str2, str3, str4, str5, valueOf, valueOf2, str6, valueOf3, valueOf4, Integer.valueOf(ordinal), this.m, Boolean.valueOf(this.n), this.o, this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "pending_incoming_message_rcs_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        byte[] byteArray;
        Object obj = new tbv((aglz) this, 0).get();
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Long valueOf2 = Long.valueOf(this.g);
        Long valueOf3 = Long.valueOf(this.h);
        String str6 = this.i;
        Integer valueOf4 = Integer.valueOf(this.j);
        Long valueOf5 = Long.valueOf(this.k);
        tqn tqnVar = this.l;
        if (tqnVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqnVar.ordinal());
        }
        apwq apwqVar = this.m;
        if (apwqVar == null) {
            byteArray = null;
        } else {
            byteArray = apwqVar.toByteArray();
        }
        Object[] objArr = {obj, str, str2, str3, str4, str5, valueOf2, valueOf3, str6, valueOf4, valueOf5, valueOf, byteArray, Integer.valueOf(this.n ? 1 : 0), this.o, this.p, Integer.valueOf(this.q ? 1 : 0), Integer.valueOf(this.r ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str7 = (String) obj2;
                    if (str7.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str7));
                    }
                }
                list.add(obj2);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String k() {
        ao(4, "content_type");
        return this.e;
    }

    public final String l() {
        ao(3, "raw_text");
        return this.d;
    }

    public final String m() {
        ao(1, "remote_user_id");
        return this.b;
    }

    public final String n() {
        ao(2, "self_identity");
        return this.c;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "PendingIncomingRcsMessageTable -- REDACTED");
        }
        return a();
    }
}
