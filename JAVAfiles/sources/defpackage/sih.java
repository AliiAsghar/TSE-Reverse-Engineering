package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sih extends aglz implements agma {
    public long a;
    public long b;
    public String c;
    public String d;
    public anic e = anic.CMS_DATA_PROVIDER_UNSPECIFIED;
    public byte[] f;
    public long g;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        byte[] bArr = this.f;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "CmsRestoreDependencyCacheTable [_id: %s,\n  dependent_id: %s,\n  dependent_cms_id: %s,\n  dependency_cms_id: %s,\n  cms_data_provider_type: %s,\n  payload: %s,\n  inserted_at_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, "BLOB".concat(String.valueOf(str)), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        contentValues.put("dependent_id", Long.valueOf(this.b));
        agnc.r(contentValues, "dependent_cms_id", this.c);
        agnc.r(contentValues, "dependency_cms_id", this.d);
        if (intValue >= 59660) {
            anic anicVar = this.e;
            if (anicVar == null) {
                contentValues.putNull("cms_data_provider_type");
            } else {
                contentValues.put("cms_data_provider_type", Integer.valueOf(anicVar.a()));
            }
        }
        contentValues.put("payload", this.f);
        contentValues.put("inserted_at_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sij sijVar = (sij) agmqVar;
        aq();
        this.cJ = sijVar.dx();
        if (sijVar.db(0)) {
            this.a = sijVar.e();
            fE(0);
        }
        if (sijVar.db(1)) {
            this.b = sijVar.c();
            fE(1);
        }
        if (sijVar.db(2)) {
            this.c = sijVar.i();
            fE(2);
        }
        if (sijVar.db(3)) {
            this.d = sijVar.h();
            fE(3);
        }
        if (sijVar.db(4)) {
            this.e = sijVar.g();
            fE(4);
        }
        if (sijVar.db(5)) {
            this.f = sijVar.j();
            fE(5);
        }
        if (sijVar.db(6)) {
            this.g = sijVar.f();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sih)) {
            return false;
        }
        sih sihVar = (sih) obj;
        if (super.aC(sihVar.cJ) && this.a == sihVar.a && this.b == sihVar.b && Objects.equals(this.c, sihVar.c) && Objects.equals(this.d, sihVar.d) && this.e == sihVar.e && Arrays.equals(this.f, sihVar.f) && this.g == sihVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_restore_dependency_cache_table", agnc.j(new String[]{"dependent_id", "dependent_cms_id", "dependency_cms_id", "cms_data_provider_type", "payload", "inserted_at_timestamp"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_restore_dependency_cache_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        anic anicVar = this.e;
        if (anicVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(anicVar.a());
        }
        Object[] objArr = {valueOf2, str, str2, valueOf, this.f, Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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
            return String.format(Locale.US, "%s", "CmsRestoreDependencyCacheTable -- REDACTED");
        }
        return a();
    }
}
