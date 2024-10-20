package com.google.android.gms.search.corpora.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchCorporaCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchCorporaCallbacks {
        static final int TRANSACTION_onClearCorpusResponse = 3;
        static final int TRANSACTION_onDeleteUsageReportResponse = 6;
        static final int TRANSACTION_onGetCorpusInfoResponse = 5;
        static final int TRANSACTION_onGetCorpusStatusResponse = 4;
        static final int TRANSACTION_onRegisterCorpusInfoResponse = 7;
        static final int TRANSACTION_onRequestIndexingResponse = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchCorporaCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
            public void onClearCorpusResponse(ClearCorpusCall$Response clearCorpusCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, clearCorpusCall$Response);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
            public void onDeleteUsageReportResponse(DeleteUsageReportCall$Response deleteUsageReportCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, deleteUsageReportCall$Response);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
            public void onGetCorpusInfoResponse(GetCorpusInfoCall$Response getCorpusInfoCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCorpusInfoCall$Response);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
            public void onGetCorpusStatusResponse(GetCorpusStatusCall$Response getCorpusStatusCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getCorpusStatusCall$Response);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
            public void onRegisterCorpusInfoResponse(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, registerCorpusInfoCall$Response);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
            public void onRequestIndexingResponse(RequestIndexingCall$Response requestIndexingCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, requestIndexingCall$Response);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
        }

        public static ISearchCorporaCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
            if (queryLocalInterface instanceof ISearchCorporaCallbacks) {
                return (ISearchCorporaCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    RequestIndexingCall$Response requestIndexingCall$Response = (RequestIndexingCall$Response) iax.a(parcel, RequestIndexingCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRequestIndexingResponse(requestIndexingCall$Response);
                    return true;
                case 3:
                    ClearCorpusCall$Response clearCorpusCall$Response = (ClearCorpusCall$Response) iax.a(parcel, ClearCorpusCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearCorpusResponse(clearCorpusCall$Response);
                    return true;
                case 4:
                    GetCorpusStatusCall$Response getCorpusStatusCall$Response = (GetCorpusStatusCall$Response) iax.a(parcel, GetCorpusStatusCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCorpusStatusResponse(getCorpusStatusCall$Response);
                    return true;
                case 5:
                    GetCorpusInfoCall$Response getCorpusInfoCall$Response = (GetCorpusInfoCall$Response) iax.a(parcel, GetCorpusInfoCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCorpusInfoResponse(getCorpusInfoCall$Response);
                    return true;
                case 6:
                    DeleteUsageReportCall$Response deleteUsageReportCall$Response = (DeleteUsageReportCall$Response) iax.a(parcel, DeleteUsageReportCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDeleteUsageReportResponse(deleteUsageReportCall$Response);
                    return true;
                case 7:
                    RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = (RegisterCorpusInfoCall$Response) iax.a(parcel, RegisterCorpusInfoCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRegisterCorpusInfoResponse(registerCorpusInfoCall$Response);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onClearCorpusResponse(ClearCorpusCall$Response clearCorpusCall$Response);

    void onDeleteUsageReportResponse(DeleteUsageReportCall$Response deleteUsageReportCall$Response);

    void onGetCorpusInfoResponse(GetCorpusInfoCall$Response getCorpusInfoCall$Response);

    void onGetCorpusStatusResponse(GetCorpusStatusCall$Response getCorpusStatusCall$Response);

    void onRegisterCorpusInfoResponse(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response);

    void onRequestIndexingResponse(RequestIndexingCall$Response requestIndexingCall$Response);
}
