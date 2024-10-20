package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgj extends aglz implements agma {
    public String a;
    public MessageIdType b = rvc.a;
    public ConversationIdType c = ruy.a;
    public long d = 0;
    public tqo e = tqo.SET;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RemindersTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  trigger_time: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        if (intValue >= 35070) {
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
                contentValues.put("conversation_id", Long.valueOf(ruy.a(this.c)));
            } else {
                contentValues.putNull("conversation_id");
            }
        }
        contentValues.put("trigger_time", Long.valueOf(this.d));
        tqo tqoVar = this.e;
        if (tqoVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(tqoVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tgl tglVar = (tgl) agmqVar;
        aq();
        this.cJ = tglVar.dx();
        if (tglVar.db(0)) {
            this.a = tglVar.h();
            fE(0);
        }
        if (tglVar.db(1)) {
            this.b = tglVar.f();
            fE(1);
        }
        if (tglVar.db(2)) {
            this.c = tglVar.e();
            fE(2);
        }
        if (tglVar.db(3)) {
            this.d = tglVar.c();
            fE(3);
        }
        if (tglVar.db(4)) {
            this.e = tglVar.g();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tgj)) {
            return false;
        }
        tgj tgjVar = (tgj) obj;
        if (super.aC(tgjVar.cJ) && Objects.equals(this.a, tgjVar.a) && Objects.equals(this.b, tgjVar.b) && Objects.equals(this.c, tgjVar.c) && this.d == tgjVar.d && this.e == tgjVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "reminders", agnc.j(new String[]{"message_id", "conversation_id", "trigger_time", "status"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(3, "trigger_time");
        return this.d;
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
        String str = this.a;
        MessageIdType messageIdType = this.b;
        ConversationIdType conversationIdType = this.c;
        Long valueOf = Long.valueOf(this.d);
        tqo tqoVar = this.e;
        if (tqoVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqoVar.ordinal();
        }
        return Objects.hash(adayVar, str, messageIdType, conversationIdType, valueOf, Integer.valueOf(ordinal), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "reminders";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new tbv((aglz) this, 4).get();
        Object obj2 = new tbv((aglz) this, 5).get();
        Long valueOf2 = Long.valueOf(this.d);
        tqo tqoVar = this.e;
        if (tqoVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqoVar.ordinal());
        }
        Object[] objArr = {obj, obj2, valueOf2, valueOf};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RemindersTable -- REDACTED");
        }
        return a();
    }
}
