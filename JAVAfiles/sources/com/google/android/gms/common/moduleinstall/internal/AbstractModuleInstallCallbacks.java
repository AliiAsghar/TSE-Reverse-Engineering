package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractModuleInstallCallbacks extends IModuleInstallCallbacks.Stub {
    @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
    public void onDeferredInstall(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
    public void onModuleInstallIntentResponse(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
    public void onModuleInstallResponse(Status status, ModuleInstallResponse moduleInstallResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
    public void onModulesAvailabilityResponse(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        throw new UnsupportedOperationException();
    }
}
