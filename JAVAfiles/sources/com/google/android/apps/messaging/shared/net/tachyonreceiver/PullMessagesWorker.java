package com.google.android.apps.messaging.shared.net.tachyonreceiver;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsw;
import defpackage.gsx;
import defpackage.utz;
import defpackage.uuh;
import defpackage.vhb;
import defpackage.xze;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PullMessagesWorker extends gsx {
    public static final xze e = xze.g("BugleNetwork", "PullMessagesWorker");
    public static final utz f = uuh.f(uuh.b, "initialDelaySeconds", 10);
    private final Context g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        Optional IZ();

        aksr a();
    }

    public PullMessagesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        a aVar = (a) akec.w(this.g, a.class);
        if (aVar.IZ().isEmpty()) {
            e.l("Skip pull messages due to absent PullMessagesWorkerHelper");
            return aktp.ag(new gsw());
        }
        gsi f2 = f();
        String d = f2.d("pull_messages_app");
        String d2 = f2.d("pull_messages_id");
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(d2)) {
            akrc b = aVar.a().b("PullMessagesWorker.startWork");
            try {
                akul a2 = ((vhb) aVar.IZ().get()).a();
                b.close();
                return a2;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        e.l("Skip pull messages due to empty parameter");
        return aktp.ag(new gsu());
    }
}
