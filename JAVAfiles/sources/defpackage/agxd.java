package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxd extends dyl {
    final /* synthetic */ agxg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxd(agxg agxgVar) {
        super(null);
        this.a = agxgVar;
    }

    @Override // defpackage.dyl
    public final void d(Throwable th) {
        alvi alviVar = agzo.a;
        agzo agzoVar = agzn.a;
        agxh agxhVar = agxh.a;
        alvi alviVar2 = agxg.a;
        agzoVar.b(agxhVar, 1);
        synchronized (this.a.f) {
            Iterator it = this.a.f.iterator();
            while (it.hasNext()) {
                ((agxf) it.next()).b();
            }
        }
        this.a.g = 0L;
        ((alvg) ((alvg) agxg.a.h()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onFailed", 235, "EmojiCompatManager.java")).q("EmojiCompat failed its initialization");
    }

    @Override // defpackage.dyl
    public final void e() {
        alvi alviVar = agzo.a;
        agzn.a.b(agxh.a, 0);
        synchronized (this.a.f) {
            Iterator it = this.a.f.iterator();
            while (it.hasNext()) {
                ((agxf) it.next()).a();
            }
        }
        agxg agxgVar = this.a;
        if (agxgVar.g > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            agzo agzoVar = agzn.a;
            agxi agxiVar = agxi.a;
            Duration ofMillis = Duration.ofMillis(elapsedRealtime - agxgVar.g);
            if (!ofMillis.isNegative() && ofMillis.compareTo(Duration.ofMillis(2147483647L)) <= 0) {
                if (agzoVar.d(agxiVar)) {
                    List list = agzoVar.e;
                    if (agzoVar.g.get() > 0 || agzoVar.d.get(agxiVar) != null) {
                        agzoVar.c(albo.bL(new adhc(agzoVar, agxiVar, 19), agzoVar.a()));
                    }
                }
            } else {
                ((alvg) ((alvg) agzo.a.d()).h("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "isDurationValid", 395, "MetricsManager.java")).D("Duration of TimerType: %s is invalid: %s", agxiVar, ofMillis);
            }
            this.a.g = 0L;
        }
        ((alvg) ((alvg) agxg.a.d()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onInitialized", 216, "EmojiCompatManager.java")).q("EmojiCompat has been initialized");
    }
}
