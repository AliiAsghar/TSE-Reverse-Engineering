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
public final class sle extends aglz implements agma {
    public long a;
    public ConversationIdType b = ruy.a;
    public boolean c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationPinTable [_id: %s,\n  conversation_id: %s,\n  pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        contentValues.put("pin_status", Boolean.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        slh slhVar = (slh) agmqVar;
        aq();
        this.cJ = slhVar.dx();
        if (slhVar.db(0)) {
            this.a = slhVar.c();
            fE(0);
        }
        if (slhVar.db(1)) {
            this.b = slhVar.e();
            fE(1);
        }
        if (slhVar.db(2)) {
            this.c = slhVar.f();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sle)) {
            return false;
        }
        sle sleVar = (sle) obj;
        if (super.aC(sleVar.cJ) && this.a == sleVar.a && Objects.equals(this.b, sleVar.b) && this.c == sleVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_pin", agnc.j(new String[]{"conversation_id", "pin_status"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Boolean.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_pin";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new rnb((aglz) this, 15).get(), Integer.valueOf(this.c ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
            return String.format(Locale.US, "%s", "ConversationPinTable -- REDACTED");
        }
        return a();
    }
}
