package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbx implements mbn {
    private static final alwo a = alwo.o("BugleClearcutLogger");
    private final armf b;
    private final armf c;
    private final armf d;

    public mbx(armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    @Override // defpackage.mbn
    public final amfk a() {
        if (!((yjv) this.d.b()).e()) {
            return ((mbc) this.b.b()).b();
        }
        mbc mbcVar = (mbc) this.b.b();
        mbcVar.c(((yjy) this.c.b()).f());
        return mbcVar.b();
    }

    @Override // defpackage.mbn
    public final amfk b(String str) {
        mbc mbcVar = (mbc) this.b.b();
        if (!agkx.ad(str)) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/analytics/common/PhoneDimensionsProvider", "getCustomDimensionsForRbm", 50, "PhoneDimensionsProvider.java")).q("Can't set custom RBM info in UMA counter: RBM bot id is not an email");
        } else {
            String str2 = (String) anna.e('@').c(str).get(1);
            aozy aozyVar = mbcVar.b;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amfk amfkVar = (amfk) aozyVar.b;
            amfk amfkVar2 = amfk.a;
            str.getClass();
            amfkVar.b |= 8;
            amfkVar.f = str;
            aozy aozyVar2 = mbcVar.b;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            amfk amfkVar3 = (amfk) aozyVar2.b;
            str2.getClass();
            amfkVar3.b |= 16;
            amfkVar3.g = str2;
        }
        return mbcVar.b();
    }
}
