package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnc extends RuntimeException implements arvz {
    public jnc(String str, Throwable th) {
        super(str, th);
    }

    @Override // defpackage.arvz
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        message.getClass();
        return new jnc(message, getCause());
    }
}
