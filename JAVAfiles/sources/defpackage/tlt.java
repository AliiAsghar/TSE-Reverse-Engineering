package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tlt extends aglz implements agma {
    public String a;
    public String b;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SqliteStat1 [tbl: %s,\n  idx: %s,\n  stat: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "tbl", this.a);
        agnc.r(contentValues, "idx", this.b);
        agnc.r(contentValues, "stat", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tlv tlvVar = (tlv) agmqVar;
        aq();
        this.cJ = tlvVar.dx();
        if (tlvVar.db(0)) {
            this.a = tlvVar.f();
            fE(0);
        }
        if (tlvVar.db(1)) {
            this.b = tlvVar.c();
            fE(1);
        }
        if (tlvVar.db(2)) {
            this.c = tlvVar.e();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tlt)) {
            return false;
        }
        tlt tltVar = (tlt) obj;
        if (super.aC(tltVar.cJ) && Objects.equals(this.a, tltVar.a) && Objects.equals(this.b, tltVar.b) && Objects.equals(this.c, tltVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sqlite_stat1", agnc.j(new String[]{"tbl", "idx", "stat"}));
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
        return Objects.hash(adayVar, this.a, this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "sqlite_stat1";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c};
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
            return String.format(Locale.US, "%s", "SqliteStat1 -- REDACTED");
        }
        return a();
    }
}
