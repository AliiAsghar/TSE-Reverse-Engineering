package defpackage;

import android.util.Log;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclx implements absx {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ IRpcResponseCallback b;

    public aclx(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        this.a = messageEventParcelable;
        this.b = iRpcResponseCallback;
    }

    @Override // defpackage.absx
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MessageEventParcelable messageEventParcelable = this.a;
        ((acko) obj).d(messageEventParcelable.d, messageEventParcelable.b, messageEventParcelable.c).q(new uyb(this.b, 7));
    }

    @Override // defpackage.absx
    public final void b() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        WearableListenerStubImpl.b(this.b, false, null);
    }
}
