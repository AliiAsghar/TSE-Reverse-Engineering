package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xzd implements xyx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xzd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xyx
    public final void a(StringBuilder sb) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                sb.append((String) this.a);
                return;
            } else {
                sb.append((String) ((jxv) this.a).b);
                return;
            }
        }
        sb.append(((Class) this.a).getSimpleName());
    }
}
