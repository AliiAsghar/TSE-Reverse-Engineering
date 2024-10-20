package com.google.android.apps.messaging.go;

import defpackage.akec;
import defpackage.akld;
import defpackage.akqj;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.aktp;
import defpackage.aktr;
import defpackage.ksh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleGo_Application extends ksh {
    @Override // defpackage.ksh, defpackage.kqg, defpackage.iaz, defpackage.ngr, defpackage.aklc, android.app.Application
    public final void onCreate() {
        akrh e;
        if (!e()) {
            super.onCreate();
            return;
        }
        aktr c = aktr.c();
        if (c.f()) {
            long s = akec.s();
            akrc e2 = ((akld) akec.w(this, akld.class)).a().e(akec.r(s), s * 1000000);
            try {
                akqj.q();
                e = aktp.e("Application.onCreate");
                try {
                    super.onCreate();
                    e.close();
                    e2.close();
                    return;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    e2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        aksa a = c.a();
        try {
            e = aktp.e("Application creation");
            try {
                akrh e3 = aktp.e("Application.onCreate");
                try {
                    super.onCreate();
                    e3.close();
                    e.close();
                    a.close();
                } finally {
                }
            } finally {
                try {
                    e.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
        } catch (Throwable th4) {
            try {
                a.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
