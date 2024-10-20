package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiek {
    public final int a;
    public final long b;
    private final List c;
    private final ExecutorService d;
    private final aidv e;

    /* JADX WARN: Multi-variable type inference failed */
    public aiek(aldy aldyVar, ExecutorService executorService, aidv aidvVar) {
        apax apaxVar;
        aldz aldzVar = (aldz) aldyVar.b.get(0);
        this.a = aldzVar.b;
        alep alepVar = (alep) aldzVar.c.get(0);
        this.b = alepVar.b;
        if (!alepVar.d.isEmpty()) {
            apaxVar = alepVar.d;
        } else {
            apaxVar = aldzVar.d;
        }
        this.c = apaxVar;
        this.d = executorService;
        this.e = aidvVar;
    }

    public final akul a() {
        if (this.c.isEmpty()) {
            return aktp.ag(alth.c);
        }
        if (aids.b(this.a, this.b)) {
            aidt a = aids.a(this.a, this.b);
            if (a.a() == 2) {
                return aktp.af(new aiej("Cached error attempting to extract the Experiment IDs from Phenotype"));
            }
            return aktp.ag(a.b());
        }
        aidv aidvVar = this.e;
        Stream stream = Collection.EL.stream(new HashSet(this.c));
        ahtx ahtxVar = aidvVar.b;
        ahtxVar.getClass();
        Stream map = stream.map(new agoq(ahtxVar, 5));
        int i = alog.d;
        alog alogVar = (alog) map.collect(alls.a);
        return akul.g(aktp.am(alogVar).h(new aidu(alogVar, 0), aidvVar.c)).h(new agui(this, 12), this.d);
    }

    public final alqf b() {
        if (this.c.isEmpty()) {
            return alth.c;
        }
        if (aids.b(this.a, this.b)) {
            aidt a = aids.a(this.a, this.b);
            boolean z = true;
            if (a.a() != 1) {
                z = false;
            }
            albo.U(z, "Expected to find experiment IDs in the cache, instead found an error");
            return a.b();
        }
        return alth.c;
    }
}
