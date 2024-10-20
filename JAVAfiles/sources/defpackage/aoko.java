package defpackage;

import android.os.IBinder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoko implements alhr {
    private final aqvq a;
    private final aqwr b;
    private boolean c;

    public aoko(aqvq aqvqVar, aqwr aqwrVar, enm enmVar) {
        this.a = aqvqVar;
        this.b = aqwrVar;
        aqam.n(enmVar.N(), aqvqVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.os.IBinder] */
    @Override // defpackage.alhr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized IBinder get() {
        if (!this.c) {
            try {
                this.c = true;
                ((argz) this.a).d();
            } catch (IOException e) {
                ((alvg) ((alvg) ((alvg) aokp.a.h()).g(e)).h("com/google/frameworks/client/data/android/binder/IoGrpcInterop$ServerLifecycle", "get", 76, "IoGrpcInterop.java")).t("Unable to start server %s", this.a);
            }
        }
        return this.b.a;
    }
}
