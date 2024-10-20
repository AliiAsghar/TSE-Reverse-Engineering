package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eet {
    public final eaq a;
    public final eaq b;

    public eet(eaq eaqVar, eaq eaqVar2) {
        this.a = eaqVar;
        this.b = eaqVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public eet(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = eaq.e(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = eaq.e(upperBound);
    }
}
