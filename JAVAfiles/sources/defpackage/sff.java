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
public final class sff extends aglz implements agma {
    public long a;
    public ConversationIdType b = ruy.a;
    public int c = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "AddContactBannerTable [_id: %s,\n  conversation_id: %s,\n  banner_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        contentValues.put("banner_status", Integer.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sfj sfjVar = (sfj) agmqVar;
        aq();
        this.cJ = sfjVar.dx();
        if (sfjVar.db(0)) {
            this.a = sfjVar.e();
            fE(0);
        }
        if (sfjVar.db(1)) {
            this.b = sfjVar.f();
            fE(1);
        }
        if (sfjVar.db(2)) {
            this.c = sfjVar.c();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sff)) {
            return false;
        }
        sff sffVar = (sff) obj;
        if (super.aC(sffVar.cJ) && this.a == sffVar.a && Objects.equals(this.b, sffVar.b) && this.c == sffVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "add_contact_banner", agnc.j(new String[]{"conversation_id", "banner_status"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "add_contact_banner";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new rnb((aglz) this, 9).get(), Integer.valueOf(this.c)};
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
            return String.format(Locale.US, "%s", "AddContactBannerTable -- REDACTED");
        }
        return a();
    }
}
