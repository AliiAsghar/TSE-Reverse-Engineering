package com.google.android.gms.fido.fido2.api;

import com.google.android.gms.fido.fido2.api.IUserPresenceApprover;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class UserPresenceApprover extends IUserPresenceApprover.Stub {
    @Override // com.google.android.gms.fido.fido2.api.IUserPresenceApprover
    public abstract void approve();

    @Override // com.google.android.gms.fido.fido2.api.IUserPresenceApprover
    public abstract void reject();
}
