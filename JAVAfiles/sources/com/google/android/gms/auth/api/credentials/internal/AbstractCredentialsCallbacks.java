package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractCredentialsCallbacks extends ICredentialsCallbacks.Stub {
    @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
    public void onCredentialResult(Status status, Credential credential) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
    public void onStatusResult(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
    public void onStringResult(Status status, String str) {
        throw new UnsupportedOperationException();
    }
}
