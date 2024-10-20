package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clh {
    public final int a;

    public /* synthetic */ clh(int i) {
        this.a = i;
    }

    public static boolean a(int i, Object obj) {
        if (!(obj instanceof clh) || i != ((clh) obj).a) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (a.bA(i, 0)) {
            return "Argb8888";
        }
        if (a.bA(i, 1)) {
            return "Alpha8";
        }
        if (a.bA(i, 2)) {
            return "Rgb565";
        }
        if (a.bA(i, 3)) {
            return "F16";
        }
        if (a.bA(i, 4)) {
            return "Gpu";
        }
        return "Unknown";
    }
}
