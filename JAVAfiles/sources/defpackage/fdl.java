package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdl extends Exception {
    public fdl(UUID uuid) {
        super("Media does not support uuid: ".concat(uuid.toString()));
    }
}
