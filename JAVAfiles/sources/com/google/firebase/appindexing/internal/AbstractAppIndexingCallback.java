package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.IAppIndexingCallback;
import defpackage.aoec;
import defpackage.aoei;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AbstractAppIndexingCallback extends IAppIndexingCallback.Stub {
    @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGet(Status status, List<Thing> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGetIndexableResponse(aoei aoeiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onSearch(Status status, aoec[] aoecVarArr) {
        throw new UnsupportedOperationException();
    }
}
