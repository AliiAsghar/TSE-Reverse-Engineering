package com.google.android.gms.spatula.settings.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISpatulaSettingsService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISpatulaSettingsService {
        static final int TRANSACTION_getSpatulaAvailability = 3;
        static final int TRANSACTION_getSpatulaPreference = 1;
        static final int TRANSACTION_setSpatulaPreference = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISpatulaSettingsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService
            public void getSpatulaAvailability(ISpatulaAvailabilityCallbacks iSpatulaAvailabilityCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSpatulaAvailabilityCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService
            public void getSpatulaPreference(ISpatulaSettingsCallbacks iSpatulaSettingsCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSpatulaSettingsCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService
            public void setSpatulaPreference(IStatusCallback iStatusCallback, String str, SpatulaSettingPreference spatulaSettingPreference) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, spatulaSettingPreference);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
        }

        public static ISpatulaSettingsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
            if (queryLocalInterface instanceof ISpatulaSettingsService) {
                return (ISpatulaSettingsService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    ISpatulaAvailabilityCallbacks asInterface = ISpatulaAvailabilityCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSpatulaAvailability(asInterface);
                } else {
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    SpatulaSettingPreference spatulaSettingPreference = (SpatulaSettingPreference) iax.a(parcel, SpatulaSettingPreference.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSpatulaPreference(asInterface2, readString, spatulaSettingPreference);
                }
            } else {
                ISpatulaSettingsCallbacks asInterface3 = ISpatulaSettingsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                getSpatulaPreference(asInterface3, readString2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSpatulaAvailability(ISpatulaAvailabilityCallbacks iSpatulaAvailabilityCallbacks);

    void getSpatulaPreference(ISpatulaSettingsCallbacks iSpatulaSettingsCallbacks, String str);

    void setSpatulaPreference(IStatusCallback iStatusCallback, String str, SpatulaSettingPreference spatulaSettingPreference);
}
