package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.SetupWizardInstrumentManagerParams;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.WalletFragmentStyle;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjs implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acjs(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 520
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r30) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjs.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new WalletCustomTheme[i];
            case 1:
                return new SetUpBiometricAuthenticationKeysResponse[i];
            case 2:
                return new WarmUpUiProcessRequest[i];
            case 3:
                return new WarmUpUiProcessResponse[i];
            case 4:
                return new Card[i];
            case 5:
                return new GetSaveInstrumentDetailsRequest[i];
            case 6:
                return new GetSaveInstrumentDetailsResponse[i];
            case 7:
                return new SaveInstrumentRequest[i];
            case 8:
                return new GetSetupWizardIntentRequest[i];
            case 9:
                return new SetupWizardInstrumentManagerParams[i];
            case 10:
                return new WalletFragmentInitParams[i];
            case 11:
                return new WalletFragmentOptions[i];
            case 12:
                return new WalletFragmentStyle[i];
            case 13:
                return new ApplicationParameters[i];
            case 14:
                return new BuyFlowConfig[i];
            case 15:
                return new LabelValue[i];
            case 16:
                return new LabelValueRow[i];
            case 17:
                return new LoyaltyPointsBalance[i];
            case 18:
                return new LoyaltyPoints[i];
            case 19:
                return new TextModuleData[i];
            default:
                return new TimeInterval[i];
        }
    }
}
