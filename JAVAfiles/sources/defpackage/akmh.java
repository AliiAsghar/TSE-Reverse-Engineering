package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akmh extends alxy {
    private final aoms a;

    public akmh(String str, aoms aomsVar) {
        super(str);
        this.a = aomsVar;
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        this.a.b(alwvVar);
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        return this.a.c(level);
    }

    @Override // defpackage.alxy, defpackage.alww
    public final void g(RuntimeException runtimeException, alwv alwvVar) {
        Log.e("TikTokClientLogging", "Internal logging error", runtimeException);
    }
}
