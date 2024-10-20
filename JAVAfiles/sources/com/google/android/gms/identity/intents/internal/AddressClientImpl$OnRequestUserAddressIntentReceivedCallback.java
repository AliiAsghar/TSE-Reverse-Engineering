package com.google.android.gms.identity.intents.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.identity.intents.internal.IAddressCallbacks;
import defpackage.abhg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AddressClientImpl$OnRequestUserAddressIntentReceivedCallback extends IAddressCallbacks.Stub {
    private final int a;
    private Activity b;

    public AddressClientImpl$OnRequestUserAddressIntentReceivedCallback(int i, Activity activity) {
        this.a = i;
        this.b = activity;
    }

    @Override // com.google.android.gms.identity.intents.internal.IAddressCallbacks
    public void onRequestUserAddressIntentReceived(int i, Bundle bundle) {
        PendingIntent pendingIntent;
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.b;
            if (activity != null && (createPendingResult = activity.createPendingResult(this.a, intent, 1073741824)) != null) {
                try {
                    createPendingResult.send(1);
                    return;
                } catch (PendingIntent.CanceledException e) {
                    Log.w("AddressClientImpl", "Exception settng pending result", e);
                    return;
                }
            }
            return;
        }
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (connectionResult.a()) {
            try {
                Activity activity2 = this.b;
                abhg.m(activity2);
                int i2 = this.a;
                if (connectionResult.a()) {
                    PendingIntent pendingIntent2 = connectionResult.d;
                    abhg.m(pendingIntent2);
                    activity2.startIntentSenderForResult(pendingIntent2.getIntentSender(), i2, null, 0, 0, 0);
                    return;
                }
                return;
            } catch (IntentSender.SendIntentException e2) {
                Log.w("AddressClientImpl", "Exception starting pending intent", e2);
                return;
            }
        }
        try {
            Activity activity3 = this.b;
            abhg.m(activity3);
            PendingIntent createPendingResult2 = activity3.createPendingResult(this.a, new Intent(), 1073741824);
            if (createPendingResult2 != null) {
                createPendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException e3) {
            Log.w("AddressClientImpl", "Exception setting pending result", e3);
        }
    }
}
