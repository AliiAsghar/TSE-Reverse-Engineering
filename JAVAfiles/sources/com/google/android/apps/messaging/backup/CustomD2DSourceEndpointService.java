package com.google.android.apps.messaging.backup;

import android.content.Intent;
import android.os.IBinder;
import defpackage.aiut;
import defpackage.akkh;
import defpackage.aklg;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.aktp;
import defpackage.albo;
import defpackage.aohs;
import defpackage.aolz;
import defpackage.apxv;
import defpackage.aqam;
import defpackage.aqws;
import defpackage.aqww;
import defpackage.asmb;
import defpackage.ico;
import defpackage.idj;
import defpackage.kqo;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomD2DSourceEndpointService extends idj implements akkh<ico> {
    private ico a;
    private boolean b;
    private boolean c;
    private final aohs d = new aohs((Object) this, (byte[]) null);

    @Deprecated
    public CustomD2DSourceEndpointService() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return ico.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ico E() {
        ico icoVar = this.a;
        if (icoVar != null) {
            if (!this.c) {
                return icoVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [apwt, java.lang.Object] */
    @Override // defpackage.enq, android.app.Service
    public final IBinder onBind(Intent intent) {
        aksa w = this.d.w(intent);
        try {
            super.onBind(intent);
            ico E = E();
            aolz aolzVar = (aolz) E.a.b();
            HashMap hashMap = new HashMap();
            aqam.m("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", (aqww) E.b.b(), hashMap);
            asmb o = aqam.o(hashMap);
            aqws aqwsVar = new aqws();
            aqwsVar.b();
            aolzVar.c(o, aqwsVar.a());
            IBinder a = ((aolz) E.a.b()).a();
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

    @Override // defpackage.idj, defpackage.enq, android.app.Service
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
                                    this.a = new ico(apxv.a(((kqo) aS).c), apxv.a(((kqo) aS).b.a.hj));
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
