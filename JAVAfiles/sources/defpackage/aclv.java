package defpackage;

import com.google.android.gms.wearable.internal.SendMessageResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aclv extends aclo {
    public aclv(abrz abrzVar) {
        super(abrzVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onSendMessage(SendMessageResponse sendMessageResponse) {
        a(new acln(actx.o(sendMessageResponse.a), sendMessageResponse.b, 0));
    }
}
