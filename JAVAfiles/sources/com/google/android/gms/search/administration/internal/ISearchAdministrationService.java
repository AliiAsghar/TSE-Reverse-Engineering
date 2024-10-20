package com.google.android.gms.search.administration.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;
import com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchAdministrationService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchAdministrationService {
        static final int TRANSACTION_clearDebugUiCache = 8;
        static final int TRANSACTION_clearUsageReportData = 4;
        static final int TRANSACTION_diagnostic = 3;
        static final int TRANSACTION_getAppIndexingPackageDetails = 6;
        static final int TRANSACTION_getAppIndexingPackages = 5;
        static final int TRANSACTION_getStorageStats = 2;
        static final int TRANSACTION_requestAppIndexingUpdateIndex = 7;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchAdministrationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationService");
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void clearDebugUiCache(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, clearDebugUiCacheCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void clearUsageReportData(ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void diagnostic(Bundle bundle, ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getAppIndexingPackageDetails(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getAppIndexingPackageDetailsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getAppIndexingPackages(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getAppIndexingPackagesCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getStorageStats(GetStorageStatsCall$Request getStorageStatsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getStorageStatsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void requestAppIndexingUpdateIndex(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, requestAppIndexingUpdateIndexCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
        }

        public static ISearchAdministrationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
            if (queryLocalInterface instanceof ISearchAdministrationService) {
                return (ISearchAdministrationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetStorageStatsCall$Request getStorageStatsCall$Request = (GetStorageStatsCall$Request) iax.a(parcel, GetStorageStatsCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getStorageStats(getStorageStatsCall$Request, asInterface);
                    break;
                case 3:
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    ISearchAdministrationCallbacks asInterface2 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    diagnostic(bundle, asInterface2);
                    break;
                case 4:
                    ISearchAdministrationCallbacks asInterface3 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    clearUsageReportData(asInterface3);
                    break;
                case 5:
                    GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request = (GetAppIndexingPackagesCall$Request) iax.a(parcel, GetAppIndexingPackagesCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface4 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAppIndexingPackages(getAppIndexingPackagesCall$Request, asInterface4);
                    break;
                case 6:
                    GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request = (GetAppIndexingPackageDetailsCall$Request) iax.a(parcel, GetAppIndexingPackageDetailsCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface5 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAppIndexingPackageDetails(getAppIndexingPackageDetailsCall$Request, asInterface5);
                    break;
                case 7:
                    RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request = (RequestAppIndexingUpdateIndexCall$Request) iax.a(parcel, RequestAppIndexingUpdateIndexCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface6 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestAppIndexingUpdateIndex(requestAppIndexingUpdateIndexCall$Request, asInterface6);
                    break;
                case 8:
                    ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request = (ClearDebugUiCacheCall$Request) iax.a(parcel, ClearDebugUiCacheCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface7 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    clearDebugUiCache(clearDebugUiCacheCall$Request, asInterface7);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearDebugUiCache(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks);

    void clearUsageReportData(ISearchAdministrationCallbacks iSearchAdministrationCallbacks);

    void diagnostic(Bundle bundle, ISearchAdministrationCallbacks iSearchAdministrationCallbacks);

    void getAppIndexingPackageDetails(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks);

    void getAppIndexingPackages(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks);

    void getStorageStats(GetStorageStatsCall$Request getStorageStatsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks);

    void requestAppIndexingUpdateIndex(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks);
}
