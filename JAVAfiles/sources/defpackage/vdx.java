package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vdx implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ vdx(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        long j = 0;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                vdv vdvVar = (vdv) obj;
                if (vdvVar != null) {
                    j = vdvVar.g;
                }
                return Long.valueOf(j);
            case 2:
                return ((vdv) obj).b;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Long.valueOf(((vdv) obj).d);
            case 7:
                return null;
            case 8:
                aozy builder = ((vdv) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((vdv) builder.b).c = vdv.a.c;
                return (vdv) builder.s();
            case 9:
                return null;
            case 10:
                return ((vdv) obj).c.H();
            case 11:
                vdt vdtVar = (vdt) obj;
                if (vdtVar != null) {
                    j = vdtVar.b;
                }
                return Long.valueOf(j);
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                aqfk aqfkVar = ((vee) obj).m;
                if (aqfkVar == null) {
                    return aqfk.b;
                }
                return aqfkVar;
            case 15:
                return ((vee) obj).d.H();
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                return null;
            case 19:
                return null;
            default:
                vec b = vec.b(((vee) obj).j);
                if (b == null) {
                    return vec.UNRECOGNIZED;
                }
                return b;
        }
    }
}
