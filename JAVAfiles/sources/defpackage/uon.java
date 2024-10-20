package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uon extends BroadcastReceiver {
    final /* synthetic */ uoo a;

    public uon(uoo uooVar) {
        this.a = uooVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        akrc b = this.a.e.b("dump_pwq_state");
        try {
            aktp.ah(new Runnable() { // from class: uom
                /* JADX WARN: Removed duplicated region for block: B:120:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x009f A[Catch: all -> 0x0327, TryCatch #3 {all -> 0x0327, blocks: (B:3:0x0016, B:5:0x002e, B:6:0x00d2, B:8:0x00da, B:9:0x0116, B:14:0x014c, B:38:0x01d7, B:39:0x01dc, B:42:0x01e7, B:43:0x01ef, B:45:0x01f5, B:67:0x026a, B:73:0x0294, B:75:0x02b5, B:77:0x02d5, B:79:0x02f5, B:98:0x031c, B:36:0x0326, B:35:0x0323, B:104:0x0142, B:106:0x0035, B:121:0x009a, B:122:0x00a8, B:124:0x00b3, B:125:0x00c9, B:126:0x009f, B:29:0x031d, B:102:0x0158, B:18:0x0168, B:20:0x017d, B:21:0x0190, B:23:0x01af, B:13:0x013d, B:100:0x01df, B:41:0x01e6), top: B:2:0x0016, inners: #0, #1, #2, #4 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 840
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uom.run():void");
                }
            }, this.a.c);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
