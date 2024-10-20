package com.google.android.gms.search.queries.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISearchQueriesCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISearchQueriesCallbacks {
        static final int TRANSACTION_onAnnotateResponse = 7;
        static final int TRANSACTION_onGetDocumentsResponse = 4;
        static final int TRANSACTION_onGetPhraseAffinityResponse = 5;
        static final int TRANSACTION_onGlobalQueryResponse = 3;
        static final int TRANSACTION_onQueryResponse = 2;
        static final int TRANSACTION_onQuerySuggestResponse = 6;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISearchQueriesCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
            public void onAnnotateResponse(AnnotateCall$Response annotateCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, annotateCall$Response);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
            public void onGetDocumentsResponse(GetDocumentsCall$Response getDocumentsCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getDocumentsCall$Response);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
            public void onGetPhraseAffinityResponse(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getPhraseAffinityCall$Response);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
            public void onGlobalQueryResponse(GlobalQueryCall$Response globalQueryCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, globalQueryCall$Response);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
            public void onQueryResponse(QueryCall$Response queryCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, queryCall$Response);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
            public void onQuerySuggestResponse(QuerySuggestCall$Response querySuggestCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, querySuggestCall$Response);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
        }

        public static ISearchQueriesCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
            if (queryLocalInterface instanceof ISearchQueriesCallbacks) {
                return (ISearchQueriesCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    QueryCall$Response queryCall$Response = (QueryCall$Response) iax.a(parcel, QueryCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onQueryResponse(queryCall$Response);
                    return true;
                case 3:
                    GlobalQueryCall$Response globalQueryCall$Response = (GlobalQueryCall$Response) iax.a(parcel, GlobalQueryCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGlobalQueryResponse(globalQueryCall$Response);
                    return true;
                case 4:
                    GetDocumentsCall$Response getDocumentsCall$Response = (GetDocumentsCall$Response) iax.a(parcel, GetDocumentsCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetDocumentsResponse(getDocumentsCall$Response);
                    return true;
                case 5:
                    GetPhraseAffinityCall$Response getPhraseAffinityCall$Response = (GetPhraseAffinityCall$Response) iax.a(parcel, GetPhraseAffinityCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetPhraseAffinityResponse(getPhraseAffinityCall$Response);
                    return true;
                case 6:
                    QuerySuggestCall$Response querySuggestCall$Response = (QuerySuggestCall$Response) iax.a(parcel, QuerySuggestCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onQuerySuggestResponse(querySuggestCall$Response);
                    return true;
                case 7:
                    AnnotateCall$Response annotateCall$Response = (AnnotateCall$Response) iax.a(parcel, AnnotateCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAnnotateResponse(annotateCall$Response);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onAnnotateResponse(AnnotateCall$Response annotateCall$Response);

    void onGetDocumentsResponse(GetDocumentsCall$Response getDocumentsCall$Response);

    void onGetPhraseAffinityResponse(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response);

    void onGlobalQueryResponse(GlobalQueryCall$Response globalQueryCall$Response);

    void onQueryResponse(QueryCall$Response queryCall$Response);

    void onQuerySuggestResponse(QuerySuggestCall$Response querySuggestCall$Response);
}
