package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cko {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static /* synthetic */ cko a(List list, long j, float f, int i) {
            if ((i & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            if ((i & 2) != 0) {
                j = 9205357640488583168L;
            }
            return new clu(list, j, f);
        }

        public static /* synthetic */ cko b(List list) {
            return new clk(list, (Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(brg.a) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(brg.a) & 4294967295L));
        }
    }

    public abstract void a(long j, clp clpVar, float f);
}
