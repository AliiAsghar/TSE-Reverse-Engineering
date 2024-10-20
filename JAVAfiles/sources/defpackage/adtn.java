package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class adtn {
    private static final alvi o = alvi.m("com/google/android/ims/receiver/sim/SimPreferences");
    public final abjc a;
    public final abja b;
    public final abja c;
    public final abja d;
    public final abja e;
    public final abja f;
    public final abja g;
    public final abja h;
    public final abja i;
    public final abja j;
    public final abja k;
    public final abja l;
    public final abja m;
    public final abja n;
    private final abja p;
    private final abja q;
    private final abja r;

    @Deprecated
    public adtn() {
        abjc abjcVar = new abjc("sim_state_tracker");
        this.a = abjcVar;
        this.b = new abix(abjcVar, "sim_id", "");
        this.c = new abix(abjcVar, "sim_serial_number", "");
        this.d = new abix(abjcVar, "imsi", "");
        this.e = new abix(abjcVar, "raw_msisdn", "");
        this.f = new abix(abjcVar, "formatted_msisdn", "");
        this.g = new abix(abjcVar, "sim_operator", "");
        this.h = new abix(abjcVar, "sim_operator_name", "");
        this.i = new abix(abjcVar, "network_operator_name", "");
        this.j = new abiy(abjcVar, "is_fi_device", false);
        this.k = new abiz(abjcVar, "sub_id", -1);
        this.l = new abiz(abjcVar, "slot_index", -1);
        this.m = new abix(abjcVar, "group_id_level1", "");
        this.p = new abix(abjcVar, "default_sim_subscription_info", "");
        this.q = new abix(abjcVar, "default_sms_sim_subscription_info", "");
        this.r = new abix(abjcVar, "default_data_sim_subscription_info", "");
        this.n = new abjb(abjcVar, altg.a);
    }

    public static final wxb v(String str) {
        if (albo.ah(str)) {
            return null;
        }
        try {
            return (wxb) apag.parseFrom(wxb.a, Base64.decode(str, 0), aozs.a());
        } catch (apba unused) {
            return null;
        } catch (IllegalArgumentException e) {
            ((alvg) ((alvg) ((alvg) o.i()).g(e)).h("com/google/android/ims/receiver/sim/SimPreferences", "deserializeSimSubscriptionInfo", (char) 576, "SimPreferences.java")).q("Failed to deserialize SimSubscriptionInfo.");
            return null;
        }
    }

    public static final String w(wxb wxbVar) {
        if (wxbVar == null) {
            return "";
        }
        return Base64.encodeToString(wxbVar.toByteArray(), 0);
    }

    @Deprecated
    public final int a() {
        wxb d = d();
        if (d == null) {
            return ((Integer) this.l.d()).intValue();
        }
        return d.e;
    }

    @Deprecated
    public final int b() {
        wxb d = d();
        if (d == null) {
            return ((Integer) this.k.d()).intValue();
        }
        return d.d;
    }

    public final wxb c() {
        return v((String) this.r.d());
    }

    public final wxb d() {
        return v((String) this.p.d());
    }

    public final wxb e() {
        return v((String) this.q.d());
    }

    public final wxb f(String str) {
        return v(o("sim_subscription_info_sim_id_".concat(String.valueOf(str))));
    }

    public final adiw g() {
        return new adiw((String) this.b.d());
    }

    @Deprecated
    public final String h() {
        wxb d = d();
        if (d == null) {
            return (String) this.f.d();
        }
        return d.q;
    }

    @Deprecated
    public final String i() {
        wxb d = d();
        if (d == null) {
            return (String) this.m.d();
        }
        return d.t;
    }

    @Deprecated
    public final String j() {
        wxb d = d();
        if (d == null) {
            return (String) this.d.d();
        }
        return d.f;
    }

    @Deprecated
    public final String k() {
        wxb d = d();
        if (d == null) {
            return (String) this.e.d();
        }
        return d.g;
    }

    @Deprecated
    public final String l() {
        String str;
        akrh e = aktp.e("SimPreferences::getSimId");
        try {
            wxb d = d();
            if (d == null) {
                str = (String) this.b.d();
            } else {
                str = d.c;
            }
            e.close();
            return str;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final String m() {
        wxb d = d();
        if (d == null) {
            return (String) this.g.d();
        }
        return d.s;
    }

    @Deprecated
    public final String n() {
        wxb d = d();
        if (d == null) {
            return (String) this.h.d();
        }
        return d.r;
    }

    @Deprecated
    public final String o(String str) {
        return (String) new abix(this.a, str, "").d();
    }

    @Deprecated
    public final void p(String str) {
        abjc abjcVar = this.a;
        abjd[] abjdVarArr = {new abix(abjcVar, str, "")};
        SharedPreferences.Editor edit = abjcVar.h().edit();
        edit.remove(abjdVarArr[0].a());
        abjc.i(edit);
    }

    public final void q(wxb wxbVar) {
        this.r.e(w(wxbVar));
    }

    public final void r(wxb wxbVar) {
        this.p.e(w(wxbVar));
    }

    public final void s(wxb wxbVar) {
        this.q.e(w(wxbVar));
    }

    @Deprecated
    public final void t(String str, String str2) {
        new abix(this.a, str, "").e(str2);
    }

    @Deprecated
    public final boolean u() {
        wxb d = d();
        if (d == null) {
            return ((Boolean) this.j.d()).booleanValue();
        }
        return d.o;
    }

    public adtn(armf armfVar) {
        abjc abjcVar = new abjc("sim_state_tracker");
        this.a = abjcVar;
        this.b = new abix(abjcVar, "sim_id", "");
        this.c = new abix(abjcVar, "sim_serial_number", "");
        this.d = new abix(abjcVar, "imsi", "");
        this.e = new abix(abjcVar, "raw_msisdn", "");
        this.f = new abix(abjcVar, "formatted_msisdn", "");
        this.g = new abix(abjcVar, "sim_operator", "");
        this.h = new abix(abjcVar, "sim_operator_name", "");
        this.i = new abix(abjcVar, "network_operator_name", "");
        this.j = new abiy(abjcVar, "is_fi_device", false);
        this.k = new abiz(abjcVar, "sub_id", -1);
        this.l = new abiz(abjcVar, "slot_index", -1);
        this.m = new abix(abjcVar, "group_id_level1", "");
        this.p = new abix(abjcVar, "default_sim_subscription_info", "");
        this.q = new abix(abjcVar, "default_sms_sim_subscription_info", "");
        this.r = new abix(abjcVar, "default_data_sim_subscription_info", "");
        this.n = new abjb(abjcVar, altg.a);
        armfVar.b();
    }
}
