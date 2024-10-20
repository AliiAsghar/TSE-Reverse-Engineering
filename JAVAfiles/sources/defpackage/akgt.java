package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgt extends RuntimeException {
    public akgt(Throwable th) {
        super("A LocalSubscriptionCallbacks didn't handle an error. It must either catch the error and pass it as part of onLoaded(), or register an error handler in onLoadError().", th);
    }
}
