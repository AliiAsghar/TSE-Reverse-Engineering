package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wop implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wop(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, arqr] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        long j;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                obj2.getClass();
                apbo apboVar = ((woo) obj).c;
                if (apboVar.containsKey(obj2)) {
                    j = ((Long) apboVar.get(obj2)).longValue();
                } else {
                    j = 0;
                }
                return Long.valueOf(j);
            case 1:
                return ((rfa) this.a).c((res) obj);
            case 2:
                return this.a;
            case 3:
                int i = wur.d;
                return this.a.a(obj);
            case 4:
                return wcm.C(this.a, obj);
            case 5:
                return wcm.C(this.a, obj);
            case 6:
                return d.X(this.a, obj);
            case 7:
                int i2 = wur.d;
                return this.a.a(obj);
            case 8:
                return wcm.C(this.a, obj);
            case 9:
                return wcm.C(this.a, obj);
            case 10:
                return wcm.C(this.a, obj);
            case 11:
                alwo alwoVar = wva.a;
                return this.a.a(obj);
            case 12:
                return wcm.C(this.a, obj);
            case 13:
                return wcm.C(this.a, obj);
            case 14:
                return wcm.C(this.a, obj);
            case 15:
                return wcm.C(this.a, obj);
            case 16:
                this.a.a(obj);
                return null;
            case 17:
                return ((wxz) this.a).o((qgg) obj, 4);
            case 18:
                return wxz.n((IllegalArgumentException) obj, (rve) this.a, 4);
            case 19:
                return ((wxz) this.a).o((qgg) obj, 4);
            default:
                return wxz.n((IllegalArgumentException) obj, (rve) this.a, 4);
        }
    }
}
