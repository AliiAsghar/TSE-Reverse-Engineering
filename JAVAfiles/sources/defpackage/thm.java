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
public final class thm extends aglz implements agma {
    public String a;
    public Instant b = uzz.l(0);
    public Instant c = uzz.l(0);

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RemoteUserIdInfoTable [remote_user_id: %s,\n  last_modified_timestamp: %s,\n  guaranteed_fresh_as_of_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "remote_user_id", this.a);
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("last_modified_timestamp");
        } else {
            contentValues.put("last_modified_timestamp", Long.valueOf(uzz.k(instant)));
        }
        Instant instant2 = this.c;
        if (instant2 == null) {
            contentValues.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(uzz.k(instant2)));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tho thoVar = (tho) agmqVar;
        aq();
        this.cJ = thoVar.dx();
        if (thoVar.db(0)) {
            this.a = thoVar.f();
            fE(0);
        }
        if (thoVar.db(1)) {
            this.b = thoVar.e();
            fE(1);
        }
        if (thoVar.db(2)) {
            this.c = thoVar.c();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof thm)) {
            return false;
        }
        thm thmVar = (thm) obj;
        if (super.aC(thmVar.cJ) && Objects.equals(this.a, thmVar.a) && Objects.equals(this.b, thmVar.b) && Objects.equals(this.c, thmVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_user_id_info_table", agnc.j(new String[]{"remote_user_id", "last_modified_timestamp", "guaranteed_fresh_as_of_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final Instant h() {
        ao(2, "guaranteed_fresh_as_of_timestamp");
        return this.c;
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
        return "remote_user_id_info_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Long.valueOf(uzz.k(this.b)), Long.valueOf(uzz.k(this.c))};
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

    public final String k() {
        ao(0, "remote_user_id");
        return this.a;
    }

    @Deprecated
    public final void l() {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "remote_user_id_info_table", this, new tbe(d, 17), new swb(11));
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RemoteUserIdInfoTable -- REDACTED");
        }
        return a();
    }
}
