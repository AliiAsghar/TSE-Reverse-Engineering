package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnd extends aglz implements agma {
    public int a;
    public String b;
    public tnm c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SuperSortLabelsTable [_id: %s,\n  name: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", Integer.valueOf(this.a));
        agnc.r(contentValues, "name", this.b);
        tnm tnmVar = this.c;
        if (tnmVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(tnmVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tng tngVar = (tng) agmqVar;
        aq();
        this.cJ = tngVar.dx();
        if (tngVar.db(0)) {
            this.a = tngVar.c();
            fE(0);
        }
        if (tngVar.db(1)) {
            this.b = tngVar.f();
            fE(1);
        }
        if (tngVar.db(2)) {
            this.c = tngVar.e();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tnd)) {
            return false;
        }
        tnd tndVar = (tnd) obj;
        if (super.aC(tndVar.cJ) && this.a == tndVar.a && Objects.equals(this.b, tndVar.b) && this.c == tndVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "supersort_labels", agnc.j(new String[]{"_id", "name", "status"}));
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
        Integer valueOf = Integer.valueOf(this.a);
        String str = this.b;
        tnm tnmVar = this.c;
        if (tnmVar == null) {
            ordinal = 0;
        } else {
            ordinal = tnmVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, str, Integer.valueOf(ordinal), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "supersort_labels";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Integer valueOf2 = Integer.valueOf(this.a);
        String str = this.b;
        tnm tnmVar = this.c;
        if (tnmVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tnmVar.ordinal());
        }
        Object[] objArr = {valueOf2, str, valueOf};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
            return String.format(Locale.US, "%s", "SuperSortLabelsTable -- REDACTED");
        }
        return a();
    }
}
