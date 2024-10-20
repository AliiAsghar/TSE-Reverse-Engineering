package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.abpe;
import defpackage.actx;
import defpackage.aode;
import defpackage.aoih;
import defpackage.aoil;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class FirebaseInstanceIdReceiver extends abpe {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abpe
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) actx.u(aoih.b(cloudMessage.a, context, new aoil(1)))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.abpe
    protected final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (aode.al(putExtras)) {
            aode.aj("_nd", putExtras.getExtras());
        }
    }
}
