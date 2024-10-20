package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adpo {
    static final acyz b;
    private static final Character l;
    private static final algs m;
    public boolean c;
    public boolean d;
    public long e;
    public long f;
    public int g;
    protected final Map h;
    public final List i;
    public Optional j;
    private static final acyz k = aczd.a(207636097);
    public static final long a = TimeUnit.HOURS.toMillis(36);

    static {
        Character ch = ',';
        l = ch;
        ch.charValue();
        m = algs.c(',');
        b = acyy.b("remove_unsupported_iari_tags");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public adpo() {
        this.c = false;
        this.d = false;
        this.e = -1L;
        this.g = 0;
        this.h = new HashMap();
        this.i = new ArrayList();
        this.j = Optional.empty();
    }

    public static String a(List list) {
        if (!adom.o(list)) {
            return String.format("+g.gsma.rcs.botversion=\"%s\"", m.d(list));
        }
        throw new IllegalArgumentException("List of bot versions can't be null or empty");
    }

    public static String d() {
        return a(Arrays.asList("#=0.92", "#=1"));
    }

    public final boolean A() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb");
    }

    public final boolean B() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms");
    }

    public final boolean C() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }

    public final boolean D() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
    }

    public final boolean E() {
        return this.i.contains("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms");
    }

    public final boolean F() {
        if (!((Boolean) k.a()).booleanValue()) {
            if (!this.i.contains("+g.gsma.rcs.ipcall") && (!this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || !this.i.contains("video"))) {
                return false;
            }
            return true;
        }
        if ((!this.i.contains("+g.gsma.rcs.ipcall") && !this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel")) || !this.i.contains("video")) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        if ((this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || this.i.contains("+g.gsma.rcs.ipcall")) && !I()) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        if (((Boolean) b.a()).booleanValue()) {
            return false;
        }
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft");
    }

    public final boolean I() {
        return this.i.contains("+g.gsma.rcs.ipvideocallonly");
    }

    public final boolean J() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered");
    }

    public final boolean K() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
    }

    public final boolean L() {
        if (this.i.contains(adsg.a()) && C()) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap");
    }

    public final boolean N() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch");
    }

    public final boolean O() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.e;
        if (j <= 0 || currentTimeMillis - j >= this.f) {
            return false;
        }
        return true;
    }

    public final void P() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer", true);
    }

    public final void Q() {
        m(true);
        t("video", true);
    }

    public final void R() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered", true);
    }

    public final void S() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap", true);
    }

    public final void T() {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch", true);
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        if (y()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
        }
        if (H()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft");
        }
        if (A()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb");
        }
        if (D()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
        }
        if (this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft")) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft");
        }
        if (!((Boolean) b.a()).booleanValue() && this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg")) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg");
        }
        if (C()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
        }
        if (B()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms");
        }
        if (E()) {
            arrayList.add("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms");
        }
        if (aczn.d()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
        }
        return TextUtils.join(",", arrayList);
    }

    public final String c(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (y() && z) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
        }
        if (adaa.u() && L() && z) {
            arrayList.add(adsg.a());
        }
        if (x()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer");
        }
        if (J()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered");
        }
        if (M()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap");
        }
        if (N()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch");
        }
        if (F() || G()) {
            arrayList.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel");
        }
        return TextUtils.join(",", arrayList);
    }

    public final void e(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im", z);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof adpo)) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final void f(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb", z);
    }

    public final void g(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms", z);
    }

    public final void h(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg", z);
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final void i(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp", z);
    }

    public final void j(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft", z);
    }

    public final void k(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush", z);
    }

    public final void l(boolean z) {
        t("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms", z);
    }

    public final void m(boolean z) {
        t("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel", z);
        t("+g.gsma.rcs.ipcall", z);
    }

    public final void n(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft", z);
    }

    public final void o(boolean z) {
        t("+g.gsma.rcs.ipvideocallonly", z);
    }

    public final void p(boolean z) {
        t("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot", z);
    }

    public final void q(boolean z) {
        t(adsg.a(), z);
    }

    public final void r(boolean z) {
        t(d(), z);
    }

    public final void s(boolean z) {
        t("+g.jibe.stickers", z);
    }

    public final void t(String str, boolean z) {
        if (!z) {
            this.i.remove(str);
        } else if (!this.i.contains(str)) {
            this.i.add(str);
        }
    }

    public final String toString() {
        return "mResponseCode: " + this.g + ", mLastActivityTimestamp: " + this.e + ", mValidityPeriodMillis: " + this.f + ", mIsKnownInNetwork: " + this.d + ", mIsOnline: " + this.c + ", mRbmBot: " + this.j + ", mCaps: " + this.i;
    }

    public final boolean u() {
        return this.i.contains("+g.jibe.stickers");
    }

    public final boolean v() {
        if (!y() && !H() && !K() && !this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.dp") && !C()) {
            return false;
        }
        return true;
    }

    public final boolean w(boolean z) {
        if (x() || J() || N() || M() || F() || G()) {
            return true;
        }
        if (y()) {
            if (z) {
                return true;
            }
            z = false;
        }
        if (L() && z) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer");
    }

    public final boolean y() {
        return this.i.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean z() {
        return this.i.isEmpty();
    }

    public adpo(long j) {
        this.c = false;
        this.d = false;
        this.e = -1L;
        this.g = 0;
        this.h = new HashMap();
        this.i = new ArrayList();
        this.j = Optional.empty();
        this.f = j;
    }

    public adpo(adpo adpoVar) {
        this.c = false;
        this.d = false;
        this.e = -1L;
        this.g = 0;
        HashMap hashMap = new HashMap();
        this.h = hashMap;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = Optional.empty();
        arrayList.clear();
        arrayList.addAll(adpoVar.i);
        hashMap.clear();
        hashMap.putAll(adpoVar.h);
        this.c = adpoVar.c;
        this.d = adpoVar.d;
        this.g = adpoVar.g;
        this.e = adpoVar.e;
        this.f = adpoVar.f;
        this.j = adpoVar.j;
    }
}
