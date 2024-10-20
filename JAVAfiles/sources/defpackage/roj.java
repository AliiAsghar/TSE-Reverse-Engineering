package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class roj extends aglz implements agma {
    public qwe a = null;
    public qvn b;
    public String c;
    public String d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupMyIdentitiesTable [token: %s,\n  address_type: %s,\n  phone_number: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        qwe qweVar = this.a;
        if (qweVar == null) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", riw.n(qweVar));
        }
        qvn qvnVar = this.b;
        if (qvnVar == null) {
            contentValues.putNull("address_type");
        } else {
            contentValues.put("address_type", Integer.valueOf(qvnVar.ordinal()));
        }
        agnc.r(contentValues, "phone_number", this.c);
        agnc.r(contentValues, "display_name", this.d);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rol rolVar = (rol) agmqVar;
        aq();
        this.cJ = rolVar.dx();
        if (rolVar.db(0)) {
            this.a = rolVar.e();
            fE(0);
        }
        if (rolVar.db(1)) {
            this.b = rolVar.c();
            fE(1);
        }
        if (rolVar.db(2)) {
            this.c = rolVar.f();
            fE(2);
        }
        if (rolVar.db(3)) {
            this.d = rolVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof roj)) {
            return false;
        }
        roj rojVar = (roj) obj;
        if (super.aC(rojVar.cJ) && Objects.equals(this.a, rojVar.a) && this.b == rojVar.b && Objects.equals(this.c, rojVar.c) && Objects.equals(this.d, rojVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "my_identities_backup", agnc.j(new String[]{"token", "address_type", "phone_number", "display_name"}));
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
        qwe qweVar = this.a;
        qvn qvnVar = this.b;
        if (qvnVar == null) {
            ordinal = 0;
        } else {
            ordinal = qvnVar.ordinal();
        }
        return Objects.hash(adayVar, qweVar, Integer.valueOf(ordinal), this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "my_identities_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String n = riw.n(this.a);
        qvn qvnVar = this.b;
        if (qvnVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qvnVar.ordinal());
        }
        Object[] objArr = {n, valueOf, this.c, this.d};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
            return String.format(Locale.US, "%s", "BackupMyIdentitiesTable -- REDACTED");
        }
        return a();
    }
}
