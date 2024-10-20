package com.google.firebase.appindexing.internal;

import defpackage.acit;
import defpackage.aode;
import defpackage.aoei;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FirebaseAppIndexQueryImpl$AppIndexingCallback<R> extends AbstractAppIndexingCallback {
    private final acit a;
    private final Class b;

    public FirebaseAppIndexQueryImpl$AppIndexingCallback(acit<R> acitVar, Class<R> cls) {
        this.a = acitVar;
        this.b = cls;
    }

    @Override // com.google.firebase.appindexing.internal.AbstractAppIndexingCallback, com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGetIndexableResponse(aoei aoeiVar) {
        Thing thing;
        if (aoeiVar.a.c() && ((thing = aoeiVar.b) == null || this.b.isInstance(thing))) {
            this.a.b(this.b.cast(aoeiVar.b));
        } else {
            this.a.a(aode.m(aoeiVar.a, "GetIndexable error, please try again."));
        }
    }
}
