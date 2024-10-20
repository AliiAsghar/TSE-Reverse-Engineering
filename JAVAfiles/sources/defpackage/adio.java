package defpackage;

import android.telephony.ims.ImsException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adio implements adwu {
    private final adii a;

    public adio(adii adiiVar) {
        this.a = adiiVar;
    }

    private final adwl d(int i) {
        if (yhx.e && aczf.H()) {
            try {
                boolean isRcsVolteSingleRegistrationCapable = this.a.a(i).isRcsVolteSingleRegistrationCapable();
                advr.k("[SR]: AOSP ProvisioningManager.isRcsVolteSingleRegistrationCapable:[%s] for subId: %d, OS.isAtLeastS:[%s], enableSingleRegistrationProvisioning:[%s]", Boolean.valueOf(isRcsVolteSingleRegistrationCapable), Integer.valueOf(i), Boolean.valueOf(yhx.e), Boolean.valueOf(aczf.H()));
                if (isRcsVolteSingleRegistrationCapable) {
                    return adwl.SINGLE_REG;
                }
                return adwl.DUAL_REG;
            } catch (ImsException | RuntimeException e) {
                advr.i(e, "[SR]: Failed to retrieve SR capability from IMS for subId: %d", Integer.valueOf(i));
                return adwl.UNKNOWN;
            }
        }
        advr.k("[SR]: Single Registration is disabled. Skipping Single Registration capability check for subId: %s, OS.isAtLeastS:[%s], enableSingleRegistrationProvisioning:[%s]", Integer.valueOf(i), Boolean.valueOf(yhx.e), Boolean.valueOf(aczf.H()));
        return adwl.DUAL_REG;
    }

    @Override // defpackage.adwu
    public final adwl a(int i) {
        return d(i);
    }

    @Override // defpackage.adwu
    public final boolean b(int i) {
        return adwl.SINGLE_REG.equals(d(i));
    }

    public final boolean c(int i) {
        if (yhx.e && aczf.H()) {
            Integer valueOf = Integer.valueOf(i);
            advr.k("[SR]: Triggering Reconfiguration for subId: %s", valueOf);
            try {
                this.a.a(i).triggerRcsReconfiguration();
                advr.c("[SR]: Reconfiguration Trigger for subId: %s succesful", valueOf);
                return true;
            } catch (ImsException | RuntimeException e) {
                advr.i(e, "[SR]: Failed to trigger reconfiguration for subId: %d", Integer.valueOf(i));
                return false;
            }
        }
        advr.q("[SR]: Single Registration is disabled. Skipping reconfiguration trigger for subId: %s", Integer.valueOf(i));
        return false;
    }
}
