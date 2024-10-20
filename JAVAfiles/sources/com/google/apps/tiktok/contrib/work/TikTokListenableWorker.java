package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajnt;
import defpackage.akcy;
import defpackage.akdl;
import defpackage.akrh;
import defpackage.akrl;
import defpackage.aksa;
import defpackage.aksr;
import defpackage.akto;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.andi;
import defpackage.aomi;
import defpackage.aomj;
import defpackage.armf;
import defpackage.gsx;
import defpackage.hht;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TikTokListenableWorker extends gsx {
    private static final alvi e = alvi.m("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    private final aksr f;
    private final armf g;
    private final WorkerParameters h;
    private final akrl i;
    private akcy j;
    private boolean k;

    public TikTokListenableWorker(Context context, aksr aksrVar, armf<akcy> armfVar, WorkerParameters workerParameters, akrl akrlVar) {
        super(context, workerParameters);
        this.j = null;
        this.k = false;
        this.g = armfVar;
        this.f = aksrVar;
        this.h = workerParameters;
        this.i = akrlVar;
    }

    public static /* synthetic */ void c(ListenableFuture listenableFuture, aomj aomjVar) {
        try {
            albo.bQ(listenableFuture);
        } catch (CancellationException unused) {
            ((alvg) ((alvg) e.i()).h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 177, "TikTokListenableWorker.java")).t("TikTokListenableWorker was cancelled while running client worker: %s", aomjVar);
        } catch (ExecutionException e2) {
            ((alvg) ((alvg) ((alvg) e.h()).g(e2.getCause())).h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 172, "TikTokListenableWorker.java")).t("TikTokListenableWorker encountered an exception while running client worker: %s", aomjVar);
        }
    }

    @Override // defpackage.gsx
    public final ListenableFuture a() {
        boolean z;
        String c = akdl.c(this.h);
        aksa f = this.f.f("WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            akrh f2 = aktp.f(hht.h(c, " getForegroundInfoAsync()"), this.i);
            try {
                if (this.j == null) {
                    z = true;
                } else {
                    z = false;
                }
                albo.U(z, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                akcy akcyVar = (akcy) this.g.b();
                this.j = akcyVar;
                ListenableFuture a = akcyVar.a(this.h);
                f2.b(a);
                f2.close();
                f.close();
                return a;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        String c = akdl.c(this.h);
        aksa f = this.f.f("WorkManager:TikTokListenableWorker startWork");
        try {
            akrh f2 = aktp.f(hht.h(c, " startWork()"), this.i);
            try {
                String c2 = akdl.c(this.h);
                akrh e2 = aktp.e(String.valueOf(c2).concat(" startWork()"));
                try {
                    albo.U(!this.k, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.k = true;
                    if (this.j == null) {
                        this.j = (akcy) this.g.b();
                    }
                    ListenableFuture b = this.j.b(this.h);
                    b.c(akto.j(new ajnt(b, new aomj(aomi.NO_USER_DATA, c2), 11, (byte[]) null)), andi.a);
                    e2.b(b);
                    e2.close();
                    f2.b(b);
                    f2.close();
                    f.close();
                    return b;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
