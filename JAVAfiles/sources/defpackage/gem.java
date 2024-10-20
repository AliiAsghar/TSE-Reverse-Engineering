package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gem {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public gem(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void b() {
        int h;
        int h2;
        if (!this.f) {
            int i = this.a;
            int f = eap.f(-1, i, 4.5f);
            int f2 = eap.f(-1, i, 3.0f);
            if (f != -1 && f2 != -1) {
                this.h = eap.h(-1, f);
                this.g = eap.h(-1, f2);
                this.f = true;
                return;
            }
            int f3 = eap.f(-16777216, this.a, 4.5f);
            int f4 = eap.f(-16777216, this.a, 3.0f);
            if (f3 != -1 && f4 != -1) {
                this.h = eap.h(-16777216, f3);
                this.g = eap.h(-16777216, f4);
                this.f = true;
                return;
            }
            if (f != -1) {
                h = eap.h(-1, f);
            } else {
                h = eap.h(-16777216, f3);
            }
            this.h = h;
            if (f2 != -1) {
                h2 = eap.h(-1, f2);
            } else {
                h2 = eap.h(-16777216, f4);
            }
            this.g = h2;
            this.f = true;
        }
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        eap.i(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gem gemVar = (gem) obj;
            if (this.b == gemVar.b && this.a == gemVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(a()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        b();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        b();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
