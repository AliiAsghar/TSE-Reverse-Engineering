package defpackage;

import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvp implements aput {
    private final CronetEngine a;
    private final aegu b;
    private final ExecutorService c;

    public apvp(CronetEngine cronetEngine, aegu aeguVar, ExecutorService executorService) {
        cronetEngine.getClass();
        this.a = cronetEngine;
        this.b = aeguVar;
        this.c = executorService;
    }

    @Override // defpackage.aput
    public final apvh a(String str, String str2, apuu apuuVar, apus apusVar) {
        apvt apvtVar;
        str.getClass();
        str2.getClass();
        apvr apvrVar = new apvr(this.c);
        if (apusVar != null) {
            apvtVar = new apvt(this.c, apusVar, this.b);
        } else {
            apvtVar = null;
        }
        return new apvs(str, str2, apuuVar, this.a, this.c, apvrVar, apvtVar);
    }
}
