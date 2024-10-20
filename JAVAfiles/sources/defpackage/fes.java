package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fes extends Handler {
    final /* synthetic */ feu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fes(feu feuVar, Looper looper) {
        super(looper);
        this.a = feuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fet fetVar;
        feu feuVar = this.a;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                fetVar = null;
                if (i != 3) {
                    if (i != 4) {
                        a.bE(feuVar.d, new IllegalStateException(String.valueOf(message.what)));
                    } else {
                        try {
                            feuVar.c.setParameters((Bundle) message.obj);
                        } catch (RuntimeException e) {
                            a.bE(feuVar.d, e);
                        }
                    }
                } else {
                    feuVar.e.h();
                }
            } else {
                fetVar = (fet) message.obj;
                int i2 = fetVar.a;
                int i3 = fetVar.b;
                MediaCodec.CryptoInfo cryptoInfo = fetVar.d;
                long j = fetVar.e;
                int i4 = fetVar.f;
                try {
                    synchronized (feu.b) {
                        feuVar.c.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i4);
                    }
                } catch (RuntimeException e2) {
                    a.bE(feuVar.d, e2);
                }
            }
        } else {
            fetVar = (fet) message.obj;
            int i5 = fetVar.a;
            int i6 = fetVar.b;
            try {
                feuVar.c.queueInputBuffer(i5, 0, fetVar.c, fetVar.e, fetVar.f);
            } catch (RuntimeException e3) {
                a.bE(feuVar.d, e3);
            }
        }
        if (fetVar != null) {
            synchronized (feu.a) {
                feu.a.add(fetVar);
            }
        }
    }
}
