package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduu {
    public final Object a;
    private final Context b;

    public aduu(Context context, adtn adtnVar) {
        this.b = context;
        this.a = adtnVar;
    }

    private static String B(String str) {
        if (str == null) {
            return "";
        }
        return str.replace(' ', '_');
    }

    public final String A() {
        StringBuilder sb = new StringBuilder("IM-client/OMA1.0 ");
        sb.append(B(Build.MANUFACTURER));
        sb.append("/");
        sb.append(B(Build.MODEL));
        sb.append("-");
        sb.append(B(Build.VERSION.RELEASE));
        sb.append(" ");
        sb.append(B("Goog"));
        sb.append("/");
        Context context = this.b;
        sb.append(B(adww.e(context, adww.a(context), 2)));
        return sb.toString();
    }

    public final synchronized int a() {
        int i;
        Object obj = this.a;
        synchronized (obj) {
            ((adut) obj).d();
            Integer num = (Integer) ((adut) obj).d.get("provisioning_sms_port_override");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final synchronized long b() {
        long a;
        a = ((adut) this.a).a("requestid", 1L);
        ((adut) this.a).h("requestid", 1 + a);
        return a;
    }

    public final synchronized long c() {
        long a;
        a = ((adut) this.a).a("sessionid", 1L);
        if (a == 1) {
            advr.c("Session ID is 1 !! This should only be the case after clearing the data or installing for the first time!", new Object[0]);
            a = 1;
        }
        if (a < 1500000000) {
            advr.c("Seeding session ID to current timestamp", new Object[0]);
            a = Instant.now().getEpochSecond();
        }
        ((adut) this.a).h("sessionid", 1 + a);
        return a;
    }

    public final synchronized String d(String str, int i) {
        String Y;
        Object obj = this.a;
        Y = agkx.Y(this.b, str, i);
        ((adut) obj).j("clientid", Y);
        return Y;
    }

    public final synchronized String e() {
        return ((adut) this.a).c("capabilities_pidf_etag", null);
    }

    public final synchronized String f() {
        return ((adut) this.a).c("clientid", null);
    }

    public final synchronized String g() {
        return albo.af(((adut) this.a).c("default_country", null));
    }

    public final synchronized String h() {
        return albo.af(((adut) this.a).c("msisdn", null));
    }

    public final synchronized String i() {
        return ((adut) this.a).c("provisioning_acs_url_override", null);
    }

    public final synchronized String j() {
        return ((adut) this.a).c("sim_serial_number", null);
    }

    public final synchronized void k(long j) {
        long a = ((adut) this.a).a("sessionid", 1L);
        long j2 = j + a;
        advr.c("****** DEBUG ****** Bumping session ID from %s to %s", Long.valueOf(a), Long.valueOf(j2));
        ((adut) this.a).h("sessionid", j2);
    }

    public final void l(String str, PrintWriter printWriter) {
        Object obj;
        printWriter.print(' ');
        printWriter.print(str);
        printWriter.print(": ");
        Object obj2 = this.a;
        synchronized (obj2) {
            ((adut) obj2).d();
            obj = ((adut) obj2).d.get(str);
        }
        printWriter.println(obj);
    }

    public final synchronized void m() {
        ((adut) this.a).f("capabilities_pidf_etag");
    }

    public final synchronized void n(String str) {
        ((adut) this.a).j("capabilities_pidf_etag", str);
    }

    public final void o(String str) {
        ((adut) this.a).j("default_country", albo.ag(str));
    }

    public final synchronized void p(boolean z) {
        ((adut) this.a).g("send_error_result_from_engine", z);
    }

    public final void q(boolean z) {
        ((adut) this.a).g("first_time_discovery_finished", z);
    }

    public final synchronized void r(String str) {
        adut adutVar = (adut) this.a;
        String ag = albo.ag(str);
        adutVar.j("msisdn", ag);
        advr.c("Setting username for Analytics to: %s", advq.PHONE_NUMBER.c(ag));
    }

    public final synchronized boolean s() {
        return ((adut) this.a).l("send_error_result_from_engine");
    }

    public final synchronized boolean t() {
        String h = h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        return h.startsWith("+1100");
    }

    public final synchronized boolean u() {
        return ((adut) this.a).k("provisioning_acs_url_override");
    }

    public final synchronized boolean v() {
        return ((adut) this.a).k("provisioning_sms_port_override");
    }

    public final synchronized boolean w() {
        return ((adut) this.a).l("first_time_discovery_finished");
    }

    public final synchronized boolean x() {
        long a = ((adut) this.a).a("sessionid", 0L);
        if (a >= 1 && a >= 1500000000) {
            return false;
        }
        return true;
    }

    public final synchronized void y() {
        ((adut) this.a).h("provisioning_last_attempt", 0L);
    }

    public final String z() {
        String str;
        String str2;
        if (yhx.d) {
            adtn adtnVar = (adtn) this.a;
            wxb d = adtnVar.d();
            if (d == null) {
                str = (String) adtnVar.i.d();
            } else {
                str = d.i;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(" ");
            sb.append(B(Build.ID));
            sb.append(" ");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            sb.append(simpleDateFormat.format(DesugarDate.from(Instant.now())));
            sb.append(" Android ");
            str2 = Build.VERSION.RELEASE_OR_CODENAME;
            sb.append(B(str2));
            sb.append(" ");
            sb.append(B(Build.DEVICE));
            sb.append(" 3gpp-gba");
            return sb.toString();
        }
        return "";
    }

    public aduu(Context context) {
        this.a = new adut(context, "com.google.android.rcs");
        this.b = context;
    }
}
