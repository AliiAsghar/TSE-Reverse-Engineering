package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.ConnectionRestrictions;
import com.google.android.gms.wearable.DataItemFilter;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Term;
import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import com.google.android.gms.wearable.internal.AccountConsentRecordParcelable;
import com.google.android.gms.wearable.internal.AddAccountToConsentRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.AddSupervisedAccountRequest;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.AppParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acju implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acju(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 528
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acju.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new WalletObjectMessage[i];
            case 1:
                return new UriData[i];
            case 2:
                return new AppRecommendationsRequest[i];
            case 3:
                return new AppTheme[i];
            case 4:
                return new Asset[i];
            case 5:
                return new ConnectionDelayConfig[i];
            case 6:
                return new ConnectionDelayFilters[i];
            case 7:
                return new ConnectionRestrictions[i];
            case 8:
                return new DataItemFilter[i];
            case 9:
                return new MessageOptions[i];
            case 10:
                return new PutDataRequest[i];
            case 11:
                return new Term[i];
            case 12:
                return new AcceptTermsRequest[i];
            case 13:
                return new AccountConsentRecordParcelable[i];
            case 14:
                return new AddAccountToConsentRequest[i];
            case 15:
                return new AddListenerRequest[i];
            case 16:
                return new AddLocalCapabilityResponse[i];
            case 17:
                return new AddSupervisedAccountRequest[i];
            case 18:
                return new AmsEntityUpdateParcelable[i];
            case 19:
                return new AncsNotificationParcelable[i];
            default:
                return new AppParcelable[i];
        }
    }
}
