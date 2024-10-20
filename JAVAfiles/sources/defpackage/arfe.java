package defpackage;

import io.grpc.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfe extends aqua {
    public static final /* synthetic */ int a = 0;
    private static final boolean b = arcb.j("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST");

    @Override // defpackage.aqtp
    public final aqtz a(aqtr aqtrVar) {
        if (b) {
            return new arey(aqtrVar);
        }
        return new arfd(aqtrVar);
    }

    @Override // defpackage.aqua
    public final aquz b(Map map) {
        Object arfaVar;
        try {
            Boolean a2 = arct.a(map, "shuffleAddressList");
            if (b) {
                arfaVar = new areu(a2);
            } else {
                arfaVar = new arfa(a2);
            }
            return new aquz(arfaVar);
        } catch (RuntimeException e) {
            return new aquz(Status.n.d(e).withDescription("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.aqua
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.aqua
    public final void d() {
    }

    @Override // defpackage.aqua
    public final void e() {
    }
}
