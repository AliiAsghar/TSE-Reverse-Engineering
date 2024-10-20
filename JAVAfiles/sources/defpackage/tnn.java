package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnn extends aglz implements agma {
    public tqv a = tqv.b(0);
    public boolean b = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "TriggerFlagsTable [_id: %s,\n  enabled: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        tqv tqvVar = this.a;
        if (tqvVar == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Integer.valueOf(tqvVar.a()));
        }
        contentValues.put("enabled", Boolean.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tnq tnqVar = (tnq) agmqVar;
        aq();
        this.cJ = tnqVar.dx();
        if (tnqVar.db(0)) {
            this.a = tnqVar.c();
            fE(0);
        }
        if (tnqVar.db(1)) {
            this.b = tnqVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tnn)) {
            return false;
        }
        tnn tnnVar = (tnn) obj;
        if (super.aC(tnnVar.cJ) && this.a == tnnVar.a && this.b == tnnVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "trigger_flags", agnc.j(new String[]{"_id", "enabled"}));
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
        return Objects.hash(adayVar, this.a, Boolean.valueOf(this.b), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "trigger_flags";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        tqv tqvVar = this.a;
        if (tqvVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqvVar.a());
        }
        Object[] objArr = {valueOf, Integer.valueOf(this.b ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
            return String.format(Locale.US, "%s", "TriggerFlagsTable -- REDACTED");
        }
        return a();
    }
}
