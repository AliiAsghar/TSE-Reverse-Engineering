package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgp extends aglz implements agma {
    public long a;
    public String b;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsBlobsPendingDeleteTable [_id: %s,\n  message_id: %s,\n  blob_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "message_id", this.b);
        agnc.r(contentValues, "blob_id", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sgs sgsVar = (sgs) agmqVar;
        aq();
        this.cJ = sgsVar.dx();
        if (sgsVar.db(0)) {
            this.a = sgsVar.c();
            fE(0);
        }
        if (sgsVar.db(1)) {
            this.b = sgsVar.f();
            fE(1);
        }
        if (sgsVar.db(2)) {
            this.c = sgsVar.e();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sgp)) {
            return false;
        }
        sgp sgpVar = (sgp) obj;
        if (super.aC(sgpVar.cJ) && this.a == sgpVar.a && Objects.equals(this.b, sgpVar.b) && Objects.equals(this.c, sgpVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_blobs_pending_delete", agnc.j(new String[]{"message_id", "blob_id"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_blobs_pending_delete";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c};
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
            return String.format(Locale.US, "%s", "CmsBlobsPendingDeleteTable -- REDACTED");
        }
        return a();
    }
}
