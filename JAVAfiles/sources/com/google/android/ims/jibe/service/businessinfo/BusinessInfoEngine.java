package com.google.android.ims.jibe.service.businessinfo;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import defpackage.acnb;
import defpackage.adtw;
import defpackage.advr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoEngine extends IBusinessInfo.Stub {
    private final Context a;
    private final acnb b;

    public BusinessInfoEngine(Context context, acnb acnbVar) {
        this.a = context;
        this.b = acnbVar;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
    public void retrieveBusinessInfo(String str) {
        adtw.d(this.a, Binder.getCallingUid());
        advr.c("Retrieving business information for: %s", advr.a(str));
        this.b.h(str, null);
    }
}
