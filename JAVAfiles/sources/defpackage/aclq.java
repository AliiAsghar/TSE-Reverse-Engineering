package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.ChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aclq extends aclo {
    private final ChannelStreamCallbacks a;

    public aclq(abrz abrzVar, ChannelStreamCallbacks channelStreamCallbacks) {
        super(abrzVar);
        this.a = channelStreamCallbacks;
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        ackv ackvVar;
        if (getChannelOutputStreamResponse.b != null) {
            ackvVar = new ackv(new ParcelFileDescriptor.AutoCloseOutputStream(getChannelOutputStreamResponse.b));
            this.a.setListener(new acku(ackvVar));
        } else {
            ackvVar = null;
        }
        a(new ackt(new Status(getChannelOutputStreamResponse.a), ackvVar));
    }
}
