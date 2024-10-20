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
public final class ynt extends aglz implements agma {
    public String b;
    public String d;
    public long e;
    public MessageIdType a = rvc.a;
    public ConversationIdType c = ruy.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SpamLoggingIdsTable [message_id: %s,\n  message_logging_id: %s,\n  conversation_id: %s,\n  conversation_logging_id: %s,\n  generation_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("message_id");
        }
        agnc.r(contentValues, "message_logging_id", this.b);
        ConversationIdType conversationIdType = this.c;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.c)));
        } else {
            contentValues.putNull("conversation_id");
        }
        agnc.r(contentValues, "conversation_logging_id", this.d);
        contentValues.put("generation_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        ynx ynxVar = (ynx) agmqVar;
        aq();
        this.cJ = ynxVar.dx();
        if (ynxVar.db(0)) {
            this.a = ynxVar.f();
            fE(0);
        }
        if (ynxVar.db(1)) {
            this.b = ynxVar.h();
            fE(1);
        }
        if (ynxVar.db(2)) {
            this.c = ynxVar.e();
            fE(2);
        }
        if (ynxVar.db(3)) {
            this.d = ynxVar.g();
            fE(3);
        }
        if (ynxVar.db(4)) {
            this.e = ynxVar.c();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ynt)) {
            return false;
        }
        ynt yntVar = (ynt) obj;
        if (super.aC(yntVar.cJ) && Objects.equals(this.a, yntVar.a) && Objects.equals(this.b, yntVar.b) && Objects.equals(this.c, yntVar.c) && Objects.equals(this.d, yntVar.d) && this.e == yntVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "spam_logging_ids_table", agnc.j(new String[]{"message_id", "message_logging_id", "conversation_id", "conversation_logging_id", "generation_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final String h() {
        ao(3, "conversation_logging_id");
        return this.d;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, Long.valueOf(this.e), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "spam_logging_ids_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new wxx((aglz) this, 16).get(), this.b, new wxx((aglz) this, 17).get(), this.d, Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final String k() {
        ao(1, "message_logging_id");
        return this.b;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "SpamLoggingIdsTable -- REDACTED");
        }
        return a();
    }
}
