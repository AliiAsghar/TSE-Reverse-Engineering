package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnv {
    private static final advp a = new advp("ProvisioningServerUtil");
    private static final alvi b = alvi.m("com/google/android/ims/provisioning/util/ProvisioningServerUtil");
    private final armf c;
    private final armf d;
    private final vau e;
    private final wwn f;
    private final armf g;

    public adnv(armf armfVar, armf armfVar2, vau vauVar, wwn wwnVar, armf armfVar3) {
        this.c = armfVar;
        this.d = armfVar2;
        this.e = vauVar;
        this.f = wwnVar;
        this.g = armfVar3;
    }

    private final Optional k(Optional optional) {
        String l;
        String name;
        if (optional.isPresent()) {
            advr.l(a, "getConfigServerUrl with simId: %s", advq.SIM_ID.c(optional));
        } else {
            advr.l(a, "getConfigServerUrl without simId", new Object[0]);
        }
        if (q()) {
            advr.l(a, "Using overridden config server URL", new Object[0]);
            l = ((aduu) this.c.b()).i();
        } else {
            String str = "";
            if (o(optional)) {
                advp advpVar = a;
                if (optional.isPresent()) {
                    name = this.e.getClass().getName();
                } else {
                    name = acpq.E().getClass().getName();
                }
                advr.l(advpVar, "Using config server URL from %s", name);
                if (optional.isPresent()) {
                    aouh c = this.e.c((String) optional.get());
                    if (c.e != 2) {
                        l = "";
                    } else {
                        l = (String) c.f;
                    }
                } else {
                    l = (String) acpq.E().a().a();
                }
            } else if (p(optional)) {
                advp advpVar2 = a;
                advr.l(advpVar2, "Using MCC based URL", new Object[0]);
                if (optional.isPresent()) {
                    aouh c2 = this.e.c((String) optional.get());
                    if (c2.e == 3) {
                        str = (String) c2.f;
                    }
                } else {
                    str = (String) acpq.E().m().a();
                }
                String m = m(optional);
                if (!TextUtils.isEmpty(m)) {
                    l = String.format(str, m);
                } else {
                    advr.l(advpVar2, "Not using MCC URL. Failed to get MCC", new Object[0]);
                    l = null;
                }
            } else if (g(optional)) {
                advr.l(a, "Using RCS compliant config URL", new Object[0]);
                l = l(optional);
            } else {
                advr.l(a, "No config URL. RCS not configured for dual-registration.", new Object[0]);
                l = null;
            }
        }
        if (l == null) {
            return Optional.empty();
        }
        if (TextUtils.isEmpty(l)) {
            return Optional.empty();
        }
        if (!l.endsWith("/")) {
            l = l.concat("/");
        }
        if (l.startsWith("http")) {
            return Optional.of(l);
        }
        advr.p(a, "Prepending \"http\" to URL %s", advq.URI.c(l));
        return Optional.of("http://".concat(l));
    }

    private final String l(Optional optional) {
        String m;
        if (optional.isPresent()) {
            Optional j = this.f.j(new adiw((String) optional.get()));
            if (((acxf) this.g.b()).a() && j.isEmpty()) {
                return null;
            }
            m = ((wxb) j.get()).s;
        } else {
            m = ((adtn) this.d.b()).m();
        }
        if (!TextUtils.isEmpty(m) && m.length() > 4) {
            try {
                return String.format("http://config.rcs.mnc%s.mcc%s.pub.3gppnetwork.org", String.format(Locale.US, "%03d", Integer.valueOf(Integer.parseInt(m.substring(3)))), m(optional));
            } catch (NumberFormatException | IllegalFormatException unused) {
            }
        }
        if (optional.isPresent()) {
            advr.h(a, "Cannot create compliant config server url, invalid MCC-MNC. sim ID: %s", advq.SIM_ID.c(optional));
        } else {
            advr.h(a, "Cannot create compliant config server url, invalid MCC-MNC.", new Object[0]);
        }
        return null;
    }

    private final String m(Optional optional) {
        String m;
        if (optional.isPresent()) {
            Optional j = this.f.j(new adiw((String) optional.get()));
            if (((acxf) this.g.b()).a() && j.isEmpty()) {
                ((alvg) ((alvg) b.i()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 256, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimSubscriptionInfo is empty.");
                return "";
            }
            ((alvg) ((alvg) b.g()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 260, "ProvisioningServerUtil.java")).q("Getting mccmnc from SimSubscriptionInfo.");
            m = ((wxb) j.get()).s;
        } else {
            ((alvg) ((alvg) b.g()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 264, "ProvisioningServerUtil.java")).q("Getting mccmnc from SimPreferences.");
            m = ((adtn) this.d.b()).m();
        }
        if (!TextUtils.isEmpty(m)) {
            return m.substring(0, 3);
        }
        ((alvg) ((alvg) b.i()).h("com/google/android/ims/provisioning/util/ProvisioningServerUtil", "getMcc", 270, "ProvisioningServerUtil.java")).q("ProvisioningServerUtil: Failed to get MCC. SimOperator is empty.");
        return "";
    }

    private final String n(Optional optional) {
        return (String) k(optional).filter(new addf(19)).orElseThrow(new adpp(optional, 1));
    }

    private final boolean o(Optional optional) {
        String str;
        if (optional.isPresent()) {
            aouh c = this.e.c((String) optional.get());
            if (c.e == 2) {
                str = (String) c.f;
            } else {
                str = "";
            }
        } else {
            str = (String) acpq.E().a().a();
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    private final boolean p(Optional optional) {
        String str;
        if (optional.isPresent()) {
            aouh c = this.e.c((String) optional.get());
            if (c.e == 3) {
                str = (String) c.f;
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                return true;
            }
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence) acpq.E().m().a())) {
            return true;
        }
        return false;
    }

    private final boolean q() {
        if (((Boolean) acpq.E().c().a()).booleanValue() && ((aduu) this.c.b()).u()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final int a() {
        if (((aduu) this.c.b()).v()) {
            return ((aduu) this.c.b()).a();
        }
        int intValue = ((Integer) acpq.E().C().a()).intValue();
        if (intValue >= 0) {
            return intValue;
        }
        if (g(Optional.empty())) {
            return 37273;
        }
        return 0;
    }

    @Deprecated
    public final int b(String str) {
        if (((aduu) this.c.b()).v()) {
            return ((aduu) this.c.b()).a();
        }
        return this.e.c(str).k;
    }

    @Deprecated
    public final Optional c() {
        return k(Optional.empty());
    }

    public final Optional d(String str) {
        return k(Optional.of(str));
    }

    @Deprecated
    public final String e() {
        return n(Optional.empty());
    }

    public final String f(String str) {
        return n(Optional.of(str));
    }

    final boolean g(Optional optional) {
        String m;
        if (optional.isPresent()) {
            Optional j = this.f.j(new adiw((String) optional.get()));
            if (((acxf) this.g.b()).a() && j.isEmpty()) {
                return false;
            }
            m = ((wxb) j.get()).s;
        } else {
            m = ((adtn) this.d.b()).m();
        }
        if (optional.isPresent()) {
            int aT = a.aT(this.e.c((String) optional.get()).g);
            if (aT == 0) {
                aT = 1;
            }
            if (TextUtils.isEmpty(m) || aT != 3) {
                return false;
            }
            return true;
        }
        String str = (String) acpq.E().t().a();
        if (TextUtils.isEmpty(m) || !TextUtils.equals(str, m)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final boolean h() {
        return c().filter(new addf(20)).isPresent();
    }

    @Deprecated
    public final int i() {
        return j(Optional.empty());
    }

    public final int j(Optional optional) {
        if (q()) {
            return 3;
        }
        if (o(optional)) {
            return 4;
        }
        if (p(optional)) {
            return 5;
        }
        if (g(optional)) {
            return 6;
        }
        advr.r(a, "No config URL source available.", new Object[0]);
        return 2;
    }
}
