package com.google.android.gms.search.corpora.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchCorporaService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchCorporaService {
        static final int TRANSACTION_clearCorpus = 3;
        static final int TRANSACTION_deleteUsageReport = 6;
        static final int TRANSACTION_getCorpusInfo = 5;
        static final int TRANSACTION_getCorpusStatus = 4;
        static final int TRANSACTION_registerCorpusInfo = 7;
        static final int TRANSACTION_requestIndexing = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchCorporaService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaService");
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void clearCorpus(ClearCorpusCall$Request clearCorpusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, clearCorpusCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void deleteUsageReport(DeleteUsageReportCall$Request deleteUsageReportCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, deleteUsageReportCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void getCorpusInfo(GetCorpusInfoCall$Request getCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCorpusInfoCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void getCorpusStatus(GetCorpusStatusCall$Request getCorpusStatusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCorpusStatusCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void registerCorpusInfo(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, registerCorpusInfoCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void requestIndexing(RequestIndexingCall$Request requestIndexingCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, requestIndexingCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
        }

        public static ISearchCorporaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
            if (queryLocalInterface instanceof ISearchCorporaService) {
                return (ISearchCorporaService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) iax.a(parcel, RequestIndexingCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestIndexing(requestIndexingCall$Request, asInterface);
                    break;
                case 3:
                    ClearCorpusCall$Request clearCorpusCall$Request = (ClearCorpusCall$Request) iax.a(parcel, ClearCorpusCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface2 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    clearCorpus(clearCorpusCall$Request, asInterface2);
                    break;
                case 4:
                    GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) iax.a(parcel, GetCorpusStatusCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface3 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCorpusStatus(getCorpusStatusCall$Request, asInterface3);
                    break;
                case 5:
                    GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) iax.a(parcel, GetCorpusInfoCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface4 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCorpusInfo(getCorpusInfoCall$Request, asInterface4);
                    break;
                case 6:
                    DeleteUsageReportCall$Request deleteUsageReportCall$Request = (DeleteUsageReportCall$Request) iax.a(parcel, DeleteUsageReportCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface5 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    deleteUsageReport(deleteUsageReportCall$Request, asInterface5);
                    break;
                case 7:
                    RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) iax.a(parcel, RegisterCorpusInfoCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface6 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerCorpusInfo(registerCorpusInfoCall$Request, asInterface6);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearCorpus(ClearCorpusCall$Request clearCorpusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks);

    void deleteUsageReport(DeleteUsageReportCall$Request deleteUsageReportCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks);

    void getCorpusInfo(GetCorpusInfoCall$Request getCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks);

    void getCorpusStatus(GetCorpusStatusCall$Request getCorpusStatusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks);

    void registerCorpusInfo(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks);

    void requestIndexing(RequestIndexingCall$Request requestIndexingCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks);
}
