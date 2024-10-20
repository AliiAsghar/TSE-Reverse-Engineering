package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfy implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acfy(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 510
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfy.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ParcelableGetOptions[i];
            case 1:
                return new AccountToken[i];
            case 2:
                return new ParcelableListOptions[i];
            case 3:
                return new MatrixCursorParcelable[i];
            case 4:
                return new ParcelableLoadImageOptions[i];
            case 5:
                return new SyncStatus[i];
            case 6:
                return new AvatarReference[i];
            case 7:
                return new BackedUpContactsPerDeviceEntity[i];
            case 8:
                return new BirthdayEntity[i];
            case 9:
                return new DeviceVersionEntity[i];
            case 10:
                return new EmailEntity[i];
            case 11:
                return new FetchBackUpDeviceContactInfoResponseEntity[i];
            case 12:
                return new NameEntity[i];
            case 13:
                return new PersonEntity[i];
            case 14:
                return new PersonFieldMetadataEntity[i];
            case 15:
                return new PhoneEntity[i];
            case 16:
                return new PhotoEntity[i];
            case 17:
                return new SourceStatsEntity[i];
            case 18:
                return new Configuration[i];
            case 19:
                return new Configurations[i];
            default:
                return new DogfoodsToken[i];
        }
    }
}
