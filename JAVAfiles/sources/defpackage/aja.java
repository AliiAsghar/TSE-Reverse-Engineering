package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aja {
    public static final float a(avc avcVar) {
        if (avcVar.p().f() == ahp.b) {
            return Float.intBitsToFloat((int) (avcVar.o() >> 32));
        }
        return Float.intBitsToFloat((int) (avcVar.o() & 4294967295L));
    }

    public static final boolean b(avc avcVar) {
        avcVar.p().h();
        c(avcVar);
        if (!c(avcVar)) {
            return true;
        }
        return false;
    }

    private static final boolean c(avc avcVar) {
        if (a(avcVar) > brg.a) {
            return true;
        }
        return false;
    }
}
