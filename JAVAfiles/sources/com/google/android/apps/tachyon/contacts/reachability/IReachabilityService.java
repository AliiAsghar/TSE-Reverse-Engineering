package com.google.android.apps.tachyon.contacts.reachability;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IReachabilityService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IReachabilityService {
        static final int TRANSACTION_generateInviteLink = 3;
        static final int TRANSACTION_generateMeetingInviteLink = 4;
        static final int TRANSACTION_queryReachability = 1;
        static final int TRANSACTION_queryReachabilityNoCache = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IReachabilityService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void generateInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                iax.f(obtainAndWriteInterfaceToken, iReachabilityInviteLinkCallback);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void generateMeetingInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                iax.f(obtainAndWriteInterfaceToken, iReachabilityInviteLinkCallback);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void queryReachability(List<String> list, IReachabilityQueryCallback iReachabilityQueryCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                iax.f(obtainAndWriteInterfaceToken, iReachabilityQueryCallback);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void queryReachabilityNoCache(List<String> list, IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringList(list);
                iax.f(obtainAndWriteInterfaceToken, iReachabilityQueryNoCacheCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
        }

        public static IReachabilityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
            if (queryLocalInterface instanceof IReachabilityService) {
                return (IReachabilityService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                        IReachabilityInviteLinkCallback asInterface = IReachabilityInviteLinkCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        generateMeetingInviteLink(createStringArrayList, asInterface);
                    } else {
                        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                        IReachabilityInviteLinkCallback asInterface2 = IReachabilityInviteLinkCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        generateInviteLink(createStringArrayList2, asInterface2);
                    }
                } else {
                    ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                    IReachabilityQueryNoCacheCallback asInterface3 = IReachabilityQueryNoCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    queryReachabilityNoCache(createStringArrayList3, asInterface3);
                }
            } else {
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                IReachabilityQueryCallback asInterface4 = IReachabilityQueryCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                queryReachability(createStringArrayList4, asInterface4);
            }
            return true;
        }
    }

    void generateInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback);

    void generateMeetingInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback);

    void queryReachability(List<String> list, IReachabilityQueryCallback iReachabilityQueryCallback);

    void queryReachabilityNoCache(List<String> list, IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallback);
}
