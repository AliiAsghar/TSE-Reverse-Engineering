package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epu extends Handler {
    final /* synthetic */ epw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epu(epw epwVar, Looper looper) {
        super(looper);
        this.a = epwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        fvq[] fvqVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        epw epwVar = this.a;
        while (true) {
            synchronized (epwVar.b) {
                size = epwVar.c.size();
                if (size <= 0) {
                    return;
                }
                fvqVarArr = new fvq[size];
                epwVar.c.toArray(fvqVarArr);
                epwVar.c.clear();
            }
            for (int i = 0; i < size; i++) {
                fvq fvqVar = fvqVarArr[i];
                int size2 = ((ArrayList) fvqVar.b).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    epv epvVar = (epv) ((ArrayList) fvqVar.b).get(i2);
                    if (!epvVar.d) {
                        epvVar.b.onReceive(epwVar.a, (Intent) fvqVar.a);
                    }
                }
            }
        }
    }
}
