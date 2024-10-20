package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjn implements uvx {
    public static final xze a = xze.g("Bugle", "RcsStillSendingMessageTracker");
    public static final alwo b = alwo.o("Bugle");
    public final andr c = new andr();
    public final anen d;
    public final armf e;
    public final uwd f;
    public final armf g;
    public final via h;
    private final anen i;
    private final anen j;
    private final armf k;
    private final armf l;

    public wjn(anen anenVar, anen anenVar2, anen anenVar3, armf armfVar, uwd uwdVar, armf armfVar2, via viaVar, armf armfVar3, armf armfVar4) {
        this.i = anenVar;
        this.d = anenVar2;
        this.e = armfVar;
        this.f = uwdVar;
        this.g = armfVar2;
        this.h = viaVar;
        this.j = anenVar3;
        this.k = armfVar3;
        this.l = armfVar4;
    }

    public final void a(MessageIdType messageIdType, long j) {
        akrh e = aktp.e("RcsStillSendingMessageTracker::startTracking");
        try {
            this.f.b(messageIdType, j, tqg.RCS_STILL_SENDING);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uvx
    public final akul c(alog alogVar) {
        return aktp.aj(new uvj(this, alogVar, 15), this.j).i(new wgb(this, 2), this.i);
    }

    @Override // defpackage.uvx
    public final long d() {
        if (!((wfh) this.k.b()).S()) {
            return ((Long) this.l.b()).longValue();
        }
        return Duration.ofMillis(((Long) ncu.c.e()).longValue()).getSeconds();
    }
}
