package com.google.android.gms.search.nativeapi.internal;

import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;
import com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks;
import defpackage.abrz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativeApiResultCallbacks<R> extends INativeApiCallbacks.Stub {
    private final abrz a;
    private final Class b;

    public NativeApiResultCallbacks(abrz<R> abrzVar, Class<R> cls) {
        this.a = abrzVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks
    public void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response) {
        this.a.c(this.b.cast(getNativeApiInfoCall$Response));
    }
}
