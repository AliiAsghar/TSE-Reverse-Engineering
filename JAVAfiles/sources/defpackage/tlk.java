package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tlk extends aglz implements agma {
    public String a;
    public String b;
    public String c;
    public long d;
    public String e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SqliteMaster [type: %s,\n  name: %s,\n  tbl_name: %s,\n  rootpage: %s,\n  sql: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        agnc.r(contentValues, "name", this.b);
        agnc.r(contentValues, "tbl_name", this.c);
        contentValues.put("rootpage", Long.valueOf(this.d));
        agnc.r(contentValues, "sql", this.e);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tln tlnVar = (tln) agmqVar;
        aq();
        this.cJ = tlnVar.dx();
        if (tlnVar.db(0)) {
            this.a = tlnVar.h();
            fE(0);
        }
        if (tlnVar.db(1)) {
            this.b = tlnVar.e();
            fE(1);
        }
        if (tlnVar.db(2)) {
            this.c = tlnVar.g();
            fE(2);
        }
        if (tlnVar.db(3)) {
            this.d = tlnVar.c();
            fE(3);
        }
        if (tlnVar.db(4)) {
            this.e = tlnVar.f();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tlk)) {
            return false;
        }
        tlk tlkVar = (tlk) obj;
        if (super.aC(tlkVar.cJ) && Objects.equals(this.a, tlkVar.a) && Objects.equals(this.b, tlkVar.b) && Objects.equals(this.c, tlkVar.c) && this.d == tlkVar.d && Objects.equals(this.e, tlkVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sqlite_master", agnc.j(new String[]{BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "name", "tbl_name", "rootpage", "sql"}));
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
        return Objects.hash(adayVar, this.a, this.b, this.c, Long.valueOf(this.d), this.e, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "sqlite_master";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c, Long.valueOf(this.d), this.e};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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
            return String.format(Locale.US, "%s", "SqliteMaster -- REDACTED");
        }
        return a();
    }
}
