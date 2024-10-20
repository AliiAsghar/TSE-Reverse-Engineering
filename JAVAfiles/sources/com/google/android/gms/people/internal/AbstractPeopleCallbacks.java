package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import com.google.android.gms.people.internal.IPeopleCallbacks;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AbstractPeopleCallbacks extends IPeopleCallbacks.Stub {
    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public final void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Shouldn't be called");
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onStatusCallback(int i) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onContactTypeMetadataRetrieved(int i, BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onFirstFullSyncStatusCallback(int i, SyncStatus syncStatus) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onGalProviderTypeCallback(int i, String str) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onGetContactsConsentsStatusCallback(Status status, ContactsConsentsStatus contactsConsentsStatus) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onMatrixCursorCallback(int i, MatrixCursorParcelable matrixCursorParcelable) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onPersonRetrieved(int i, PersonEntity personEntity) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onSyncStatus(int i, SyncStatus syncStatus) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onBundleLoaded(int i, Bundle bundle, Bundle bundle2) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onDataHoldersLoaded(int i, Bundle bundle, DataHolder[] dataHolderArr) {
    }

    @Override // com.google.android.gms.people.internal.IPeopleCallbacks
    public void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }
}
