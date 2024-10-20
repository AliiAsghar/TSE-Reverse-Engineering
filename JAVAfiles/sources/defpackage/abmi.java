package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.OtpRequest;
import com.google.android.gms.auth.firstparty.dataservice.OtpResponse;
import com.google.android.gms.auth.firstparty.dataservice.PasswordCheckRequest;
import com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.dataservice.WebSetupConfig;
import com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abmi(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 596
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmi.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GplusInfoResponse[i];
            case 1:
                return new GplusInfoRequest[i];
            case 2:
                return new OtpRequest[i];
            case 3:
                return new OtpResponse[i];
            case 4:
                return new PasswordCheckRequest[i];
            case 5:
                return new PasswordCheckResponse[i];
            case 6:
                return new PostSignInData[i];
            case 7:
                return new UpdateCredentialsRequest[i];
            case 8:
                return new ValidateAccountCredentialsResponse[i];
            case 9:
                return new WebSetupConfig[i];
            case 10:
                return new WebSetupConfigRequest[i];
            case 11:
                return new AccountRemovalAllowedWorkflowRequest[i];
            case 12:
                return new ConfirmCredentialsWorkflowRequest[i];
            case 13:
                return new FinishSessionWorkflowRequest[i];
            case 14:
                return new StartAddAccountSessionWorkflowRequest[i];
            case 15:
                return new TokenWorkflowRequest[i];
            case 16:
                return new UpdateCredentialsWorkflowRequest[i];
            case 17:
                return new AccountCredentials[i];
            case 18:
                return new AppDescription[i];
            case 19:
                return new CaptchaChallenge[i];
            default:
                return new CaptchaSolution[i];
        }
    }
}
