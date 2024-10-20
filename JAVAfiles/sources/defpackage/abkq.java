package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.auth.GetHubTokenRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.NotificationParams;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.account.device.AddCastCertificateToDeviceAccountRequest;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;
import com.google.android.gms.auth.api.credentials.Credential;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abkq(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 568
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abkq.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BrowserResolutionCookie[i];
            case 1:
                return new AuthzenBeginTxData[i];
            case 2:
                return new GetAccountsRequest[i];
            case 3:
                return new GetHubTokenInternalResponse[i];
            case 4:
                return new GetHubTokenRequest[i];
            case 5:
                return new HasCapabilitiesRequest[i];
            case 6:
                return new NotificationParams[i];
            case 7:
                return new ResolutionData[i];
            case 8:
                return new TokenData[i];
            case 9:
                return new AddCastCertificateToDeviceAccountRequest[i];
            case 10:
                return new AccountTransferMsg[i];
            case 11:
                return new AccountTransferProgress[i];
            case 12:
                return new AuthenticatorAnnotatedData[i];
            case 13:
                return new AuthenticatorTransferInfo[i];
            case 14:
                return new DeviceMetaData[i];
            case 15:
                return new DeviceMetaDataRequest[i];
            case 16:
                return new NotifyCompletionRequest[i];
            case 17:
                return new RetrieveDataRequest[i];
            case 18:
                return new SendDataRequest[i];
            case 19:
                return new UserChallengeRequest[i];
            default:
                return new Credential[i];
        }
    }
}
