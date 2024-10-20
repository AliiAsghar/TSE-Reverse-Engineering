package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnz extends aglz implements agma {
    public Instant a = Instant.EPOCH;
    public int b;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupMetadataTable [created_timestamp: %s,\n  schema_version: %s,\n  backup_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        rog.c().intValue();
        Instant instant = this.a;
        if (instant == null) {
            contentValues.putNull("created_timestamp");
        } else {
            contentValues.put("created_timestamp", Long.valueOf(uzz.k(instant)));
        }
        contentValues.put("schema_version", Integer.valueOf(this.b));
        agnc.r(contentValues, "backup_id", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rob robVar = (rob) agmqVar;
        aq();
        this.cJ = robVar.dx();
        if (robVar.db(0)) {
            this.a = robVar.e();
            fE(0);
        }
        if (robVar.db(1)) {
            this.b = robVar.c();
            fE(1);
        }
        if (robVar.db(2)) {
            this.c = robVar.f();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rnz)) {
            return false;
        }
        rnz rnzVar = (rnz) obj;
        if (super.aC(rnzVar.cJ) && Objects.equals(this.a, rnzVar.a) && this.b == rnzVar.b && Objects.equals(this.c, rnzVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "backup_metadata", agnc.j(new String[]{"created_timestamp", "schema_version", "backup_id"}));
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
        return Objects.hash(adayVar, this.a, Integer.valueOf(this.b), this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "backup_metadata";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(uzz.k(this.a)), Integer.valueOf(this.b), this.c};
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
            return String.format(Locale.US, "%s", "BackupMetadataTable -- REDACTED");
        }
        return a();
    }
}
