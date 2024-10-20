package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdx extends aglz implements agma {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public AgentUseCase l = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoTable [rbm_bot_id: %s,\n  display_name: %s,\n  logo_image_remote_url: %s,\n  logo_image_local_uri: %s,\n  description: %s,\n  color: %s,\n  hero_image_remote_url: %s,\n  hero_image_local_uri: %s,\n  verifier_id: %s,\n  version: %s,\n  expiry_milliseconds: %s,\n  agent_use_case_category: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "rbm_bot_id", this.a);
        agnc.r(contentValues, "display_name", this.b);
        agnc.r(contentValues, "logo_image_remote_url", this.c);
        agnc.r(contentValues, "logo_image_local_uri", this.d);
        agnc.r(contentValues, "description", this.e);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, this.f);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, this.g);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, this.h);
        agnc.r(contentValues, "verifier_id", this.i);
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.j);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, Long.valueOf(this.k));
        if (intValue >= 59140) {
            AgentUseCase agentUseCase = this.l;
            if (agentUseCase == null) {
                contentValues.putNull("agent_use_case_category");
            } else {
                contentValues.put("agent_use_case_category", Integer.valueOf(agentUseCase.ordinal()));
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        teb tebVar = (teb) agmqVar;
        aq();
        this.cJ = tebVar.dx();
        if (tebVar.db(0)) {
            this.a = tebVar.m();
            fE(0);
        }
        if (tebVar.db(1)) {
            this.b = tebVar.h();
            fE(1);
        }
        if (tebVar.db(2)) {
            this.c = tebVar.l();
            fE(2);
        }
        if (tebVar.db(3)) {
            this.d = tebVar.k();
            fE(3);
        }
        if (tebVar.db(4)) {
            this.e = tebVar.g();
            fE(4);
        }
        if (tebVar.db(5)) {
            this.f = tebVar.f();
            fE(5);
        }
        if (tebVar.db(6)) {
            this.g = tebVar.j();
            fE(6);
        }
        if (tebVar.db(7)) {
            this.h = tebVar.i();
            fE(7);
        }
        if (tebVar.db(8)) {
            this.i = tebVar.n();
            fE(8);
        }
        if (tebVar.db(9)) {
            this.j = tebVar.o();
            fE(9);
        }
        if (tebVar.db(10)) {
            this.k = tebVar.c();
            fE(10);
        }
        if (tebVar.db(11)) {
            this.l = tebVar.e();
            fE(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tdx)) {
            return false;
        }
        tdx tdxVar = (tdx) obj;
        if (super.aC(tdxVar.cJ) && Objects.equals(this.a, tdxVar.a) && Objects.equals(this.b, tdxVar.b) && Objects.equals(this.c, tdxVar.c) && Objects.equals(this.d, tdxVar.d) && Objects.equals(this.e, tdxVar.e) && Objects.equals(this.f, tdxVar.f) && Objects.equals(this.g, tdxVar.g) && Objects.equals(this.h, tdxVar.h) && Objects.equals(this.i, tdxVar.i) && Objects.equals(this.j, tdxVar.j) && this.k == tdxVar.k && this.l == tdxVar.l) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_info", agnc.j(new String[]{"rbm_bot_id", "display_name", "logo_image_remote_url", "logo_image_local_uri", "description", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, "verifier_id", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, "agent_use_case_category"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final long h() {
        ao(10, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
        return this.k;
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
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        String str9 = this.i;
        String str10 = this.j;
        Long valueOf = Long.valueOf(this.k);
        AgentUseCase agentUseCase = this.l;
        if (agentUseCase == null) {
            ordinal = 0;
        } else {
            ordinal = agentUseCase.ordinal();
        }
        return Objects.hash(adayVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, valueOf, Integer.valueOf(ordinal), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "rbm_business_info";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        String str9 = this.i;
        String str10 = this.j;
        Long valueOf2 = Long.valueOf(this.k);
        AgentUseCase agentUseCase = this.l;
        if (agentUseCase == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(agentUseCase.ordinal());
        }
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, str9, str10, valueOf2, valueOf};
        sb.append('(');
        for (int i = 0; i < 12; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str11 = (String) obj;
                    if (str11.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str11));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String k() {
        ao(0, "rbm_bot_id");
        return this.a;
    }

    public final String l() {
        ao(9, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        return this.j;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RbmBusinessInfoTable -- REDACTED");
        }
        return a();
    }
}
