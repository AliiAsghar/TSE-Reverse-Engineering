package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mte {
    public final ResolvedRecipient a;
    final /* synthetic */ lhm b;
    private final Instant c;

    public mte(lhm lhmVar, ResolvedRecipient resolvedRecipient, Instant instant) {
        this.b = lhmVar;
        this.a = resolvedRecipient;
        this.c = instant;
    }

    public final String toString() {
        ResolvedRecipient resolvedRecipient = this.a;
        lhm lhmVar = this.b;
        return resolvedRecipient.r(false) + " " + lhmVar.b(this.c);
    }
}
