package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.ims.ProvisioningManager;
import com.android.vcard.VCardConfig;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Map;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adip extends ProvisioningManager.RcsProvisioningCallback {
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final String f;
    private final adnk g;
    private final adnb h;
    private final Context i;
    private final adko j;
    private final adin k;
    private final int l;
    private final apuv m;
    private static final advp e = new advp("SingleRegistrationProvisioningListener[SR]");
    static final acyz a = aczd.a(190016284);
    static final acyz b = acyy.b("enable_single_reg_preprovisioning_without_tos");
    static final acyz c = acyy.b("disable_configuration_reset_on_callback_removed");

    public adip(Context context, adnk adnkVar, adnb adnbVar, adko adkoVar, apuv apuvVar, String str, int i, adin adinVar) {
        this.i = context;
        this.f = str;
        this.l = i;
        this.j = adkoVar;
        this.g = adnkVar;
        this.m = apuvVar;
        this.h = adnbVar;
        this.k = adinVar;
    }

    private final void a() {
        this.g.u(this.f, null);
    }

    private final void b(boolean z) {
        Intent putExtra = new Intent(RcsIntents.ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT).putExtra(RcsIntents.EXTRA_SIM_ID, this.f).putExtra(RcsIntents.EXTRA_SUB_ID, this.l).putExtra(RcsIntents.EXTRA_SETUP_VENDOR_IMS, z);
        putExtra.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        advz.b(this.i, putExtra, "com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationProvisioningEventReceiver", advy.SINGLE_REGISTRATION_PROVISIONING_LISTENER);
        advr.d(e, "RcsSingleRegistrationProvisioningEvent was sent for simId: %s, subId: %d, setupVendorIms: %b", advq.SIM_ID.c(this.f), Integer.valueOf(this.l), Boolean.valueOf(z));
    }

    public final void onAutoConfigurationErrorReceived(int i, String str) {
        if (aczf.L() && this.g.E(this.f)) {
            advr.r(e, "ignoring auto configuration error when SR is disabled: %d, %s", Integer.valueOf(i), str);
            return;
        }
        advr.q("AutoConfiguration error received. Error Code: %d, Error Description: %s", Integer.valueOf(i), str);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.c(i);
        }
    }

    public final void onConfigurationChanged(byte[] bArr) {
        if (aczf.L() && this.g.E(this.f)) {
            advr.r(e, "ignoring RCS configuration update received when SR is disabled", new Object[0]);
            return;
        }
        advr.l(e, "RCS configuration update is received.", new Object[0]);
        Configuration configuration = new Configuration();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Charset charset = StandardCharsets.UTF_8;
            ThreadLocal threadLocal = asry.a;
            assa assaVar = new assa();
            int i = asrv.a;
            if (charset == null) {
                charset = Charset.defaultCharset();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream, charset);
            char[] cArr = (char[]) asry.a.get();
            Arrays.fill(cArr, (char) 0);
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                } else {
                    assaVar.write(cArr, 0, read);
                }
            }
            String assaVar2 = assaVar.toString();
            advr.d(e, "%s", "RCS configuration XML:");
            for (String str : assaVar2.split("(?<=>)", -1)) {
                advr.d(e, "%s", advq.GENERIC.c(str.trim()));
            }
            this.h.a(new ByteArrayInputStream(assaVar2.getBytes(StandardCharsets.UTF_8)), configuration, true);
            advr.l(e, "RCS config was parsed successfully.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
                this.k.e(true);
            }
        } catch (adna | IOException e2) {
            advr.j(e2, e, "Failed to parse the config received from Provisioning AOSP.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
                this.k.e(false);
            }
        }
        Configuration f = this.g.f(this.f);
        ImsConfiguration imsConfiguration = configuration.mImsConfiguration;
        ImsConfiguration imsConfiguration2 = f.mImsConfiguration;
        imsConfiguration.mDomain = imsConfiguration2.mDomain;
        imsConfiguration.f(imsConfiguration2.mPublicIdentity, imsConfiguration2.mUserName);
        imsConfiguration.mPcscfAddress = imsConfiguration2.mPcscfAddress;
        imsConfiguration.mPcsfPort = imsConfiguration2.mPcsfPort;
        adko adkoVar = this.j;
        adnk adnkVar = this.g;
        String str2 = this.f;
        adkoVar.c(configuration, adnkVar.f(str2), str2);
        this.d.set(true);
        b(false);
    }

    public final void onConfigurationReset() {
        if (aczf.L() && this.g.E(this.f)) {
            advr.r(e, "ignoring RCS configuration reset when SR is disabled", new Object[0]);
            return;
        }
        advr.l(e, "RCS configuration is not longer valid.", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.f();
        }
        a();
        b(false);
    }

    public final void onPreProvisioningReceived(byte[] bArr) {
        if (aczf.L() && this.g.E(this.f)) {
            advr.r(e, "ignoring preprovisioning event when SR is disabled.", new Object[0]);
            return;
        }
        if (((Boolean) b.a()).booleanValue()) {
            advr.l(e, "triggering MVS pre-provisioning reconfiguration", new Object[0]);
            Intent intent = new Intent(RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED);
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            advz.b(this.i, intent, "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", advy.SINGLE_REGISTRATION_PROVISIONING_LISTENER);
        } else {
            advr.r(e, "Pre provisioning configuration received. This should never happen, because AM doesn't support self-provisioning.", new Object[0]);
        }
        if (((Boolean) a.a()).booleanValue()) {
            this.k.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    public final void onRemoved() {
        if (aczf.L() && this.g.E(this.f)) {
            advr.r(e, "ignoring RCS configuration removed when SR is disabled", new Object[0]);
            return;
        }
        advr.l(e, "The RcsProvisioningCallback instance is removed from AOSP.", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.d();
        }
        if (!((Boolean) c.a()).booleanValue()) {
            a();
        }
        b(true);
        apuv apuvVar = this.m;
        if (apuvVar != null) {
            advr.c("[SR]: onCallbackTermination", new Object[0]);
            Map.EL.remove(apuvVar.c, Integer.valueOf(apuvVar.a), apuvVar.b);
        }
    }
}
