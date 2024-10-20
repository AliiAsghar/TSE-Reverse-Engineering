package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qts extends aglz implements agma {
    public qss a = null;
    public qss b = null;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "GroupMembersTable [group_token: %s,\n  destination_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        qss qssVar = this.a;
        if (qssVar != null && !qssVar.equals(null)) {
            contentValues.put("group_token", qta.e(this.a));
        } else {
            contentValues.putNull("group_token");
        }
        qss qssVar2 = this.b;
        if (qssVar2 != null && !qssVar2.equals(null)) {
            contentValues.put("destination_token", qta.e(this.b));
        } else {
            contentValues.putNull("destination_token");
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qtv qtvVar = (qtv) agmqVar;
        aq();
        this.cJ = qtvVar.dx();
        if (qtvVar.db(0)) {
            this.a = qtvVar.e();
            fE(0);
        }
        if (qtvVar.db(1)) {
            this.b = qtvVar.c();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qts)) {
            return false;
        }
        qts qtsVar = (qts) obj;
        if (super.aC(qtsVar.cJ) && Objects.equals(this.a, qtsVar.a) && Objects.equals(this.b, qtsVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "group_members", agnc.j(new String[]{"group_token", "destination_token"}));
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
        return "group_members";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new ngq((aglz) this, 19).get(), new ngq((aglz) this, 20).get()};
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
            return String.format(Locale.US, "%s", "GroupMembersTable -- REDACTED");
        }
        return a();
    }
}
