package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiak implements Parcelable, Comparable {
    public final int a;
    public final int b;

    public aiak() {
        throw null;
    }

    public static aiak a(int i, int i2) {
        try {
            ahzj ahzjVar = new ahzj(i, i2);
            int i3 = ahzjVar.a;
            albo.V(alst.d(0, 23).a(Integer.valueOf(i3)), "Hours must not be out-of-range: 0 to 23, but was: %s.", i3);
            int i4 = ahzjVar.b;
            albo.V(alst.d(0, 59).a(Integer.valueOf(i4)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", i4);
            return ahzjVar;
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        aiak aiakVar = (aiak) obj;
        aiakVar.getClass();
        if (this == aiakVar) {
            return 0;
        }
        int i = this.a;
        int i2 = aiakVar.a;
        if (i == i2) {
            return this.b - aiakVar.b;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiak) {
            aiak aiakVar = (aiak) obj;
            if (this.a == aiakVar.a && this.b == aiakVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LocalTime{hours=" + this.a + ", minutes=" + this.b + "}";
    }

    public aiak(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
