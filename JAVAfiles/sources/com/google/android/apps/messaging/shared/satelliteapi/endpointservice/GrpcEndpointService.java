package com.google.android.apps.messaging.shared.satelliteapi.endpointservice;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.aiut;
import defpackage.akkh;
import defpackage.aklg;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.aktp;
import defpackage.albo;
import defpackage.anen;
import defpackage.aohs;
import defpackage.aolz;
import defpackage.kqo;
import defpackage.wpp;
import defpackage.wpq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GrpcEndpointService extends wpq implements akkh<wpp> {
    private wpp a;
    private boolean b;
    private boolean c;
    private final aohs d = new aohs((Object) this, (byte[]) null);

    @Deprecated
    public GrpcEndpointService() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return wpp.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wpp E() {
        wpp wppVar = this.a;
        if (wppVar != null) {
            if (!this.c) {
                return wppVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.enq, android.app.Service
    public final IBinder onBind(Intent intent) {
        aksa w = this.d.w(intent);
        try {
            super.onBind(intent);
            IBinder a = ((aolz) E().a).a();
            w.close();
            return a;
        } catch (Throwable th) {
            try {
                w.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wpq, defpackage.enq, android.app.Service
    public final void onCreate() {
        aksa x = this.d.x();
        try {
            this.b = true;
            albo.T(getApplication() instanceof aklg);
            if (this.a == null) {
                if (this.b) {
                    if (!this.c) {
                        akrh e = aktp.e("CreateComponent");
                        try {
                            aS();
                            e.close();
                            e = aktp.e("CreatePeer");
                            try {
                                try {
                                    Object aS = aS();
                                    this.a = new wpp((aolz) ((kqo) aS).c.b(), (Context) ((kqo) aS).b.n.b(), (anen) ((kqo) aS).b.z.b());
                                    e.close();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } catch (ClassCastException e2) {
                                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                            }
                        } finally {
                            try {
                                e.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("createPeer() called after destroyed.");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
            }
            super.onCreate();
            this.b = false;
            x.close();
        } catch (Throwable th3) {
            try {
                x.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.enq, android.app.Service
    public final void onDestroy() {
        aksa y = this.d.y();
        try {
            super.onDestroy();
            this.c = true;
            y.close();
        } catch (Throwable th) {
            try {
                y.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
