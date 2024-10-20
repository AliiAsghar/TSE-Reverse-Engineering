package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyo implements ServiceConnection, aqwz {
    private static final Logger a = Logger.getLogger(aqyo.class.getName());
    private final Intent b;
    private final int c;
    private final Executor d;
    private Context e;
    private int f;
    private int g;
    private final aqxf h;

    public aqyo(Executor executor, Context context, Intent intent, aqxf aqxfVar) {
        synchronized (this) {
            this.b = intent;
            this.c = 1;
            this.h = aqxfVar;
            this.e = context;
            this.d = executor;
            this.f = 1;
            this.g = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x0011, B:12:0x0042, B:13:0x0097, B:15:0x009d, B:17:0x009f, B:18:0x00b1, B:25:0x00a4, B:26:0x0021, B:28:0x003f, B:29:0x0033, B:30:0x0039, B:34:0x0069, B:32:0x0081), top: B:2:0x0001, inners: #2, #4 }] */
    @Override // defpackage.aqwz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r11.f     // Catch: java.lang.Throwable -> Lc3
            r1 = 1
            if (r0 != r1) goto Lc1
            r0 = 2
            r11.f = r0     // Catch: java.lang.Throwable -> Lc3
            android.content.Context r2 = r11.e     // Catch: java.lang.Throwable -> Lc3
            android.content.Intent r9 = r11.b     // Catch: java.lang.Throwable -> Lc3
            int r7 = r11.c     // Catch: java.lang.Throwable -> Lc3
            aqyn r10 = defpackage.aqyn.BIND_SERVICE     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = "BindingChannelCredentials is expected to have null devicePolicyAdmin when targetUserHandle is not set"
            defpackage.albo.U(r1, r3)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            int r3 = r10.ordinal()     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            if (r3 == 0) goto L39
            if (r3 == r1) goto L33
            if (r3 == r0) goto L21
            goto L42
        L21:
            java.lang.String r0 = "device_policy"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            r3 = r0
            android.app.admin.DevicePolicyManager r3 = (android.app.admin.DevicePolicyManager) r3     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            r4 = 0
            r8 = 0
            r5 = r9
            r6 = r11
            boolean r0 = defpackage.bl$$ExternalSyntheticApiModelOutline0.m(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            goto L3d
        L33:
            r0 = 0
            boolean r0 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r2, r9, r11, r7, r0)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            goto L3d
        L39:
            boolean r0 = r2.bindService(r9, r11, r7)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
        L3d:
            if (r0 == 0) goto L42
            io.grpc.Status r0 = io.grpc.Status.b     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            goto L97
        L42:
            io.grpc.Status r0 = io.grpc.Status.l     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            java.lang.String r1 = r10.d     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            r3.<init>()     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            r3.append(r1)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            java.lang.String r1 = "("
            r3.append(r1)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            java.lang.String r1 = ") returned false"
            r3.append(r1)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            java.lang.String r1 = r3.toString()     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            io.grpc.Status r0 = r0.withDescription(r1)     // Catch: java.lang.RuntimeException -> L68 java.lang.SecurityException -> L80 java.lang.Throwable -> Lc3
            goto L97
        L68:
            r0 = move-exception
            io.grpc.Status r1 = io.grpc.Status.m     // Catch: java.lang.Throwable -> Lc3
            io.grpc.Status r0 = r1.d(r0)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = r10.d     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "RuntimeException from "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lc3
            io.grpc.Status r0 = r0.withDescription(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L97
        L80:
            r0 = move-exception
            io.grpc.Status r1 = io.grpc.Status.h     // Catch: java.lang.Throwable -> Lc3
            io.grpc.Status r0 = r1.d(r0)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = r10.d     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "SecurityException from "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lc3
            io.grpc.Status r0 = r0.withDescription(r1)     // Catch: java.lang.Throwable -> Lc3
        L97:
            boolean r1 = r0.f()     // Catch: java.lang.Throwable -> Lc3
            if (r1 != 0) goto Lc1
            android.content.Context r1 = r11.e     // Catch: java.lang.Throwable -> Lc3
            r1.unbindService(r11)     // Catch: java.lang.RuntimeException -> La3 java.lang.Throwable -> Lc3
            goto Lb1
        La3:
            r6 = move-exception
            java.util.logging.Logger r1 = defpackage.aqyo.a     // Catch: java.lang.Throwable -> Lc3
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = "io.grpc.binder.internal.ServiceBinding"
            java.lang.String r4 = "handleBindServiceFailure"
            java.lang.String r5 = "Could not clean up after bindService() failure."
            r1.logp(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc3
        Lb1:
            r1 = 4
            r11.f = r1     // Catch: java.lang.Throwable -> Lc3
            java.util.concurrent.Executor r1 = r11.d     // Catch: java.lang.Throwable -> Lc3
            aqym r2 = new aqym     // Catch: java.lang.Throwable -> Lc3
            r3 = 0
            r2.<init>(r11, r0, r3)     // Catch: java.lang.Throwable -> Lc3
            r1.execute(r2)     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r11)
            return
        Lc1:
            monitor-exit(r11)
            return
        Lc3:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lc3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqyo.a():void");
    }

    public final void b(Status status) {
        Logger logger = a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", status);
        this.e = null;
        if (this.g != 4) {
            this.g = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.h.m(status);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Status status) {
        Context context;
        synchronized (this) {
            int i = this.f;
            if (i != 2 && i != 3) {
                context = null;
                this.f = 4;
            }
            context = this.e;
            this.f = 4;
        }
        this.d.execute(new aqym(this, status, 2));
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        c(Status.n.withDescription("onBindingDied: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        c(Status.l.withDescription("onNullBinding: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.f == 2) {
                this.f = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.g == 1) {
            this.g = 3;
            a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.h.k(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c(Status.n.withDescription("onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
