package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agls {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(agll agllVar, aodz aodzVar) {
        Executor threadPoolExecutor;
        aaoc aaocVar = acge.a;
        acgl acglVar = new acgl(agllVar.a);
        String valueOf = String.valueOf(agllVar.a.getPackageName());
        Context context = agllVar.a;
        if (aodzVar.a == null) {
            try {
                aodzVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                aodzVar.a = -1;
            }
        }
        String concat = "com.google.android.libraries.consentverifier#".concat(valueOf);
        acir c2 = acglVar.c(concat, ((Integer) aodzVar.a).intValue(), c, null);
        if (aglo.l(agllVar.a)) {
            abgj abgjVar = accz.a;
            threadPoolExecutor = abgj.r(10);
        } else {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            arbj arbjVar = new arbj((char[]) null, (byte[]) null);
            arbjVar.j("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, arbj.t(arbjVar), aglv.a);
        }
        try {
            c2.p(threadPoolExecutor, new abwx(acglVar, concat, threadPoolExecutor, 2));
            c2.o(threadPoolExecutor, new ktn(concat, 12));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", concat, e));
        }
    }
}
