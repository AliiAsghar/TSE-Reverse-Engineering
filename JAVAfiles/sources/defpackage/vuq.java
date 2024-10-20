package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vuq implements vur {
    static final utz a = uuh.f(uuh.b, "rcs_group_name_change_server_response_client_timeout_ms", 17000);

    @Override // defpackage.vur
    public final Duration a() {
        return Duration.ofMillis(((Long) a.e()).longValue());
    }
}
