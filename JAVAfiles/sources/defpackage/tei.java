package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tei extends aglz implements agma {
    public String a;
    public String b;
    public String c;
    public String d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RbmBusinessVerifierInfoTable [verifier_id: %s,\n  verifier_name: %s,\n  verifier_logo_image_remote_url: %s,\n  verifier_logo_image_local_uri: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "verifier_id", this.a);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, this.b);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, this.c);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI, this.d);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tek tekVar = (tek) agmqVar;
        aq();
        this.cJ = tekVar.dx();
        if (tekVar.db(0)) {
            this.a = tekVar.c();
            fE(0);
        }
        if (tekVar.db(1)) {
            this.b = tekVar.g();
            fE(1);
        }
        if (tekVar.db(2)) {
            this.c = tekVar.f();
            fE(2);
        }
        if (tekVar.db(3)) {
            this.d = tekVar.e();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tei)) {
            return false;
        }
        tei teiVar = (tei) obj;
        if (super.aC(teiVar.cJ) && Objects.equals(this.a, teiVar.a) && Objects.equals(this.b, teiVar.b) && Objects.equals(this.c, teiVar.c) && Objects.equals(this.d, teiVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_verifier_info", agnc.j(new String[]{"verifier_id", BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI}));
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
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "rbm_business_verifier_info";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c, this.d};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
            return String.format(Locale.US, "%s", "RbmBusinessVerifierInfoTable -- REDACTED");
        }
        return a();
    }
}
