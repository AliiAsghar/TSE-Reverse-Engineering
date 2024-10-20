package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alhc extends Random {
    private static final long serialVersionUID = 898001275432099254L;
    private final boolean a = true;

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (!this.a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
    }
}
