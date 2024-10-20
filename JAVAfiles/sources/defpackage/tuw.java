package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tuw {
    private static final xze c = xze.g("BugleEtouffee", "IdVerificationCache");
    public final Object a = new Object();
    public final HashMap b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(rve rveVar) {
        Integer num = (Integer) ttd.x.e();
        Integer num2 = (Integer) ttd.y.e();
        synchronized (this.a) {
            if (this.b.size() > num2.intValue()) {
                c.q("Cache is too large. Clear it.");
                this.b.clear();
            }
            Integer num3 = (Integer) this.b.get(rveVar);
            if (num3 == null) {
                num3 = 0;
            }
            if (num3.intValue() >= num.intValue()) {
                return false;
            }
            this.b.put(rveVar, Integer.valueOf(num3.intValue() + 1));
            return true;
        }
    }
}
