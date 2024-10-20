package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzz {
    public final aegu b;
    public final Executor c;
    public final abzr d;
    public final addy e;
    private final acak g;
    public static final apuv f = new apuv("UdevsVerdict");
    public static final accv a = new accv(null);

    public abzz(aegu aeguVar, Executor executor, acak acakVar, abzr abzrVar, addy addyVar) {
        this.b = aeguVar;
        this.c = executor;
        this.g = acakVar;
        this.d = abzrVar;
        this.e = addyVar;
    }

    public static algw a(algw algwVar, algy algyVar) {
        if (algwVar.f() && algyVar.a(algwVar.b())) {
            return algwVar;
        }
        return alfd.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture b(aovk aovkVar) {
        acak acakVar = this.g;
        return ancj.f(anee.o(albo.bN(new xpx(acakVar, aovkVar, 7), acakVar.b)), new aald(aovkVar, 17), this.c);
    }
}
