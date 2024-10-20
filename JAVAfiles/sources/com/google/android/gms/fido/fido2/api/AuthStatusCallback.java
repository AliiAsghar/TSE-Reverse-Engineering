package com.google.android.gms.fido.fido2.api;

import com.google.android.gms.fido.fido2.api.IAuthStatusCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class AuthStatusCallback extends IAuthStatusCallback.Stub {
    @Override // com.google.android.gms.fido.fido2.api.IAuthStatusCallback
    public abstract void onStatusChanged(int i);

    public abstract void onUserPresenceApprovalRequired(UserPresenceApprover userPresenceApprover);
}
