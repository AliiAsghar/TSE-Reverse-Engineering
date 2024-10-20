package com.google.android.gms.search.queries.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks;
import defpackage.abhb;
import defpackage.achq;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SearchQueriesCallbacks<T> extends ISearchQueriesCallbacks.Stub {
    private final achq a;
    private final acit b;

    public SearchQueriesCallbacks(achq achqVar, acit<T> acitVar) {
        this.a = achqVar;
        this.b = acitVar;
    }

    private final void a(Bundle bundle) {
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
            try {
                ((ISearchQueriesService) this.a.K()).logApiTraceEvents(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onAnnotateResponse(AnnotateCall$Response annotateCall$Response) {
        a(annotateCall$Response.c);
        abhb.d(annotateCall$Response.a, annotateCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetDocumentsResponse(GetDocumentsCall$Response getDocumentsCall$Response) {
        a(getDocumentsCall$Response.c);
        abhb.d(getDocumentsCall$Response.a, getDocumentsCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetPhraseAffinityResponse(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        a(getPhraseAffinityCall$Response.c);
        abhb.d(getPhraseAffinityCall$Response.a, getPhraseAffinityCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGlobalQueryResponse(GlobalQueryCall$Response globalQueryCall$Response) {
        a(globalQueryCall$Response.c);
        abhb.d(globalQueryCall$Response.a, globalQueryCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQueryResponse(QueryCall$Response queryCall$Response) {
        a(queryCall$Response.c);
        abhb.d(queryCall$Response.a, queryCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQuerySuggestResponse(QuerySuggestCall$Response querySuggestCall$Response) {
        a(querySuggestCall$Response.c);
        abhb.d(querySuggestCall$Response.a, querySuggestCall$Response.b, this.b);
    }
}
