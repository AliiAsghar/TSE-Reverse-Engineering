package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class IMessengerCompat$Impl extends Binder implements IInterface {
    private final Handler a;

    IMessengerCompat$Impl(Handler handler) {
        this.a = handler;
        attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Message message;
        parcel.enforceInterface(getInterfaceDescriptor());
        if (i == 1) {
            if (parcel.readInt() != 0) {
                message = (Message) Message.CREATOR.createFromParcel(parcel);
            } else {
                message = null;
            }
            send(message);
            return true;
        }
        return false;
    }

    public void send(Message message) {
        message.arg2 = Binder.getCallingUid();
        this.a.dispatchMessage(message);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
