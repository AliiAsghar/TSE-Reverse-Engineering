package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtt extends acda {
    final /* synthetic */ BaseGmsClient a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abtt(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.a = baseGmsClient;
    }

    private static final void b(Message message) {
        abtu abtuVar = (abtu) message.obj;
        abtuVar.b();
        abtuVar.f();
    }

    private static final boolean c(Message message) {
        if (message.what == 2 || message.what == 1 || message.what == 7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [absf, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.p.get() != message.arg1) {
            if (c(message)) {
                b(message);
                return;
            }
            return;
        }
        if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.q()) {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                this.a.m = new ConnectionResult(message.arg2);
                BaseGmsClient baseGmsClient = this.a;
                if (!baseGmsClient.n && !TextUtils.isEmpty(baseGmsClient.c()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(baseGmsClient.c());
                        BaseGmsClient baseGmsClient2 = this.a;
                        if (!baseGmsClient2.n) {
                            baseGmsClient2.C(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                ConnectionResult connectionResult = this.a.m;
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(8);
                }
                this.a.h.a(connectionResult);
                System.currentTimeMillis();
                return;
            }
            if (message.what == 5) {
                ConnectionResult connectionResult2 = this.a.m;
                if (connectionResult2 == null) {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.a.h.a(connectionResult2);
                System.currentTimeMillis();
                return;
            }
            if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                this.a.h.a(new ConnectionResult(message.arg2, pendingIntent));
                System.currentTimeMillis();
                return;
            }
            if (message.what == 6) {
                this.a.C(5, null);
                ahjj ahjjVar = this.a.t;
                if (ahjjVar != null) {
                    ahjjVar.a.onConnectionSuspended(message.arg2);
                }
                BaseGmsClient baseGmsClient3 = this.a;
                int i = message.arg2;
                baseGmsClient3.J();
                this.a.E(5, 1, null);
                return;
            }
            if (message.what == 2 && !this.a.p()) {
                b(message);
                return;
            }
            if (c(message)) {
                abtu abtuVar = (abtu) message.obj;
                synchronized (abtuVar) {
                    obj = abtuVar.d;
                    if (abtuVar.e) {
                        Log.w("GmsClient", a.bX(abtuVar, "Callback proxy ", " being reused. This is not safe."));
                    }
                }
                if (obj != null) {
                    abtuVar.d();
                }
                synchronized (abtuVar) {
                    abtuVar.e = true;
                }
                abtuVar.f();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        b(message);
    }
}
