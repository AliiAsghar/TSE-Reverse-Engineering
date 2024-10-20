package defpackage;

import android.net.Uri;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbb extends agps {
    public tbb() {
        super("participants");
    }

    public final void A(mta mtaVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58620) {
            agnc.t("norm_ui_status", intValue2);
        }
        if (intValue >= 58620) {
            if (mtaVar == null) {
                this.a.putNull("norm_ui_status");
            } else {
                this.a.put("norm_ui_status", Integer.valueOf(mtaVar.a()));
            }
        }
    }

    public final void B(String str) {
        agnc.r(this.a, "normalized_destination", aabr.bb(str));
    }

    public final void C(vox voxVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59550) {
            agnc.t("photo_source", intValue2);
        }
        if (intValue >= 59550) {
            if (voxVar == null) {
                this.a.putNull("photo_source");
            } else {
                this.a.put("photo_source", Integer.valueOf(voxVar.a()));
            }
        }
    }

    public final void D(Uri uri) {
        if (uri == null) {
            this.a.putNull("profile_photo_uri");
        } else {
            this.a.put("profile_photo_uri", uri.toString());
        }
    }

    public final void E() {
        this.a.putNull("profile_photo_uri");
    }

    public final void F(String str) {
        agnc.r(this.a, "send_destination", aabr.bb(str));
    }

    public final void G(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 2000) {
            agnc.t("sim_slot_id", intValue2);
        }
        if (intValue >= 2000) {
            this.a.put("sim_slot_id", Integer.valueOf(i));
        }
    }

    public final void H(int i) {
        this.a.put("sub_id", Integer.valueOf(i));
    }

    public final void I(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 2000) {
            agnc.t("subscription_color", intValue2);
        }
        if (intValue >= 2000) {
            this.a.put("subscription_color", Integer.valueOf(i));
        }
    }

    public final void J(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 2000) {
            agnc.t("subscription_name", intValue2);
        }
        if (intValue >= 2000) {
            agnc.r(this.a, "subscription_name", str);
        }
    }

    public final void K(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 13050) {
            agnc.t("video_reachability", intValue2);
        }
        if (intValue >= 13050) {
            this.a.put("video_reachability", Integer.valueOf(i));
        }
    }

    public final void L(tbd tbdVar) {
        Z(new tbc(tbdVar));
    }

    public final void M(Function function) {
        Object apply;
        apply = function.apply(new tbd());
        Z(new tbc((tbd) apply));
    }

    public final qwe b() {
        return riw.m(this.a.getAsString("my_identity_token"));
    }

    @Override // defpackage.agps
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final tba a() {
        ac();
        try {
            if (oes.a() && b() != null) {
                y(b());
            }
            return new tba(this.c, this.a, this.b, this.d.g(), this.e.a());
        } catch (Throwable th) {
            throw new aglw(th);
        }
    }

    public final boolean d(String str) {
        tbd tbdVar = new tbd();
        tbdVar.h(str);
        return ae(new tbc(tbdVar), "participants-buildAndUpdateForId");
    }

    public final void e(int i) {
        this.a.put("color_palette_index", Integer.valueOf(i));
    }

    public final void f(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 1000) {
            agnc.t("color_type", intValue2);
        }
        if (intValue >= 1000) {
            this.a.put("color_type", Integer.valueOf(i));
        }
    }

    public final void g(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 4000) {
            agnc.t("contact_destination", intValue2);
        }
        if (intValue >= 4000) {
            agnc.r(this.a, "contact_destination", str);
        }
    }

    public final void h() {
        this.a.putNull("contact_destination");
    }

    public final void i(long j) {
        this.a.put("contact_id", Long.valueOf(j));
    }

    public final void j() {
        this.a.putNull("contact_metadata");
    }

    public final void k() {
        this.a.putNull("contact_photo_uri");
    }

    public final void l(long j) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 35010) {
            agnc.t("directory_id", intValue2);
        }
        if (intValue >= 35010) {
            this.a.put("directory_id", Long.valueOf(j));
        }
    }

    public final void m(String str) {
        agnc.r(this.a, "display_destination", aabr.bb(str));
    }

    public final void n(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10027) {
            agnc.t("extended_color", intValue2);
        }
        if (intValue >= 10027) {
            this.a.put("extended_color", Integer.valueOf(i));
        }
    }

    public final void o(String str) {
        agnc.r(this.a, "first_name", yta.a(str));
    }

    public final void p() {
        this.a.putNull("first_name");
    }

    public final void q(String str) {
        agnc.r(this.a, "full_name", yta.a(str));
    }

    public final void r() {
        this.a.putNull("full_name");
    }

    public final void s(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 55010) {
            agnc.t("is_check_constraint_enabled_via_phenotype", intValue2);
        }
        if (intValue >= 55010) {
            this.a.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(z));
        }
    }

    public final void t(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 24060) {
            agnc.t("is_spam", intValue2);
        }
        if (intValue >= 24060) {
            this.a.put("is_spam", Boolean.valueOf(z));
        }
    }

    public final void u(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 30000) {
            agnc.t("is_spam_source", intValue2);
        }
        if (intValue >= 30000) {
            this.a.put("is_spam_source", Integer.valueOf(i));
        }
    }

    public final void v(tqr tqrVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 31030) {
            agnc.t("latest_verification_status", intValue2);
        }
        if (intValue >= 31030) {
            if (tqrVar == null) {
                this.a.putNull("latest_verification_status");
            } else {
                this.a.put("latest_verification_status", Integer.valueOf(tqrVar.ordinal()));
            }
        }
    }

    public final void w(String str) {
        agnc.r(this.a, "lookup_key", str);
    }

    public final void x() {
        this.a.putNull("lookup_key");
    }

    public final void y(qwe qweVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        if (valueOf2.intValue() >= 60160 && intValue >= 60160) {
            if (qweVar != null && !qweVar.equals(null)) {
                this.a.put("my_identity_token_foreign_key", riw.n(qweVar));
            } else {
                this.a.putNull("my_identity_token_foreign_key");
            }
        }
    }

    public final void z(vox voxVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59550) {
            agnc.t("name_source", intValue2);
        }
        if (intValue >= 59550) {
            if (voxVar == null) {
                this.a.putNull("name_source");
            } else {
                this.a.put("name_source", Integer.valueOf(voxVar.a()));
            }
        }
    }
}
