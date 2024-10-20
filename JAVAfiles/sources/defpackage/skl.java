package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skl extends aglz implements agma {
    public String a;
    public long c;
    public String d;
    public long f;
    public boolean g;
    public Instant b = Instant.EPOCH;
    public ConversationIdType e = ruy.a;
    public qfe h = qfe.UNKNOWN_STATE;
    public rxg i = rxg.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  conversation_participants_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
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
        agnc.r(contentValues, "conversation_participants_id", this.d);
        ConversationIdType conversationIdType = this.e;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(conversationIdType)));
        }
        contentValues.put("participant_id", Long.valueOf(this.f));
        contentValues.put("is_normalized", Boolean.valueOf(this.g));
        qfe qfeVar = this.h;
        if (qfeVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(qfeVar.e));
        }
        if (intValue >= 59440) {
            rxg rxgVar = this.i;
            if (rxgVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", vcp.n(rxgVar));
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sko skoVar = (sko) agmqVar;
        aq();
        this.cJ = skoVar.dx();
        if (skoVar.db(0)) {
            this.a = skoVar.k();
            fE(0);
        }
        if (skoVar.db(1)) {
            this.b = skoVar.i();
            fE(1);
        }
        if (skoVar.db(2)) {
            this.c = skoVar.c();
            fE(2);
        }
        if (skoVar.db(3)) {
            this.d = skoVar.j();
            fE(3);
        }
        if (skoVar.db(4)) {
            this.e = skoVar.g();
            fE(4);
        }
        if (skoVar.db(5)) {
            this.f = skoVar.e();
            fE(5);
        }
        if (skoVar.db(6)) {
            this.g = skoVar.l();
            fE(6);
        }
        if (skoVar.db(7)) {
            this.h = skoVar.f();
            fE(7);
        }
        if (skoVar.db(8)) {
            this.i = skoVar.h();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof skl)) {
            return false;
        }
        skl sklVar = (skl) obj;
        if (super.aC(sklVar.cJ) && Objects.equals(this.a, sklVar.a) && Objects.equals(this.b, sklVar.b) && this.c == sklVar.c && Objects.equals(this.d, sklVar.d) && Objects.equals(this.e, sklVar.e) && this.f == sklVar.f && this.g == sklVar.g && this.h == sklVar.h && Objects.equals(this.i, sklVar.i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants_audit_log", agnc.j(new String[]{"operation_datetime", "operation_type", "conversation_participants_id", "conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(5, "participant_id");
        return this.f;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_participants_audit_log";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(uzz.k(this.b));
        Long valueOf3 = Long.valueOf(this.c);
        String str = this.d;
        Long valueOf4 = Long.valueOf(ruy.a(this.e));
        Long valueOf5 = Long.valueOf(this.f);
        Integer valueOf6 = Integer.valueOf(this.g ? 1 : 0);
        qfe qfeVar = this.h;
        if (qfeVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qfeVar.e);
        }
        Object[] objArr = {valueOf2, valueOf3, str, valueOf4, valueOf5, valueOf6, valueOf, vcp.n(this.i)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationParticipantsAuditLogTable -- REDACTED");
        }
        return a();
    }
}
