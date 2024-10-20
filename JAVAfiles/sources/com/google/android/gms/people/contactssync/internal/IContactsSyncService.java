package com.google.android.gms.people.contactssync.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupSyncUserAction;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.CpgDocumentRequest;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IContactsSyncService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IContactsSyncService {
        static final int TRANSACTION_addAccountCategoryToBackupAndSync = 192803;
        static final int TRANSACTION_addDeviceContactsSyncSettingChangedListener = 223601;
        static final int TRANSACTION_classifyAccountTypes = 201202;
        static final int TRANSACTION_cleanupSyncedGoogleContacts = 223902;
        static final int TRANSACTION_fsaUpdateSyncStatus = 203902;
        static final int TRANSACTION_getBackupAndSyncOptInState = 192806;
        static final int TRANSACTION_getBackupAndSyncOptInStateOld = 192403;
        static final int TRANSACTION_getBackupAndSyncSuggestion = 192807;
        static final int TRANSACTION_getBackupSyncSuggestion = 201602;
        static final int TRANSACTION_getDeviceContactsSyncSettingAction = 223903;
        static final int TRANSACTION_getImportSimContactsProgress = 213902;
        static final int TRANSACTION_getImportSimContactsSuggestions = 213302;
        static final int TRANSACTION_importSimContacts = 212502;
        static final int TRANSACTION_migrateContacts = 202604;
        static final int TRANSACTION_optInBackupAndSync = 214201;
        static final int TRANSACTION_optInBackupAndSyncInternalOld = 192402;
        static final int TRANSACTION_optInBackupAndSyncPreY2021w42 = 192802;
        static final int TRANSACTION_optInBackupAndSyncWithoutValidation = 203302;
        static final int TRANSACTION_optOutBackupAndSync = 192805;
        static final int TRANSACTION_readCpgDocuments = 242001;
        static final int TRANSACTION_recordBackupSyncUserAction = 201603;
        static final int TRANSACTION_registerSyncStatusListener = 203901;
        static final int TRANSACTION_registerSyncStatusListenerWithChannel = 234202;
        static final int TRANSACTION_removeAccountCategoryFromBackupAndSync = 192804;
        static final int TRANSACTION_removeDeviceContactsSyncSettingChangedListener = 223602;
        static final int TRANSACTION_syncHighResPhoto = 194202;
        static final int TRANSACTION_upsertCpgDocuments = 231501;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IContactsSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncService");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void addAccountCategoryToBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addAccountCategoryToBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addDeviceContactsSyncSettingChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void classifyAccountTypes(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<ClassifyAccountTypeRequest> list, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_classifyAccountTypes, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void cleanupSyncedGoogleContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_cleanupSyncedGoogleContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void fsaUpdateSyncStatus(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ExtendedSyncStatus extendedSyncStatus, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, extendedSyncStatus);
                iax.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_fsaUpdateSyncStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInState, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncOptInStateOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInStateOld, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncSuggestion, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, getBackupSyncSuggestionRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupSyncSuggestion, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getDeviceContactsSyncSettingAction, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public int getImportSimContactsProgress(ImportSimContactsRequest importSimContactsRequest, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, importSimContactsRequest);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getImportSimContactsProgress, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getImportSimContactsSuggestions(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, getImportSimContactsSuggestionsRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getImportSimContactsSuggestions, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void importSimContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ImportSimContactsRequest importSimContactsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, importSimContactsRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_importSimContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void migrateContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, AccountWithDataSet accountWithDataSet, AccountWithDataSet accountWithDataSet2, List<Long> list, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, accountWithDataSet);
                iax.d(obtainAndWriteInterfaceToken, accountWithDataSet2);
                obtainAndWriteInterfaceToken.writeList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_migrateContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, BackupAndSyncOptInOptions backupAndSyncOptInOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, backupAndSyncOptInOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncInternalOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncInternalOld, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncPreY2021w42(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncPreY2021w42, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncWithoutValidation(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncWithoutValidation, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optOutBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optOutBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void readCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocumentRequest> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_readCpgDocuments, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void recordBackupSyncUserAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, BackupSyncUserAction backupSyncUserAction) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, backupSyncUserAction);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordBackupSyncUserAction, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void registerSyncStatusListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerSyncStatusListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void registerSyncStatusListenerWithChannel(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerSyncStatusListenerWithChannel, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void removeAccountCategoryFromBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeAccountCategoryFromBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeDeviceContactsSyncSettingChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void syncHighResPhoto(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                iax.d(obtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncHighResPhoto, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void upsertCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocument> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_upsertCpgDocuments, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
        }

        public static IContactsSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
            if (queryLocalInterface instanceof IContactsSyncService) {
                return (IContactsSyncService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_optInBackupAndSyncInternalOld /* 192402 */:
                    IContactsSyncServiceCallbacks asInterface = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] createIntArray = parcel.createIntArray();
                    String readString = parcel.readString();
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncInternalOld(asInterface, createIntArray, readString, g);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncOptInStateOld /* 192403 */:
                    IContactsSyncServiceCallbacks asInterface2 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInStateOld(asInterface2, readString2);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optInBackupAndSyncPreY2021w42 /* 192802 */:
                    IContactsSyncServiceCallbacks asInterface3 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncPreY2021w42(asInterface3, readString3);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addAccountCategoryToBackupAndSync /* 192803 */:
                    IContactsSyncServiceCallbacks asInterface4 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] createIntArray2 = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    addAccountCategoryToBackupAndSync(asInterface4, createIntArray2);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_removeAccountCategoryFromBackupAndSync /* 192804 */:
                    IContactsSyncServiceCallbacks asInterface5 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] createIntArray3 = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    removeAccountCategoryFromBackupAndSync(asInterface5, createIntArray3);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optOutBackupAndSync /* 192805 */:
                    IContactsSyncServiceCallbacks asInterface6 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    optOutBackupAndSync(asInterface6);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncOptInState /* 192806 */:
                    IContactsSyncServiceCallbacks asInterface7 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInState(asInterface7);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncSuggestion /* 192807 */:
                    IContactsSyncServiceCallbacks asInterface8 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncSuggestion(asInterface8);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_syncHighResPhoto /* 194202 */:
                    IContactsSyncServiceCallbacks asInterface9 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) iax.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    syncHighResPhoto(asInterface9, uri);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_classifyAccountTypes /* 201202 */:
                    IContactsSyncServiceCallbacks asInterface10 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(ClassifyAccountTypeRequest.CREATOR);
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    classifyAccountTypes(asInterface10, createTypedArrayList, readString4);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupSyncSuggestion /* 201602 */:
                    IContactsSyncServiceCallbacks asInterface11 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest = (GetBackupSyncSuggestionRequest) iax.a(parcel, GetBackupSyncSuggestionRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupSyncSuggestion(asInterface11, getBackupSyncSuggestionRequest);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_recordBackupSyncUserAction /* 201603 */:
                    IContactsSyncServiceCallbacks asInterface12 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BackupSyncUserAction backupSyncUserAction = (BackupSyncUserAction) iax.a(parcel, BackupSyncUserAction.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordBackupSyncUserAction(asInterface12, backupSyncUserAction);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_migrateContacts /* 202604 */:
                    IContactsSyncServiceCallbacks asInterface13 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountWithDataSet accountWithDataSet = (AccountWithDataSet) iax.a(parcel, AccountWithDataSet.CREATOR);
                    AccountWithDataSet accountWithDataSet2 = (AccountWithDataSet) iax.a(parcel, AccountWithDataSet.CREATOR);
                    ArrayList b = iax.b(parcel);
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    migrateContacts(asInterface13, accountWithDataSet, accountWithDataSet2, b, readInt);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optInBackupAndSyncWithoutValidation /* 203302 */:
                    IContactsSyncServiceCallbacks asInterface14 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncWithoutValidation(asInterface14, readString5);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_registerSyncStatusListener /* 203901 */:
                    IContactsSyncServiceCallbacks asInterface15 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean g2 = iax.g(parcel);
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    String readString6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    registerSyncStatusListener(asInterface15, g2, account, readString6);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_fsaUpdateSyncStatus /* 203902 */:
                    IContactsSyncServiceCallbacks asInterface16 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ExtendedSyncStatus extendedSyncStatus = (ExtendedSyncStatus) iax.a(parcel, ExtendedSyncStatus.CREATOR);
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    fsaUpdateSyncStatus(asInterface16, extendedSyncStatus, account2);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_importSimContacts /* 212502 */:
                    IContactsSyncServiceCallbacks asInterface17 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) iax.a(parcel, ImportSimContactsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    importSimContacts(asInterface17, importSimContactsRequest);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getImportSimContactsSuggestions /* 213302 */:
                    IContactsSyncServiceCallbacks asInterface18 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest = (GetImportSimContactsSuggestionsRequest) iax.a(parcel, GetImportSimContactsSuggestionsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getImportSimContactsSuggestions(asInterface18, getImportSimContactsSuggestionsRequest);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getImportSimContactsProgress /* 213902 */:
                    ImportSimContactsRequest importSimContactsRequest2 = (ImportSimContactsRequest) iax.a(parcel, ImportSimContactsRequest.CREATOR);
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    int importSimContactsProgress = getImportSimContactsProgress(importSimContactsRequest2, readInt2);
                    parcel2.writeNoException();
                    parcel2.writeInt(importSimContactsProgress);
                    return true;
                case TRANSACTION_optInBackupAndSync /* 214201 */:
                    IContactsSyncServiceCallbacks asInterface19 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    BackupAndSyncOptInOptions backupAndSyncOptInOptions = (BackupAndSyncOptInOptions) iax.a(parcel, BackupAndSyncOptInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSync(asInterface19, readString7, backupAndSyncOptInOptions);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addDeviceContactsSyncSettingChangedListener /* 223601 */:
                    IContactsSyncServiceCallbacks asInterface20 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addDeviceContactsSyncSettingChangedListener(asInterface20);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_removeDeviceContactsSyncSettingChangedListener /* 223602 */:
                    IContactsSyncServiceCallbacks asInterface21 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    removeDeviceContactsSyncSettingChangedListener(asInterface21);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_cleanupSyncedGoogleContacts /* 223902 */:
                    IContactsSyncServiceCallbacks asInterface22 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    cleanupSyncedGoogleContacts(asInterface22, readString8);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getDeviceContactsSyncSettingAction /* 223903 */:
                    IContactsSyncServiceCallbacks asInterface23 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDeviceContactsSyncSettingAction(asInterface23);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_upsertCpgDocuments /* 231501 */:
                    IContactsSyncServiceCallbacks asInterface24 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(CpgDocument.CREATOR);
                    enforceNoDataAvail(parcel);
                    upsertCpgDocuments(asInterface24, createTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_registerSyncStatusListenerWithChannel /* 234202 */:
                    IContactsSyncServiceCallbacks asInterface25 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean g3 = iax.g(parcel);
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    registerSyncStatusListenerWithChannel(asInterface25, g3, account3, readString9, readString10);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_readCpgDocuments /* 242001 */:
                    IContactsSyncServiceCallbacks asInterface26 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(CpgDocumentRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    readCpgDocuments(asInterface26, createTypedArrayList3);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addAccountCategoryToBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr);

    void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void classifyAccountTypes(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<ClassifyAccountTypeRequest> list, String str);

    void cleanupSyncedGoogleContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str);

    void fsaUpdateSyncStatus(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ExtendedSyncStatus extendedSyncStatus, Account account);

    void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void getBackupAndSyncOptInStateOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str);

    void getBackupAndSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void getBackupSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest);

    void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    int getImportSimContactsProgress(ImportSimContactsRequest importSimContactsRequest, int i);

    void getImportSimContactsSuggestions(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest);

    void importSimContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ImportSimContactsRequest importSimContactsRequest);

    void migrateContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, AccountWithDataSet accountWithDataSet, AccountWithDataSet accountWithDataSet2, List<Long> list, int i);

    void optInBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, BackupAndSyncOptInOptions backupAndSyncOptInOptions);

    void optInBackupAndSyncInternalOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, String str, boolean z);

    void optInBackupAndSyncPreY2021w42(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str);

    void optInBackupAndSyncWithoutValidation(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str);

    void optOutBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void readCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocumentRequest> list);

    void recordBackupSyncUserAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, BackupSyncUserAction backupSyncUserAction);

    void registerSyncStatusListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str);

    void registerSyncStatusListenerWithChannel(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, String str2);

    void removeAccountCategoryFromBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr);

    void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void syncHighResPhoto(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, Uri uri);

    void upsertCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocument> list);
}
