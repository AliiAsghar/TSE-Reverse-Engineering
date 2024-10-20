package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adca extends apyn {
    private final apyi b;

    public adca(armf armfVar, armf armfVar2, apyi apyiVar) {
        super(armfVar2, new apyv(adca.class), armfVar);
        this.b = apys.c(apyiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        apwq apwqVar;
        TraceId l;
        String str;
        adcc adccVar = (adcc) obj;
        Optional optional = adccVar.a;
        advp advpVar = adbs.a;
        if (optional.isPresent()) {
            apwqVar = ((adqu) adccVar.a.get()).i;
        } else if (adccVar.b.isPresent() && ((adrc) adccVar.b.get()).N != null) {
            apwqVar = ((adrc) adccVar.b.get()).N.i;
        } else {
            apwqVar = null;
        }
        if (apwqVar != null) {
            aodz b = TraceId.b();
            apws apwsVar = apws.a;
            apbo apboVar = apwqVar.b;
            if (apboVar.containsKey("urn:goog:am")) {
                apwsVar = (apws) apboVar.get("urn:goog:am");
            }
            apbo apboVar2 = apwsVar.b;
            if (apboVar2.containsKey("Trace-Id")) {
                str = (String) apboVar2.get("Trace-Id");
            } else {
                str = "";
            }
            b.m(str);
            l = b.l();
        } else {
            l = TraceId.b().l();
        }
        return albo.bI(l);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
