package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOnRenderEventListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOnRenderEventListener {
        static final int TRANSACTION_onFrameEnd = 2;
        static final int TRANSACTION_onFrameStart = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOnRenderEventListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnRenderEventListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnRenderEventListener
            public void onFrameEnd() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IOnRenderEventListener
            public void onFrameStart() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnRenderEventListener");
        }

        public static IOnRenderEventListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnRenderEventListener");
            if (queryLocalInterface instanceof IOnRenderEventListener) {
                return (IOnRenderEventListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                onFrameEnd();
            } else {
                onFrameStart();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onFrameEnd();

    void onFrameStart();
}
