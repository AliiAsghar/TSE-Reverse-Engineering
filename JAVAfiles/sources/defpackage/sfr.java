package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfr extends aglz implements agma {
    public long a;
    public String b;
    public long c;
    public long d;
    public long e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupIdMapTable [_id: %s,\n  table_name: %s,\n  backup_id: %s,\n  bugle_id: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "table_name", this.b);
        contentValues.put("backup_id", Long.valueOf(this.c));
        contentValues.put("bugle_id", Long.valueOf(this.d));
        contentValues.put("status", Long.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sft sftVar = (sft) agmqVar;
        aq();
        this.cJ = sftVar.dx();
        if (sftVar.db(0)) {
            this.a = sftVar.f();
            fE(0);
        }
        if (sftVar.db(1)) {
            this.b = sftVar.h();
            fE(1);
        }
        if (sftVar.db(2)) {
            this.c = sftVar.c();
            fE(2);
        }
        if (sftVar.db(3)) {
            this.d = sftVar.e();
            fE(3);
        }
        if (sftVar.db(4)) {
            this.e = sftVar.g();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sfr)) {
            return false;
        }
        sfr sfrVar = (sfr) obj;
        if (super.aC(sfrVar.cJ) && this.a == sfrVar.a && Objects.equals(this.b, sfrVar.b) && this.c == sfrVar.c && this.d == sfrVar.d && this.e == sfrVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "backup_id_map", agnc.j(new String[]{"table_name", "backup_id", "bugle_id", "status"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(3, "bugle_id");
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "backup_id_map";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e)};
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
            return String.format(Locale.US, "%s", "BackupIdMapTable -- REDACTED");
        }
        return a();
    }
}
