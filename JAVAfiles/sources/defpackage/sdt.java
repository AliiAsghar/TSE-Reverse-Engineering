package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdt extends aglz {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public String h;
    public String i;
    private String j;
    private String k;
    private String l;
    private AgentUseCase m = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
    private String n;
    private String o;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoAndVerifierInfoQuery [rbm_business_info.rbm_business_info_rbm_bot_id: %s,\n  rbm_business_info.rbm_business_info_display_name: %s,\n  rbm_business_info.rbm_business_info_logo_image_remote_url: %s,\n  rbm_business_info.rbm_business_info_logo_image_local_uri: %s,\n  rbm_business_info.rbm_business_info_description: %s,\n  rbm_business_info.rbm_business_info_color: %s,\n  rbm_business_info.rbm_business_info_hero_image_remote_url: %s,\n  rbm_business_info.rbm_business_info_hero_image_local_uri: %s,\n  rbm_business_info.rbm_business_info_version: %s,\n  rbm_business_info.rbm_business_info_expiry_milliseconds: %s,\n  rbm_business_info.rbm_business_info_agent_use_case_category: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_id: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_name: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_logo_image_remote_url: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_logo_image_local_uri: %s\n]\n", String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.l), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.m), String.valueOf(this.h), String.valueOf(this.n), String.valueOf(this.i), String.valueOf(this.o));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sea seaVar = (sea) agmqVar;
        aq();
        this.cJ = seaVar.dx();
        if (seaVar.db(0)) {
            this.j = seaVar.getString(seaVar.cI(0, sdx.a));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.k = seaVar.getString(seaVar.cI(1, sdx.a));
            fE(1);
        }
        if (seaVar.db(2)) {
            this.a = seaVar.getString(seaVar.cI(2, sdx.a));
            fE(2);
        }
        if (seaVar.db(3)) {
            this.b = seaVar.getString(seaVar.cI(3, sdx.a));
            fE(3);
        }
        if (seaVar.db(4)) {
            this.l = seaVar.getString(seaVar.cI(4, sdx.a));
            fE(4);
        }
        if (seaVar.db(5)) {
            this.c = seaVar.getString(seaVar.cI(5, sdx.a));
            fE(5);
        }
        if (seaVar.db(6)) {
            this.d = seaVar.getString(seaVar.cI(6, sdx.a));
            fE(6);
        }
        if (seaVar.db(7)) {
            this.e = seaVar.getString(seaVar.cI(7, sdx.a));
            fE(7);
        }
        if (seaVar.db(8)) {
            this.f = seaVar.getString(seaVar.cI(8, sdx.a));
            fE(8);
        }
        if (seaVar.db(9)) {
            this.g = seaVar.getLong(seaVar.cI(9, sdx.a));
            fE(9);
        }
        if (seaVar.db(10)) {
            AgentUseCase[] values = AgentUseCase.values();
            int i = seaVar.getInt(seaVar.cI(10, sdx.a));
            if (i < values.length) {
                this.m = values[i];
                fE(10);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (seaVar.db(11)) {
            this.h = seaVar.getString(seaVar.cI(11, sdx.a));
            fE(11);
        }
        if (seaVar.db(12)) {
            this.n = seaVar.getString(seaVar.cI(12, sdx.a));
            fE(12);
        }
        if (seaVar.db(13)) {
            this.i = seaVar.getString(seaVar.cI(13, sdx.a));
            fE(13);
        }
        if (seaVar.db(14)) {
            this.o = seaVar.getString(seaVar.cI(14, sdx.a));
            fE(14);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sdt)) {
            return false;
        }
        sdt sdtVar = (sdt) obj;
        if (super.aC(sdtVar.cJ) && Objects.equals(this.j, sdtVar.j) && Objects.equals(this.k, sdtVar.k) && Objects.equals(this.a, sdtVar.a) && Objects.equals(this.b, sdtVar.b) && Objects.equals(this.l, sdtVar.l) && Objects.equals(this.c, sdtVar.c) && Objects.equals(this.d, sdtVar.d) && Objects.equals(this.e, sdtVar.e) && Objects.equals(this.f, sdtVar.f) && this.g == sdtVar.g && this.m == sdtVar.m && Objects.equals(this.h, sdtVar.h) && Objects.equals(this.n, sdtVar.n) && Objects.equals(this.i, sdtVar.i) && Objects.equals(this.o, sdtVar.o)) {
            return true;
        }
        return false;
    }

    public final AgentUseCase f() {
        ao(10, "agent_use_case_category");
        return this.m;
    }

    public final String g() {
        ao(4, "description");
        return this.l;
    }

    public final String h() {
        ao(1, "display_name");
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
        String str = this.j;
        String str2 = this.k;
        String str3 = this.a;
        String str4 = this.b;
        String str5 = this.l;
        String str6 = this.c;
        String str7 = this.d;
        String str8 = this.e;
        String str9 = this.f;
        Long valueOf = Long.valueOf(this.g);
        AgentUseCase agentUseCase = this.m;
        if (agentUseCase == null) {
            ordinal = 0;
        } else {
            ordinal = agentUseCase.ordinal();
        }
        return Objects.hash(adayVar, str, str2, str3, str4, str5, str6, str7, str8, str9, valueOf, Integer.valueOf(ordinal), this.h, this.n, this.i, this.o, null);
    }

    public final String i() {
        ao(0, "rbm_bot_id");
        return this.j;
    }

    public final String j() {
        ao(14, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
        return this.o;
    }

    public final String k() {
        ao(12, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
        return this.n;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RbmBusinessInfoAndVerifierInfoQuery -- REDACTED");
        }
        return a();
    }
}
