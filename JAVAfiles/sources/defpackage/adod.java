package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface adod extends adoc, addv {
    static {
        acyy.b("use_jibe_factory_destroy_alternative");
    }

    void destroyRcsEngine();

    void dumpState(PrintWriter printWriter);

    void initializeRcsEngineForBugle();

    void onSimAbsent();

    void onSimLoaded(boolean z);

    void shutdown();

    void stop(acok acokVar);
}
