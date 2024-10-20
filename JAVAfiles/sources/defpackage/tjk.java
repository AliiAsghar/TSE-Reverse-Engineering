package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjk extends aglz implements agma {
    public tpz a;
    public String b;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchSuffixTable [which_database: %s,\n  participant_id: %s,\n  destination_suffix: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        tpz tpzVar = this.a;
        if (tpzVar == null) {
            contentValues.putNull("which_database");
        } else {
            contentValues.put("which_database", Integer.valueOf(tpzVar.ordinal()));
        }
        agnc.r(contentValues, "participant_id", this.b);
        agnc.r(contentValues, "destination_suffix", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tjm tjmVar = (tjm) agmqVar;
        aq();
        this.cJ = tjmVar.dx();
        if (tjmVar.db(0)) {
            this.a = tjmVar.c();
            fE(0);
        }
        if (tjmVar.db(1)) {
            this.b = tjmVar.f();
            fE(1);
        }
        if (tjmVar.db(2)) {
            this.c = tjmVar.e();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tjk)) {
            return false;
        }
        tjk tjkVar = (tjk) obj;
        if (super.aC(tjkVar.cJ) && this.a == tjkVar.a && Objects.equals(this.b, tjkVar.b) && Objects.equals(this.c, tjkVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_suffix", agnc.j(new String[]{"which_database", "participant_id", "destination_suffix"}));
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
        tpz tpzVar = this.a;
        if (tpzVar == null) {
            ordinal = 0;
        } else {
            ordinal = tpzVar.ordinal();
        }
        return Objects.hash(adayVar, Integer.valueOf(ordinal), this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "restore_workflow_scratch_suffix";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        tpz tpzVar = this.a;
        if (tpzVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tpzVar.ordinal());
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
            return String.format(Locale.US, "%s", "RestoreWorkflowScratchSuffixTable -- REDACTED");
        }
        return a();
    }
}
