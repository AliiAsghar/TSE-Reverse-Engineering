package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agpn implements agox {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agpn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        if (this.b != 0) {
            String str = (String) obj;
            int indexOf = str.indexOf(".");
            Object obj2 = this.a;
            if (indexOf == -1) {
                return obj2;
            }
            return String.valueOf(obj2).concat(String.valueOf(str.substring(indexOf)));
        }
        return ((agpo) this.a).b.t;
    }
}
