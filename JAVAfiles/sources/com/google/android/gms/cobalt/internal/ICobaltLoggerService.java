package com.google.android.gms.cobalt.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICobaltLoggerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICobaltLoggerService {
        static final int TRANSACTION_logOccurrence = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICobaltLoggerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.cobalt.internal.ICobaltLoggerService");
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerService
            public void logOccurrence(LogOccurrenceRequest logOccurrenceRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, logOccurrenceRequest);
                iax.f(obtainAndWriteInterfaceToken, iCobaltLoggerCallbacks);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.cobalt.internal.ICobaltLoggerService");
        }

        public static ICobaltLoggerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cobalt.internal.ICobaltLoggerService");
            if (queryLocalInterface instanceof ICobaltLoggerService) {
                return (ICobaltLoggerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LogOccurrenceRequest logOccurrenceRequest = (LogOccurrenceRequest) iax.a(parcel, LogOccurrenceRequest.CREATOR);
                ICobaltLoggerCallbacks asInterface = ICobaltLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                logOccurrence(logOccurrenceRequest, asInterface);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void logOccurrence(LogOccurrenceRequest logOccurrenceRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks);
}
