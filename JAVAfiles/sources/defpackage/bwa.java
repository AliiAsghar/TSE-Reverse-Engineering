package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwa {
    public int a;

    public bwa(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
