package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mel {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper");
    public final anen a;
    private final men c;
    private final mek d;

    public mel(anen anenVar, men menVar, mek mekVar) {
        this.a = anenVar;
        this.c = menVar;
        this.d = mekVar;
    }

    public final byte[] a() {
        try {
            return this.d.g();
        } catch (IOException e) {
            alvw i = b.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper", "getAppEventLogData", 'I', "MessageLogDumper.java")).q("Failed to dump app events");
            return null;
        }
    }

    public final byte[] b() {
        try {
            return this.c.h();
        } catch (IOException e) {
            alvw i = b.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper", "getMessageStatusLogData", ':', "MessageLogDumper.java")).q("Failed to dump message status");
            return null;
        }
    }
}
