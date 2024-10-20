package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.signup.IAuthListener;
import com.google.android.ims.rcsservice.signup.ISignup;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForwardingSignupBinder extends ISignup.Stub implements adud<ISignup> {
    private ISignup a;
    private final Context b;

    public ForwardingSignupBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public boolean getConsentSkipped(String str) {
        return ((ISignup) getDelegate()).getConsentSkipped(str);
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public int getRcsAvailability(String str) {
        return ((ISignup) getDelegate()).getRcsAvailability(str);
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public int getRcsEligibility(String str) {
        return ((ISignup) getDelegate()).getRcsEligibility(str);
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public boolean isSeamlessAuthorizedProvisioningAllowed() {
        return ((ISignup) getDelegate()).isSeamlessAuthorizedProvisioningAllowed();
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public boolean isSignedUp() {
        return ((ISignup) getDelegate()).isSignedUp();
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public void requestResignup(int i, IAuthListener iAuthListener) {
        ((ISignup) getDelegate()).requestResignup(i, iAuthListener);
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public void requestSignup(int i, IAuthListener iAuthListener) {
        ((ISignup) getDelegate()).requestSignup(i, iAuthListener);
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public int requestSignupWithMsisdn(String str) {
        return ((ISignup) getDelegate()).requestSignupWithMsisdn(str);
    }

    @Override // com.google.android.ims.rcsservice.signup.ISignup
    public int requestSignupWithOtp(String str) {
        return ((ISignup) getDelegate()).requestSignupWithOtp(str);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (ISignup) iBinder;
    }

    @Override // defpackage.adud
    public synchronized ISignup getInterface() {
        return this.a;
    }
}
