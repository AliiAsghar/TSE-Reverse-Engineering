package defpackage;

import android.os.Parcelable;
import com.google.android.gms.telephonyspam.SpamLookupResult;
import com.google.android.gms.telephonyspam.UpdateSpamSettingsOptions;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.LineItem;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aciz(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 597
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aciz.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new UpdateSpamSettingsOptions[i];
            case 1:
                return new SpamLookupResult[i];
            case 2:
                return new ConsentInformation.AccountConsentInformation[i];
            case 3:
                return new ConsentInformation[i];
            case 4:
                return new ElCapitanOptions[i];
            case 5:
                return new SafetyOptions[i];
            case 6:
                return new UsageReportingOptInOptions[i];
            case 7:
                return new Address[i];
            case 8:
                return new CardInfo[i];
            case 9:
                return new CardRequirements[i];
            case 10:
                return new Cart[i];
            case 11:
                return new CountrySpecification[i];
            case 12:
                return new CreateWalletObjectsRequest[i];
            case 13:
                return new FullWallet[i];
            case 14:
                return new FullWalletRequest[i];
            case 15:
                return new GiftCardWalletObject[i];
            case 16:
                return new InstrumentInfo[i];
            case 17:
                return new IsReadyToPayRequest[i];
            case 18:
                return new LineItem[i];
            case 19:
                return new MaskedWallet[i];
            default:
                return new NotifyTransactionStatusRequest[i];
        }
    }
}
