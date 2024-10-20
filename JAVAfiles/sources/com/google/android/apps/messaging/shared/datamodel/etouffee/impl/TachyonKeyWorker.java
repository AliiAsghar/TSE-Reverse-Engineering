package com.google.android.apps.messaging.shared.datamodel.etouffee.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.andi;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsw;
import defpackage.gsx;
import defpackage.ttd;
import defpackage.tvd;
import defpackage.twe;
import defpackage.twf;
import defpackage.xyo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TachyonKeyWorker extends gsx {
    private final twf e;
    private final aksr f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        aksr a();

        twf dy();
    }

    public TachyonKeyWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.e = aVar.dy();
        this.f = aVar.a();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        akul e;
        akrc b = this.f.b("TachyonKeyWorker.startWork");
        try {
            twf twfVar = this.e;
            gsi f = f();
            twf.a.o("Start uploading prekeys in worker helper");
            if (!ttd.a()) {
                xyo a2 = twf.a.a();
                a2.H("The task is not enabled.");
                a2.q();
                e = aktp.ag(new gsw());
            } else {
                String d = f.d("canonical_number");
                if (TextUtils.isEmpty(d)) {
                    twf.a.m("Missing RCS phone number");
                    e = aktp.ag(new gsu());
                } else {
                    e = twfVar.f.j(d).i(new twe(twfVar, d, 1), twfVar.d).i(new twe(twfVar, d, 0), twfVar.d).e(Throwable.class, new tvd(11), andi.a);
                }
            }
            b.close();
            return e;
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
