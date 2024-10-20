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
public final class sys extends aglz implements agma {
    public rvh a = rvh.a;
    public rvi b = rvi.a;
    public Instant c = Instant.EPOCH;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "P13nFeaturesTable [feature_id: %s,\n  feature: %s,\n  start_date: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        rvh rvhVar = this.a;
        if (rvhVar != null && !rvhVar.equals(rvh.a)) {
            contentValues.put("feature_id", Long.valueOf(rvh.a(this.a)));
        } else {
            contentValues.putNull("feature_id");
        }
        if (intValue >= 54060) {
            rvi rviVar = this.b;
            if (rviVar != null && !rviVar.equals(rvi.a)) {
                contentValues.put("feature", rvi.d(this.b));
            } else {
                contentValues.putNull("feature");
            }
        }
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("start_date");
        } else {
            contentValues.put("start_date", Long.valueOf(uxi.h(instant)));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        syu syuVar = (syu) agmqVar;
        aq();
        this.cJ = syuVar.dx();
        if (syuVar.db(0)) {
            this.a = syuVar.c();
            fE(0);
        }
        if (syuVar.db(1)) {
            this.b = syuVar.e();
            fE(1);
        }
        if (syuVar.db(2)) {
            this.c = syuVar.f();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sys)) {
            return false;
        }
        sys sysVar = (sys) obj;
        if (super.aC(sysVar.cJ) && Objects.equals(this.a, sysVar.a) && Objects.equals(this.b, sysVar.b) && Objects.equals(this.c, sysVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_features", agnc.j(new String[]{"feature", "start_date"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "feature_id";
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
        return "smarts_personalization_features";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new swc(this, 13).get(), Long.valueOf(uxi.h(this.c))};
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
            return String.format(Locale.US, "%s", "P13nFeaturesTable -- REDACTED");
        }
        return a();
    }
}
