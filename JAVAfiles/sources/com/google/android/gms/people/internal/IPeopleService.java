package com.google.android.gms.people.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.consentprimitive.GetContactsConsentsStatusRequest;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.IPeopleCallbacks;
import com.google.android.gms.people.model.AvatarReference;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPeopleService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPeopleService {
        static final int TRANSACTION_addCircle = 701;
        static final int TRANSACTION_addCircle26 = 27;
        static final int TRANSACTION_addPeopleToCircle = 28;
        static final int TRANSACTION_fetchBackUpDeviceContactInfo = 1401;
        static final int TRANSACTION_getContactsConsentsStatus = 213301;
        static final int TRANSACTION_getContactsConsentsStatus2 = 213901;
        static final int TRANSACTION_getFirstFullSyncStatus = 4201;
        static final int TRANSACTION_getGalProviderFileDescriptor = 2202;
        static final int TRANSACTION_getGalProviderType = 2201;
        static final int TRANSACTION_getMe = 1602;
        static final int TRANSACTION_getSyncStatus = 2101;
        static final int TRANSACTION_identityGetByIds = 501;
        static final int TRANSACTION_identityList = 601;
        static final int TRANSACTION_internalCall = 304;
        static final int TRANSACTION_loadAddToCircleConsent = 101;
        static final int TRANSACTION_loadAutocompleteList = 507;
        static final int TRANSACTION_loadAvatar = 502;
        static final int TRANSACTION_loadAvatarByReference = 508;
        static final int TRANSACTION_loadAvatarLegacy = 5;
        static final int TRANSACTION_loadCircles = 19;
        static final int TRANSACTION_loadContactsGaiaIds = 403;
        static final int TRANSACTION_loadContactsGaiaIds24 = 25;
        static final int TRANSACTION_loadLog = 302;
        static final int TRANSACTION_loadOwnerAvatar = 505;
        static final int TRANSACTION_loadOwnerAvatarLegacy = 29;
        static final int TRANSACTION_loadOwnerCoverPhoto = 506;
        static final int TRANSACTION_loadOwnerCoverPhotoLegacy = 301;
        static final int TRANSACTION_loadOwners = 305;
        static final int TRANSACTION_loadPeople = 404;
        static final int TRANSACTION_loadPeople400 = 401;
        static final int TRANSACTION_loadPeopleForAggregation = 402;
        static final int TRANSACTION_loadPeopleForAggregation200 = 201;
        static final int TRANSACTION_loadPeopleForAggregation201 = 202;
        static final int TRANSACTION_loadPeopleForAggregation202 = 203;
        static final int TRANSACTION_loadPeopleLive = 22;
        static final int TRANSACTION_loadPhoneNumbers = 1201;
        static final int TRANSACTION_loadRemoteImage = 504;
        static final int TRANSACTION_preliminarySync = 240501;
        static final int TRANSACTION_queryGalProvider = 2203;
        static final int TRANSACTION_registerDataChangedListener = 11;
        static final int TRANSACTION_removeCircle = 204;
        static final int TRANSACTION_requestSync = 205;
        static final int TRANSACTION_requestSyncOld = 17;
        static final int TRANSACTION_requestSyncOld19 = 20;
        static final int TRANSACTION_requestSyncOld25 = 26;
        static final int TRANSACTION_requestSyncWithStatus = 2002;
        static final int TRANSACTION_requestUploadSyncWithStatus = 2501;
        static final int TRANSACTION_restoreBackedUpDeviceContacts = 1402;
        static final int TRANSACTION_sendInteractionFeedback = 509;
        static final int TRANSACTION_setAvatar = 18;
        static final int TRANSACTION_setAvatarOld = 13;
        static final int TRANSACTION_setHasShownAddToCircleConsent = 102;
        static final int TRANSACTION_setSyncToContactsEnabled = 15;
        static final int TRANSACTION_setSyncToContactsSettings = 10;
        static final int TRANSACTION_startSync = 12;
        static final int TRANSACTION_updateCircle = 303;
        static final int TRANSACTION_updatePersonCircles = 23;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPeopleService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addCircle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addCircle26(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addPeopleToCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void fetchBackUpDeviceContactInfo(IPeopleCallbacks iPeopleCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_fetchBackUpDeviceContactInfo, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getContactsConsentsStatus(IPeopleCallbacks iPeopleCallbacks, List<Account> list, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getContactsConsentsStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getContactsConsentsStatus2(IPeopleCallbacks iPeopleCallbacks, GetContactsConsentsStatusRequest getContactsConsentsStatusRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, getContactsConsentsStatusRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getContactsConsentsStatus2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getFirstFullSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFirstFullSyncStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getGalProviderFileDescriptor(IPeopleCallbacks iPeopleCallbacks, Uri uri, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getGalProviderFileDescriptor, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getGalProviderType(IPeopleCallbacks iPeopleCallbacks, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getGalProviderType, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getMe(IPeopleCallbacks iPeopleCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getMe, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getSyncStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void identityGetByIds(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, accountToken);
                obtainAndWriteInterfaceToken.writeStringList(list);
                iax.d(obtainAndWriteInterfaceToken, parcelableGetOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_identityGetByIds, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken identityList(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, accountToken);
                iax.d(obtainAndWriteInterfaceToken, parcelableListOptions);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_identityList, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void internalCall(IPeopleCallbacks iPeopleCallbacks, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_internalCall, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadAddToCircleConsent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAutocompleteList(IPeopleCallbacks iPeopleCallbacks, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAutocompleteList, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAvatar(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAvatar, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAvatarByReference(IPeopleCallbacks iPeopleCallbacks, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, avatarReference);
                iax.d(obtainAndWriteInterfaceToken, parcelableLoadImageOptions);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAvatarByReference, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadContactsGaiaIds(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadContactsGaiaIds, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadContactsGaiaIds24(IPeopleCallbacks iPeopleCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadLog(IPeopleCallbacks iPeopleCallbacks, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadLog, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadOwnerAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadOwnerAvatar, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwnerAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadOwnerCoverPhoto, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwnerCoverPhotoLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadOwnerCoverPhotoLegacy, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwners(IPeopleCallbacks iPeopleCallbacks, boolean z, boolean z2, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadOwners, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeople(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeInt(i4);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeople, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeople400(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeople400, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i4);
                obtainAndWriteInterfaceToken.writeInt(i5);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeopleForAggregation, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation200(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, boolean z, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                transactAndReadExceptionReturnVoid(201, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation201(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(202, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation202(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                transactAndReadExceptionReturnVoid(203, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleLive(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadPhoneNumbers(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadPhoneNumbers, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadRemoteImage(IPeopleCallbacks iPeopleCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadRemoteImage, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void preliminarySync(IPeopleCallbacks iPeopleCallbacks, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_preliminarySync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void queryGalProvider(IPeopleCallbacks iPeopleCallbacks, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeStringArray(strArr2);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_queryGalProvider, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle registerDataChangedListener(IPeopleCallbacks iPeopleCallbacks, boolean z, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void removeCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeCircle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSync(String str, String str2, long j, boolean z, boolean z2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_requestSync, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld19(String str, String str2, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld25(String str, String str2, long j, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void requestSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSyncWithStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void requestUploadSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestUploadSyncWithStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void restoreBackedUpDeviceContacts(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_restoreBackedUpDeviceContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken sendInteractionFeedback(IPeopleCallbacks iPeopleCallbacks, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_sendInteractionFeedback, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setAvatarOld(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setHasShownAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setHasShownAddToCircleConsent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setSyncToContactsEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setSyncToContactsSettings(IPeopleCallbacks iPeopleCallbacks, String str, boolean z, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle startSync(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void updateCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, int i, String str5) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str5);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateCircle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void updatePersonCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                obtainAndWriteInterfaceToken.writeStringList(list2);
                iax.d(obtainAndWriteInterfaceToken, favaDiagnosticsEntity);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.internal.IPeopleService");
        }

        public static IPeopleService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
            if (queryLocalInterface instanceof IPeopleService) {
                return (IPeopleService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 22) {
                if (i != 23) {
                    if (i != TRANSACTION_loadAddToCircleConsent) {
                        if (i != TRANSACTION_setHasShownAddToCircleConsent) {
                            if (i != TRANSACTION_identityGetByIds) {
                                if (i != TRANSACTION_loadAvatar) {
                                    switch (i) {
                                        case 5:
                                            IPeopleCallbacks asInterface = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString = parcel.readString();
                                            int readInt = parcel.readInt();
                                            int readInt2 = parcel.readInt();
                                            enforceNoDataAvail(parcel);
                                            loadAvatarLegacy(asInterface, readString, readInt, readInt2);
                                            parcel2.writeNoException();
                                            return true;
                                        case 15:
                                            boolean g = iax.g(parcel);
                                            enforceNoDataAvail(parcel);
                                            setSyncToContactsEnabled(g);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_loadRemoteImage /* 504 */:
                                            IPeopleCallbacks asInterface2 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString2 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            ICancelToken loadRemoteImage = loadRemoteImage(asInterface2, readString2);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, loadRemoteImage);
                                            return true;
                                        case TRANSACTION_loadOwnerAvatar /* 505 */:
                                            IPeopleCallbacks asInterface3 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString3 = parcel.readString();
                                            String readString4 = parcel.readString();
                                            int readInt3 = parcel.readInt();
                                            int readInt4 = parcel.readInt();
                                            enforceNoDataAvail(parcel);
                                            ICancelToken loadOwnerAvatar = loadOwnerAvatar(asInterface3, readString3, readString4, readInt3, readInt4);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, loadOwnerAvatar);
                                            return true;
                                        case TRANSACTION_loadOwnerCoverPhoto /* 506 */:
                                            IPeopleCallbacks asInterface4 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString5 = parcel.readString();
                                            String readString6 = parcel.readString();
                                            int readInt5 = parcel.readInt();
                                            enforceNoDataAvail(parcel);
                                            ICancelToken loadOwnerCoverPhoto = loadOwnerCoverPhoto(asInterface4, readString5, readString6, readInt5);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, loadOwnerCoverPhoto);
                                            return true;
                                        case TRANSACTION_loadAutocompleteList /* 507 */:
                                            IPeopleCallbacks asInterface5 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString7 = parcel.readString();
                                            String readString8 = parcel.readString();
                                            boolean g2 = iax.g(parcel);
                                            String readString9 = parcel.readString();
                                            String readString10 = parcel.readString();
                                            int readInt6 = parcel.readInt();
                                            int readInt7 = parcel.readInt();
                                            int readInt8 = parcel.readInt();
                                            boolean g3 = iax.g(parcel);
                                            enforceNoDataAvail(parcel);
                                            ICancelToken loadAutocompleteList = loadAutocompleteList(asInterface5, readString7, readString8, g2, readString9, readString10, readInt6, readInt7, readInt8, g3);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, loadAutocompleteList);
                                            return true;
                                        case TRANSACTION_loadAvatarByReference /* 508 */:
                                            IPeopleCallbacks asInterface6 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            AvatarReference avatarReference = (AvatarReference) iax.a(parcel, AvatarReference.CREATOR);
                                            ParcelableLoadImageOptions parcelableLoadImageOptions = (ParcelableLoadImageOptions) iax.a(parcel, ParcelableLoadImageOptions.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            ICancelToken loadAvatarByReference = loadAvatarByReference(asInterface6, avatarReference, parcelableLoadImageOptions);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, loadAvatarByReference);
                                            return true;
                                        case TRANSACTION_sendInteractionFeedback /* 509 */:
                                            IPeopleCallbacks asInterface7 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString11 = parcel.readString();
                                            int readInt9 = parcel.readInt();
                                            enforceNoDataAvail(parcel);
                                            ICancelToken sendInteractionFeedback = sendInteractionFeedback(asInterface7, readString11, readInt9);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, sendInteractionFeedback);
                                            return true;
                                        case TRANSACTION_identityList /* 601 */:
                                            IPeopleCallbacks asInterface8 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            AccountToken accountToken = (AccountToken) iax.a(parcel, AccountToken.CREATOR);
                                            ParcelableListOptions parcelableListOptions = (ParcelableListOptions) iax.a(parcel, ParcelableListOptions.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            ICancelToken identityList = identityList(asInterface8, accountToken, parcelableListOptions);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, identityList);
                                            return true;
                                        case TRANSACTION_addCircle /* 701 */:
                                            IPeopleCallbacks asInterface9 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString12 = parcel.readString();
                                            String readString13 = parcel.readString();
                                            String readString14 = parcel.readString();
                                            String readString15 = parcel.readString();
                                            boolean g4 = iax.g(parcel);
                                            enforceNoDataAvail(parcel);
                                            addCircle(asInterface9, readString12, readString13, readString14, readString15, g4);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_loadPhoneNumbers /* 1201 */:
                                            IPeopleCallbacks asInterface10 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString16 = parcel.readString();
                                            String readString17 = parcel.readString();
                                            Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            ICancelToken loadPhoneNumbers = loadPhoneNumbers(asInterface10, readString16, readString17, bundle);
                                            parcel2.writeNoException();
                                            iax.f(parcel2, loadPhoneNumbers);
                                            return true;
                                        case TRANSACTION_fetchBackUpDeviceContactInfo /* 1401 */:
                                            IPeopleCallbacks asInterface11 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString18 = parcel.readString();
                                            String readString19 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            fetchBackUpDeviceContactInfo(asInterface11, readString18, readString19);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_restoreBackedUpDeviceContacts /* 1402 */:
                                            IPeopleCallbacks asInterface12 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString20 = parcel.readString();
                                            String readString21 = parcel.readString();
                                            String[] createStringArray = parcel.createStringArray();
                                            enforceNoDataAvail(parcel);
                                            restoreBackedUpDeviceContacts(asInterface12, readString20, readString21, createStringArray);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getMe /* 1602 */:
                                            IPeopleCallbacks asInterface13 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString22 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            getMe(asInterface13, readString22);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_requestSyncWithStatus /* 2002 */:
                                            IPeopleCallbacks asInterface14 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Account account = (Account) iax.a(parcel, Account.CREATOR);
                                            String readString23 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            requestSyncWithStatus(asInterface14, account, readString23);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getSyncStatus /* 2101 */:
                                            IPeopleCallbacks asInterface15 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                                            String readString24 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            getSyncStatus(asInterface15, account2, readString24);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getGalProviderType /* 2201 */:
                                            IPeopleCallbacks asInterface16 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Uri uri = (Uri) iax.a(parcel, Uri.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            getGalProviderType(asInterface16, uri);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getGalProviderFileDescriptor /* 2202 */:
                                            IPeopleCallbacks asInterface17 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Uri uri2 = (Uri) iax.a(parcel, Uri.CREATOR);
                                            String readString25 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            getGalProviderFileDescriptor(asInterface17, uri2, readString25);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_queryGalProvider /* 2203 */:
                                            IPeopleCallbacks asInterface18 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Uri uri3 = (Uri) iax.a(parcel, Uri.CREATOR);
                                            String[] createStringArray2 = parcel.createStringArray();
                                            String readString26 = parcel.readString();
                                            String[] createStringArray3 = parcel.createStringArray();
                                            String readString27 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            queryGalProvider(asInterface18, uri3, createStringArray2, readString26, createStringArray3, readString27);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_requestUploadSyncWithStatus /* 2501 */:
                                            IPeopleCallbacks asInterface19 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                                            String readString28 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            requestUploadSyncWithStatus(asInterface19, account3, readString28);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getFirstFullSyncStatus /* 4201 */:
                                            IPeopleCallbacks asInterface20 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                                            String readString29 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            getFirstFullSyncStatus(asInterface20, account4, readString29);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getContactsConsentsStatus /* 213301 */:
                                            IPeopleCallbacks asInterface21 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                                            int readInt10 = parcel.readInt();
                                            enforceNoDataAvail(parcel);
                                            getContactsConsentsStatus(asInterface21, createTypedArrayList, readInt10);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_getContactsConsentsStatus2 /* 213901 */:
                                            IPeopleCallbacks asInterface22 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            GetContactsConsentsStatusRequest getContactsConsentsStatusRequest = (GetContactsConsentsStatusRequest) iax.a(parcel, GetContactsConsentsStatusRequest.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            getContactsConsentsStatus2(asInterface22, getContactsConsentsStatusRequest);
                                            parcel2.writeNoException();
                                            return true;
                                        case TRANSACTION_preliminarySync /* 240501 */:
                                            IPeopleCallbacks asInterface23 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            Account account5 = (Account) iax.a(parcel, Account.CREATOR);
                                            String readString30 = parcel.readString();
                                            enforceNoDataAvail(parcel);
                                            preliminarySync(asInterface23, account5, readString30);
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case 10:
                                                    IPeopleCallbacks asInterface24 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String readString31 = parcel.readString();
                                                    boolean g5 = iax.g(parcel);
                                                    String[] createStringArray4 = parcel.createStringArray();
                                                    enforceNoDataAvail(parcel);
                                                    setSyncToContactsSettings(asInterface24, readString31, g5, createStringArray4);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 11:
                                                    IPeopleCallbacks asInterface25 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    boolean g6 = iax.g(parcel);
                                                    String readString32 = parcel.readString();
                                                    String readString33 = parcel.readString();
                                                    int readInt11 = parcel.readInt();
                                                    enforceNoDataAvail(parcel);
                                                    Bundle registerDataChangedListener = registerDataChangedListener(asInterface25, g6, readString32, readString33, readInt11);
                                                    parcel2.writeNoException();
                                                    iax.e(parcel2, registerDataChangedListener);
                                                    return true;
                                                case 12:
                                                    String readString34 = parcel.readString();
                                                    String readString35 = parcel.readString();
                                                    enforceNoDataAvail(parcel);
                                                    Bundle startSync = startSync(readString34, readString35);
                                                    parcel2.writeNoException();
                                                    iax.e(parcel2, startSync);
                                                    return true;
                                                case 13:
                                                    IPeopleCallbacks asInterface26 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String readString36 = parcel.readString();
                                                    String readString37 = parcel.readString();
                                                    Uri uri4 = (Uri) iax.a(parcel, Uri.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    setAvatarOld(asInterface26, readString36, readString37, uri4);
                                                    parcel2.writeNoException();
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case 17:
                                                            String readString38 = parcel.readString();
                                                            String readString39 = parcel.readString();
                                                            enforceNoDataAvail(parcel);
                                                            Bundle requestSyncOld = requestSyncOld(readString38, readString39);
                                                            parcel2.writeNoException();
                                                            iax.e(parcel2, requestSyncOld);
                                                            return true;
                                                        case 18:
                                                            IPeopleCallbacks asInterface27 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            String readString40 = parcel.readString();
                                                            String readString41 = parcel.readString();
                                                            Uri uri5 = (Uri) iax.a(parcel, Uri.CREATOR);
                                                            boolean g7 = iax.g(parcel);
                                                            enforceNoDataAvail(parcel);
                                                            setAvatar(asInterface27, readString40, readString41, uri5, g7);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 19:
                                                            IPeopleCallbacks asInterface28 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            String readString42 = parcel.readString();
                                                            String readString43 = parcel.readString();
                                                            String readString44 = parcel.readString();
                                                            int readInt12 = parcel.readInt();
                                                            String readString45 = parcel.readString();
                                                            boolean g8 = iax.g(parcel);
                                                            enforceNoDataAvail(parcel);
                                                            loadCircles(asInterface28, readString42, readString43, readString44, readInt12, readString45, g8);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 20:
                                                            String readString46 = parcel.readString();
                                                            String readString47 = parcel.readString();
                                                            long readLong = parcel.readLong();
                                                            enforceNoDataAvail(parcel);
                                                            Bundle requestSyncOld19 = requestSyncOld19(readString46, readString47, readLong);
                                                            parcel2.writeNoException();
                                                            iax.e(parcel2, requestSyncOld19);
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case 25:
                                                                    IPeopleCallbacks asInterface29 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString48 = parcel.readString();
                                                                    String readString49 = parcel.readString();
                                                                    enforceNoDataAvail(parcel);
                                                                    loadContactsGaiaIds24(asInterface29, readString48, readString49);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case 26:
                                                                    String readString50 = parcel.readString();
                                                                    String readString51 = parcel.readString();
                                                                    long readLong2 = parcel.readLong();
                                                                    boolean g9 = iax.g(parcel);
                                                                    enforceNoDataAvail(parcel);
                                                                    Bundle requestSyncOld25 = requestSyncOld25(readString50, readString51, readLong2, g9);
                                                                    parcel2.writeNoException();
                                                                    iax.e(parcel2, requestSyncOld25);
                                                                    return true;
                                                                case 27:
                                                                    IPeopleCallbacks asInterface30 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString52 = parcel.readString();
                                                                    String readString53 = parcel.readString();
                                                                    String readString54 = parcel.readString();
                                                                    String readString55 = parcel.readString();
                                                                    enforceNoDataAvail(parcel);
                                                                    addCircle26(asInterface30, readString52, readString53, readString54, readString55);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case 28:
                                                                    IPeopleCallbacks asInterface31 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString56 = parcel.readString();
                                                                    String readString57 = parcel.readString();
                                                                    String readString58 = parcel.readString();
                                                                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                                                                    enforceNoDataAvail(parcel);
                                                                    addPeopleToCircle(asInterface31, readString56, readString57, readString58, createStringArrayList);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case 29:
                                                                    IPeopleCallbacks asInterface32 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString59 = parcel.readString();
                                                                    String readString60 = parcel.readString();
                                                                    int readInt13 = parcel.readInt();
                                                                    int readInt14 = parcel.readInt();
                                                                    enforceNoDataAvail(parcel);
                                                                    loadOwnerAvatarLegacy(asInterface32, readString59, readString60, readInt13, readInt14);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                default:
                                                                    switch (i) {
                                                                        case 201:
                                                                            IPeopleCallbacks asInterface33 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                            String readString61 = parcel.readString();
                                                                            String readString62 = parcel.readString();
                                                                            String readString63 = parcel.readString();
                                                                            boolean g10 = iax.g(parcel);
                                                                            int readInt15 = parcel.readInt();
                                                                            int readInt16 = parcel.readInt();
                                                                            enforceNoDataAvail(parcel);
                                                                            loadPeopleForAggregation200(asInterface33, readString61, readString62, readString63, g10, readInt15, readInt16);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case 202:
                                                                            IPeopleCallbacks asInterface34 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                            String readString64 = parcel.readString();
                                                                            String readString65 = parcel.readString();
                                                                            String readString66 = parcel.readString();
                                                                            int readInt17 = parcel.readInt();
                                                                            boolean g11 = iax.g(parcel);
                                                                            int readInt18 = parcel.readInt();
                                                                            int readInt19 = parcel.readInt();
                                                                            String readString67 = parcel.readString();
                                                                            enforceNoDataAvail(parcel);
                                                                            loadPeopleForAggregation201(asInterface34, readString64, readString65, readString66, readInt17, g11, readInt18, readInt19, readString67);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case 203:
                                                                            IPeopleCallbacks asInterface35 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                            String readString68 = parcel.readString();
                                                                            String readString69 = parcel.readString();
                                                                            String readString70 = parcel.readString();
                                                                            int readInt20 = parcel.readInt();
                                                                            boolean g12 = iax.g(parcel);
                                                                            int readInt21 = parcel.readInt();
                                                                            int readInt22 = parcel.readInt();
                                                                            String readString71 = parcel.readString();
                                                                            boolean g13 = iax.g(parcel);
                                                                            enforceNoDataAvail(parcel);
                                                                            loadPeopleForAggregation202(asInterface35, readString68, readString69, readString70, readInt20, g12, readInt21, readInt22, readString71, g13);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_removeCircle /* 204 */:
                                                                            IPeopleCallbacks asInterface36 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                            String readString72 = parcel.readString();
                                                                            String readString73 = parcel.readString();
                                                                            String readString74 = parcel.readString();
                                                                            enforceNoDataAvail(parcel);
                                                                            removeCircle(asInterface36, readString72, readString73, readString74);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_requestSync /* 205 */:
                                                                            String readString75 = parcel.readString();
                                                                            String readString76 = parcel.readString();
                                                                            long readLong3 = parcel.readLong();
                                                                            boolean g14 = iax.g(parcel);
                                                                            boolean g15 = iax.g(parcel);
                                                                            enforceNoDataAvail(parcel);
                                                                            Bundle requestSync = requestSync(readString75, readString76, readLong3, g14, g15);
                                                                            parcel2.writeNoException();
                                                                            iax.e(parcel2, requestSync);
                                                                            return true;
                                                                        default:
                                                                            switch (i) {
                                                                                case TRANSACTION_loadOwnerCoverPhotoLegacy /* 301 */:
                                                                                    IPeopleCallbacks asInterface37 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                    String readString77 = parcel.readString();
                                                                                    String readString78 = parcel.readString();
                                                                                    int readInt23 = parcel.readInt();
                                                                                    enforceNoDataAvail(parcel);
                                                                                    loadOwnerCoverPhotoLegacy(asInterface37, readString77, readString78, readInt23);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_loadLog /* 302 */:
                                                                                    IPeopleCallbacks asInterface38 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                                                                                    enforceNoDataAvail(parcel);
                                                                                    loadLog(asInterface38, bundle2);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_updateCircle /* 303 */:
                                                                                    IPeopleCallbacks asInterface39 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                    String readString79 = parcel.readString();
                                                                                    String readString80 = parcel.readString();
                                                                                    String readString81 = parcel.readString();
                                                                                    String readString82 = parcel.readString();
                                                                                    int readInt24 = parcel.readInt();
                                                                                    String readString83 = parcel.readString();
                                                                                    enforceNoDataAvail(parcel);
                                                                                    updateCircle(asInterface39, readString79, readString80, readString81, readString82, readInt24, readString83);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_internalCall /* 304 */:
                                                                                    IPeopleCallbacks asInterface40 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                                                                                    enforceNoDataAvail(parcel);
                                                                                    internalCall(asInterface40, bundle3);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_loadOwners /* 305 */:
                                                                                    IPeopleCallbacks asInterface41 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                    boolean g16 = iax.g(parcel);
                                                                                    boolean g17 = iax.g(parcel);
                                                                                    String readString84 = parcel.readString();
                                                                                    String readString85 = parcel.readString();
                                                                                    int readInt25 = parcel.readInt();
                                                                                    enforceNoDataAvail(parcel);
                                                                                    loadOwners(asInterface41, g16, g17, readString84, readString85, readInt25);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case TRANSACTION_loadPeople400 /* 401 */:
                                                                                            IPeopleCallbacks asInterface42 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                            String readString86 = parcel.readString();
                                                                                            String readString87 = parcel.readString();
                                                                                            String readString88 = parcel.readString();
                                                                                            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                                                                                            int readInt26 = parcel.readInt();
                                                                                            boolean g18 = iax.g(parcel);
                                                                                            long readLong4 = parcel.readLong();
                                                                                            String readString89 = parcel.readString();
                                                                                            int readInt27 = parcel.readInt();
                                                                                            int readInt28 = parcel.readInt();
                                                                                            enforceNoDataAvail(parcel);
                                                                                            loadPeople400(asInterface42, readString86, readString87, readString88, createStringArrayList2, readInt26, g18, readLong4, readString89, readInt27, readInt28);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        case TRANSACTION_loadPeopleForAggregation /* 402 */:
                                                                                            IPeopleCallbacks asInterface43 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                            String readString90 = parcel.readString();
                                                                                            String readString91 = parcel.readString();
                                                                                            String readString92 = parcel.readString();
                                                                                            int readInt29 = parcel.readInt();
                                                                                            boolean g19 = iax.g(parcel);
                                                                                            int readInt30 = parcel.readInt();
                                                                                            int readInt31 = parcel.readInt();
                                                                                            String readString93 = parcel.readString();
                                                                                            boolean g20 = iax.g(parcel);
                                                                                            int readInt32 = parcel.readInt();
                                                                                            int readInt33 = parcel.readInt();
                                                                                            enforceNoDataAvail(parcel);
                                                                                            loadPeopleForAggregation(asInterface43, readString90, readString91, readString92, readInt29, g19, readInt30, readInt31, readString93, g20, readInt32, readInt33);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        case TRANSACTION_loadContactsGaiaIds /* 403 */:
                                                                                            IPeopleCallbacks asInterface44 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                            String readString94 = parcel.readString();
                                                                                            String readString95 = parcel.readString();
                                                                                            int readInt34 = parcel.readInt();
                                                                                            enforceNoDataAvail(parcel);
                                                                                            loadContactsGaiaIds(asInterface44, readString94, readString95, readInt34);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        case TRANSACTION_loadPeople /* 404 */:
                                                                                            IPeopleCallbacks asInterface45 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                                            String readString96 = parcel.readString();
                                                                                            String readString97 = parcel.readString();
                                                                                            String readString98 = parcel.readString();
                                                                                            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                                                                                            int readInt35 = parcel.readInt();
                                                                                            boolean g21 = iax.g(parcel);
                                                                                            long readLong5 = parcel.readLong();
                                                                                            String readString99 = parcel.readString();
                                                                                            int readInt36 = parcel.readInt();
                                                                                            int readInt37 = parcel.readInt();
                                                                                            int readInt38 = parcel.readInt();
                                                                                            enforceNoDataAvail(parcel);
                                                                                            loadPeople(asInterface45, readString96, readString97, readString98, createStringArrayList3, readInt35, g21, readLong5, readString99, readInt36, readInt37, readInt38);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        default:
                                                                                            return false;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                }
                                IPeopleCallbacks asInterface46 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                String readString100 = parcel.readString();
                                int readInt39 = parcel.readInt();
                                int readInt40 = parcel.readInt();
                                enforceNoDataAvail(parcel);
                                ICancelToken loadAvatar = loadAvatar(asInterface46, readString100, readInt39, readInt40);
                                parcel2.writeNoException();
                                iax.f(parcel2, loadAvatar);
                                return true;
                            }
                            IPeopleCallbacks asInterface47 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            AccountToken accountToken2 = (AccountToken) iax.a(parcel, AccountToken.CREATOR);
                            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                            ParcelableGetOptions parcelableGetOptions = (ParcelableGetOptions) iax.a(parcel, ParcelableGetOptions.CREATOR);
                            enforceNoDataAvail(parcel);
                            identityGetByIds(asInterface47, accountToken2, createStringArrayList4, parcelableGetOptions);
                            parcel2.writeNoException();
                            return true;
                        }
                        IPeopleCallbacks asInterface48 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        String readString101 = parcel.readString();
                        String readString102 = parcel.readString();
                        enforceNoDataAvail(parcel);
                        setHasShownAddToCircleConsent(asInterface48, readString101, readString102);
                        parcel2.writeNoException();
                        return true;
                    }
                    IPeopleCallbacks asInterface49 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString103 = parcel.readString();
                    String readString104 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    loadAddToCircleConsent(asInterface49, readString103, readString104);
                    parcel2.writeNoException();
                    return true;
                }
                IPeopleCallbacks asInterface50 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString105 = parcel.readString();
                String readString106 = parcel.readString();
                String readString107 = parcel.readString();
                ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                FavaDiagnosticsEntity favaDiagnosticsEntity = (FavaDiagnosticsEntity) iax.a(parcel, FavaDiagnosticsEntity.CREATOR);
                enforceNoDataAvail(parcel);
                updatePersonCircles(asInterface50, readString105, readString106, readString107, createStringArrayList5, createStringArrayList6, favaDiagnosticsEntity);
                parcel2.writeNoException();
                return true;
            }
            IPeopleCallbacks asInterface51 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
            String readString108 = parcel.readString();
            String readString109 = parcel.readString();
            String readString110 = parcel.readString();
            int readInt41 = parcel.readInt();
            String readString111 = parcel.readString();
            enforceNoDataAvail(parcel);
            loadPeopleLive(asInterface51, readString108, readString109, readString110, readInt41, readString111);
            parcel2.writeNoException();
            return true;
        }
    }

    void addCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, boolean z);

    void addCircle26(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4);

    void addPeopleToCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list);

    void fetchBackUpDeviceContactInfo(IPeopleCallbacks iPeopleCallbacks, String str, String str2);

    void getContactsConsentsStatus(IPeopleCallbacks iPeopleCallbacks, List<Account> list, int i);

    void getContactsConsentsStatus2(IPeopleCallbacks iPeopleCallbacks, GetContactsConsentsStatusRequest getContactsConsentsStatusRequest);

    void getFirstFullSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str);

    void getGalProviderFileDescriptor(IPeopleCallbacks iPeopleCallbacks, Uri uri, String str);

    void getGalProviderType(IPeopleCallbacks iPeopleCallbacks, Uri uri);

    void getMe(IPeopleCallbacks iPeopleCallbacks, String str);

    void getSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str);

    void identityGetByIds(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions);

    ICancelToken identityList(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, ParcelableListOptions parcelableListOptions);

    void internalCall(IPeopleCallbacks iPeopleCallbacks, Bundle bundle);

    void loadAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2);

    ICancelToken loadAutocompleteList(IPeopleCallbacks iPeopleCallbacks, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2);

    ICancelToken loadAvatar(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2);

    ICancelToken loadAvatarByReference(IPeopleCallbacks iPeopleCallbacks, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions);

    void loadAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2);

    void loadCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, boolean z);

    void loadContactsGaiaIds(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i);

    void loadContactsGaiaIds24(IPeopleCallbacks iPeopleCallbacks, String str, String str2);

    void loadLog(IPeopleCallbacks iPeopleCallbacks, Bundle bundle);

    ICancelToken loadOwnerAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2);

    void loadOwnerAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2);

    ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i);

    void loadOwnerCoverPhotoLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i);

    void loadOwners(IPeopleCallbacks iPeopleCallbacks, boolean z, boolean z2, String str, String str2, int i);

    void loadPeople(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4);

    void loadPeople400(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3);

    void loadPeopleForAggregation(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5);

    void loadPeopleForAggregation200(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, boolean z, int i, int i2);

    void loadPeopleForAggregation201(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4);

    void loadPeopleForAggregation202(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2);

    void loadPeopleLive(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4);

    ICancelToken loadPhoneNumbers(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Bundle bundle);

    ICancelToken loadRemoteImage(IPeopleCallbacks iPeopleCallbacks, String str);

    void preliminarySync(IPeopleCallbacks iPeopleCallbacks, Account account, String str);

    void queryGalProvider(IPeopleCallbacks iPeopleCallbacks, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Bundle registerDataChangedListener(IPeopleCallbacks iPeopleCallbacks, boolean z, String str, String str2, int i);

    void removeCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3);

    Bundle requestSync(String str, String str2, long j, boolean z, boolean z2);

    Bundle requestSyncOld(String str, String str2);

    Bundle requestSyncOld19(String str, String str2, long j);

    Bundle requestSyncOld25(String str, String str2, long j, boolean z);

    void requestSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str);

    void requestUploadSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str);

    void restoreBackedUpDeviceContacts(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String[] strArr);

    ICancelToken sendInteractionFeedback(IPeopleCallbacks iPeopleCallbacks, String str, int i);

    void setAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, boolean z);

    void setAvatarOld(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri);

    void setHasShownAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2);

    void setSyncToContactsEnabled(boolean z);

    void setSyncToContactsSettings(IPeopleCallbacks iPeopleCallbacks, String str, boolean z, String[] strArr);

    Bundle startSync(String str, String str2);

    void updateCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, int i, String str5);

    void updatePersonCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity);
}
