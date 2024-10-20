package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class soa extends aglz implements agma {
    public long a;
    public String b;
    public long c = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "DataUsageTable [_id: %s,\n  phone_number: %s,\n  data_size: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "phone_number", this.b);
        contentValues.put("data_size", Long.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        soc socVar = (soc) agmqVar;
        aq();
        this.cJ = socVar.dx();
        if (socVar.db(0)) {
            this.a = socVar.e();
            fE(0);
        }
        if (socVar.db(1)) {
            this.b = socVar.f();
            fE(1);
        }
        if (socVar.db(2)) {
            this.c = socVar.c();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof soa)) {
            return false;
        }
        soa soaVar = (soa) obj;
        if (super.aC(soaVar.cJ) && this.a == soaVar.a && Objects.equals(this.b, soaVar.b) && this.c == soaVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "data_usage", agnc.j(new String[]{"phone_number", "data_size"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Long.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "data_usage";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Long.valueOf(this.c)};
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
            return String.format(Locale.US, "%s", "DataUsageTable -- REDACTED");
        }
        return a();
    }
}
