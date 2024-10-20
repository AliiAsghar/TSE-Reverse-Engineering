package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import com.google.android.gms.people.consentprimitive.GetContactsConsentsStatusRequest;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.BackupSyncUserAction;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse;
import com.google.android.gms.people.cpg.ActionPreference;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.CpgDocumentRequest;
import com.google.android.gms.people.cpg.GroupContactOrder;
import com.google.android.gms.people.cpg.PreferenceDocumentRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acfp(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 480
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfp.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ContactsConsentsStatus[i];
            case 1:
                return new ContactsConsentsDetailedStatus[i];
            case 2:
                return new GetContactsConsentsStatusRequest[i];
            case 3:
                return new AccountWithDataSet[i];
            case 4:
                return new BackupAndSyncOptInOptions[i];
            case 5:
                return new BackupAndSyncOptInState[i];
            case 6:
                return new BackupAndSyncSuggestion[i];
            case 7:
                return new BackupSyncContactInfo[i];
            case 8:
                return new BackupSyncUserAction[i];
            case 9:
                return new DeviceContactsSyncSetting[i];
            case 10:
                return new ExtendedSyncStatus[i];
            case 11:
                return new GetBackupSyncSuggestionRequest[i];
            case 12:
                return new GetBackupSyncSuggestionResponse[i];
            case 13:
                return new GetImportSimContactsSuggestionsRequest[i];
            case 14:
                return new ImportSimContactsRequest[i];
            case 15:
                return new RecordBackupSyncUserActionResponse[i];
            case 16:
                return new ActionPreference[i];
            case 17:
                return new CpgDocument[i];
            case 18:
                return new CpgDocumentRequest[i];
            case 19:
                return new GroupContactOrder[i];
            default:
                return new PreferenceDocumentRequest[i];
        }
    }
}
