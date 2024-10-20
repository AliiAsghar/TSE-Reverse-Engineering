package com.google.android.gms.people.contactssync.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse;
import com.google.android.gms.people.cpg.CpgDocument;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractContactsSyncServiceCallbacks extends IContactsSyncServiceCallbacks.Stub {
    public void onDeviceContactsSyncSettingChanged() {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onAddAccountCategoryToBackupAndSync(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onCleanupSyncedGoogleContacts(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onCpgAppSearchUpsert(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onOptInBackupAndSync(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onOptInBackupAndSyncInternalOld(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onOptOutBackupAndSync(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onRemoveAccountCategoryFromBackupAndSync(Status status) {
    }

    public void onStatus(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onSyncHighResPhoto(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void updateSyncStatusDone(Status status) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onClassifyAccountTypesResult(Status status, List<ClassifyAccountTypeResult> list) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onCpgAppSearchRead(Status status, List<CpgDocument> list) {
    }

    public void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onGetBackupAndSyncOptInStateOld(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onGetBackupAndSyncSuggestion(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onGetBackupSyncSuggestion(Status status, GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse) {
    }

    public void onGetDeviceContactsSyncSettingAction(Status status, String str) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onGetImportSimContactsSuggestions(Status status, List list) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onImportSimContacts(Status status, int i) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onMigrateContacts(Status status, List<Long> list) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onRecordBackupSyncUserAction(Status status, RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse) {
    }

    @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public void onSyncStatusUpdate(Status status, ExtendedSyncStatus extendedSyncStatus) {
    }
}
