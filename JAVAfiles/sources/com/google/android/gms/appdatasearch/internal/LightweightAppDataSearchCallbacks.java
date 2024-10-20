package com.google.android.gms.appdatasearch.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.abrz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class LightweightAppDataSearchCallbacks<T> extends ILightweightAppDataSearchCallbacks.Stub {
    protected abrz<T> mHolder;

    public LightweightAppDataSearchCallbacks(abrz<T> abrzVar) {
        this.mHolder = abrzVar;
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onStatus(Status status) {
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
    }
}
