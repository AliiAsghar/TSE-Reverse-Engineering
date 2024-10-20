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
public final class tdo extends aglz implements agma {
    public String a;
    public String b;
    public qku c;
    public String d;
    public String e;
    public String f;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoPropertiesTable [_id: %s,\n  rbm_bot_id: %s,\n  type: %s,\n  header: %s,\n  subheader: %s,\n  property_value: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() >= 51020) {
            agnc.r(contentValues, "rbm_bot_id", this.b);
        }
        qku qkuVar = this.c;
        if (qkuVar == null) {
            contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        } else {
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(qkuVar.ordinal()));
        }
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, this.d);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, this.e);
        agnc.r(contentValues, "property_value", this.f);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tdq tdqVar = (tdq) agmqVar;
        aq();
        this.cJ = tdqVar.dx();
        if (tdqVar.db(0)) {
            this.a = tdqVar.f();
            fE(0);
        }
        if (tdqVar.db(1)) {
            this.b = tdqVar.h();
            fE(1);
        }
        if (tdqVar.db(2)) {
            this.c = tdqVar.c();
            fE(2);
        }
        if (tdqVar.db(3)) {
            this.d = tdqVar.e();
            fE(3);
        }
        if (tdqVar.db(4)) {
            this.e = tdqVar.i();
            fE(4);
        }
        if (tdqVar.db(5)) {
            this.f = tdqVar.g();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tdo)) {
            return false;
        }
        tdo tdoVar = (tdo) obj;
        if (super.aC(tdoVar.cJ) && Objects.equals(this.a, tdoVar.a) && Objects.equals(this.b, tdoVar.b) && this.c == tdoVar.c && Objects.equals(this.d, tdoVar.d) && Objects.equals(this.e, tdoVar.e) && Objects.equals(this.f, tdoVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_info_properties", agnc.j(new String[]{"rbm_bot_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, "property_value"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final qku h() {
        ao(2, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.c;
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
        String str = this.a;
        String str2 = this.b;
        qku qkuVar = this.c;
        if (qkuVar == null) {
            ordinal = 0;
        } else {
            ordinal = qkuVar.ordinal();
        }
        return Objects.hash(adayVar, str, str2, Integer.valueOf(ordinal), this.d, this.e, this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "rbm_business_info_properties";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String str = this.b;
        qku qkuVar = this.c;
        if (qkuVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qkuVar.ordinal());
        }
        Object[] objArr = {str, valueOf, this.d, this.e, this.f};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
        ao(3, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER);
        return this.d;
    }

    public final String l() {
        ao(5, "property_value");
        return this.f;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RbmBusinessInfoPropertiesTable -- REDACTED");
        }
        return a();
    }
}
