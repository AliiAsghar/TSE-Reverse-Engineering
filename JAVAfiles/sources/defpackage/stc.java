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
public final class stc extends aglz<stf, sti, stj, stc, ste> implements agma<Long> {
    public String a;
    public ConversationIdType b = ruy.a;
    public MessageIdType c = rvc.a;
    public int d = 0;
    public aqby e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageAnnotationsTable [_id: %s,\n  conversation_id: %s,\n  message_id: %s,\n  annotation_type: %s,\n  annotation_details: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(conversationIdType)));
        }
        if (intValue >= 20040) {
            MessageIdType messageIdType = this.c;
            if (messageIdType != null && !messageIdType.equals(rvc.a)) {
                contentValues.put("message_id", Long.valueOf(rvc.a(this.c)));
            } else {
                contentValues.putNull("message_id");
            }
        }
        contentValues.put("annotation_type", Integer.valueOf(this.d));
        aqby aqbyVar = this.e;
        if (aqbyVar == null) {
            contentValues.putNull("annotation_details");
        } else {
            contentValues.put("annotation_details", aqbyVar.toByteArray());
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        stf stfVar = (stf) agmqVar;
        aq();
        this.cJ = stfVar.dx();
        if (stfVar.db(0)) {
            this.a = stfVar.h();
            fE(0);
        }
        if (stfVar.db(1)) {
            this.b = stfVar.e();
            fE(1);
        }
        if (stfVar.db(2)) {
            this.c = stfVar.f();
            fE(2);
        }
        if (stfVar.db(3)) {
            this.d = stfVar.c();
            fE(3);
        }
        if (stfVar.db(4)) {
            this.e = stfVar.g();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof stc)) {
            return false;
        }
        stc stcVar = (stc) obj;
        if (super.aC(stcVar.cJ) && Objects.equals(this.a, stcVar.a) && Objects.equals(this.b, stcVar.b) && Objects.equals(this.c, stcVar.c) && this.d == stcVar.d && Objects.equals(this.e, stcVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages_annotations", agnc.j(new String[]{"conversation_id", "message_id", "annotation_type", "annotation_details"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int h() {
        ao(3, "annotation_type");
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
        return Objects.hash(adayVar, this.a, this.b, this.c, Integer.valueOf(this.d), this.e, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "messages_annotations";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Long valueOf = Long.valueOf(ruy.a(this.b));
        Object obj = new snj(this, 10).get();
        Integer valueOf2 = Integer.valueOf(this.d);
        aqby aqbyVar = this.e;
        if (aqbyVar == null) {
            byteArray = null;
        } else {
            byteArray = aqbyVar.toByteArray();
        }
        Object[] objArr = {valueOf, obj, valueOf2, byteArray};
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

    public final ConversationIdType k() {
        ao(1, "conversation_id");
        return this.b;
    }

    public final MessageIdType l() {
        ao(2, "message_id");
        return this.c;
    }

    public final aqby m() {
        ao(4, "annotation_details");
        return this.e;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageAnnotationsTable -- REDACTED");
        }
        return a();
    }
}
