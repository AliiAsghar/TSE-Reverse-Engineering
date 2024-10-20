package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjy extends algf {
    private final algf a;

    public anjy(anjq anjqVar) {
        this.a = new ankb(anjqVar);
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        Object obj2;
        aqgy aqgyVar = (aqgy) obj;
        askt asktVar = null;
        aqrk aqrkVar = new aqrk((byte[]) null);
        aqrkVar.j(anjk.b);
        if ((aqgyVar.b & 1) != 0) {
            aqfn aqfnVar = aqgyVar.c;
            if (aqfnVar == null) {
                aqfnVar = aqfn.a;
            }
            if (aqfnVar != null) {
                aqrkVar.a = aqfnVar;
            } else {
                throw new NullPointerException("Null id");
            }
        }
        algf m = this.a.m();
        int i = aqgyVar.d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    asktVar = askt.REGULAR;
                }
            } else {
                asktVar = askt.ADMIN;
            }
        } else {
            asktVar = askt.DEFAULT_ROLE;
        }
        if (asktVar == null) {
            asktVar = askt.UNRECOGNIZED;
        }
        aqrkVar.j((anjk) m.fu(asktVar));
        Object obj3 = aqrkVar.a;
        if (obj3 != null && (obj2 = aqrkVar.b) != null) {
            return new anjl((aqfn) obj3, (anjk) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (aqrkVar.a == null) {
            sb.append(" id");
        }
        if (aqrkVar.b == null) {
            sb.append(" role");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        anjl anjlVar = (anjl) obj;
        aozy createBuilder = aqgy.a.createBuilder();
        aqfn aqfnVar = anjlVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqgy aqgyVar = (aqgy) createBuilder.b;
        aqfnVar.getClass();
        aqgyVar.c = aqfnVar;
        aqgyVar.b |= 1;
        askt asktVar = (askt) this.a.fu(anjlVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqgy) createBuilder.b).d = asktVar.a();
        return (aqgy) createBuilder.s();
    }
}
