package com.google.android.gms.search.administration.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchAdministrationCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchAdministrationCallbacks {
        static final int TRANSACTION_onClearDebugUiCacheResponse = 8;
        static final int TRANSACTION_onClearUsageReportDataResponse = 4;
        static final int TRANSACTION_onDiagnosticResponse = 3;
        static final int TRANSACTION_onGetAppIndexingPackageDetailsResponse = 6;
        static final int TRANSACTION_onGetAppIndexingPackagesResponse = 5;
        static final int TRANSACTION_onGetStorageStatsResponse = 2;
        static final int TRANSACTION_onRequestAppIndexingUpdateIndexResponse = 7;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchAdministrationCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onClearDebugUiCacheResponse(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, clearDebugUiCacheCall$Response);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onClearUsageReportDataResponse(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onDiagnosticResponse(BundleResponse bundleResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundleResponse);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onGetAppIndexingPackageDetailsResponse(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getAppIndexingPackageDetailsCall$Response);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onGetAppIndexingPackagesResponse(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getAppIndexingPackagesCall$Response);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onGetStorageStatsResponse(GetStorageStatsCall$Response getStorageStatsCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getStorageStatsCall$Response);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onRequestAppIndexingUpdateIndexResponse(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, requestAppIndexingUpdateIndexCall$Response);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
        }

        public static ISearchAdministrationCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
            if (queryLocalInterface instanceof ISearchAdministrationCallbacks) {
                return (ISearchAdministrationCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetStorageStatsCall$Response getStorageStatsCall$Response = (GetStorageStatsCall$Response) iax.a(parcel, GetStorageStatsCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetStorageStatsResponse(getStorageStatsCall$Response);
                    return true;
                case 3:
                    BundleResponse bundleResponse = (BundleResponse) iax.a(parcel, BundleResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDiagnosticResponse(bundleResponse);
                    return true;
                case 4:
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearUsageReportDataResponse(status);
                    return true;
                case 5:
                    GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response = (GetAppIndexingPackagesCall$Response) iax.a(parcel, GetAppIndexingPackagesCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAppIndexingPackagesResponse(getAppIndexingPackagesCall$Response);
                    return true;
                case 6:
                    GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response = (GetAppIndexingPackageDetailsCall$Response) iax.a(parcel, GetAppIndexingPackageDetailsCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAppIndexingPackageDetailsResponse(getAppIndexingPackageDetailsCall$Response);
                    return true;
                case 7:
                    RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response = (RequestAppIndexingUpdateIndexCall$Response) iax.a(parcel, RequestAppIndexingUpdateIndexCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRequestAppIndexingUpdateIndexResponse(requestAppIndexingUpdateIndexCall$Response);
                    return true;
                case 8:
                    ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response = (ClearDebugUiCacheCall$Response) iax.a(parcel, ClearDebugUiCacheCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearDebugUiCacheResponse(clearDebugUiCacheCall$Response);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onClearDebugUiCacheResponse(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response);

    void onClearUsageReportDataResponse(Status status);

    void onDiagnosticResponse(BundleResponse bundleResponse);

    void onGetAppIndexingPackageDetailsResponse(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response);

    void onGetAppIndexingPackagesResponse(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response);

    void onGetStorageStatsResponse(GetStorageStatsCall$Response getStorageStatsCall$Response);

    void onRequestAppIndexingUpdateIndexResponse(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response);
}
