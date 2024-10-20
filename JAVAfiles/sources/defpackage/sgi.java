package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgi extends aglz implements agma {
    public long a;
    public long b;
    public long c;
    public long d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsBackupDependencyCacheTable [_id: %s,\n  dependent_id: %s,\n  dependency_id: %s,\n  inserted_at_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("dependent_id", Long.valueOf(this.b));
        contentValues.put("dependency_id", Long.valueOf(this.c));
        contentValues.put("inserted_at_timestamp", Long.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sgl sglVar = (sgl) agmqVar;
        aq();
        this.cJ = sglVar.dx();
        if (sglVar.db(0)) {
            this.a = sglVar.f();
            fE(0);
        }
        if (sglVar.db(1)) {
            this.b = sglVar.e();
            fE(1);
        }
        if (sglVar.db(2)) {
            this.c = sglVar.c();
            fE(2);
        }
        if (sglVar.db(3)) {
            this.d = sglVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sgi)) {
            return false;
        }
        sgi sgiVar = (sgi) obj;
        if (super.aC(sgiVar.cJ) && this.a == sgiVar.a && this.b == sgiVar.b && this.c == sgiVar.c && this.d == sgiVar.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_backup_dependency_cache_table", agnc.j(new String[]{"dependent_id", "dependency_id", "inserted_at_timestamp"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_backup_dependency_cache_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)};
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
            return String.format(Locale.US, "%s", "CmsBackupDependencyCacheTable -- REDACTED");
        }
        return a();
    }
}
