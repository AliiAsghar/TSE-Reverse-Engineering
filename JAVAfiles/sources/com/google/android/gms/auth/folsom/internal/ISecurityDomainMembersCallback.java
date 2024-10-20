package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.common.api.Status;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISecurityDomainMembersCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ISecurityDomainMembersCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ISecurityDomainMembersCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback
            public void onResult(Status status, List<SecurityDomainMember> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
        }

        public static ISecurityDomainMembersCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
            if (queryLocalInterface instanceof ISecurityDomainMembersCallback) {
                return (ISecurityDomainMembersCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(SecurityDomainMember.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, createTypedArrayList);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, List<SecurityDomainMember> list);
}
