package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class anrb {
    protected final String d;
    protected final int e;

    public anrb(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final String toString() {
        return String.format("%s(0x%04x)", this.d, Integer.valueOf(this.e));
    }
}
