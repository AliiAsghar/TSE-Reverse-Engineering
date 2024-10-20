package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tox extends aglz implements agma {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsBrandsTable [_id: %s,\n  brand_id: %s,\n  name: %s,\n  description: %s,\n  logo_url: %s,\n  logo_uri: %s,\n  version_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "brand_id", this.b);
        agnc.r(contentValues, "name", this.c);
        agnc.r(contentValues, "description", this.d);
        agnc.r(contentValues, "logo_url", this.e);
        Uri uri = this.f;
        if (uri == null) {
            contentValues.putNull("logo_uri");
        } else {
            contentValues.put("logo_uri", uri.toString());
        }
        agnc.r(contentValues, "version_token", this.g);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tpb tpbVar = (tpb) agmqVar;
        aq();
        this.cJ = tpbVar.dx();
        if (tpbVar.db(0)) {
            this.a = tpbVar.c();
            fE(0);
        }
        if (tpbVar.db(1)) {
            this.b = tpbVar.f();
            fE(1);
        }
        if (tpbVar.db(2)) {
            this.c = tpbVar.i();
            fE(2);
        }
        if (tpbVar.db(3)) {
            this.d = tpbVar.g();
            fE(3);
        }
        if (tpbVar.db(4)) {
            this.e = tpbVar.h();
            fE(4);
        }
        if (tpbVar.db(5)) {
            this.f = tpbVar.e();
            fE(5);
        }
        if (tpbVar.db(6)) {
            this.g = tpbVar.j();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tox)) {
            return false;
        }
        tox toxVar = (tox) obj;
        if (super.aC(toxVar.cJ) && this.a == toxVar.a && Objects.equals(this.b, toxVar.b) && Objects.equals(this.c, toxVar.c) && Objects.equals(this.d, toxVar.d) && Objects.equals(this.e, toxVar.e) && Objects.equals(this.f, toxVar.f) && Objects.equals(this.g, toxVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "verified_sms_brands", agnc.j(new String[]{"brand_id", "name", "description", "logo_url", "logo_uri", "version_token"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final Uri h() {
        ao(5, "logo_uri");
        return this.f;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "verified_sms_brands";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        Uri uri2 = this.f;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Object[] objArr = {str, str2, str3, str4, uri, this.g};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str5 = (String) obj;
                    if (str5.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str5));
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
        ao(1, "brand_id");
        return this.b;
    }

    public final String l() {
        ao(3, "description");
        return this.d;
    }

    public final String m() {
        ao(2, "name");
        return this.c;
    }

    public final String n() {
        ao(6, "version_token");
        return this.g;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "VerifiedSmsBrandsTable -- REDACTED");
        }
        return a();
    }
}
