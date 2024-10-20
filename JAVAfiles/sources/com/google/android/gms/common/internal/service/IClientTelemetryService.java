package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.TelemetryData;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IClientTelemetryService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IClientTelemetryService {
        static final int TRANSACTION_recordData = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IClientTelemetryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
            }

            @Override // com.google.android.gms.common.internal.service.IClientTelemetryService
            public void recordData(TelemetryData telemetryData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, telemetryData);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.service.IClientTelemetryService");
        }

        public static IClientTelemetryService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (queryLocalInterface instanceof IClientTelemetryService) {
                return (IClientTelemetryService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                TelemetryData telemetryData = (TelemetryData) iax.a(parcel, TelemetryData.CREATOR);
                enforceNoDataAvail(parcel);
                recordData(telemetryData);
                return true;
            }
            return false;
        }
    }

    void recordData(TelemetryData telemetryData);
}
