package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ProxyCard;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acjq(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 506
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjq.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PaymentCardRecognitionIntentRequest[i];
            case 1:
                return new OfferWalletObject[i];
            case 2:
                return new PaymentCardRecognitionIntentResponse[i];
            case 3:
                return new PaymentData[i];
            case 4:
                return new PaymentDataRequest[i];
            case 5:
                return new PaymentMethodToken[i];
            case 6:
                return new PaymentMethodTokenizationParameters[i];
            case 7:
                return new ProxyCard[i];
            case 8:
                return new ShippingAddressRequirements[i];
            case 9:
                return new TransactionInfo[i];
            case 10:
                return new WebPaymentData[i];
            case 11:
                return new WebPaymentDataRequest[i];
            case 12:
                return new ButtonOptions[i];
            case 13:
                return new GetInstrumentAvailabilityResponse[i];
            case 14:
                return new ExecuteBuyFlowRequest[i];
            case 15:
                return new GetBuyFlowInitializationTokenRequest[i];
            case 16:
                return new GetBuyFlowInitializationTokenResponse[i];
            case 17:
                return new GetClientTokenRequest[i];
            case 18:
                return new GetClientTokenResponse[i];
            case 19:
                return new InitializeBuyFlowRequest[i];
            default:
                return new SetUpBiometricAuthenticationKeysRequest[i];
        }
    }
}
