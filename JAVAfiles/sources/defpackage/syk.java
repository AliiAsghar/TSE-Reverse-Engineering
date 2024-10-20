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
public final class syk extends aglz implements agma {
    public rvh a = rvh.a;
    public Instant b = Instant.EPOCH;
    public float c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "P13nDecayedFeatureValuesTable [feature_id: %s,\n  date: %s,\n  feature_value: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        rvh rvhVar = this.a;
        if (rvhVar != null && !rvhVar.equals(rvh.a)) {
            contentValues.put("feature_id", Long.valueOf(rvh.a(this.a)));
        } else {
            contentValues.putNull("feature_id");
        }
        Instant instant = this.b;
        if (instant != null && !instant.equals(Instant.EPOCH)) {
            contentValues.put("date", Long.valueOf(uxi.h(this.b)));
        } else {
            contentValues.putNull("date");
        }
        contentValues.put("feature_value", Float.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        syo syoVar = (syo) agmqVar;
        aq();
        this.cJ = syoVar.dx();
        if (syoVar.db(0)) {
            this.a = syoVar.e();
            fE(0);
        }
        if (syoVar.db(1)) {
            this.b = syoVar.f();
            fE(1);
        }
        if (syoVar.db(2)) {
            this.c = syoVar.c();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof syk)) {
            return false;
        }
        syk sykVar = (syk) obj;
        if (super.aC(sykVar.cJ) && Objects.equals(this.a, sykVar.a) && Objects.equals(this.b, sykVar.b) && this.c == sykVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_decayed_feature_values", agnc.j(new String[]{"feature_id", "date", "feature_value"}));
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
        return Objects.hash(adayVar, this.a, this.b, Float.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "smarts_personalization_decayed_feature_values";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new swc(this, 11).get(), new swc(this, 12).get(), Float.valueOf(this.c)};
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
            return String.format(Locale.US, "%s", "P13nDecayedFeatureValuesTable -- REDACTED");
        }
        return a();
    }
}
