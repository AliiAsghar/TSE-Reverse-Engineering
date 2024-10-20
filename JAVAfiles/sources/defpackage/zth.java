package defpackage;

import android.os.Debug;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zth implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ zth(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 19) {
                        switch (i) {
                            case 13:
                                advr.l(adms.a, "No default call sim to calculate availability.", new Object[0]);
                                return;
                            case 14:
                                try {
                                    Thread.sleep(Math.max(0L, 600000L));
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    synchronized (aefx.class) {
                                        Thread thread = aefx.b;
                                        if (thread != null && thread.isAlive()) {
                                            Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                                            return;
                                        }
                                    }
                                }
                                aefx.b();
                                return;
                            case 15:
                                ((alvg) ((alvg) aehk.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "appendOauthToken", 167, "RpcManager.java")).q("Oauth Token is present, but did not append to request");
                                return;
                            case 16:
                                throw new RuntimeException("Someone quit the @LightweightExecutor looper");
                            case 17:
                                Debug.stopMethodTracing();
                                return;
                            default:
                                return;
                        }
                    }
                    Throwable th = new Throwable();
                    th.fillInStackTrace();
                    ((alvg) ((alvg) ((alvg) akbr.a.h()).g(th)).h("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl$1", "run", (char) 236, "FuturesMixinImpl.java")).q("b/66999648 detected");
                    return;
                }
                xze xzeVar = aalt.c;
                return;
            }
            alwo alwoVar = ztr.a;
            return;
        }
        alwo alwoVar2 = ztr.a;
    }
}
