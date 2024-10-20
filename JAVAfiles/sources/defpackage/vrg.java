package defpackage;

import android.os.TransactionTooLargeException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrg {
    private static final xze a = xze.g("BugleRcs", "ClientInfoProvider");
    private Optional b = Optional.empty();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (this.b.isEmpty()) {
            try {
                this.b = Optional.of(false);
            } catch (TransactionTooLargeException | RuntimeException e) {
                a.r("Unable to get list of installed applications ", e);
            }
        }
        return ((Boolean) this.b.orElse(true)).booleanValue();
    }
}
