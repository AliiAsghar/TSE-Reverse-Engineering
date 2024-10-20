package com.google.android.gms.search.administration.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;
import com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks;
import defpackage.abrz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchAdministrationResultCallbacks<R> extends ISearchAdministrationCallbacks.Stub {
    private final abrz a;
    private final Class b;

    public SearchAdministrationResultCallbacks(abrz<R> abrzVar, Class<R> cls) {
        this.a = abrzVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onClearDebugUiCacheResponse(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
        this.a.c(this.b.cast(clearDebugUiCacheCall$Response));
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onClearUsageReportDataResponse(Status status) {
        this.a.c(this.b.cast(status));
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onDiagnosticResponse(BundleResponse bundleResponse) {
        this.a.c(this.b.cast(bundleResponse));
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onGetAppIndexingPackageDetailsResponse(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
        this.a.c(this.b.cast(getAppIndexingPackageDetailsCall$Response));
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onGetAppIndexingPackagesResponse(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
        this.a.c(this.b.cast(getAppIndexingPackagesCall$Response));
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onGetStorageStatsResponse(GetStorageStatsCall$Response getStorageStatsCall$Response) {
        this.a.c(this.b.cast(getStorageStatsCall$Response));
    }

    @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
    public void onRequestAppIndexingUpdateIndexResponse(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
        this.a.c(this.b.cast(requestAppIndexingUpdateIndexCall$Response));
    }
}
