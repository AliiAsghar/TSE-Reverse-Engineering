package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jko implements agck {
    private static final alvi g = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/ProjectionSpecComposeScreenClearcutLogger");
    public final xnv a;
    public final amqh b;
    public final amqe c;
    public final Instant d;
    public Instant e;
    public int f;
    private final arqr h;
    private final arml i;
    private final jxv j;

    public jko(armf armfVar, xnv xnvVar, jxv jxvVar, amqh amqhVar, amqe amqeVar, arqr arqrVar) {
        armfVar.getClass();
        xnvVar.getClass();
        jxvVar.getClass();
        amqhVar.getClass();
        this.a = xnvVar;
        this.j = jxvVar;
        this.b = amqhVar;
        this.c = amqeVar;
        this.h = arqrVar;
        this.i = armd.a(new jjw(armfVar, 4));
        this.d = xnvVar.f();
    }

    @Override // defpackage.agck
    public final void a() {
        mdc c = c();
        amqi amqiVar = amqi.FULL_SCREEN;
        amqd amqdVar = amqd.UNKNOWN_CLOSING_SOURCE;
        Integer valueOf = Integer.valueOf(b() - this.f);
        Instant instant = null;
        Duration ca = null;
        if (this.e == null) {
            alvw h = g.h();
            h.X(alwp.a, "BugleComposeRow2");
            alvg alvgVar = (alvg) h;
            alvgVar.Z(alwk.MEDIUM);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/ProjectionSpecComposeScreenClearcutLogger", "resolveTimeSpent", 82, "ProjectionSpecComposeScreenClearcutLogger.kt")).q("Did not record an opening time");
        } else {
            Instant f = this.a.f();
            f.getClass();
            Instant instant2 = this.e;
            if (instant2 == null) {
                arro.b("openingTime");
            } else {
                instant = instant2;
            }
            ca = albo.ca(f, instant);
        }
        c.c(this.b, amqiVar, amqdVar, valueOf, ca);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ascv, java.lang.Object] */
    public final int b() {
        List<jha> list = ((jhc) this.j.a.c()).b;
        int i = 0;
        if (!list.isEmpty()) {
            for (jha jhaVar : list) {
                if ((jhaVar instanceof jgz) && ((Boolean) this.h.a(((jgz) jhaVar).a)).booleanValue() && (i = i + 1) < 0) {
                    aqjn.F();
                }
            }
        }
        return i;
    }

    public final mdc c() {
        return (mdc) this.i.a();
    }
}
