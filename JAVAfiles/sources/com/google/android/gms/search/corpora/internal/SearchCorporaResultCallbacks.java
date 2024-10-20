package com.google.android.gms.search.corpora.internal;

import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks;
import defpackage.abrz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchCorporaResultCallbacks<R> extends ISearchCorporaCallbacks.Stub {
    private final abrz a;
    private final Class b;

    public SearchCorporaResultCallbacks(abrz<R> abrzVar, Class<R> cls) {
        this.a = abrzVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
    public void onClearCorpusResponse(ClearCorpusCall$Response clearCorpusCall$Response) {
        this.a.c(this.b.cast(clearCorpusCall$Response));
    }

    @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
    public void onDeleteUsageReportResponse(DeleteUsageReportCall$Response deleteUsageReportCall$Response) {
        this.a.c(this.b.cast(deleteUsageReportCall$Response));
    }

    @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
    public void onGetCorpusInfoResponse(GetCorpusInfoCall$Response getCorpusInfoCall$Response) {
        this.a.c(this.b.cast(getCorpusInfoCall$Response));
    }

    @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
    public void onGetCorpusStatusResponse(GetCorpusStatusCall$Response getCorpusStatusCall$Response) {
        this.a.c(this.b.cast(getCorpusStatusCall$Response));
    }

    @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
    public void onRegisterCorpusInfoResponse(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response) {
        this.a.c(this.b.cast(registerCorpusInfoCall$Response));
    }

    @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks
    public void onRequestIndexingResponse(RequestIndexingCall$Response requestIndexingCall$Response) {
        this.a.c(this.b.cast(requestIndexingCall$Response));
    }
}
