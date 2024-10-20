package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sos extends aglz implements agma {
    public String a;
    public String b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "DisambiguationTable [lookup_key: %s,\n  normalized_destination: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "lookup_key", this.a);
        agnc.r(contentValues, "normalized_destination", this.b);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sou souVar = (sou) agmqVar;
        aq();
        this.cJ = souVar.dx();
        if (souVar.db(0)) {
            this.a = souVar.c();
            fE(0);
        }
        if (souVar.db(1)) {
            this.b = souVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sos)) {
            return false;
        }
        sos sosVar = (sos) obj;
        if (super.aC(sosVar.cJ) && Objects.equals(this.a, sosVar.a) && Objects.equals(this.b, sosVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "disambiguations", agnc.j(new String[]{"lookup_key", "normalized_destination"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    @Deprecated
    public final void h() {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "disambiguations", this, new skt(d, 9), new rbc(15));
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "disambiguations";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b};
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
            return String.format(Locale.US, "%s", "DisambiguationTable -- REDACTED");
        }
        return a();
    }
}
