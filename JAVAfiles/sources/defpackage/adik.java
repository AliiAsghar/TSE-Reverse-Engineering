package defpackage;

import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adik implements adii {
    private final /* synthetic */ int a;

    @Override // defpackage.adii
    public final ProvisioningManager a(int i) {
        if (this.a != 0) {
            try {
                return ProvisioningManager.createForSubscriptionId(i);
            } catch (IllegalArgumentException e) {
                throw new ImsException("Invalid subscription id.", 3, e);
            }
        }
        try {
            return ProvisioningManager.createForSubscriptionId(i);
        } catch (IllegalArgumentException e2) {
            throw new ImsException("Invalid subscription id.", 3, e2);
        }
    }
}
