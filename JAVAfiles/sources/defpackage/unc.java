package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unc extends RuntimeException {
    public final UUID a;

    public unc(String str, UUID uuid) {
        super("Could not save WorkManager UUID to queue ".concat(str));
        this.a = uuid;
    }
}
