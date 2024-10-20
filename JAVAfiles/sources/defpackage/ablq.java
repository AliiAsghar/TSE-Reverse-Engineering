package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleRequest;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleResult;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ablq(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 534
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablq.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GetPhoneNumberHintIntentRequest[i];
            case 1:
                return new GetDefaultAccountResult[i];
            case 2:
                return new GetSignInIntentRequest[i];
            case 3:
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            case 4:
                return new InternalSignInCredentialWrapper[i];
            case 5:
                return new MatchPasswordResult[i];
            case 6:
                return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
            case 7:
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            case 8:
                return new BeginSignInRequest.PasswordRequestOptions[i];
            case 9:
                return new SaveAccountLinkingTokenRequest[i];
            case 10:
                return new SaveAccountLinkingTokenResult[i];
            case 11:
                return new SavePasswordRequest[i];
            case 12:
                return new SavePasswordResult[i];
            case 13:
                return new SignInCredential[i];
            case 14:
                return new SignInPassword[i];
            case 15:
                return new SigningInfoCompat[i];
            case 16:
                return new VerifyWithGoogleRequest[i];
            case 17:
                return new VerifyWithGoogleResult[i];
            case 18:
                return new ProxyGrpcRequest[i];
            case 19:
                return new ProxyRequest[i];
            default:
                return new ProxyResponse[i];
        }
    }
}
