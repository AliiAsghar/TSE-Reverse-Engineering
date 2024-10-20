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
public final class sqq extends aglz implements agma {
    public ConversationIdType a = ruy.a;
    public qwe b = null;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "GeminiConversationIdMappingsTable [conversation_id: %s,\n  my_identity_token: %s,\n  gemini_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("conversation_id");
        }
        qwe qweVar = this.b;
        if (qweVar != null && !qweVar.equals(null)) {
            contentValues.put("my_identity_token", riw.n(this.b));
        } else {
            contentValues.putNull("my_identity_token");
        }
        agnc.r(contentValues, "gemini_conversation_id", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sqs sqsVar = (sqs) agmqVar;
        aq();
        this.cJ = sqsVar.dx();
        if (sqsVar.db(0)) {
            this.a = sqsVar.e();
            fE(0);
        }
        if (sqsVar.db(1)) {
            this.b = sqsVar.c();
            fE(1);
        }
        if (sqsVar.db(2)) {
            this.c = sqsVar.f();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sqq)) {
            return false;
        }
        sqq sqqVar = (sqq) obj;
        if (super.aC(sqqVar.cJ) && Objects.equals(this.a, sqqVar.a) && Objects.equals(this.b, sqqVar.b) && Objects.equals(this.c, sqqVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "gemini_conversation_id_mappings", agnc.j(new String[]{"conversation_id", "my_identity_token", "gemini_conversation_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "gemini_conversation_id_mappings";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new snj(this, 5).get(), new snj(this, 6).get(), this.c};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
            return String.format(Locale.US, "%s", "GeminiConversationIdMappingsTable -- REDACTED");
        }
        return a();
    }
}
