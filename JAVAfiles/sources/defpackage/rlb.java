package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rlb extends aglz implements agma {
    public String c;
    public long e;
    public String f;
    public String g;
    public boolean i;
    public String j;
    public String k;
    public String l;
    public long o;
    public int p;
    public int q;
    public String s;
    public xxw t;
    public ConversationIdType a = ruy.a;
    public qwe b = null;
    public tqc d = tqc.UNARCHIVED;
    public tqh h = tqh.NAME_IS_AUTOMATIC;
    public vtm m = vtm.b();
    public qpd n = qpd.b(0);
    public int r = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupConversationsTable [_id: %s,\n  current_my_identity: %s,\n  snippet_text: %s,\n  archive_status: %s,\n  most_recent_timestamp_ms: %s,\n  subject: %s,\n  name: %s,\n  name_is_automatic: %s,\n  has_rbm_participant: %s,\n  rcs_group_self_msisdn: %s,\n  rcs_group_id: %s,\n  rcs_conference_uri: %s,\n  rcs_group_capabilities: %s,\n  error_state: %s,\n  rcs_subject_change_timestamp_ms: %s,\n  join_state: %s,\n  conversation_type: %s,\n  send_mode: %s,\n  cms_id: %s,\n  cms_life_cycle: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        int intValue = rlk.b().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("_id");
        }
        if (intValue >= 110) {
            qwe qweVar = this.b;
            if (qweVar != null && !qweVar.equals(null)) {
                contentValues.put("current_my_identity", riw.n(this.b));
            } else {
                contentValues.putNull("current_my_identity");
            }
        }
        agnc.r(contentValues, "snippet_text", this.c);
        tqc tqcVar = this.d;
        if (tqcVar == null) {
            contentValues.putNull("archive_status");
        } else {
            contentValues.put("archive_status", Integer.valueOf(tqcVar.h));
        }
        contentValues.put("most_recent_timestamp_ms", Long.valueOf(this.e));
        agnc.r(contentValues, "subject", this.f);
        agnc.r(contentValues, "name", this.g);
        tqh tqhVar = this.h;
        if (tqhVar == null) {
            contentValues.putNull("name_is_automatic");
        } else {
            contentValues.put("name_is_automatic", Integer.valueOf(tqhVar.ordinal()));
        }
        contentValues.put("has_rbm_participant", Boolean.valueOf(this.i));
        agnc.r(contentValues, "rcs_group_self_msisdn", this.j);
        agnc.r(contentValues, "rcs_group_id", this.k);
        agnc.r(contentValues, "rcs_conference_uri", this.l);
        vtm vtmVar = this.m;
        if (vtmVar == null) {
            contentValues.putNull("rcs_group_capabilities");
        } else {
            contentValues.put("rcs_group_capabilities", Long.valueOf(vtmVar.a));
        }
        qpd qpdVar = this.n;
        if (qpdVar == null) {
            contentValues.putNull("error_state");
        } else {
            contentValues.put("error_state", Integer.valueOf(qpdVar.a()));
        }
        contentValues.put("rcs_subject_change_timestamp_ms", Long.valueOf(this.o));
        contentValues.put("join_state", Integer.valueOf(this.p));
        contentValues.put("conversation_type", Integer.valueOf(this.q));
        contentValues.put("send_mode", Integer.valueOf(this.r));
        agnc.r(contentValues, "cms_id", this.s);
        xxw xxwVar = this.t;
        if (xxwVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rlf rlfVar = (rlf) agmqVar;
        aq();
        this.cJ = rlfVar.dx();
        if (rlfVar.db(0)) {
            this.a = rlfVar.k();
            fE(0);
        }
        if (rlfVar.db(1)) {
            this.b = rlfVar.j();
            fE(1);
        }
        if (rlfVar.db(2)) {
            this.c = rlfVar.u();
            fE(2);
        }
        if (rlfVar.db(3)) {
            this.d = rlfVar.l();
            fE(3);
        }
        if (rlfVar.db(4)) {
            this.e = rlfVar.g();
            fE(4);
        }
        if (rlfVar.db(5)) {
            this.f = rlfVar.v();
            fE(5);
        }
        if (rlfVar.db(6)) {
            this.g = rlfVar.q();
            fE(6);
        }
        if (rlfVar.db(7)) {
            this.h = rlfVar.m();
            fE(7);
        }
        if (rlfVar.db(8)) {
            this.i = rlfVar.w();
            fE(8);
        }
        if (rlfVar.db(9)) {
            this.j = rlfVar.t();
            fE(9);
        }
        if (rlfVar.db(10)) {
            this.k = rlfVar.s();
            fE(10);
        }
        if (rlfVar.db(11)) {
            this.l = rlfVar.r();
            fE(11);
        }
        if (rlfVar.db(12)) {
            this.m = rlfVar.n();
            fE(12);
        }
        if (rlfVar.db(13)) {
            this.n = rlfVar.i();
            fE(13);
        }
        if (rlfVar.db(14)) {
            this.o = rlfVar.h();
            fE(14);
        }
        if (rlfVar.db(15)) {
            this.p = rlfVar.e();
            fE(15);
        }
        if (rlfVar.db(16)) {
            this.q = rlfVar.c();
            fE(16);
        }
        if (rlfVar.db(17)) {
            this.r = rlfVar.f();
            fE(17);
        }
        if (rlfVar.db(18)) {
            this.s = rlfVar.p();
            fE(18);
        }
        if (rlfVar.db(19)) {
            this.t = rlfVar.o();
            fE(19);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rlb)) {
            return false;
        }
        rlb rlbVar = (rlb) obj;
        if (super.aC(rlbVar.cJ) && Objects.equals(this.a, rlbVar.a) && Objects.equals(this.b, rlbVar.b) && Objects.equals(this.c, rlbVar.c) && this.d == rlbVar.d && this.e == rlbVar.e && Objects.equals(this.f, rlbVar.f) && Objects.equals(this.g, rlbVar.g) && this.h == rlbVar.h && this.i == rlbVar.i && Objects.equals(this.j, rlbVar.j) && Objects.equals(this.k, rlbVar.k) && Objects.equals(this.l, rlbVar.l) && Objects.equals(this.m, rlbVar.m) && this.n == rlbVar.n && this.o == rlbVar.o && this.p == rlbVar.p && this.q == rlbVar.q && this.r == rlbVar.r && Objects.equals(this.s, rlbVar.s) && this.t == rlbVar.t) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversations_backup", agnc.j(new String[]{"_id", "current_my_identity", "snippet_text", "archive_status", "most_recent_timestamp_ms", "subject", "name", "name_is_automatic", "has_rbm_participant", "rcs_group_self_msisdn", "rcs_group_id", "rcs_conference_uri", "rcs_group_capabilities", "error_state", "rcs_subject_change_timestamp_ms", "join_state", "conversation_type", "send_mode", "cms_id", "cms_life_cycle"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
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
        ConversationIdType conversationIdType = this.a;
        qwe qweVar = this.b;
        String str = this.c;
        tqc tqcVar = this.d;
        Long valueOf = Long.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        tqh tqhVar = this.h;
        if (tqhVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqhVar.ordinal();
        }
        Integer valueOf2 = Integer.valueOf(ordinal);
        Boolean valueOf3 = Boolean.valueOf(this.i);
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        vtm vtmVar = this.m;
        qpd qpdVar = this.n;
        Long valueOf4 = Long.valueOf(this.o);
        Integer valueOf5 = Integer.valueOf(this.p);
        Integer valueOf6 = Integer.valueOf(this.q);
        Integer valueOf7 = Integer.valueOf(this.r);
        String str7 = this.s;
        xxw xxwVar = this.t;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        return Objects.hash(adayVar, conversationIdType, qweVar, str, tqcVar, valueOf, str2, str3, valueOf2, valueOf3, str4, str5, str6, vtmVar, qpdVar, valueOf4, valueOf5, valueOf6, valueOf7, str7, Integer.valueOf(ordinal2), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversations_backup";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object valueOf2;
        Long l;
        Integer valueOf3;
        Object valueOf4;
        Object obj = new qwn((aglz) this, 14).get();
        Object obj2 = new qwn((aglz) this, 15).get();
        String str = this.c;
        tqc tqcVar = this.d;
        if (tqcVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqcVar.h);
        }
        Long valueOf5 = Long.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        tqh tqhVar = this.h;
        if (tqhVar == null) {
            valueOf2 = 0;
        } else {
            valueOf2 = String.valueOf(tqhVar.ordinal());
        }
        Integer valueOf6 = Integer.valueOf(this.i ? 1 : 0);
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        Long valueOf7 = Long.valueOf(this.m.a);
        qpd qpdVar = this.n;
        if (qpdVar == null) {
            l = valueOf7;
            valueOf3 = 0;
        } else {
            l = valueOf7;
            valueOf3 = String.valueOf(qpdVar.a());
        }
        Long valueOf8 = Long.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        Integer valueOf10 = Integer.valueOf(this.q);
        Integer valueOf11 = Integer.valueOf(this.r);
        String str7 = this.s;
        xxw xxwVar = this.t;
        if (xxwVar == null) {
            valueOf4 = 0;
        } else {
            valueOf4 = String.valueOf(xxwVar.ordinal());
        }
        Object[] objArr = {obj, obj2, str, valueOf, valueOf5, str2, str3, valueOf2, valueOf6, str4, str5, str6, l, valueOf3, valueOf8, valueOf9, valueOf10, valueOf11, str7, valueOf4};
        sb.append('(');
        for (int i = 0; i < 20; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str8 = (String) obj3;
                    if (str8.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str8));
                    }
                }
                list.add(obj3);
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
            return String.format(Locale.US, "%s", "BackupConversationsTable -- REDACTED");
        }
        return a();
    }
}
