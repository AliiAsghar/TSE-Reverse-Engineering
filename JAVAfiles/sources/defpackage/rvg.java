package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvg {
    public static final Optional a = Optional.empty();

    public static Optional a(String str) {
        if (str == null) {
            return a;
        }
        return Optional.of(UUID.fromString(str));
    }

    public static String b(Optional optional) {
        if (optional != null && !optional.isEmpty()) {
            return ((UUID) optional.get()).toString();
        }
        return null;
    }
}
