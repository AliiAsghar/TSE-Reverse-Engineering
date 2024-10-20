package com.google.android.rcs.client.ims;

import android.content.Context;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.ajnv;
import defpackage.ajnw;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.apfi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsConnectionTrackerService extends ajnv<IImsConnectionTracker> {
    public ImsConnectionTrackerService(Context context, ajoa ajoaVar, Optional<ajnw> optional) {
        super(IImsConnectionTracker.class, context, ajoaVar, 1, optional);
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "ImsConnectionTrackerServiceVersions";
    }

    public ImsRegistrationState getRegistrationState() {
        b();
        try {
            return ((IImsConnectionTracker) a()).getRegistrationState();
        } catch (Exception e) {
            throw new ajny(e.getMessage());
        }
    }

    @Override // defpackage.ajnv
    public apfi getServiceNameLoggingEnum() {
        return apfi.IMS_CONNECTION_TRACKER_SERVICE;
    }

    public boolean isRegistered() {
        b();
        try {
            return ((IImsConnectionTracker) a()).isRegistered();
        } catch (Exception e) {
            throw new ajny(e.getMessage());
        }
    }
}
