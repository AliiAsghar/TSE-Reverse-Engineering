package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcx extends amdb {
    final /* synthetic */ amdb a;

    public amcx(amdb amdbVar) {
        this.a = amdbVar;
    }

    @Override // defpackage.amdb
    public final amda a(String str) {
        amda a = this.a.a(str);
        if (a == null) {
            return null;
        }
        return new amda(str, 0, a.b, a.d);
    }

    public final String toString() {
        return "before(" + this.a.toString() + ")";
    }
}
