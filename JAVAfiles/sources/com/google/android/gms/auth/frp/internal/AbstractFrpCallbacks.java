package com.google.android.gms.auth.frp.internal;

import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.FrpUnlockResponse;
import com.google.android.gms.auth.frp.UnlockForWearResponse;
import com.google.android.gms.auth.frp.internal.IFrpCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractFrpCallbacks extends IFrpCallbacks.Stub {
    @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
    public void onGetSnapshot(Status status, FrpSnapshot frpSnapshot) {
    }

    @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
    public void onIsChallengeRequired(Status status, boolean z) {
    }

    @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
    public void onIsChallengeSupported(Status status, boolean z) {
    }

    @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
    public void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse) {
    }

    @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
    public void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse) {
    }
}
