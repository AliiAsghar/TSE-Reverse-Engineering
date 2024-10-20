package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfw {
    public static final float a(float f, float f2, bwj bwjVar) {
        long j = ((cku) bwjVar.g(bfy.a)).i;
        if (bgu.a(bwjVar).m()) {
            if (ckw.a(j) <= 0.5d) {
                return f2;
            }
        } else if (ckw.a(j) >= 0.5d) {
            return f2;
        }
        return f;
    }

    public static final float b(bwj bwjVar) {
        return a(0.38f, 0.38f, bwjVar);
    }
}
