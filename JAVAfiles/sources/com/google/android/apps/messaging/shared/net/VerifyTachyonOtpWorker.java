package com.google.android.apps.messaging.shared.net;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.albo;
import defpackage.andi;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsx;
import defpackage.uva;
import defpackage.vbj;
import defpackage.vbn;
import defpackage.vcm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VerifyTachyonOtpWorker extends gsx {
    private final vcm e;
    private final aksr f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        aksr a();

        vcm eq();
    }

    public VerifyTachyonOtpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.e = aVar.eq();
        this.f = aVar.a();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        ListenableFuture e;
        akrc b = this.f.b("VerifyTachyonOtpWorker.startWork");
        try {
            gsi f = f();
            vcm vcmVar = this.e;
            String d = f.d("otpCode");
            if (TextUtils.isEmpty(d)) {
                vcm.a.q("Invalid input data: missing otp.");
                e = albo.bI(new gsu());
            } else {
                String d2 = f.d("msisdn");
                if (TextUtils.isEmpty(d2)) {
                    vcm.a.q("Invalid input data: missing phone number");
                    e = albo.bI(new gsu());
                } else {
                    e = akul.g(vcmVar.b.b(d2).i(new vbn(d, 18), vcmVar.c).f(Exception.class, new uva(11), andi.a)).h(new vbj(15), andi.a).e(Exception.class, new vbj(16), andi.a);
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
