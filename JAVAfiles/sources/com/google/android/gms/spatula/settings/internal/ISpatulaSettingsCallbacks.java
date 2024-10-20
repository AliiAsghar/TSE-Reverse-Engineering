package com.google.android.gms.spatula.settings.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISpatulaSettingsCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISpatulaSettingsCallbacks {
        static final int TRANSACTION_onGetSpatulaPreference = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISpatulaSettingsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks
            public void onGetSpatulaPreference(Status status, SpatulaSettingPreference spatulaSettingPreference) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, spatulaSettingPreference);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
        }

        public static ISpatulaSettingsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
            if (queryLocalInterface instanceof ISpatulaSettingsCallbacks) {
                return (ISpatulaSettingsCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                SpatulaSettingPreference spatulaSettingPreference = (SpatulaSettingPreference) iax.a(parcel, SpatulaSettingPreference.CREATOR);
                enforceNoDataAvail(parcel);
                onGetSpatulaPreference(status, spatulaSettingPreference);
                return true;
            }
            return false;
        }
    }

    void onGetSpatulaPreference(Status status, SpatulaSettingPreference spatulaSettingPreference);
}
