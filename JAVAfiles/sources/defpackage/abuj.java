package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuj implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final abuh e;
    public ComponentName f;
    public final /* synthetic */ abui g;

    public abuj(abui abuiVar, abuh abuhVar) {
        this.g = abuiVar;
        this.e = abuhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: abur -> 0x0126, TryCatch #7 {abur -> 0x0126, blocks: (B:3:0x0004, B:5:0x000e, B:7:0x0013, B:9:0x001f, B:18:0x0031, B:20:0x0059, B:22:0x0063, B:25:0x006e, B:26:0x0090, B:29:0x0094, B:32:0x004a, B:11:0x003e, B:12:0x0045, B:35:0x003a, B:36:0x003d, B:40:0x00a5, B:60:0x00b4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: abur -> 0x0126, TryCatch #7 {abur -> 0x0126, blocks: (B:3:0x0004, B:5:0x000e, B:7:0x0013, B:9:0x001f, B:18:0x0031, B:20:0x0059, B:22:0x0063, B:25:0x006e, B:26:0x0090, B:29:0x0094, B:32:0x004a, B:11:0x003e, B:12:0x0045, B:35:0x003a, B:36:0x003d, B:40:0x00a5, B:60:0x00b4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: abur -> 0x0126, TryCatch #7 {abur -> 0x0126, blocks: (B:3:0x0004, B:5:0x000e, B:7:0x0013, B:9:0x001f, B:18:0x0031, B:20:0x0059, B:22:0x0063, B:25:0x006e, B:26:0x0090, B:29:0x0094, B:32:0x004a, B:11:0x003e, B:12:0x0045, B:35:0x003a, B:36:0x003d, B:40:0x00a5, B:60:0x00b4), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:46:0x00dd, B:48:0x00f1, B:51:0x010a, B:53:0x010d, B:54:0x0116), top: B:45:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:46:0x00dd, B:48:0x00f1, B:51:0x010a, B:53:0x010d, B:54:0x0116), top: B:45:0x00dd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult c(defpackage.abuj r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuj.c(abuj, java.lang.String):com.google.android.gms.common.ConnectionResult");
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
