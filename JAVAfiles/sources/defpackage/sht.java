package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sht extends aglz implements agma {
    public long a;
    public String b;
    public String c;
    public xxv d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsMediaNotificationsTable [_id: %s,\n  message_cms_id: %s,\n  blob_id: %s,\n  blob_type: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "message_cms_id", this.b);
        agnc.r(contentValues, "blob_id", this.c);
        xxv xxvVar = this.d;
        if (xxvVar == null) {
            contentValues.putNull("blob_type");
        } else {
            contentValues.put("blob_type", Integer.valueOf(xxvVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        shv shvVar = (shv) agmqVar;
        aq();
        this.cJ = shvVar.dx();
        if (shvVar.db(0)) {
            this.a = shvVar.c();
            fE(0);
        }
        if (shvVar.db(1)) {
            this.b = shvVar.g();
            fE(1);
        }
        if (shvVar.db(2)) {
            this.c = shvVar.f();
            fE(2);
        }
        if (shvVar.db(3)) {
            this.d = shvVar.e();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sht)) {
            return false;
        }
        sht shtVar = (sht) obj;
        if (super.aC(shtVar.cJ) && this.a == shtVar.a && Objects.equals(this.b, shtVar.b) && Objects.equals(this.c, shtVar.c) && this.d == shtVar.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_media_notifications", agnc.j(new String[]{"message_cms_id", "blob_id", "blob_type"}));
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
        String str = this.b;
        String str2 = this.c;
        xxv xxvVar = this.d;
        if (xxvVar == null) {
            ordinal = 0;
        } else {
            ordinal = xxvVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, str, str2, Integer.valueOf(ordinal), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_media_notifications";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String str = this.b;
        String str2 = this.c;
        xxv xxvVar = this.d;
        if (xxvVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(xxvVar.ordinal());
        }
        Object[] objArr = {str, str2, valueOf};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
            return String.format(Locale.US, "%s", "CmsMediaNotificationsTable -- REDACTED");
        }
        return a();
    }
}
