package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qre implements qrd {
    private final aogy b;

    public qre(aogy aogyVar) {
        this.b = aogyVar;
    }

    @Override // defpackage.qrd
    public final akul a() {
        akct a = akcx.a(qrc.class);
        a.e(new akcw("ConversationMatchingLoggerWorker", 1));
        a.c(new akcu(new akcv(((Long) qrc.a.e()).longValue(), TimeUnit.MINUTES), alfd.a));
        return akul.g(this.b.r(a.a()));
    }
}
