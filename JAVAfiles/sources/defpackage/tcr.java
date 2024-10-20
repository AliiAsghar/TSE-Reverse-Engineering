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
public final class tcr extends aglz implements agma {
    public long a;
    public Instant b = uzz.l(0);
    public String c;
    public String d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "PiiHashTable [_id: %s,\n  timestamp: %s,\n  hash_value: %s,\n  hash_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("timestamp");
        } else {
            contentValues.put("timestamp", Long.valueOf(uzz.k(instant)));
        }
        agnc.r(contentValues, "hash_value", this.c);
        agnc.r(contentValues, "hash_key", this.d);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tcu tcuVar = (tcu) agmqVar;
        aq();
        this.cJ = tcuVar.dx();
        if (tcuVar.db(0)) {
            this.a = tcuVar.c();
            fE(0);
        }
        if (tcuVar.db(1)) {
            this.b = tcuVar.e();
            fE(1);
        }
        if (tcuVar.db(2)) {
            this.c = tcuVar.g();
            fE(2);
        }
        if (tcuVar.db(3)) {
            this.d = tcuVar.f();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tcr)) {
            return false;
        }
        tcr tcrVar = (tcr) obj;
        if (super.aC(tcrVar.cJ) && this.a == tcrVar.a && Objects.equals(this.b, tcrVar.b) && Objects.equals(this.c, tcrVar.c) && Objects.equals(this.d, tcrVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pii_hash", agnc.j(new String[]{"timestamp", "hash_value", "hash_key"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "pii_hash";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(uzz.k(this.b)), this.c, this.d};
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
            return String.format(Locale.US, "%s", "PiiHashTable -- REDACTED");
        }
        return a();
    }
}
