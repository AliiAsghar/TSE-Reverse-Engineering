package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgw extends aglz implements agma {
    public String a;
    public String b;
    public shf c;
    public she d;
    public ukr h;
    public int i;
    public amlo e = amlo.b(0);
    public int f = -1;
    public String g = "-1";
    public int j = -1;
    public String k = "-1";

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsDeadLetterQueueTable [_id: %s,\n  cms_id: %s,\n  cms_data_type: %s,\n  abandoned_action: %s,\n  failure_reason: %s,\n  bugle_table_type: %s,\n  bugle_id: %s,\n  cms_backup_parameters: %s,\n  backup_flags: %s,\n  backup_dependency_table_type: %s,\n  backup_dependency_bugle_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "cms_id", this.b);
        shf shfVar = this.c;
        if (shfVar == null) {
            contentValues.putNull("cms_data_type");
        } else {
            contentValues.put("cms_data_type", Integer.valueOf(shfVar.ordinal()));
        }
        she sheVar = this.d;
        if (sheVar == null) {
            contentValues.putNull("abandoned_action");
        } else {
            contentValues.put("abandoned_action", Integer.valueOf(sheVar.ordinal()));
        }
        amlo amloVar = this.e;
        if (amloVar == null) {
            contentValues.putNull("failure_reason");
        } else {
            contentValues.put("failure_reason", Integer.valueOf(amloVar.bs));
        }
        if (intValue >= 57090) {
            contentValues.put("bugle_table_type", Integer.valueOf(this.f));
        }
        if (intValue >= 57090) {
            agnc.r(contentValues, "bugle_id", this.g);
        }
        if (intValue >= 57090) {
            ukr ukrVar = this.h;
            if (ukrVar == null) {
                contentValues.putNull("cms_backup_parameters");
            } else {
                contentValues.put("cms_backup_parameters", ukrVar.toByteArray());
            }
        }
        if (intValue >= 57090) {
            contentValues.put("backup_flags", Integer.valueOf(this.i));
        }
        if (intValue >= 57090) {
            contentValues.put("backup_dependency_table_type", Integer.valueOf(this.j));
        }
        if (intValue >= 57090) {
            agnc.r(contentValues, "backup_dependency_bugle_id", this.k);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sha shaVar = (sha) agmqVar;
        aq();
        this.cJ = shaVar.dx();
        if (shaVar.db(0)) {
            this.a = shaVar.n();
            fE(0);
        }
        if (shaVar.db(1)) {
            this.b = shaVar.m();
            fE(1);
        }
        if (shaVar.db(2)) {
            this.c = shaVar.h();
            fE(2);
        }
        if (shaVar.db(3)) {
            this.d = shaVar.g();
            fE(3);
        }
        if (shaVar.db(4)) {
            this.e = shaVar.j();
            fE(4);
        }
        if (shaVar.db(5)) {
            this.f = shaVar.f();
            fE(5);
        }
        if (shaVar.db(6)) {
            this.g = shaVar.l();
            fE(6);
        }
        if (shaVar.db(7)) {
            this.h = shaVar.i();
            fE(7);
        }
        if (shaVar.db(8)) {
            this.i = shaVar.e();
            fE(8);
        }
        if (shaVar.db(9)) {
            this.j = shaVar.c();
            fE(9);
        }
        if (shaVar.db(10)) {
            this.k = shaVar.k();
            fE(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sgw)) {
            return false;
        }
        sgw sgwVar = (sgw) obj;
        if (super.aC(sgwVar.cJ) && Objects.equals(this.a, sgwVar.a) && Objects.equals(this.b, sgwVar.b) && this.c == sgwVar.c && this.d == sgwVar.d && this.e == sgwVar.e && this.f == sgwVar.f && Objects.equals(this.g, sgwVar.g) && Objects.equals(this.h, sgwVar.h) && this.i == sgwVar.i && this.j == sgwVar.j && Objects.equals(this.k, sgwVar.k)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_dead_letter_queue", agnc.j(new String[]{"cms_id", "cms_data_type", "abandoned_action", "failure_reason", "bugle_table_type", "bugle_id", "cms_backup_parameters", "backup_flags", "backup_dependency_table_type", "backup_dependency_bugle_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        String str = this.a;
        String str2 = this.b;
        shf shfVar = this.c;
        if (shfVar == null) {
            ordinal = 0;
        } else {
            ordinal = shfVar.ordinal();
        }
        Integer valueOf = Integer.valueOf(ordinal);
        she sheVar = this.d;
        if (sheVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = sheVar.ordinal();
        }
        return Objects.hash(adayVar, str, str2, valueOf, Integer.valueOf(ordinal2), this.e, Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), this.k, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_dead_letter_queue";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object valueOf2;
        byte[] byteArray;
        String str = this.b;
        shf shfVar = this.c;
        Object obj = 0;
        if (shfVar == null) {
            valueOf = obj;
        } else {
            valueOf = String.valueOf(shfVar.ordinal());
        }
        she sheVar = this.d;
        if (sheVar == null) {
            valueOf2 = obj;
        } else {
            valueOf2 = String.valueOf(sheVar.ordinal());
        }
        amlo amloVar = this.e;
        if (amloVar != null) {
            obj = String.valueOf(amloVar.bs);
        }
        Integer valueOf3 = Integer.valueOf(this.f);
        String str2 = this.g;
        ukr ukrVar = this.h;
        if (ukrVar == null) {
            byteArray = null;
        } else {
            byteArray = ukrVar.toByteArray();
        }
        Object[] objArr = {str, valueOf, valueOf2, obj, valueOf3, str2, byteArray, Integer.valueOf(this.i), Integer.valueOf(this.j), this.k};
        sb.append('(');
        for (int i = 0; i < 10; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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
            return String.format(Locale.US, "%s", "CmsDeadLetterQueueTable -- REDACTED");
        }
        return a();
    }
}
