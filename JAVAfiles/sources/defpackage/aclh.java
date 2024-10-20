package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclh implements ackd {
    private final String a;
    private final String b;

    public aclh(ackd ackdVar) {
        this.a = ackdVar.f();
        this.b = ackdVar.e();
    }

    @Override // defpackage.ackd
    public final String e() {
        return this.b;
    }

    @Override // defpackage.ackd
    public final String f() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
