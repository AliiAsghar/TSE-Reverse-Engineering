package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgn {
    public static final jgn a = new jgn();
    public static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter");

    private jgn() {
    }

    public static final void a(ahlp ahlpVar, amqh amqhVar, amqi amqiVar) {
        aozy createBuilder = amqj.a.createBuilder();
        createBuilder.getClass();
        akec.X(amqhVar, createBuilder);
        if (amqiVar != null) {
            akec.Y(amqiVar, createBuilder);
        }
        ahlpVar.F(akec.W(createBuilder));
    }

    public static final void c(ahlp ahlpVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                a(ahlpVar, amqh.EMOJI, null);
                return;
            }
            if (i2 != 4) {
                aozy createBuilder = ampa.a.createBuilder();
                createBuilder.getClass();
                aktp.bA(1, createBuilder);
                ahlpVar.D(aktp.bz(createBuilder));
                return;
            }
            aozy createBuilder2 = ampa.a.createBuilder();
            createBuilder2.getClass();
            aktp.bA(2, createBuilder2);
            ahlpVar.D(aktp.bz(createBuilder2));
        }
    }
}
