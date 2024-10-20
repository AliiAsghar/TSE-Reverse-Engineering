package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atom implements atox {
    private final /* synthetic */ int g;
    static final atom f = new atom(5);
    static final atom e = new atom(4);
    static final atom d = new atom(3);
    static final atom c = new atom(2);
    static final atom b = new atom(1);
    static final atom a = new atom(0);

    public atom(int i) {
        this.g = i;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.atox
    public final /* synthetic */ Object a(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((asmp) obj).close();
                            return null;
                        }
                        ((asmp) obj).close();
                        return arnb.a;
                    }
                    return obj.toString();
                }
                return (asmp) obj;
            }
            asmp asmpVar = (asmp) obj;
            try {
                asmp k = atqx.k(asmpVar);
                asmpVar.close();
                return k;
            } catch (Throwable th) {
                asmpVar.close();
                throw th;
            }
        }
        return (asmk) obj;
    }
}
