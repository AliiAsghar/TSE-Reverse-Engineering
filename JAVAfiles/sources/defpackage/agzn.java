package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agzn {
    public static final agzo a;

    static {
        aegu aeguVar = agsp.a;
        agtj a2 = agtj.a();
        if (a2.g == null) {
            String bV = a.bV(10, "ExeSeq-P");
            if (bV.length() > 16) {
                if (!ahaw.a) {
                    bV = bV.substring(0, 16);
                } else {
                    throw new IllegalArgumentException(String.format("name[%s] exceeds max length (%d)", bV, 16));
                }
            }
            agts e = agtj.e();
            agtn agtnVar = new agtn(agsp.a, e, new agtl(bV, 10, e));
            synchronized (a2.c) {
                a2.c.add(e);
            }
            a2.g = new agtm(albo.bC(agtnVar));
        }
        a = new agzo(aeguVar, a2.g);
    }
}
