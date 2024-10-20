package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akjj extends arrm implements arqx {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akjj(Object obj, int i, byte[] bArr) {
        super(4, obj, khw.class, "onLayoutRectUpdated", "onLayoutRectUpdated(IIII)V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.a != 0) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            int intValue3 = ((Number) obj3).intValue();
            int intValue4 = ((Number) obj4).intValue();
            hmk hmkVar = ((khw) this.e).v;
            jxp jxpVar = jxp.a;
            jxpVar.getClass();
            jxo jxoVar = new jxo(intValue, intValue2, intValue3, intValue4);
            if (hmkVar.a.containsKey(jxpVar)) {
                ascd ascdVar = (ascd) hmkVar.a.get(jxpVar);
                if (ascdVar != null) {
                    ascdVar.f(jxoVar);
                }
            } else {
                hmkVar.a.put(jxpVar, ascy.a(jxoVar));
            }
            return arnb.a;
        }
        return ((ahtx) this.e).f((String) obj, ((Number) obj2).intValue(), (String[]) obj3, (byte[]) obj4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akjj(Object obj, int i) {
        super(4, obj, ahtx.class, "register", "register(Ljava/lang/String;I[Ljava/lang/String;[B)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
        this.a = i;
    }
}
