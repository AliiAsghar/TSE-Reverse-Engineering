package com.google.android.gms.telephonyspam.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.telephonyspam.SettingsLookupResult;
import com.google.android.gms.telephonyspam.SpamLookupResult;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITelephonySpamCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ITelephonySpamCallbacks {
        static final int TRANSACTION_onSettingsLookupComplete = 3;
        static final int TRANSACTION_onSpamLookupComplete = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ITelephonySpamCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks
            public void onSettingsLookupComplete(Status status, SettingsLookupResult settingsLookupResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, settingsLookupResult);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks
            public void onSpamLookupComplete(Status status, SpamLookupResult spamLookupResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, spamLookupResult);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
        }

        public static ITelephonySpamCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
            if (queryLocalInterface instanceof ITelephonySpamCallbacks) {
                return (ITelephonySpamCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                SettingsLookupResult settingsLookupResult = (SettingsLookupResult) iax.a(parcel, SettingsLookupResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSettingsLookupComplete(status, settingsLookupResult);
                return true;
            }
            Status status2 = (Status) iax.a(parcel, Status.CREATOR);
            SpamLookupResult spamLookupResult = (SpamLookupResult) iax.a(parcel, SpamLookupResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSpamLookupComplete(status2, spamLookupResult);
            return true;
        }
    }

    void onSettingsLookupComplete(Status status, SettingsLookupResult settingsLookupResult);

    void onSpamLookupComplete(Status status, SpamLookupResult spamLookupResult);
}
