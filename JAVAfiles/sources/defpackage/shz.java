package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shz extends aglz implements agma {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g = 0;
    public long h = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsNotificationsTable [cms_id: %s,\n  cms_last_mod_seq: %s,\n  cms_correlation_id: %s,\n  from_address: %s,\n  to_address: %s,\n  correlation_text: %s,\n  modified_at_timestamp: %s,\n  message_received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "cms_id", this.a);
        contentValues.put("cms_last_mod_seq", Long.valueOf(this.b));
        agnc.r(contentValues, "cms_correlation_id", this.c);
        agnc.r(contentValues, "from_address", this.d);
        agnc.r(contentValues, "to_address", this.e);
        agnc.r(contentValues, "correlation_text", this.f);
        contentValues.put("modified_at_timestamp", Long.valueOf(this.g));
        if (intValue >= 46040) {
            contentValues.put("message_received_timestamp", Long.valueOf(this.h));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sid sidVar = (sid) agmqVar;
        aq();
        this.cJ = sidVar.dx();
        if (sidVar.db(0)) {
            this.a = sidVar.h();
            fE(0);
        }
        if (sidVar.db(1)) {
            this.b = sidVar.c();
            fE(1);
        }
        if (sidVar.db(2)) {
            this.c = sidVar.g();
            fE(2);
        }
        if (sidVar.db(3)) {
            this.d = sidVar.j();
            fE(3);
        }
        if (sidVar.db(4)) {
            this.e = sidVar.k();
            fE(4);
        }
        if (sidVar.db(5)) {
            this.f = sidVar.i();
            fE(5);
        }
        if (sidVar.db(6)) {
            this.g = sidVar.f();
            fE(6);
        }
        if (sidVar.db(7)) {
            this.h = sidVar.e();
            fE(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof shz)) {
            return false;
        }
        shz shzVar = (shz) obj;
        if (super.aC(shzVar.cJ) && Objects.equals(this.a, shzVar.a) && this.b == shzVar.b && Objects.equals(this.c, shzVar.c) && Objects.equals(this.d, shzVar.d) && Objects.equals(this.e, shzVar.e) && Objects.equals(this.f, shzVar.f) && this.g == shzVar.g && this.h == shzVar.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_notifications", agnc.j(new String[]{"cms_id", "cms_last_mod_seq", "cms_correlation_id", "from_address", "to_address", "correlation_text", "modified_at_timestamp", "message_received_timestamp"}));
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
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_notifications";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Long.valueOf(this.b), this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
            return String.format(Locale.US, "%s", "CmsNotificationsTable -- REDACTED");
        }
        return a();
    }
}
