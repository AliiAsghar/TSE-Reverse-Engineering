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
public final class srp extends aglz implements agma {
    public long a;
    public String c;
    public String d;
    public boolean f;
    public uyf g;
    public ConversationIdType b = ruy.a;
    public boolean e = true;
    public long h = 0;
    public long i = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "LighterConversationsTable [_id: %s,\n  conversation_id: %s,\n  business_id: %s,\n  lighter_conversation_id_json: %s,\n  read: %s,\n  is_last_message_outgoing: %s,\n  conversation_status: %s,\n  last_action_timestamp: %s,\n  sync_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
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
        agnc.r(contentValues, "business_id", this.c);
        agnc.r(contentValues, "lighter_conversation_id_json", this.d);
        if (intValue >= 58700) {
            contentValues.put("read", Boolean.valueOf(this.e));
        }
        if (intValue >= 58810) {
            contentValues.put("is_last_message_outgoing", Boolean.valueOf(this.f));
        }
        if (intValue >= 59030) {
            uyf uyfVar = this.g;
            if (uyfVar == null) {
                contentValues.putNull("conversation_status");
            } else {
                contentValues.put("conversation_status", Integer.valueOf(uyfVar.ordinal()));
            }
        }
        if (intValue >= 59040) {
            contentValues.put("last_action_timestamp", Long.valueOf(this.h));
        }
        if (intValue >= 59100) {
            contentValues.put("sync_timestamp_ms", Long.valueOf(this.i));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sru sruVar = (sru) agmqVar;
        aq();
        this.cJ = sruVar.dx();
        if (sruVar.db(0)) {
            this.a = sruVar.c();
            fE(0);
        }
        if (sruVar.db(1)) {
            this.b = sruVar.g();
            fE(1);
        }
        if (sruVar.db(2)) {
            this.c = sruVar.i();
            fE(2);
        }
        if (sruVar.db(3)) {
            this.d = sruVar.j();
            fE(3);
        }
        if (sruVar.db(4)) {
            this.e = sruVar.l();
            fE(4);
        }
        if (sruVar.db(5)) {
            this.f = sruVar.k();
            fE(5);
        }
        if (sruVar.db(6)) {
            this.g = sruVar.h();
            fE(6);
        }
        if (sruVar.db(7)) {
            this.h = sruVar.e();
            fE(7);
        }
        if (sruVar.db(8)) {
            this.i = sruVar.f();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof srp)) {
            return false;
        }
        srp srpVar = (srp) obj;
        if (super.aC(srpVar.cJ) && this.a == srpVar.a && Objects.equals(this.b, srpVar.b) && Objects.equals(this.c, srpVar.c) && Objects.equals(this.d, srpVar.d) && this.e == srpVar.e && this.f == srpVar.f && this.g == srpVar.g && this.h == srpVar.h && this.i == srpVar.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "lighter_conversations_table", agnc.j(new String[]{"conversation_id", "business_id", "lighter_conversation_id_json", "read", "is_last_message_outgoing", "conversation_status", "last_action_timestamp", "sync_timestamp_ms"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
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
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        String str2 = this.d;
        Boolean valueOf2 = Boolean.valueOf(this.e);
        Boolean valueOf3 = Boolean.valueOf(this.f);
        uyf uyfVar = this.g;
        if (uyfVar == null) {
            ordinal = 0;
        } else {
            ordinal = uyfVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, conversationIdType, str, str2, valueOf2, valueOf3, Integer.valueOf(ordinal), Long.valueOf(this.h), Long.valueOf(this.i), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "lighter_conversations_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new snj(this, 8).get();
        String str = this.c;
        String str2 = this.d;
        Integer valueOf2 = Integer.valueOf(this.e ? 1 : 0);
        Integer valueOf3 = Integer.valueOf(this.f ? 1 : 0);
        uyf uyfVar = this.g;
        if (uyfVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(uyfVar.ordinal());
        }
        Object[] objArr = {obj, str, str2, valueOf2, valueOf3, valueOf, Long.valueOf(this.h), Long.valueOf(this.i)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "LighterConversationsTable -- REDACTED");
        }
        return a();
    }
}
