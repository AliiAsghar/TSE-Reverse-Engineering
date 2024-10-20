package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IModuleInstallStatusListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IModuleInstallStatusListener {
        static final int TRANSACTION_onInstallStatusUpdated = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IModuleInstallStatusListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener
            public void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, moduleInstallStatusUpdate);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
        }

        public static IModuleInstallStatusListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
            if (queryLocalInterface instanceof IModuleInstallStatusListener) {
                return (IModuleInstallStatusListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) iax.a(parcel, ModuleInstallStatusUpdate.CREATOR);
                enforceNoDataAvail(parcel);
                onInstallStatusUpdated(moduleInstallStatusUpdate);
                return true;
            }
            return false;
        }
    }

    void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate);
}
