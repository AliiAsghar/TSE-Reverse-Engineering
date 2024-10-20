package defpackage;

import com.google.communication.synapse.security.scytale.EventPublisher;
import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twa extends EventPublisher {
    public final armf a;
    public final Optional b;
    private final Executor c;

    public twa(armf armfVar, Optional optional, Executor executor) {
        this.a = armfVar;
        this.b = optional;
        this.c = executor;
    }

    @Override // com.google.communication.synapse.security.scytale.EventPublisher
    public final void onScytaleEvent(ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
        qiu.h(aktp.ah(new ryv(this, scytaleLoggingProto$ScytaleEvent, 6), this.c));
    }
}
