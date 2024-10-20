package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.aeey;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISafetyCoreCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements ISafetyCoreCallbacks {
        static final int TRANSACTION_onClassificationResult = 2;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements ISafetyCoreCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
            public void onClassificationResult(Status status, aeey aeeyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, aeeyVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
        }

        public static ISafetyCoreCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
            if (queryLocalInterface instanceof ISafetyCoreCallbacks) {
                return (ISafetyCoreCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                aeey aeeyVar = (aeey) iax.a(parcel, aeey.CREATOR);
                enforceNoDataAvail(parcel);
                onClassificationResult(status, aeeyVar);
                return true;
            }
            return false;
        }
    }

    void onClassificationResult(Status status, aeey aeeyVar);
}
