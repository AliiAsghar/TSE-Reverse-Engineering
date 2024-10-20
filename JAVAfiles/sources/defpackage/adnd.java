package defpackage;

import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnd extends adnf {
    private static final advp a;
    private final adnk d;
    private final adtn e;
    private final ahjj f;

    static {
        Charset charset = StandardCharsets.UTF_8;
        a = new advp("RcsReconfigurationSmsHandler");
    }

    public adnd(adtn adtnVar, adnk adnkVar, ahjj ahjjVar) {
        this.f = ahjjVar;
        this.e = adtnVar;
        this.d = adnkVar;
    }

    @Override // defpackage.adnf
    protected final boolean c(String str, int i, int i2) {
        String str2;
        String substring;
        Configuration f;
        adju c;
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = b;
            for (int i3 = 0; i3 < 2; i3++) {
                str2 = strArr[i3];
                if (str.endsWith(str2)) {
                    break;
                }
            }
        }
        str2 = null;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        advr.r(a, "Reconfiguration SMS body contains valid reconfiguration suffix: %s, encoding: UTF_16", str2);
        advr.q("Received reconfiguration SMS", new Object[0]);
        if (TextUtils.isEmpty(str) || !str.endsWith(str2)) {
            substring = null;
        } else {
            substring = str.substring(0, str.length() - str2.length());
        }
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        if ((TextUtils.isEmpty(substring) || !substring.equals(this.e.j())) && (TextUtils.isEmpty(substring) || (f = this.d.f(this.e.l())) == null || (c = f.c()) == null || !albo.ar(substring, c.k))) {
            return true;
        }
        ahjj ahjjVar = this.f;
        ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfigSms", 413, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onReconfigSms");
        wkk wkkVar = (wkk) ahjjVar.a;
        wxb wxbVar = (wxb) wkkVar.n.i(i).orElse(null);
        if (wxbVar == null) {
            ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfigSms", 417, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: onReconfigSms. No SimSubscriptionInfo found for subId %s. Ignoring SMS.", i);
        } else {
            armf armfVar = wkkVar.h;
            String str3 = wxbVar.c;
            adnk adnkVar = (adnk) armfVar.b();
            Configuration f2 = adnkVar.f(str3);
            f2.g();
            f2.i();
            adnkVar.u(str3, f2);
            wkkVar.B(new adiw(str3), vrk.RECONFIG_SMS);
            wkkVar.u(new adiw(str3), wxbVar.d, amww.RECONFIG_SMS);
        }
        return true;
    }
}
