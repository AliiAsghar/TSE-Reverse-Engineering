package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjq {
    public static final atgu e = new atgu(2, -9223372036854775807L);
    public static final atgu f = new atgu(3, -9223372036854775807L);
    public final Executor a;
    public final Runnable b;
    public fjo c;
    public IOException d;

    public fjq() {
        ExecutorService P = eul.P("ExoPlayer:Loader:ProgressiveMediaPeriod");
        this.a = P;
        P.getClass();
        this.b = new fhg(P, 2);
    }

    public final void a() {
        fjo fjoVar = this.c;
        dzg.h(fjoVar);
        fjoVar.a(false);
    }

    public final boolean b() {
        if (this.c != null) {
            return true;
        }
        return false;
    }
}
