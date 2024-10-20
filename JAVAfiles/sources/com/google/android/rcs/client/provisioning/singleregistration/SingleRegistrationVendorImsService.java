package com.google.android.rcs.client.provisioning.singleregistration;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.ajnv;
import defpackage.ajny;
import defpackage.ajoa;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SingleRegistrationVendorImsService extends ajnv<ISingleRegistrationVendorImsController> {
    public SingleRegistrationVendorImsService(Context context, ajoa ajoaVar) {
        super(ISingleRegistrationVendorImsController.class, context, ajoaVar, 1, Optional.empty());
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "RcsSingleRegistrationVendomImsServiceVersions";
    }

    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        b();
        try {
            return ((ISingleRegistrationVendorImsController) a()).setupVendorIms(i);
        } catch (RemoteException | IllegalStateException e) {
            throw new ajny("Error while notifying location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        b();
        try {
            return ((ISingleRegistrationVendorImsController) a()).terminateVendorIms(i);
        } catch (RemoteException | IllegalStateException e) {
            throw new ajny("Error while notifying location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
