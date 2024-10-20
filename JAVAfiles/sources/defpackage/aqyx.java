package defpackage;

import j$.time.Instant;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyx {
    public final boolean a;
    public final boolean b;
    public final Object c;

    public aqyx(ByteBuffer byteBuffer, boolean z, boolean z2) {
        this.c = byteBuffer;
        this.a = z;
        this.b = z2;
    }

    public aqyx(Instant instant, boolean z, boolean z2) {
        instant.getClass();
        this.c = instant;
        this.a = z;
        this.b = z2;
    }
}
