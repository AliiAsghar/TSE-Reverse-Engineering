package com.google.android.gms.appdatasearch.internal;

import com.google.android.gms.common.api.Status;
import defpackage.abrz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UsageReportingApiImpl {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class OnStatusCallback extends LightweightAppDataSearchCallbacks<Status> {
        public OnStatusCallback(abrz<Status> abrzVar) {
            super(abrzVar);
        }

        @Override // com.google.android.gms.appdatasearch.internal.LightweightAppDataSearchCallbacks, com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
        public void onStatus(Status status) {
            this.mHolder.c(status);
        }
    }
}
