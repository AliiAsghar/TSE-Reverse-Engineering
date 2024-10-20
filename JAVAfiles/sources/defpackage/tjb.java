package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjb extends aglz implements agma {
    public tjj a;
    public String b;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchDuplicatesTable [key: %s,\n  backup_id: %s,\n  bugle_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        tjj tjjVar = this.a;
        if (tjjVar == null) {
            contentValues.putNull("key");
        } else {
            contentValues.put("key", Integer.valueOf(tjjVar.ordinal()));
        }
        agnc.r(contentValues, "backup_id", this.b);
        agnc.r(contentValues, "bugle_id", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tjd tjdVar = (tjd) agmqVar;
        aq();
        this.cJ = tjdVar.dx();
        if (tjdVar.db(0)) {
            this.a = tjdVar.c();
            fE(0);
        }
        if (tjdVar.db(1)) {
            this.b = tjdVar.e();
            fE(1);
        }
        if (tjdVar.db(2)) {
            this.c = tjdVar.f();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tjb)) {
            return false;
        }
        tjb tjbVar = (tjb) obj;
        if (super.aC(tjbVar.cJ) && this.a == tjbVar.a && Objects.equals(this.b, tjbVar.b) && Objects.equals(this.c, tjbVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_duplicates", agnc.j(new String[]{"key", "backup_id", "bugle_id"}));
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
        tjj tjjVar = this.a;
        if (tjjVar == null) {
            ordinal = 0;
        } else {
            ordinal = tjjVar.ordinal();
        }
        return Objects.hash(adayVar, Integer.valueOf(ordinal), this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "restore_workflow_scratch_duplicates";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        tjj tjjVar = this.a;
        if (tjjVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tjjVar.ordinal());
        }
        Object[] objArr = {valueOf, this.b, this.c};
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
            return String.format(Locale.US, "%s", "RestoreWorkflowScratchDuplicatesTable -- REDACTED");
        }
        return a();
    }
}
