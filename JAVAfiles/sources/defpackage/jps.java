package defpackage;

import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jps {
    private static final alvi f = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/PersistenceDraftObserver");
    public final arwe a;
    public final arpi b;
    public final jpq c;
    public final Duration d;
    public final jxv e;
    private final AtomicReference g;

    public jps(arwe arweVar, arpi arpiVar, jxv jxvVar, jpq jpqVar, Duration duration) {
        arweVar.getClass();
        arpiVar.getClass();
        jxvVar.getClass();
        this.a = arweVar;
        this.b = arpiVar;
        this.e = jxvVar;
        this.c = jpqVar;
        this.d = duration;
        this.g = new AtomicReference();
    }

    public final Object a(arxm arxmVar, arpe arpeVar) {
        Object t;
        arxm arxmVar2 = (arxm) this.g.getAndSet(arxmVar);
        alvw e = f.e();
        e.X(alwp.a, "BugleComposeRow2");
        ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/PersistenceDraftObserver", "replaceSubscription", 47, "PersistenceDraftObserver.kt")).D("Replacing draft persistence subscription %s with %s", arxmVar2, arxmVar);
        if (arxmVar2 != null && (t = arwi.t(arxmVar2, arpeVar)) == arpl.a) {
            return t;
        }
        return arnb.a;
    }
}
