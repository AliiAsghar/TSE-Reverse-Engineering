package com.google.android.gms.appdatasearch.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.abhb;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConnectionlessLightweightAppDataSearchCallbacks<T> extends ILightweightAppDataSearchCallbacks.Stub {
    private final acit a;

    public ConnectionlessLightweightAppDataSearchCallbacks(acit<T> acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        abhb.d(status, parcelFileDescriptor, this.a);
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
        abhb.d(getRecentContextCall$Response.a, getRecentContextCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onStatus(Status status) {
        abhb.d(status, null, this.a);
    }
}
