package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qis implements andy {
    private final String c;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback$EmptyLoggingCallbackNoParent");
    public static final qis a = new qis("Unexpected error in fire&forget future");

    public qis(String str) {
        this.c = str;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        ((alvg) ((alvg) ((alvg) b.i()).g(th)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback$EmptyLoggingCallbackNoParent", "onFailure", 205, "CrashOnUnexpectedExceptionFutureCallback.java")).q(this.c);
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
    }
}
