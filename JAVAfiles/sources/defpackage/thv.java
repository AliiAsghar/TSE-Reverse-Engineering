package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thv extends aglz implements agma {
    public String a;
    public String b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RemoteUserIdToRegistrationIdTable [remote_user_id: %s,\n  tachyon_registration_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "remote_user_id", this.a);
        agnc.r(contentValues, "tachyon_registration_id", this.b);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        thx thxVar = (thx) agmqVar;
        aq();
        this.cJ = thxVar.dx();
        if (thxVar.db(0)) {
            this.a = thxVar.c();
            fE(0);
        }
        if (thxVar.db(1)) {
            this.b = thxVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof thv)) {
            return false;
        }
        thv thvVar = (thv) obj;
        if (super.aC(thvVar.cJ) && Objects.equals(this.a, thvVar.a) && Objects.equals(this.b, thvVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_user_id_to_registration_id", agnc.j(new String[]{"remote_user_id", "tachyon_registration_id"}));
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
        return "remote_user_id_to_registration_id";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b};
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
            return String.format(Locale.US, "%s", "RemoteUserIdToRegistrationIdTable -- REDACTED");
        }
        return a();
    }
}
