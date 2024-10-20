package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IKidsCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IKidsCallbacks {
        static final int TRANSACTION_onBoolean = 3;
        static final int TRANSACTION_onBooleanList = 5;
        static final int TRANSACTION_onCursorWindow = 2;
        static final int TRANSACTION_onPendingIntent = 4;
        static final int TRANSACTION_onStatus = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IKidsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsCallbacks");
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onBoolean(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onBooleanList(Status status, List<Boolean> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onCursorWindow(Status status, CursorWindow cursorWindow) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, cursorWindow);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onPendingIntent(Status status, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onStatus(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsCallbacks");
        }

        public static IKidsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsCallbacks");
            if (queryLocalInterface instanceof IKidsCallbacks) {
                return (IKidsCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            Status status = (Status) iax.a(parcel, Status.CREATOR);
                            ArrayList b = iax.b(parcel);
                            enforceNoDataAvail(parcel);
                            onBooleanList(status, b);
                        } else {
                            Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                            PendingIntent pendingIntent = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                            enforceNoDataAvail(parcel);
                            onPendingIntent(status2, pendingIntent);
                        }
                    } else {
                        Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                        boolean g = iax.g(parcel);
                        enforceNoDataAvail(parcel);
                        onBoolean(status3, g);
                    }
                } else {
                    Status status4 = (Status) iax.a(parcel, Status.CREATOR);
                    CursorWindow cursorWindow = (CursorWindow) iax.a(parcel, CursorWindow.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCursorWindow(status4, cursorWindow);
                }
            } else {
                Status status5 = (Status) iax.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onStatus(status5);
            }
            return true;
        }
    }

    void onBoolean(Status status, boolean z);

    void onBooleanList(Status status, List<Boolean> list);

    void onCursorWindow(Status status, CursorWindow cursorWindow);

    void onPendingIntent(Status status, PendingIntent pendingIntent);

    void onStatus(Status status);
}
