package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sin extends aglz implements agma {
    public long a;
    public long b;
    public String c;
    public String d;
    public long e = 0;
    public qkt f;
    public String g;
    public long h;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsStatusTable [_id: %s,\n  table_type: %s,\n  item_id: %s,\n  cms_id: %s,\n  timestamp: %s,\n  event_type: %s,\n  status: %s,\n  attempt_number: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("table_type", Long.valueOf(this.b));
        agnc.r(contentValues, "item_id", this.c);
        agnc.r(contentValues, "cms_id", this.d);
        contentValues.put("timestamp", Long.valueOf(this.e));
        qkt qktVar = this.f;
        if (qktVar == null) {
            contentValues.putNull("event_type");
        } else {
            contentValues.put("event_type", Integer.valueOf(qktVar.ordinal()));
        }
        agnc.r(contentValues, "status", this.g);
        contentValues.put("attempt_number", Long.valueOf(this.h));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sir sirVar = (sir) agmqVar;
        aq();
        this.cJ = sirVar.dx();
        if (sirVar.db(0)) {
            this.a = sirVar.e();
            fE(0);
        }
        if (sirVar.db(1)) {
            this.b = sirVar.f();
            fE(1);
        }
        if (sirVar.db(2)) {
            this.c = sirVar.j();
            fE(2);
        }
        if (sirVar.db(3)) {
            this.d = sirVar.i();
            fE(3);
        }
        if (sirVar.db(4)) {
            this.e = sirVar.g();
            fE(4);
        }
        if (sirVar.db(5)) {
            this.f = sirVar.h();
            fE(5);
        }
        if (sirVar.db(6)) {
            this.g = sirVar.k();
            fE(6);
        }
        if (sirVar.db(7)) {
            this.h = sirVar.c();
            fE(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sin)) {
            return false;
        }
        sin sinVar = (sin) obj;
        if (super.aC(sinVar.cJ) && this.a == sinVar.a && this.b == sinVar.b && Objects.equals(this.c, sinVar.c) && Objects.equals(this.d, sinVar.d) && this.e == sinVar.e && this.f == sinVar.f && Objects.equals(this.g, sinVar.g) && this.h == sinVar.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_status", agnc.j(new String[]{"table_type", "item_id", "cms_id", "timestamp", "event_type", "status", "attempt_number"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
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
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        Long valueOf3 = Long.valueOf(this.e);
        qkt qktVar = this.f;
        if (qktVar == null) {
            ordinal = 0;
        } else {
            ordinal = qktVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, valueOf2, str, str2, valueOf3, Integer.valueOf(ordinal), this.g, Long.valueOf(this.h), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_status";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        Long valueOf3 = Long.valueOf(this.e);
        qkt qktVar = this.f;
        if (qktVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qktVar.ordinal());
        }
        Object[] objArr = {valueOf2, str, str2, valueOf3, valueOf, this.g, Long.valueOf(this.h)};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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
            return String.format(Locale.US, "%s", "CmsStatusTable -- REDACTED");
        }
        return a();
    }
}
