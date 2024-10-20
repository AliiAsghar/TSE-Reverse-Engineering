package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahro {
    private final float a;
    private final Random b;

    public ahro(Random random, float f) {
        boolean z = false;
        if (f >= brg.a && f <= 1.0f) {
            z = true;
        }
        d.t(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        if (this.b.nextFloat() < this.a) {
            return true;
        }
        return false;
    }
}
