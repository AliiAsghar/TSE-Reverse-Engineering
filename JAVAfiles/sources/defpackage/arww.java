package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arww implements arxi {
    public final boolean a;

    public arww(boolean z) {
        this.a = z;
    }

    @Override // defpackage.arxi
    public final aryb hc() {
        return null;
    }

    @Override // defpackage.arxi
    public final boolean he() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (true != this.a) {
            str = "New";
        } else {
            str = "Active";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
