package com.google.android.gms.search.global.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGlobalSearchAdminService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGlobalSearchAdminService {
        static final int TRANSACTION_getCurrentExperimentIds = 4;
        static final int TRANSACTION_getGlobalSearchSources = 2;
        static final int TRANSACTION_getPendingExperimentIds = 5;
        static final int TRANSACTION_setExperimentIds = 3;
        static final int TRANSACTION_setIncludeInGlobalSearch = 8;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGlobalSearchAdminService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getCurrentExperimentIds(GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCurrentExperimentIdsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getGlobalSearchSources(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getGlobalSearchSourcesCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getPendingExperimentIds(GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getPendingExperimentIdsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void setExperimentIds(SetExperimentIdsCall$Request setExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, setExperimentIdsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void setIncludeInGlobalSearch(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, setIncludeInGlobalSearchCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
        }

        public static IGlobalSearchAdminService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
            if (queryLocalInterface instanceof IGlobalSearchAdminService) {
                return (IGlobalSearchAdminService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 8) {
                                return false;
                            }
                            SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = (SetIncludeInGlobalSearchCall$Request) iax.a(parcel, SetIncludeInGlobalSearchCall$Request.CREATOR);
                            IGlobalSearchAdminCallbacks asInterface = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            setIncludeInGlobalSearch(setIncludeInGlobalSearchCall$Request, asInterface);
                        } else {
                            GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request = (GetPendingExperimentIdsCall$Request) iax.a(parcel, GetPendingExperimentIdsCall$Request.CREATOR);
                            IGlobalSearchAdminCallbacks asInterface2 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            getPendingExperimentIds(getPendingExperimentIdsCall$Request, asInterface2);
                        }
                    } else {
                        GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request = (GetCurrentExperimentIdsCall$Request) iax.a(parcel, GetCurrentExperimentIdsCall$Request.CREATOR);
                        IGlobalSearchAdminCallbacks asInterface3 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        getCurrentExperimentIds(getCurrentExperimentIdsCall$Request, asInterface3);
                    }
                } else {
                    SetExperimentIdsCall$Request setExperimentIdsCall$Request = (SetExperimentIdsCall$Request) iax.a(parcel, SetExperimentIdsCall$Request.CREATOR);
                    IGlobalSearchAdminCallbacks asInterface4 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setExperimentIds(setExperimentIdsCall$Request, asInterface4);
                }
            } else {
                GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request = (GetGlobalSearchSourcesCall$Request) iax.a(parcel, GetGlobalSearchSourcesCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks asInterface5 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getGlobalSearchSources(getGlobalSearchSourcesCall$Request, asInterface5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getCurrentExperimentIds(GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks);

    void getGlobalSearchSources(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks);

    void getPendingExperimentIds(GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks);

    void setExperimentIds(SetExperimentIdsCall$Request setExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks);

    void setIncludeInGlobalSearch(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks);
}
