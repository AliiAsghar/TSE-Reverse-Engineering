package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdz implements ewg {
    public static final boolean a;
    public final UUID b;
    public final byte[] c;

    static {
        boolean z = false;
        if ("Amazon".equals(eul.c) && ("AFTM".equals(eul.d) || "AFTB".equals(eul.d))) {
            z = true;
        }
        a = z;
    }

    public fdz(UUID uuid, byte[] bArr) {
        this.b = uuid;
        this.c = bArr;
    }
}
