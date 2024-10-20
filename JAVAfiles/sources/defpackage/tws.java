package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tws extends unp {
    public final armf a;
    public final armf b;
    public final armf c;
    private final armf d;

    public tws(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.a = armfVar;
        this.b = armfVar2;
        this.d = armfVar3;
        this.c = armfVar4;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UndeliveredMessageFallbackHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        alob alobVar = new alob();
        alobVar.j(rvx.b);
        alobVar.j(rvx.a);
        return aktp.ai(new rbn(this, (twt) apbtVar, alobVar.g(), 5), (Executor) this.d.b());
    }

    @Override // defpackage.unx
    public final apca e() {
        return twt.a.getParserForType();
    }
}
