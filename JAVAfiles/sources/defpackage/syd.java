package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syd extends aglz implements agma {
    public long a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ModifiedByTable [_id: %s,\n  am_version_code: %s,\n  stack_trace_hash: %s,\n  source: %s,\n  tiktok_trace: %s,\n  stack_trace: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("am_version_code", Long.valueOf(this.b));
        contentValues.put("stack_trace_hash", Long.valueOf(this.c));
        agnc.r(contentValues, "source", this.d);
        agnc.r(contentValues, "tiktok_trace", this.e);
        agnc.r(contentValues, "stack_trace", this.f);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        syg sygVar = (syg) agmqVar;
        aq();
        this.cJ = sygVar.dx();
        if (sygVar.db(0)) {
            this.a = sygVar.e();
            fE(0);
        }
        if (sygVar.db(1)) {
            this.b = sygVar.c();
            fE(1);
        }
        if (sygVar.db(2)) {
            this.c = sygVar.f();
            fE(2);
        }
        if (sygVar.db(3)) {
            this.d = sygVar.g();
            fE(3);
        }
        if (sygVar.db(4)) {
            this.e = sygVar.i();
            fE(4);
        }
        if (sygVar.db(5)) {
            this.f = sygVar.h();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof syd)) {
            return false;
        }
        syd sydVar = (syd) obj;
        if (super.aC(sydVar.cJ) && this.a == sydVar.a && this.b == sydVar.b && this.c == sydVar.c && Objects.equals(this.d, sydVar.d) && Objects.equals(this.e, sydVar.e) && Objects.equals(this.f, sydVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "modified_by", agnc.j(new String[]{"am_version_code", "stack_trace_hash", "source", "tiktok_trace", "stack_trace"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "modified_by";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, this.f};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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
            return String.format(Locale.US, "%s", "ModifiedByTable -- REDACTED");
        }
        return a();
    }
}
