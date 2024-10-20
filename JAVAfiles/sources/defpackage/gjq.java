package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjq implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public gjq(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        gjq gjqVar = (gjq) obj;
        gjqVar.getClass();
        int i = this.a - gjqVar.a;
        if (i == 0) {
            return this.d - gjqVar.d;
        }
        return i;
    }
}
