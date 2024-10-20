package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofd implements aohf {
    private final /* synthetic */ int a;

    @Override // defpackage.aohf
    public final Object a() {
        int i = this.a;
        if (i == 0) {
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return Executors.newSingleThreadScheduledExecutor(new aofj("Firebase Scheduler", 0, null));
                    }
                    return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new aofj("Firebase Blocking", 11, null)));
                }
                return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new aofj("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            }
            StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            detectNetwork.detectResourceMismatches();
            detectNetwork.detectUnbufferedIo();
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new aofj("Firebase Background", 10, detectNetwork.penaltyLog().build())));
        }
        return Collections.emptySet();
    }
}
