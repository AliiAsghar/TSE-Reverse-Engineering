package com.google.android.ims.jibe.service.signup;

import com.google.android.ims.rcsservice.signup.IAuthListener;
import com.google.android.ims.rcsservice.signup.ISignup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class SignupEngine extends ISignup.Stub {
    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public boolean getConsentSkipped(String str) {
        return false;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public int getRcsAvailability(String str) {
        return 22;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public int getRcsEligibility(String str) {
        return 1;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public boolean isSeamlessAuthorizedProvisioningAllowed() {
        return false;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public boolean isSignedUp() {
        return false;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public int requestSignupWithMsisdn(String str) {
        return 6;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public int requestSignupWithOtp(String str) {
        return 6;
    }

    @Deprecated
    public void notifyProvisioningSuccess() {
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public void requestResignup(int i, IAuthListener iAuthListener) {
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    @Deprecated
    public void requestSignup(int i, IAuthListener iAuthListener) {
    }
}
