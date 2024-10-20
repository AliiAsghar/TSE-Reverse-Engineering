package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apbl implements apbr {
    public static final apbl a = new apbl(1);
    private final /* synthetic */ int b;

    public apbl(int i) {
        this.b = i;
    }

    @Override // defpackage.apbr
    public final apbq a(Class cls) {
        if (this.b != 0) {
            if (apag.class.isAssignableFrom(cls)) {
                try {
                    return (apbq) apag.getDefaultInstance(cls.asSubclass(apag.class)).buildMessageInfo();
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
                }
            }
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.apbr
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return apag.class.isAssignableFrom(cls);
        }
        return false;
    }
}
