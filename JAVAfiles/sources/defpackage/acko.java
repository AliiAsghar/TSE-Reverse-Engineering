package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient$Channel;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class acko extends Service implements acjv {
    public ComponentName F;
    public ackm G;
    public Intent H;
    public boolean J;
    private IBinder a;
    private Looper b;
    public final Object I = new Object();
    public final ackr K = new ackr(new ahjj(this, (byte[]) null));

    public acir d(String str, String str2, byte[] bArr) {
        throw null;
    }

    public void i(ChannelClient$Channel channelClient$Channel) {
        throw null;
    }

    public void j(MessageEventParcelable messageEventParcelable) {
        throw null;
    }

    public void k(ChannelClient$Channel channelClient$Channel) {
        throw null;
    }

    public void l(acke ackeVar) {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        char c;
        if (intent != null && (action = intent.getAction()) != null) {
            switch (action.hashCode()) {
                case -1487371046:
                    if (action.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1140095138:
                    if (action.equals("com.google.android.gms.wearable.REQUEST_RECEIVED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -786751258:
                    if (action.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 705066793:
                    if (action.equals("com.google.android.gms.wearable.NODE_MIGRATED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 915816236:
                    if (action.equals("com.google.android.gms.wearable.DATA_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1003809169:
                    if (action.equals("com.google.android.gms.wearable.CHANNEL_EVENT")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1460975593:
                    if (action.equals("com.google.android.gms.wearable.BIND_LISTENER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return this.a;
                default:
                    if (Log.isLoggable("WearableLS", 3)) {
                        Log.d("WearableLS", a.bX(intent, "onBind: Provided bind intent (", ") is not allowed"));
                        return null;
                    }
                    return null;
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.F = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(String.valueOf(this.F))));
        }
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.b = handlerThread.getLooper();
        }
        this.G = new ackm(this, this.b);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.H = intent;
        intent.setComponent(this.F);
        this.a = new ackn(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(String.valueOf(this.F))));
        }
        synchronized (this.I) {
            this.J = true;
            ackm ackmVar = this.G;
            if (ackmVar != null) {
                ackmVar.getLooper().quit();
                ackmVar.b("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.F));
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.acjv
    public final void m(Channel channel) {
    }

    @Override // defpackage.acjv
    public final void n(Channel channel) {
    }

    @Override // defpackage.acjv
    public final void o(Channel channel) {
    }

    @Override // defpackage.acjv
    public final void p(Channel channel) {
    }
}
