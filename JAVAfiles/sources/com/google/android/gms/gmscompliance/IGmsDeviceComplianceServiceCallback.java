package com.google.android.gms.gmscompliance;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGmsDeviceComplianceServiceCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGmsDeviceComplianceServiceCallback {
        static final int TRANSACTION_onGetGmsDeviceCompliance = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGmsDeviceComplianceServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
            }

            @Override // com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback
            public void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, gmsDeviceComplianceResponse);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
        }

        public static IGmsDeviceComplianceServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
            if (queryLocalInterface instanceof IGmsDeviceComplianceServiceCallback) {
                return (IGmsDeviceComplianceServiceCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) iax.a(parcel, GmsDeviceComplianceResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onGetGmsDeviceCompliance(status, gmsDeviceComplianceResponse);
                return true;
            }
            return false;
        }
    }

    void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse);
}
