package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alwo;
import defpackage.ancr;
import defpackage.apwt;
import defpackage.armf;
import defpackage.wln;
import defpackage.xyt;
import defpackage.xze;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class IncomingRcsEventReceiver extends wln {
    public static final xze a = xze.g("Bugle", "IncomingRcsEventReceiver");
    public static final xze b = xze.g("BugleAction", "IncomingRcsEventReceiver");
    public static final alwo c = alwo.o("BugleAction");
    public xyt d;
    public apwt e;
    public apwt f;
    public apwt g;
    public armf h;
    public armf i;
    public armf j;
    public armf k;
    public armf l;
    public armf m;
    public armf n;
    public aksr o;
    public armf p;
    public armf q;
    public armf r;
    public armf s;
    public armf t;

    @Override // defpackage.wng
    public final akrc a() {
        return this.o.b("IncomingRcsEventReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.IncomingRcsEvent.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 3;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.IncomingRcsEvent.Latency";
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final akul j(Context context, final Intent intent) {
        return aktp.aj(new ancr() { // from class: wmc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:157:0x07ab  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x07b2  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x037e  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x03a0  */
            /* JADX WARN: Type inference failed for: r0v151, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v48, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v79, types: [armf, java.lang.Object] */
            @Override // defpackage.ancr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 2712
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wmc.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, (Executor) this.p.b());
    }
}
