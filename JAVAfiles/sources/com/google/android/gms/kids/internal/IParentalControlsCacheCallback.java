package com.google.android.gms.kids.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IParentalControlsCacheCallback extends IInterface {
    public static final int FLAG_CLEAR_CACHE = 2;
    public static final int FLAG_DEFAULT_ALLOWED = 8;
    public static final int FLAG_MORE_DATA = 1;
    public static final int FLAG_REMOVE_RESOURCES = 4;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IParentalControlsCacheCallback {
        static final int TRANSACTION_updateCache = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IParentalControlsCacheCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IParentalControlsCacheCallback");
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsCacheCallback
            public void updateCache(String str, List<Uri> list, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IParentalControlsCacheCallback");
        }

        public static IParentalControlsCacheCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IParentalControlsCacheCallback");
            if (queryLocalInterface instanceof IParentalControlsCacheCallback) {
                return (IParentalControlsCacheCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String readString = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                updateCache(readString, createTypedArrayList, readInt);
                return true;
            }
            return false;
        }
    }

    void updateCache(String str, List<Uri> list, int i);
}
