package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvc extends aglz implements agma {
    public String b;
    public qvn d;
    public String e;
    public String f;
    public qwe a = null;
    public boolean c = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MyIdentitiesTable [token: %s,\n  provisioning_id: %s,\n  is_verified: %s,\n  address_type: %s,\n  phone_number: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        qwe qweVar = this.a;
        if (qweVar == null) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", riw.n(qweVar));
        }
        if (intValue >= 59990) {
            agnc.r(contentValues, "provisioning_id", this.b);
        }
        if (intValue >= 60320) {
            contentValues.put("is_verified", Boolean.valueOf(this.c));
        }
        if (intValue >= 59980) {
            qvn qvnVar = this.d;
            if (qvnVar == null) {
                contentValues.putNull("address_type");
            } else {
                contentValues.put("address_type", Integer.valueOf(qvnVar.ordinal()));
            }
        }
        agnc.r(contentValues, "phone_number", this.e);
        if (intValue >= 60120) {
            agnc.r(contentValues, "display_name", this.f);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qvf qvfVar = (qvf) agmqVar;
        aq();
        this.cJ = qvfVar.dx();
        if (qvfVar.db(0)) {
            this.a = qvfVar.e();
            fE(0);
        }
        if (qvfVar.db(1)) {
            this.b = qvfVar.h();
            fE(1);
        }
        if (qvfVar.db(2)) {
            this.c = qvfVar.i();
            fE(2);
        }
        if (qvfVar.db(3)) {
            this.d = qvfVar.c();
            fE(3);
        }
        if (qvfVar.db(4)) {
            this.e = qvfVar.f();
            fE(4);
        }
        if (qvfVar.db(5)) {
            this.f = qvfVar.g();
            fE(5);
        }
    }

    public final qwe d() {
        ao(0, "token");
        return this.a;
    }

    public final String e() {
        ao(4, "phone_number");
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qvc)) {
            return false;
        }
        qvc qvcVar = (qvc) obj;
        if (super.aC(qvcVar.cJ) && Objects.equals(this.a, qvcVar.a) && Objects.equals(this.b, qvcVar.b) && this.c == qvcVar.c && this.d == qvcVar.d && Objects.equals(this.e, qvcVar.e) && Objects.equals(this.f, qvcVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "my_identities", agnc.j(new String[]{"token", "provisioning_id", "is_verified", "address_type", "phone_number", "display_name"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final void h() {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "my_identities", this, new qsb(d, 7), new qab(16));
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
        String str = this.b;
        Boolean valueOf = Boolean.valueOf(this.c);
        qvn qvnVar = this.d;
        if (qvnVar == null) {
            ordinal = 0;
        } else {
            ordinal = qvnVar.ordinal();
        }
        return Objects.hash(adayVar, qweVar, str, valueOf, Integer.valueOf(ordinal), this.e, this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "my_identities";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String n = riw.n(this.a);
        String str = this.b;
        Integer valueOf2 = Integer.valueOf(this.c ? 1 : 0);
        qvn qvnVar = this.d;
        if (qvnVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qvnVar.ordinal());
        }
        Object[] objArr = {n, str, valueOf2, valueOf, this.e, this.f};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
            return String.format(Locale.US, "%s", "MyIdentitiesTable -- REDACTED");
        }
        return a();
    }
}
