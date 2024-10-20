package com.google.android.gms.search.global.internal;

import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.abhb;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GlobalSearchAdminCallbacks<T> extends IGlobalSearchAdminCallbacks.Stub {
    private final acit a;

    public GlobalSearchAdminCallbacks(acit<T> acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetCurrentExperimentIdsResponse(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        abhb.d(getCurrentExperimentIdsCall$Response.a, getCurrentExperimentIdsCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetGlobalSearchSourcesResponse(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        abhb.d(getGlobalSearchSourcesCall$Response.a, getGlobalSearchSourcesCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetPendingExperimentIdsResponse(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        abhb.d(getPendingExperimentIdsCall$Response.a, getPendingExperimentIdsCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetExperimentIdsResponse(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        abhb.d(setExperimentIdsCall$Response.a, null, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetIncludeInGlobalSearchResponse(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        abhb.d(setIncludeInGlobalSearchCall$Response.a, null, this.a);
    }
}
