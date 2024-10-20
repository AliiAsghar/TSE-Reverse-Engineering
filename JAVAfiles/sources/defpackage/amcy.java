package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcy extends amdb {
    final /* synthetic */ amdb a;

    public amcy(amdb amdbVar) {
        this.a = amdbVar;
    }

    @Override // defpackage.amdb
    public final amda a(String str) {
        amda a = this.a.a(str);
        if (a == null) {
            return null;
        }
        int length = a.a.length() - a.c;
        String str2 = a.a;
        int length2 = str2.length() - length;
        return new amda(str2, length2, length, Math.max(1, length) + length2);
    }

    public final String toString() {
        return "after(" + this.a.toString() + ")";
    }
}
