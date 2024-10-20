package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syy extends aglz implements agma {
    public Instant a = Instant.EPOCH;
    public aldw b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "P13nNormalizedFeatureValuesTable [date: %s,\n  features: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        byte[] byteArray;
        Instant instant = this.a;
        if (instant != null && !instant.equals(Instant.EPOCH)) {
            contentValues.put("date", Long.valueOf(uxi.h(this.a)));
        } else {
            contentValues.putNull("date");
        }
        aldw aldwVar = this.b;
        if (aldwVar == null) {
            byteArray = null;
        } else {
            byteArray = aldwVar.toByteArray();
        }
        contentValues.put("features", byteArray);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sza szaVar = (sza) agmqVar;
        aq();
        this.cJ = szaVar.dx();
        if (szaVar.db(0)) {
            this.a = szaVar.e();
            fE(0);
        }
        if (szaVar.db(1)) {
            this.b = szaVar.c();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof syy)) {
            return false;
        }
        syy syyVar = (syy) obj;
        if (super.aC(syyVar.cJ) && Objects.equals(this.a, syyVar.a) && Objects.equals(this.b, syyVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_normalized_feature_values", agnc.j(new String[]{"date", "features"}));
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
        return Objects.hash(adayVar, this.a, this.b, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "smarts_personalization_normalized_feature_values";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object obj = new swc(this, 14).get();
        aldw aldwVar = this.b;
        if (aldwVar == null) {
            byteArray = null;
        } else {
            byteArray = aldwVar.toByteArray();
        }
        Object[] objArr = {obj, byteArray};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "P13nNormalizedFeatureValuesTable -- REDACTED");
        }
        return a();
    }
}
