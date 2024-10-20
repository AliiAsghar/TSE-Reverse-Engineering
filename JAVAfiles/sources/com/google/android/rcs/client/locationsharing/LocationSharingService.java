package com.google.android.rcs.client.locationsharing;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.ajnv;
import defpackage.ajny;
import defpackage.ajoa;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocationSharingService extends ajnv<ILocationSharing> {
    public LocationSharingService(Context context, ajoa ajoaVar) {
        super(ILocationSharing.class, context, ajoaVar, 1, Optional.empty());
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "LocationSharingServiceVersions";
    }

    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
        b();
        try {
            return ((ILocationSharing) a()).pushLocation(str, locationInformation, str2);
        } catch (RemoteException | IllegalStateException e) {
            throw new ajny("Error while pushing location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
        b();
        try {
            return ((ILocationSharing) a()).pushLocationToGroup(j, locationInformation, str);
        } catch (RemoteException | IllegalStateException e) {
            throw new ajny("Error while pushing location to group: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
