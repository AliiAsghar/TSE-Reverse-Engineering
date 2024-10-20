package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snq extends aglz implements agma {
    public tqb a = tqb.b(0);
    public long b = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "DataUpgradersTable [_id: %s,\n  last_update_version: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        tqb tqbVar = this.a;
        if (tqbVar == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Integer.valueOf(tqbVar.a()));
        }
        contentValues.put("last_update_version", Long.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sns snsVar = (sns) agmqVar;
        aq();
        this.cJ = snsVar.dx();
        if (snsVar.db(0)) {
            this.a = snsVar.e();
            fE(0);
        }
        if (snsVar.db(1)) {
            this.b = snsVar.c();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof snq)) {
            return false;
        }
        snq snqVar = (snq) obj;
        if (super.aC(snqVar.cJ) && this.a == snqVar.a && this.b == snqVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "data_upgrade_workers", agnc.j(new String[]{"_id", "last_update_version"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final long h() {
        ao(1, "last_update_version");
        return this.b;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "data_upgrade_workers";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        tqb tqbVar = this.a;
        if (tqbVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqbVar.a());
        }
        Object[] objArr = {valueOf, Long.valueOf(this.b)};
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
            return String.format(Locale.US, "%s", "DataUpgradersTable -- REDACTED");
        }
        return a();
    }
}
