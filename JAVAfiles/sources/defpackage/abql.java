package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abql extends abqm {
    private final Callable e;

    public abql(Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.abqm
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
