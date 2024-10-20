package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdh extends gto {
    private static final alvi a = alvi.m("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final aksr c;

    public akdh(Map map, aksr aksrVar) {
        this.b = map;
        this.c = aksrVar;
    }

    @Override // defpackage.gto
    public final gsx a(Context context, String str, WorkerParameters workerParameters) {
        armf armfVar;
        try {
            aksa f = this.c.f("WorkerFactory.createWorker()");
            try {
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    alpt a2 = akdl.a(workerParameters.c);
                    if (a2.size() != 1) {
                        ((alvg) ((alvg) a.h()).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 84, "TikTokWorkerFactory.java")).t("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new aomj(aomi.NO_USER_DATA, Integer.valueOf(a2.size())));
                        f.close();
                        return null;
                    }
                    String str2 = (String) alzz.aP(a2);
                    armfVar = (armf) this.b.get(str2);
                    if (armfVar == null) {
                        ((alvg) ((alvg) a.h()).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 95, "TikTokWorkerFactory.java")).t("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                        f.close();
                        return null;
                    }
                } else {
                    armfVar = (armf) this.b.get(str);
                    if (armfVar != null) {
                        workerParameters.c.add(akdl.b(str));
                    } else {
                        f.close();
                        return null;
                    }
                }
                akrl akrlVar = akrk.a;
                TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, this.c, armfVar, workerParameters, akrlVar);
                f.close();
                return tikTokListenableWorker;
            } finally {
            }
        } catch (RuntimeException e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 147, "TikTokWorkerFactory.java")).q("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
    }
}
