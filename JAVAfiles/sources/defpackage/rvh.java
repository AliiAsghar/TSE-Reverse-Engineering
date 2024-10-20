package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvh {
    public static final rvh a = new rvh(-1);
    private final rvb b;

    public rvh(long j) {
        this.b = new rvb(j);
    }

    public static long a(rvh rvhVar) {
        if (rvhVar != null) {
            rvb rvbVar = rvhVar.b;
            if (rvbVar.a.isPresent()) {
                return ((Long) rvbVar.a.get()).longValue();
            }
            return -1L;
        }
        return -1L;
    }
}
