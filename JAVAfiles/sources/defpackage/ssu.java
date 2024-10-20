package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssu extends aglz implements agma {
    public int a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "LinkedAccountTable [account_id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("account_id", Integer.valueOf(this.a));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        ssy ssyVar = (ssy) agmqVar;
        aq();
        this.cJ = ssyVar.dx();
        if (ssyVar.db(0)) {
            this.a = ssyVar.c();
            super.fE(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ssu)) {
            return false;
        }
        ssu ssuVar = (ssu) obj;
        if (super.aC(ssuVar.cJ) && this.a == ssuVar.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "linked_account", agnc.j(new String[]{"account_id"}));
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
        return Objects.hash(adayVar, Integer.valueOf(this.a), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "linked_account";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.a)};
        sb.append('(');
        for (int i = 0; i <= 0; i++) {
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
            return String.format(Locale.US, "%s", "LinkedAccountTable -- REDACTED");
        }
        return a();
    }
}
