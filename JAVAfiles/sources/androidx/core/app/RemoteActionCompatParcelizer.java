package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.gnb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(gnb gnbVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) gnbVar.t(remoteActionCompat.a);
        remoteActionCompat.b = gnbVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = gnbVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) gnbVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = gnbVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = gnbVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, gnb gnbVar) {
        gnbVar.u(remoteActionCompat.a);
        gnbVar.g(remoteActionCompat.b, 2);
        gnbVar.g(remoteActionCompat.c, 3);
        gnbVar.i(remoteActionCompat.d, 4);
        gnbVar.f(remoteActionCompat.e, 5);
        gnbVar.f(remoteActionCompat.f, 6);
    }
}
