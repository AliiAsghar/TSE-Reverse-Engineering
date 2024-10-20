package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.ChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acks extends ackq {
    final /* synthetic */ ChannelImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acks(ChannelImpl channelImpl, abrg abrgVar) {
        super(abrgVar);
        this.a = channelImpl;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ abrm a(Status status) {
        return new ackt(status, null);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        ChannelStreamCallbacks channelStreamCallbacks = new ChannelStreamCallbacks();
        ((IWearableService) ((aclw) abquVar).w()).getChannelOutputStream(new aclq(this, channelStreamCallbacks), channelStreamCallbacks, this.a.a);
    }
}
