package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtb implements ServiceConnection, abqz {
    public final absf a;
    public IBinder b;
    private final String d;
    private final String e;
    private final ComponentName f;
    private final Context g;
    private final Handler h;
    private final abtc i;
    public boolean c = false;
    private String j = null;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abtb(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, defpackage.absf r7, defpackage.abtc r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r0 = 0
            r1.j = r0
            r1.g = r2
            acda r2 = new acda
            r2.<init>(r3)
            r1.h = r2
            r1.a = r7
            r1.i = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.d = r4
            r1.e = r5
            r1.f = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abtb.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, absf, abtc):void");
    }

    private final void d() {
        if (Thread.currentThread() == this.h.getLooper().getThread()) {
        } else {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // defpackage.abqz
    public final int a() {
        return 0;
    }

    public final IBinder b() {
        d();
        return this.b;
    }

    public final void c() {
        String.valueOf(this.b);
    }

    @Override // defpackage.abqz
    public final void g(String str) {
        d();
        this.j = str;
        d();
        c();
        try {
            this.g.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.c = false;
        this.b = null;
    }

    @Override // defpackage.abqz
    public final boolean j() {
        return false;
    }

    @Override // defpackage.abqz
    public final String k() {
        return this.j;
    }

    @Override // defpackage.abqz
    public final Set l() {
        return Collections.emptySet();
    }

    @Override // defpackage.abqz
    public final void m(abtv abtvVar) {
        d();
        c();
        if (p()) {
            try {
                g("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.d).setAction(this.e);
            }
            boolean bindService = this.g.bindService(intent, this, abui.a);
            this.c = bindService;
            if (!bindService) {
                this.b = null;
                this.i.onConnectionFailed(new ConnectionResult(16));
            }
            c();
        } catch (SecurityException e) {
            this.c = false;
            this.b = null;
            throw e;
        }
    }

    @Override // defpackage.abqz
    public final void n() {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.h.post(new aanh(this, iBinder, 18, null));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.h.post(new aaxu(this, 18));
    }

    @Override // defpackage.abqz
    public final boolean p() {
        d();
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.abqz
    public final boolean q() {
        d();
        return this.c;
    }

    @Override // defpackage.abqz
    public final boolean r() {
        return false;
    }

    @Override // defpackage.abqz
    public final Feature[] s() {
        return new Feature[0];
    }

    @Override // defpackage.abqz
    public final void t() {
        if (this.d != null) {
            return;
        }
        abhg.m(this.f);
        this.f.getPackageName();
    }

    @Override // defpackage.abqz
    public final void u(ahjj ahjjVar) {
    }

    @Override // defpackage.abqz
    public final void o(IAccountAccessor iAccountAccessor, Set set) {
    }
}
