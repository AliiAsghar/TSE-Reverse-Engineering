package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcg extends aglz implements agma {
    public long a;
    public String b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "PhoneNumberMinMatchGuesserTable [guesser_id: %s,\n  test_phone_number: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "test_phone_number", this.b);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tck tckVar = (tck) agmqVar;
        aq();
        this.cJ = tckVar.dx();
        if (tckVar.db(0)) {
            this.a = tckVar.c();
            fE(0);
        }
        if (tckVar.db(1)) {
            this.b = tckVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tcg)) {
            return false;
        }
        tcg tcgVar = (tcg) obj;
        if (super.aC(tcgVar.cJ) && this.a == tcgVar.a && Objects.equals(this.b, tcgVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "phone_number_min_match_guesser", agnc.j(new String[]{"test_phone_number"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "guesser_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "phone_number_min_match_guesser";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b};
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
            return String.format(Locale.US, "%s", "PhoneNumberMinMatchGuesserTable -- REDACTED");
        }
        return a();
    }
}
