package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amcz extends amdb {
    final /* synthetic */ char a;

    public amcz(char c) {
        this.a = c;
    }

    @Override // defpackage.amdb
    public final amda a(String str) {
        int indexOf = str.indexOf(this.a, 0);
        if (indexOf >= 0) {
            return new amda(str, indexOf, 1, Math.max(1, 1) + indexOf);
        }
        return null;
    }

    public final String toString() {
        return "first('" + this.a + "')";
    }
}
