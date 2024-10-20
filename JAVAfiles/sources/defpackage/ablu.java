package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.firstparty.dataservice.AccountInterruptControls;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.CheckRealNameRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckRealNameResponse;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablu implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ablu(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 512
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablu.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GoogleSignInOptions[i];
            case 1:
                return new GoogleSignInAccount[i];
            case 2:
                return new SignInAccount[i];
            case 3:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 4:
                return new SignInConfiguration[i];
            case 5:
                return new AccountInterruptControls[i];
            case 6:
                return new AccountNameCheckRequest[i];
            case 7:
                return new AccountNameCheckResponse[i];
            case 8:
                return new AccountRemovalRequest[i];
            case 9:
                return new AccountRemovalResponse[i];
            case 10:
                return new AccountSignInRequest[i];
            case 11:
                return new CheckFactoryResetPolicyComplianceRequest[i];
            case 12:
                return new CheckFactoryResetPolicyComplianceResponse[i];
            case 13:
                return new CheckRealNameRequest[i];
            case 14:
                return new CheckRealNameResponse[i];
            case 15:
                return new ClearTokenRequest[i];
            case 16:
                return new ClearTokenResponse[i];
            case 17:
                return new ConfirmCredentialsRequest[i];
            case 18:
                return new DeviceManagementInfoResponse[i];
            case 19:
                return new GetAndAdvanceOtpCounterResponse[i];
            default:
                return new GoogleAccountData[i];
        }
    }
}
