package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aarr implements alhr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aarr(armf armfVar, boolean z, int i) {
        this.c = i;
        this.b = armfVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        if (this.c != 0) {
            return new akip(this.a);
        }
        boolean z = false;
        if (!this.a && !((ajzb) this.b).i.equals("pseudonymous")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ aarr(boolean z, ajzb ajzbVar, int i) {
        this.c = i;
        this.a = z;
        this.b = ajzbVar;
    }
}
