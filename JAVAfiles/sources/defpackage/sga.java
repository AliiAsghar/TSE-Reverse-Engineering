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
public final class sga extends aglz implements agma {
    public long a;
    public int d;
    public long f;
    public ConversationIdType b = ruy.a;
    public pqz c = pqz.b(0);
    public psk e = psk.b(0);

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BusinessConversationsMetadataTable [_id: %s,\n  conversation_id: %s,\n  chatbot_directory_conversation_state: %s,\n  conversation_stop_state: %s,\n  conversation_toolstone_state: %s,\n  conversation_toolstone_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        pqz pqzVar = this.c;
        if (pqzVar == null) {
            contentValues.putNull("chatbot_directory_conversation_state");
        } else {
            contentValues.put("chatbot_directory_conversation_state", Integer.valueOf(pqzVar.a()));
        }
        if (intValue >= 59010) {
            contentValues.put("conversation_stop_state", Integer.valueOf(this.d));
        }
        if (intValue >= 59050) {
            psk pskVar = this.e;
            if (pskVar == null) {
                contentValues.putNull("conversation_toolstone_state");
            } else {
                contentValues.put("conversation_toolstone_state", Integer.valueOf(pskVar.a()));
            }
        }
        if (intValue >= 59050) {
            contentValues.put("conversation_toolstone_timestamp_ms", Long.valueOf(this.f));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sgc sgcVar = (sgc) agmqVar;
        aq();
        this.cJ = sgcVar.dx();
        if (sgcVar.db(0)) {
            this.a = sgcVar.f();
            fE(0);
        }
        if (sgcVar.db(1)) {
            this.b = sgcVar.i();
            fE(1);
        }
        if (sgcVar.db(2)) {
            this.c = sgcVar.g();
            fE(2);
        }
        if (sgcVar.db(3)) {
            this.d = sgcVar.c();
            fE(3);
        }
        if (sgcVar.db(4)) {
            this.e = sgcVar.h();
            fE(4);
        }
        if (sgcVar.db(5)) {
            this.f = sgcVar.e();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sga)) {
            return false;
        }
        sga sgaVar = (sga) obj;
        if (super.aC(sgaVar.cJ) && this.a == sgaVar.a && Objects.equals(this.b, sgaVar.b) && this.c == sgaVar.c && this.d == sgaVar.d && this.e == sgaVar.e && this.f == sgaVar.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "business_conversations_metadata", agnc.j(new String[]{"conversation_id", "chatbot_directory_conversation_state", "conversation_stop_state", "conversation_toolstone_state", "conversation_toolstone_timestamp_ms"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final psk h() {
        ao(4, "conversation_toolstone_state");
        return this.e;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), this.e, Long.valueOf(this.f), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "business_conversations_metadata";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new rnb((aglz) this, 10).get();
        pqz pqzVar = this.c;
        Object obj2 = 0;
        if (pqzVar == null) {
            valueOf = obj2;
        } else {
            valueOf = String.valueOf(pqzVar.a());
        }
        Integer valueOf2 = Integer.valueOf(this.d);
        psk pskVar = this.e;
        if (pskVar != null) {
            obj2 = String.valueOf(pskVar.a());
        }
        Object[] objArr = {obj, valueOf, valueOf2, obj2, Long.valueOf(this.f)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj3);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final void k() {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "business_conversations_metadata", this, new ryu(d, 17), new rug(this, 14));
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "BusinessConversationsMetadataTable -- REDACTED");
        }
        return a();
    }
}
