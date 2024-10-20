package com.google.android.ims.rcsservice.events;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IEventObserver extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IEventObserver {
        static final int TRANSACTION_notifyEvent = 1;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IEventObserver {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.events.IEventObserver");
            }

            @Override // com.google.android.ims.rcsservice.events.IEventObserver
            public void notifyEvent(Event event) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, event);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.events.IEventObserver");
        }

        public static IEventObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.events.IEventObserver");
            if (queryLocalInterface instanceof IEventObserver) {
                return (IEventObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Event event = (Event) iax.a(parcel, Event.CREATOR);
                enforceNoDataAvail(parcel);
                notifyEvent(event);
                return true;
            }
            return false;
        }
    }

    void notifyEvent(Event event);
}
