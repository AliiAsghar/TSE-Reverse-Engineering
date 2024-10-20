package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abda extends ResultReceiver {
    public final /* synthetic */ abdc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abda(abdc abdcVar) {
        super(null);
        this.a = abdcVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != 2 && i != 0) {
            if (i != 3 && i != 1) {
                xyo b = abdc.a.b();
                b.H("Received unexpected IME operation result:");
                b.F(i);
                b.q();
                return;
            }
            xzw.a(new aaxu(this, 10));
            return;
        }
        xzw.a(new aaxu(this, 9));
    }
}
