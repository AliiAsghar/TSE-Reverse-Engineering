package defpackage;

import java.lang.Thread;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akds extends arpa implements CoroutineExceptionHandler {
    public static final akds a = new akds();

    private akds() {
        super(CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(arpi arpiVar, Throwable th) {
        arpiVar.getClass();
        th.getClass();
        Thread currentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        uncaughtExceptionHandler.getClass();
        uncaughtExceptionHandler.uncaughtException(currentThread, th);
    }
}
