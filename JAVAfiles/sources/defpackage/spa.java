package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spa extends aglz implements agma {
    public String b;
    public jpo c;
    public String d;
    public String f;
    public ConversationIdType a = ruy.a;
    public boolean e = false;
    public boolean g = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "DraftsTable [conversation_id: %s,\n  text: %s,\n  attachments: %s,\n  subject: %s,\n  is_urgent: %s,\n  replied_to_message_id: %s,\n  is_encrypted: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("conversation_id");
        }
        agnc.r(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.b);
        if (intValue >= 59420) {
            jpo jpoVar = this.c;
            if (jpoVar == null) {
                contentValues.putNull("attachments");
            } else {
                contentValues.put("attachments", jpoVar.toByteArray());
            }
        }
        if (intValue >= 59170) {
            agnc.r(contentValues, "subject", this.d);
        }
        if (intValue >= 59170) {
            contentValues.put("is_urgent", Boolean.valueOf(this.e));
        }
        if (intValue >= 59540) {
            agnc.r(contentValues, "replied_to_message_id", this.f);
        }
        if (intValue >= 59720) {
            contentValues.put("is_encrypted", Boolean.valueOf(this.g));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        spd spdVar = (spd) agmqVar;
        aq();
        this.cJ = spdVar.dx();
        if (spdVar.db(0)) {
            this.a = spdVar.e();
            fE(0);
        }
        if (spdVar.db(1)) {
            this.b = spdVar.h();
            fE(1);
        }
        if (spdVar.db(2)) {
            this.c = spdVar.c();
            fE(2);
        }
        if (spdVar.db(3)) {
            this.d = spdVar.g();
            fE(3);
        }
        if (spdVar.db(4)) {
            this.e = spdVar.j();
            fE(4);
        }
        if (spdVar.db(5)) {
            this.f = spdVar.f();
            fE(5);
        }
        if (spdVar.db(6)) {
            this.g = spdVar.i();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof spa)) {
            return false;
        }
        spa spaVar = (spa) obj;
        if (super.aC(spaVar.cJ) && Objects.equals(this.a, spaVar.a) && Objects.equals(this.b, spaVar.b) && Objects.equals(this.c, spaVar.c) && Objects.equals(this.d, spaVar.d) && this.e == spaVar.e && Objects.equals(this.f, spaVar.f) && this.g == spaVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "drafts", agnc.j(new String[]{"conversation_id", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "attachments", "subject", "is_urgent", "replied_to_message_id", "is_encrypted"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    @Deprecated
    public final Long h(int i) {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        return Long.valueOf(agnc.a(d2, "drafts", this, new rbe(d, i, 4), new rbc(16)));
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "drafts";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object obj = new snj(this, 2).get();
        String str = this.b;
        jpo jpoVar = this.c;
        if (jpoVar == null) {
            byteArray = null;
        } else {
            byteArray = jpoVar.toByteArray();
        }
        Object[] objArr = {obj, str, byteArray, this.d, Integer.valueOf(this.e ? 1 : 0), this.f, Integer.valueOf(this.g ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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

    public final /* synthetic */ akul k() {
        Object obj;
        aaze aazeVar = new aaze(this, 11);
        obj = agnc.c.j.get();
        return aktp.ai(aazeVar, (Executor) obj);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "DraftsTable -- REDACTED");
        }
        return a();
    }
}
