package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class anjx implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final anjf apply(aqhf aqhfVar) {
        aqhe aqheVar;
        Object apply;
        aqhd aqhdVar;
        Object apply2;
        Object apply3;
        Object obj;
        Object obj2;
        arbj arbjVar = new arbj();
        arbjVar.g(anjc.a);
        Function function = ankq.c;
        int i = aqhfVar.b;
        aqhc aqhcVar = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        aqheVar = null;
                    } else {
                        aqheVar = aqhe.REMOVAL_ALLOWED_FOR_ADMINS;
                    }
                } else {
                    aqheVar = aqhe.REMOVAL_ALLOWED_FOR_ALL;
                }
            } else {
                aqheVar = aqhe.NO_USER_REMOVAL_ALLOWED;
            }
        } else {
            aqheVar = aqhe.UNKNOWN_REMOVAL_POLICY;
        }
        if (aqheVar == null) {
            aqheVar = aqhe.UNRECOGNIZED;
        }
        apply = function.apply(aqheVar);
        anje anjeVar = (anje) apply;
        if (anjeVar != null) {
            arbjVar.c = anjeVar;
            Function function2 = ankq.b;
            int i2 = aqhfVar.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        aqhdVar = null;
                    } else {
                        aqhdVar = aqhd.RENAMING_ALLOWED;
                    }
                } else {
                    aqhdVar = aqhd.NO_RENAMING_ALLOWED;
                }
            } else {
                aqhdVar = aqhd.UNKNOWN_RENAMING_POLICY;
            }
            if (aqhdVar == null) {
                aqhdVar = aqhd.UNRECOGNIZED;
            }
            apply2 = function2.apply(aqhdVar);
            anjd anjdVar = (anjd) apply2;
            if (anjdVar != null) {
                arbjVar.b = anjdVar;
                Function function3 = ankq.d;
                int i3 = aqhfVar.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            aqhcVar = aqhc.GROUP_ICON_MODIFICATION_ALLOWED;
                        }
                    } else {
                        aqhcVar = aqhc.NO_GROUP_ICON_MODIFICATION_ALLOWED;
                    }
                } else {
                    aqhcVar = aqhc.UNKNOWN_GROUP_ICON_MODIFICATION_POLICY;
                }
                if (aqhcVar == null) {
                    aqhcVar = aqhc.UNRECOGNIZED;
                }
                apply3 = function3.apply(aqhcVar);
                arbjVar.g((anjc) apply3);
                Object obj3 = arbjVar.c;
                if (obj3 != null && (obj = arbjVar.b) != null && (obj2 = arbjVar.a) != null) {
                    return new anjf((anje) obj3, (anjd) obj, (anjc) obj2);
                }
                StringBuilder sb = new StringBuilder();
                if (arbjVar.c == null) {
                    sb.append(" userRemovalPolicy");
                }
                if (arbjVar.b == null) {
                    sb.append(" renamingPolicy");
                }
                if (arbjVar.a == null) {
                    sb.append(" groupIconModificationPolicy");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new NullPointerException("Null renamingPolicy");
        }
        throw new NullPointerException("Null userRemovalPolicy");
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
