package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atse implements akgr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public atse(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akgr
    public final akfd a() {
        if (this.b != 0) {
            return uwu.a;
        }
        akfc akfcVar = xxu.a;
        akfcVar.getClass();
        return akfcVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arwe, java.lang.Object] */
    @Override // defpackage.akgr
    public final ListenableFuture b() {
        akul c;
        uxi uxiVar;
        if (this.b != 0) {
            if (kpt.a()) {
                uwu uwuVar = (uwu) this.a;
                if (!((Optional) ((AtomicReference) ((uac) uwuVar.d.b()).b).get()).isEmpty()) {
                    uxiVar = (uxi) ((Optional) ((AtomicReference) ((uac) uwuVar.d.b()).b).get()).get();
                    return aktp.ag(uxiVar);
                }
            }
            uxiVar = new uxi(null);
            return aktp.ag(uxiVar);
        }
        atsg atsgVar = (atsg) this.a;
        c = qjh.c(atsgVar.a, arpj.a, arwf.a, new atsd(atsgVar, null));
        return c;
    }
}
