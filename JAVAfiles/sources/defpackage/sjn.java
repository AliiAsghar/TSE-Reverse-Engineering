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
public final class sjn extends aglz implements agma {
    public long a;
    public String e;
    public ConversationIdType b = ruy.a;
    public qhy c = qhy.CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
    public qhx d = qhx.CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
    public long f = 0;
    public long g = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationClassificationsTable [_id: %s,\n  conversation_id: %s,\n  classification_type: %s,\n  classification_state: %s,\n  date: %s,\n  impression_count: %s,\n  generated_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        qhy qhyVar = this.c;
        if (qhyVar == null) {
            contentValues.putNull("classification_type");
        } else {
            contentValues.put("classification_type", Integer.valueOf(qhyVar.a()));
        }
        if (intValue >= 58690) {
            qhx qhxVar = this.d;
            if (qhxVar == null) {
                contentValues.putNull("classification_state");
            } else {
                contentValues.put("classification_state", Integer.valueOf(qhxVar.a()));
            }
        }
        agnc.r(contentValues, "date", this.e);
        if (intValue >= 58840) {
            contentValues.put("impression_count", Long.valueOf(this.f));
        }
        if (intValue >= 58840) {
            contentValues.put("generated_timestamp", Long.valueOf(this.g));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sjp sjpVar = (sjp) agmqVar;
        aq();
        this.cJ = sjpVar.dx();
        if (sjpVar.db(0)) {
            this.a = sjpVar.e();
            fE(0);
        }
        if (sjpVar.db(1)) {
            this.b = sjpVar.i();
            fE(1);
        }
        if (sjpVar.db(2)) {
            this.c = sjpVar.h();
            fE(2);
        }
        if (sjpVar.db(3)) {
            this.d = sjpVar.g();
            fE(3);
        }
        if (sjpVar.db(4)) {
            this.e = sjpVar.j();
            fE(4);
        }
        if (sjpVar.db(5)) {
            this.f = sjpVar.f();
            fE(5);
        }
        if (sjpVar.db(6)) {
            this.g = sjpVar.c();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sjn)) {
            return false;
        }
        sjn sjnVar = (sjn) obj;
        if (super.aC(sjnVar.cJ) && this.a == sjnVar.a && Objects.equals(this.b, sjnVar.b) && this.c == sjnVar.c && this.d == sjnVar.d && Objects.equals(this.e, sjnVar.e) && this.f == sjnVar.f && this.g == sjnVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_classifications_table", agnc.j(new String[]{"conversation_id", "classification_type", "classification_state", "date", "impression_count", "generated_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final qhy h() {
        ao(2, "classification_type");
        return this.c;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, this.e, Long.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_classifications_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new rnb((aglz) this, 11).get();
        qhy qhyVar = this.c;
        Object obj2 = 0;
        if (qhyVar == null) {
            valueOf = obj2;
        } else {
            valueOf = String.valueOf(qhyVar.a());
        }
        qhx qhxVar = this.d;
        if (qhxVar != null) {
            obj2 = String.valueOf(qhxVar.a());
        }
        Object[] objArr = {obj, valueOf, obj2, this.e, Long.valueOf(this.f), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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

    public final String k() {
        ao(4, "date");
        return this.e;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationClassificationsTable -- REDACTED");
        }
        return a();
    }
}
