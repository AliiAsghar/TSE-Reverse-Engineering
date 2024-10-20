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
public final class qpp extends aglz implements agma {
    public long a;
    public long b;
    public String c;
    public ConversationIdType d = ruy.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationMatcherCacheTable [_id: %s,\n  matcher_version: %s,\n  destination_key: %s,\n  conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("matcher_version", Long.valueOf(this.b));
        agnc.r(contentValues, "destination_key", this.c);
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.d)));
        } else {
            contentValues.putNull("conversation_id");
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qpr qprVar = (qpr) agmqVar;
        aq();
        this.cJ = qprVar.dx();
        if (qprVar.db(0)) {
            this.a = qprVar.c();
            fE(0);
        }
        if (qprVar.db(1)) {
            this.b = qprVar.e();
            fE(1);
        }
        if (qprVar.db(2)) {
            this.c = qprVar.g();
            fE(2);
        }
        if (qprVar.db(3)) {
            this.d = qprVar.f();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qpp)) {
            return false;
        }
        qpp qppVar = (qpp) obj;
        if (super.aC(qppVar.cJ) && this.a == qppVar.a && this.b == qppVar.b && Objects.equals(this.c, qppVar.c) && Objects.equals(this.d, qppVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_matcher_cache", agnc.j(new String[]{"matcher_version", "destination_key", "conversation_id"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_matcher_cache";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), this.c, new ngq((aglz) this, 16).get()};
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
            return String.format(Locale.US, "%s", "ConversationMatcherCacheTable -- REDACTED");
        }
        return a();
    }
}
