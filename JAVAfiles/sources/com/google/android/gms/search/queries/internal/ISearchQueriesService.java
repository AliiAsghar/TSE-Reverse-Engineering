package com.google.android.gms.search.queries.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.queries.AnnotateCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchQueriesService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchQueriesService {
        static final int TRANSACTION_annotate = 7;
        static final int TRANSACTION_getDocument = 9;
        static final int TRANSACTION_getDocuments = 4;
        static final int TRANSACTION_getPhraseAffinity = 5;
        static final int TRANSACTION_globalQuery = 3;
        static final int TRANSACTION_logApiTraceEvents = 8;
        static final int TRANSACTION_query = 2;
        static final int TRANSACTION_querySuggest = 6;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchQueriesService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesService");
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void annotate(AnnotateCall$Request annotateCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, annotateCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getDocument(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getDocumentsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getDocuments(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getDocumentsCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getPhraseAffinity(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getPhraseAffinityCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void globalQuery(GlobalQueryCall$Request globalQueryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, globalQueryCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void logApiTraceEvents(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void query(QueryCall$Request queryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, queryCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void querySuggest(QuerySuggestCall$Request querySuggestCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, querySuggestCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        }

        public static ISearchQueriesService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
            if (queryLocalInterface instanceof ISearchQueriesService) {
                return (ISearchQueriesService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    QueryCall$Request queryCall$Request = (QueryCall$Request) iax.a(parcel, QueryCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    query(queryCall$Request, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    GlobalQueryCall$Request globalQueryCall$Request = (GlobalQueryCall$Request) iax.a(parcel, GlobalQueryCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface2 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    globalQuery(globalQueryCall$Request, asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) iax.a(parcel, GetDocumentsCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface3 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDocuments(getDocumentsCall$Request, asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = (GetPhraseAffinityCall$Request) iax.a(parcel, GetPhraseAffinityCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface4 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPhraseAffinity(getPhraseAffinityCall$Request, asInterface4);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    QuerySuggestCall$Request querySuggestCall$Request = (QuerySuggestCall$Request) iax.a(parcel, QuerySuggestCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface5 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    querySuggest(querySuggestCall$Request, asInterface5);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    AnnotateCall$Request annotateCall$Request = (AnnotateCall$Request) iax.a(parcel, AnnotateCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface6 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    annotate(annotateCall$Request, asInterface6);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    logApiTraceEvents(bundle);
                    return true;
                case 9:
                    GetDocumentsCall$Request getDocumentsCall$Request2 = (GetDocumentsCall$Request) iax.a(parcel, GetDocumentsCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface7 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDocument(getDocumentsCall$Request2, asInterface7);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void annotate(AnnotateCall$Request annotateCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);

    void getDocument(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);

    void getDocuments(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);

    void getPhraseAffinity(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);

    void globalQuery(GlobalQueryCall$Request globalQueryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);

    void logApiTraceEvents(Bundle bundle);

    void query(QueryCall$Request queryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);

    void querySuggest(QuerySuggestCall$Request querySuggestCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks);
}
