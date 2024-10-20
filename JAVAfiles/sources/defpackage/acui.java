package defpackage;

import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acui extends IOException {
    public final int a;
    public final Duration b;

    public acui(int i, Duration duration) {
        super("HTTP response code=" + i + " retryAfter=" + String.valueOf(duration));
        this.a = i;
        this.b = duration;
    }
}
