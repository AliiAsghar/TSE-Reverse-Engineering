package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjs extends aglz implements agma {
    public tpz a;
    public String b;
    public long c;
    public long d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchTimestampsTable [which_database: %s,\n  message_id: %s,\n  timestamp_in_seconds: %s,\n  timestamp_mod_1000: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        tpz tpzVar = this.a;
        if (tpzVar == null) {
            contentValues.putNull("which_database");
        } else {
            contentValues.put("which_database", Integer.valueOf(tpzVar.ordinal()));
        }
        agnc.r(contentValues, "message_id", this.b);
        contentValues.put("timestamp_in_seconds", Long.valueOf(this.c));
        contentValues.put("timestamp_mod_1000", Long.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tju tjuVar = (tju) agmqVar;
        aq();
        this.cJ = tjuVar.dx();
        if (tjuVar.db(0)) {
            this.a = tjuVar.f();
            fE(0);
        }
        if (tjuVar.db(1)) {
            this.b = tjuVar.g();
            fE(1);
        }
        if (tjuVar.db(2)) {
            this.c = tjuVar.c();
            fE(2);
        }
        if (tjuVar.db(3)) {
            this.d = tjuVar.e();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tjs)) {
            return false;
        }
        tjs tjsVar = (tjs) obj;
        if (super.aC(tjsVar.cJ) && this.a == tjsVar.a && Objects.equals(this.b, tjsVar.b) && this.c == tjsVar.c && this.d == tjsVar.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_timestamps", agnc.j(new String[]{"which_database", "message_id", "timestamp_in_seconds", "timestamp_mod_1000"}));
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
        return Objects.hash(adayVar, Integer.valueOf(ordinal), this.b, Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "restore_workflow_scratch_timestamps";
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
        Object[] objArr = {valueOf, this.b, Long.valueOf(this.c), Long.valueOf(this.d)};
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
            return String.format(Locale.US, "%s", "RestoreWorkflowScratchTimestampsTable -- REDACTED");
        }
        return a();
    }
}
