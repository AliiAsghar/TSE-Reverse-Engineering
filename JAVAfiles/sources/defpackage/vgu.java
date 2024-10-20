package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgu implements qrn {
    private static final List a = aqjn.B(aqdr.GROUP, aqdr.TACHYGRAM_MESSAGE);

    @Override // defpackage.qrn
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        obj.getClass();
        List list = a;
        aqds aqdsVar = (aqds) obj;
        aqdr b = aqdr.b(aqdsVar.d);
        if (b == null) {
            b = aqdr.UNRECOGNIZED;
        }
        if (!list.contains(b)) {
            aqdr b2 = aqdr.b(aqdsVar.d);
            if (b2 == null) {
                b2 = aqdr.UNRECOGNIZED;
            }
            throw new IllegalStateException("TachygramExecutionKeyExtractor called for messageType: " + b2.a());
        }
        aqdq b3 = aqdq.b(aqdsVar.j);
        if (b3 == null) {
            b3 = aqdq.UNRECOGNIZED;
        }
        if (b3 == aqdq.EPHEMERAL) {
            return "default key for parallel execution";
        }
        if ((aqdsVar.b & 4) != 0) {
            aqfn aqfnVar = aqdsVar.i;
            if (aqfnVar == null) {
                aqfnVar = aqfn.a;
            }
            return "tachygram ".concat(String.valueOf(aqfnVar.c));
        }
        aqfn aqfnVar2 = aqdsVar.g;
        if (aqfnVar2 == null) {
            aqfnVar2 = aqfn.a;
        }
        return "tachygram ".concat(String.valueOf(aqfnVar2.c));
    }
}
