package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjy implements akin {
    public final ajwt a;
    public final akka b;
    public final armf c;
    public final String d;
    public final ahlp e;
    private final Executor f;
    private final ahiy g;

    public akjy(ajwt ajwtVar, ahiy ahiyVar, ahlp ahlpVar, akka akkaVar, armf armfVar, Executor executor, String str) {
        ajwtVar.getClass();
        ahiyVar.getClass();
        akkaVar.getClass();
        armfVar.getClass();
        executor.getClass();
        this.a = ajwtVar;
        this.g = ahiyVar;
        this.e = ahlpVar;
        this.b = akkaVar;
        this.c = armfVar;
        this.f = executor;
        this.d = str;
    }

    @Override // defpackage.akin
    public final ListenableFuture a(String str, aozb aozbVar, ahtt ahttVar) {
        return this.b.a(ahttVar, aozbVar, str, this.d);
    }

    @Override // defpackage.akin
    public final ListenableFuture b(aozb aozbVar, ahtt ahttVar) {
        aaoa aaoaVar = new aaoa((Object) this, (Object) aozbVar, (Object) ahttVar, 12, (short[]) null);
        akka akkaVar = this.b;
        ListenableFuture b = akkaVar.b.b(new akiq((arqr) aaoaVar, akkaVar, 6), andi.a);
        b.getClass();
        return b;
    }

    public final ListenableFuture c(aozb aozbVar, ajwt ajwtVar, ajwt ajwtVar2, ahtt ahttVar) {
        if (ajwtVar != null && d.F(ajwtVar2, ajwtVar)) {
            return aktp.Z(this.g.C(ajwtVar2), new akjx(new aaoa(this, ahttVar, aozbVar, 13), 0), this.f);
        }
        return albo.bI(null);
    }
}
