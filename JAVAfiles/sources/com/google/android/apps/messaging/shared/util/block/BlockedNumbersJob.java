package com.google.android.apps.messaging.shared.util.block;

import android.content.Context;
import android.net.Uri;
import android.provider.BlockedNumberContract;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.aktp;
import defpackage.anen;
import defpackage.armf;
import defpackage.gsd;
import defpackage.gso;
import defpackage.gsx;
import defpackage.gsz;
import defpackage.gvf;
import defpackage.wkf;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BlockedNumbersJob extends gsx {
    public final armf e;
    private final anen f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LE();

        anen hR();
    }

    public BlockedNumbersJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.f = aVar.hR();
        this.e = aVar.LE();
    }

    public static void c(Context context) {
        Uri uri;
        gsz gszVar = new gsz(BlockedNumbersJob.class);
        gsd gsdVar = new gsd();
        uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
        gsdVar.b(uri, true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        gsdVar.d = timeUnit.toMillis(0L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        timeUnit2.getClass();
        gsdVar.e = timeUnit2.toMillis(3L);
        gszVar.f(gsdVar.a());
        gvf.ar(context).k("BlockedNumbersListenableWorker", gso.REPLACE, gszVar.j()).a();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        return aktp.ai(new wkf(this, 15), this.f);
    }
}
