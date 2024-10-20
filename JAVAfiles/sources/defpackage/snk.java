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
public final class snk extends aglz implements agma {
    public ConversationIdType a = ruy.a;
    public String b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CustodianRcsGroupIdsTable [conversation_id: %s,\n  rcs_group_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.a)));
        } else {
            contentValues.putNull("conversation_id");
        }
        agnc.r(contentValues, "rcs_group_id", this.b);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        snm snmVar = (snm) agmqVar;
        aq();
        this.cJ = snmVar.dx();
        if (snmVar.db(0)) {
            this.a = snmVar.c();
            fE(0);
        }
        if (snmVar.db(1)) {
            this.b = snmVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof snk)) {
            return false;
        }
        snk snkVar = (snk) obj;
        if (super.aC(snkVar.cJ) && Objects.equals(this.a, snkVar.a) && Objects.equals(this.b, snkVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "custodian_rcs_group_ids", agnc.j(new String[]{"conversation_id", "rcs_group_id"}));
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
        return Objects.hash(adayVar, this.a, this.b, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "custodian_rcs_group_ids";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new snj(this, 0).get(), this.b};
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
            return String.format(Locale.US, "%s", "CustodianRcsGroupIdsTable -- REDACTED");
        }
        return a();
    }
}
