package com.google.android.gms.auth.account.device.internal;

import com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractDeviceAccountCallbacks extends IDeviceAccountCallbacks.Stub {
    @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
    public void onCastCertificateAddedToDeviceAccount(Status status, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
    public void onGetDeviceAccountJwt(Status status, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
    public void onGetIddid(Status status, String str) {
        throw new UnsupportedOperationException();
    }
}
