package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdk extends Handler {
    final /* synthetic */ fdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdk(fdn fdnVar, Looper looper) {
        super(looper);
        this.a = fdnVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null) {
            for (fdj fdjVar : this.a.b) {
                fdjVar.i();
                if (Arrays.equals(fdjVar.f, bArr)) {
                    if (message.what == 2 && fdjVar.e == 4) {
                        int i = eul.a;
                        fdjVar.e(false);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
