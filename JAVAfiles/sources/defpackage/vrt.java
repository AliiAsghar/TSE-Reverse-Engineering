package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;
import android.telephony.ims.RcsClientConfiguration;
import com.google.android.ims.util.common.RcsIntents;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrt implements vrl {
    static final alhr a = uuh.x(202332654, "enable_vendor_ims_master_switch_broadcast");
    public static final xze b = xze.g("BugleRcsProvisioning", "SingleRegistrationVendorImsAvailabilityNotifier");
    static final utz c = uuh.e(uuh.b, "single_registration_vendor_ims_availability_notifier_debounce_millis", 50);
    private final Context d;
    private final mbl e;
    private final adii f;
    private final wpp g;

    public vrt(Context context, wpp wppVar, mbl mblVar, adii adiiVar) {
        this.d = context;
        this.g = wppVar;
        this.e = mblVar;
        this.f = adiiVar;
    }

    private static boolean b(vrm vrmVar) {
        return vrk.USER_SETTING_ENABLED.equals(vrmVar.b);
    }

    public final void a(vrm vrmVar) {
        int intValue = ((Integer) vrmVar.c.get()).intValue();
        boolean b2 = b(vrmVar);
        if (yhx.f) {
            if (!b2) {
                try {
                    ProvisioningManager a2 = this.f.a(intValue);
                    RcsClientConfiguration rcsClientConfiguration = new RcsClientConfiguration(aczf.t(), aczf.s(), aczf.q(), aczf.r(), false);
                    xyo a3 = b.a();
                    a3.H("[SR]: disabling RCS by setting RCS configuration using ProvisioningManager");
                    a3.l(intValue);
                    a3.q();
                    a2.setRcsClientConfiguration(rcsClientConfiguration);
                    return;
                } catch (ImsException e) {
                    b.n("[SR]: ImsException caught while setting RCS client configuration", e);
                    return;
                }
            }
            return;
        }
        xyo a4 = b.a();
        a4.H("[SR]: broadcasting RCS master switch change event to VendorIMS");
        a4.A("isEnabled", b2);
        a4.l(intValue);
        a4.q();
        Intent intent = new Intent(RcsIntents.ACTION_TOGGLE_RCS_MASTER_SWITCH);
        intent.putExtra(RcsIntents.EXTRA_SUBSCRIPTION_ID, intValue);
        intent.putExtra(RcsIntents.EXTRA_RCS_MASTER_SWITCH_STATE, b2 ? 1 : 0);
        this.d.sendBroadcast(intent, "android.permission.READ_PRIVILEGED_PHONE_STATE");
        this.e.c("Bugle.RcsEngine.SingleRegistration.VendorImsMasterSwitchBroadcast.Count");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.vrl
    public final void am(vrm vrmVar) {
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            vrmVar.c.isPresent();
            if (!vrk.USER_SETTING_DISABLED.equals(vrmVar.b) && !b(vrmVar)) {
                return;
            }
            wpp wppVar = this.g;
            ung ungVar = new ung(this, vrmVar, 16, null);
            vrs vrsVar = new vrs(vrmVar, ((xnv) wppVar.c).f().toEpochMilli(), UUID.randomUUID());
            aktp.ah(new vri((Object) wppVar, (Object) vrsVar, (Object) ungVar, 2, (short[]) null), wppVar.a).k(qiu.c(new vra(vrsVar, 5)), andi.a);
        }
    }
}
