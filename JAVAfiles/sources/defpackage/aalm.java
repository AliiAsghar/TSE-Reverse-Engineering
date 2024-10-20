package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalm implements ServiceConnection {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aalm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cj fe;
        if (this.b != 0) {
            kmw.a.p("Diagnostics service connected");
            ibi ibiVar = (ibi) ((kmw) this.a).d.b();
            DiagnosticsFragment diagnosticsFragment = ((kmw) this.a).h;
            if (diagnosticsFragment != null && (fe = diagnosticsFragment.fe()) != null) {
                fe.runOnUiThread(new ivl(diagnosticsFragment, 15));
            }
            ((kmw) this.a).e.c();
            Object obj = this.a;
            List<knj> a = ((kmw) obj).a();
            qdq qdqVar = new qdq(obj);
            for (knj knjVar : a) {
                knjVar.getClass();
                qjb.a(new ivl(knjVar, 12), ibiVar.a);
            }
            qjb.a(new ivl(qdqVar, 13), ibiVar.a);
            return;
        }
        try {
            ((IG1Restore.Stub) iBinder).requestRestore(Uri.EMPTY, Uri.EMPTY, Uri.EMPTY);
        } catch (Exception e) {
            xzb.s(e, "failed IG1 Request restore");
        }
        ((Activity) this.a).unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (this.b != 0) {
            kmw.a.p("Diagnostics service disconnected");
        }
    }
}
