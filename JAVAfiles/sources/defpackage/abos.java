package defpackage;

import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.AuthAccountRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abos implements Parcelable.Creator {
    public static final abos a = new abos(14);
    private final /* synthetic */ int b;

    public abos(int i) {
        this.b = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 528
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abos.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.b) {
            case 0:
                return new BatchedLogErrorParcelable[i];
            case 1:
                return new LogEventParcelable[i];
            case 2:
                return new DataCollectionIdentifierParcelable[i];
            case 3:
                return new LogErrorParcelable[i];
            case 4:
                return new LogVerifierResultParcelable[i];
            case 5:
                return new PlayLoggerContext[i];
            case 6:
                return new CloudMessage[i];
            case 7:
                return new CloudMessagingMessengerCompat[i];
            case 8:
                return new LogOccurrenceRequest[i];
            case 9:
                return new ConnectionResult[i];
            case 10:
                return new Feature[i];
            case 11:
                return new GoogleCertificatesLookupQuery[i];
            case 12:
                return new GoogleCertificatesLookupResponse[i];
            case 13:
                return new GoogleCertificatesQuery[i];
            case 14:
                return new ApiMetadata[i];
            case 15:
                return new ComplianceOptions[i];
            case 16:
                return new Scope[i];
            case 17:
                return new Status[i];
            case 18:
                return new BitmapTeleporter[i];
            case 19:
                return new DataHolder[i];
            default:
                return new AuthAccountRequest[i];
        }
    }
}
