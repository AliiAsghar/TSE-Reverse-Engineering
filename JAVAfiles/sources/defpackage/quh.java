package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class quh extends aglz implements agma {
    public String a;
    public int b;
    public int c = -1;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ActiveSimsTable [sim_serial_number: %s,\n  active_sub_id: %s,\n  sim_slot_index: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sim_serial_number", this.a);
        contentValues.put("active_sub_id", Integer.valueOf(this.b));
        contentValues.put("sim_slot_index", Integer.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        quk qukVar = (quk) agmqVar;
        aq();
        this.cJ = qukVar.dx();
        if (qukVar.db(0)) {
            this.a = qukVar.f();
            fE(0);
        }
        if (qukVar.db(1)) {
            this.b = qukVar.c();
            fE(1);
        }
        if (qukVar.db(2)) {
            this.c = qukVar.e();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof quh)) {
            return false;
        }
        quh quhVar = (quh) obj;
        if (super.aC(quhVar.cJ) && Objects.equals(this.a, quhVar.a) && this.b == quhVar.b && this.c == quhVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "active_sims", agnc.j(new String[]{"sim_serial_number", "active_sub_id", "sim_slot_index"}));
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
        return Objects.hash(adayVar, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "active_sims";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)};
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
            return String.format(Locale.US, "%s", "ActiveSimsTable -- REDACTED");
        }
        return a();
    }
}
