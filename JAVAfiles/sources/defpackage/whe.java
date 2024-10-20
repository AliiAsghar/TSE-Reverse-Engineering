package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class whe implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ whe(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xze xzeVar = whj.a;
                return null;
            case 1:
                xze xzeVar2 = whj.a;
                aozy builder = ((whc) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((whc) builder.b).o = true;
                return (whc) builder.s();
            case 2:
                xze xzeVar3 = whj.a;
                return null;
            case 3:
                xze xzeVar4 = whj.a;
                return null;
            case 4:
                xze xzeVar5 = whj.a;
                return ((whc) obj).c;
            case 5:
                xze xzeVar6 = whj.a;
                return null;
            case 6:
                xze xzeVar7 = whj.a;
                whm whmVar = ((whc) obj).q;
                if (whmVar == null) {
                    whmVar = whm.a;
                }
                return uhy.b(whmVar);
            case 7:
                xze xzeVar8 = whj.a;
                return null;
            default:
                xze xzeVar9 = whj.a;
                return null;
        }
    }
}
