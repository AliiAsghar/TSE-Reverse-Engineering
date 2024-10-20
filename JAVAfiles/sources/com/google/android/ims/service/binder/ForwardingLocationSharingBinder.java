package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForwardingLocationSharingBinder extends ILocationSharing.Stub implements adud<ILocationSharing> {
    private ILocationSharing a;
    private final Context b;

    public ForwardingLocationSharingBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
        return ((ILocationSharing) getDelegate()).pushLocation(str, locationInformation, str2);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
        return ((ILocationSharing) getDelegate()).pushLocationToGroup(j, locationInformation, str);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (ILocationSharing.Stub) iBinder;
    }

    @Override // defpackage.adud
    public synchronized ILocationSharing getInterface() {
        return this.a;
    }
}
