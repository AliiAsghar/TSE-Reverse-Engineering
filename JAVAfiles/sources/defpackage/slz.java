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
public final class slz extends aglz implements agma {
    public long a;
    public long c;
    public long e;
    public Instant b = Instant.EPOCH;
    public ConversationIdType d = ruy.a;
    public qfe f = qfe.UNKNOWN_STATE;
    public rxg g = rxg.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(uzz.k(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(conversationIdType)));
        }
        contentValues.put("participant_id", Long.valueOf(this.e));
        qfe qfeVar = this.f;
        if (qfeVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(qfeVar.e));
        }
        rxg rxgVar = this.g;
        if (rxgVar == null) {
            contentValues.putNull("last_modified_by_key");
        } else {
            contentValues.put("last_modified_by_key", vcp.n(rxgVar));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        smc smcVar = (smc) agmqVar;
        aq();
        this.cJ = smcVar.dx();
        if (smcVar.db(0)) {
            this.a = smcVar.c();
            fE(0);
        }
        if (smcVar.db(1)) {
            this.b = smcVar.j();
            fE(1);
        }
        if (smcVar.db(2)) {
            this.c = smcVar.e();
            fE(2);
        }
        if (smcVar.db(3)) {
            this.d = smcVar.h();
            fE(3);
        }
        if (smcVar.db(4)) {
            this.e = smcVar.f();
            fE(4);
        }
        if (smcVar.db(5)) {
            this.f = smcVar.g();
            fE(5);
        }
        if (smcVar.db(6)) {
            this.g = smcVar.i();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof slz)) {
            return false;
        }
        slz slzVar = (slz) obj;
        if (super.aC(slzVar.cJ) && this.a == slzVar.a && Objects.equals(this.b, slzVar.b) && this.c == slzVar.c && Objects.equals(this.d, slzVar.d) && this.e == slzVar.e && this.f == slzVar.f && Objects.equals(this.g, slzVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_to_participants_audit_log", agnc.j(new String[]{"operation_datetime", "operation_type", "conversation_id", "participant_id", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Long.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, this.g, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_to_participants_audit_log";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(uzz.k(this.b));
        Long valueOf3 = Long.valueOf(this.c);
        Long valueOf4 = Long.valueOf(ruy.a(this.d));
        Long valueOf5 = Long.valueOf(this.e);
        qfe qfeVar = this.f;
        if (qfeVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qfeVar.e);
        }
        Object[] objArr = {valueOf2, valueOf3, valueOf4, valueOf5, valueOf, vcp.n(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
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
            return String.format(Locale.US, "%s", "ConversationToParticipantsAuditLogTable -- REDACTED");
        }
        return a();
    }
}
