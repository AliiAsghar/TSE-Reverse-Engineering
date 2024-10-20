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
public final class tod extends aglz implements agma {
    public String a;
    public MessageIdType b = rvc.a;
    public long c;
    public long d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "UserReferenceTable [_id: %s,\n  message_id: %s,\n  user_ref_id: %s,\n  user_ref_datetime: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        agnc.q(contentValues, "user_ref_id", this.c);
        contentValues.put("user_ref_datetime", Long.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        toh tohVar = (toh) agmqVar;
        aq();
        this.cJ = tohVar.dx();
        if (tohVar.db(0)) {
            this.a = tohVar.g();
            fE(0);
        }
        if (tohVar.db(1)) {
            this.b = tohVar.f();
            fE(1);
        }
        if (tohVar.db(2)) {
            this.c = tohVar.c();
            fE(2);
        }
        if (tohVar.db(3)) {
            this.d = tohVar.e();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tod)) {
            return false;
        }
        tod todVar = (tod) obj;
        if (super.aC(todVar.cJ) && Objects.equals(this.a, todVar.a) && Objects.equals(this.b, todVar.b) && this.c == todVar.c && this.d == todVar.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "user_references", agnc.j(new String[]{"message_id", "user_ref_id", "user_ref_datetime"}));
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
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "user_references";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new tbv((aglz) this, 8).get(), Long.valueOf(this.c), Long.valueOf(this.d)};
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
            return String.format(Locale.US, "%s", "UserReferenceTable -- REDACTED");
        }
        return a();
    }
}
