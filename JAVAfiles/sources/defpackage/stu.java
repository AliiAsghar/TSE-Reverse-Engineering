package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stu extends aglz implements agma {
    public long a;
    public MessageIdType b = rvc.a;
    public aqaz c = aqaz.UNKNOWN_CLASSIFICATION_TYPE;
    public aqcw d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageClassificationsTable [_id: %s,\n  message_id: %s,\n  classification_type: %s,\n  classification_details: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        byte[] byteArray;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        aqaz aqazVar = this.c;
        if (aqazVar == null) {
            contentValues.putNull("classification_type");
        } else {
            contentValues.put("classification_type", Integer.valueOf(aqazVar.a()));
        }
        if (intValue >= 58480) {
            aqcw aqcwVar = this.d;
            if (aqcwVar == null) {
                byteArray = null;
            } else {
                byteArray = aqcwVar.toByteArray();
            }
            contentValues.put("classification_details", byteArray);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        stw stwVar = (stw) agmqVar;
        aq();
        this.cJ = stwVar.dx();
        if (stwVar.db(0)) {
            this.a = stwVar.c();
            fE(0);
        }
        if (stwVar.db(1)) {
            this.b = stwVar.e();
            fE(1);
        }
        if (stwVar.db(2)) {
            this.c = stwVar.f();
            fE(2);
        }
        if (stwVar.db(3)) {
            this.d = stwVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof stu)) {
            return false;
        }
        stu stuVar = (stu) obj;
        if (super.aC(stuVar.cJ) && this.a == stuVar.a && Objects.equals(this.b, stuVar.b) && this.c == stuVar.c && Objects.equals(this.d, stuVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_classifications_table", agnc.j(new String[]{"message_id", "classification_type", "classification_details"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final aqcw h() {
        ao(3, "classification_details");
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_classifications_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        byte[] byteArray;
        Object obj = new snj(this, 12).get();
        aqaz aqazVar = this.c;
        if (aqazVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(aqazVar.a());
        }
        aqcw aqcwVar = this.d;
        if (aqcwVar == null) {
            byteArray = null;
        } else {
            byteArray = aqcwVar.toByteArray();
        }
        Object[] objArr = {obj, valueOf, byteArray};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageClassificationsTable -- REDACTED");
        }
        return a();
    }
}
