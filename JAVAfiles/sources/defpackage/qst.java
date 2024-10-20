package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qst extends aglz implements agma {
    public qss a = null;
    public String b;
    public qsn c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "DestinationsTable [token: %s,\n  address: %s,\n  address_type: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        qss qssVar = this.a;
        if (qssVar != null && !qssVar.equals(null)) {
            contentValues.put("token", qta.e(this.a));
        } else {
            contentValues.putNull("token");
        }
        agnc.r(contentValues, "address", this.b);
        qsn qsnVar = this.c;
        if (qsnVar == null) {
            contentValues.putNull("address_type");
        } else {
            contentValues.put("address_type", Integer.valueOf(qsnVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qsv qsvVar = (qsv) agmqVar;
        aq();
        this.cJ = qsvVar.dx();
        if (qsvVar.db(0)) {
            this.a = qsvVar.e();
            fE(0);
        }
        if (qsvVar.db(1)) {
            this.b = qsvVar.f();
            fE(1);
        }
        if (qsvVar.db(2)) {
            this.c = qsvVar.c();
            fE(2);
        }
    }

    public final void d() {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "destinations", this, new qsb(d, 2), new qab(13));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qst)) {
            return false;
        }
        qst qstVar = (qst) obj;
        if (super.aC(qstVar.cJ) && Objects.equals(this.a, qstVar.a) && Objects.equals(this.b, qstVar.b) && this.c == qstVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "destinations", agnc.j(new String[]{"token", "address", "address_type"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        qss qssVar = this.a;
        String str = this.b;
        qsn qsnVar = this.c;
        if (qsnVar == null) {
            ordinal = 0;
        } else {
            ordinal = qsnVar.ordinal();
        }
        return Objects.hash(adayVar, qssVar, str, Integer.valueOf(ordinal), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "destinations";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new ngq((aglz) this, 18).get();
        String str = this.b;
        qsn qsnVar = this.c;
        if (qsnVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qsnVar.ordinal());
        }
        Object[] objArr = {obj, str, valueOf};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "DestinationsTable -- REDACTED");
        }
        return a();
    }
}
