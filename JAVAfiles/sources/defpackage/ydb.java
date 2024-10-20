package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydb implements Comparable {
    final int a;
    final int b;

    public ydb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ydb ydbVar = (ydb) obj;
        int i = this.a - ydbVar.a;
        if (i != 0) {
            return i;
        }
        return this.b - ydbVar.b;
    }
}
