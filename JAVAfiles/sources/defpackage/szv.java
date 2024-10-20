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
public final class szv extends aglz implements agma {
    public ConversationIdType a = ruy.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ParentDisallowedConversationsTable [conversation_id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("conversation_id");
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        szx szxVar = (szx) agmqVar;
        aq();
        this.cJ = szxVar.dx();
        if (szxVar.db(0)) {
            this.a = szxVar.c();
            super.fE(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof szv)) {
            return false;
        }
        szv szvVar = (szv) obj;
        if (super.aC(szvVar.cJ) && Objects.equals(this.a, szvVar.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "parent_disallowed_conversations", agnc.j(new String[]{"conversation_id"}));
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
        return Objects.hash(adayVar, this.a, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "parent_disallowed_conversations";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new swc(this, 17).get()};
        sb.append('(');
        for (int i = 0; i <= 0; i++) {
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
            return String.format(Locale.US, "%s", "ParentDisallowedConversationsTable -- REDACTED");
        }
        return a();
    }
}
