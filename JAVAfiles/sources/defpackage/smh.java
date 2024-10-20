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
public final class smh extends aglz<smj, sml, smm, smh, smi> implements agma<Long> {
    public long b;
    public ConversationIdType a = ruy.a;
    public qfe c = qfe.UNKNOWN_STATE;
    public rxg d = vcp.m();

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsTable [conversation_id: %s,\n  participant_id: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("conversation_id");
        }
        agnc.q(contentValues, "participant_id", this.b);
        qfe qfeVar = this.c;
        if (qfeVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(qfeVar.e));
        }
        rxg rxgVar = this.d;
        if (rxgVar == null) {
            contentValues.putNull("last_modified_by_key");
        } else {
            contentValues.put("last_modified_by_key", vcp.n(rxgVar));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        smj smjVar = (smj) agmqVar;
        aq();
        this.cJ = smjVar.dx();
        if (smjVar.db(0)) {
            this.a = smjVar.f();
            fE(0);
        }
        if (smjVar.db(1)) {
            this.b = smjVar.c();
            fE(1);
        }
        if (smjVar.db(2)) {
            this.c = smjVar.e();
            fE(2);
        }
        if (smjVar.db(3)) {
            this.d = smjVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof smh)) {
            return false;
        }
        smh smhVar = (smh) obj;
        if (super.aC(smhVar.cJ) && Objects.equals(this.a, smhVar.a) && this.b == smhVar.b && this.c == smhVar.c && Objects.equals(this.d, smhVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_to_participants", agnc.j(new String[]{"conversation_id", "participant_id", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final long h() {
        ao(1, "participant_id");
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
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_to_participants";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new rnb((aglz) this, 17).get();
        Long valueOf2 = Long.valueOf(this.b);
        qfe qfeVar = this.c;
        if (qfeVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qfeVar.e);
        }
        Object[] objArr = {obj, valueOf2, valueOf, vcp.n(this.d)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final qfe k() {
        ao(2, "rcs_group_join_status");
        return this.c;
    }

    public final ConversationIdType l() {
        ao(0, "conversation_id");
        return this.a;
    }

    public final rxg m() {
        ao(3, "last_modified_by_key");
        return this.d;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationToParticipantsTable -- REDACTED");
        }
        return a();
    }
}
