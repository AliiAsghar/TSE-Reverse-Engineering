package defpackage;

import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pys implements unx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorHandler");
    private final armf b;
    private final via c;
    private final /* synthetic */ uno d;

    public pys(arwe arweVar, armf armfVar, pyr pyrVar, via viaVar, ConcurrentMap concurrentMap) {
        arweVar.getClass();
        armfVar.getClass();
        viaVar.getClass();
        concurrentMap.getClass();
        this.b = armfVar;
        this.c = viaVar;
        apca parserForType = pyt.a.getParserForType();
        parserForType.getClass();
        this.d = new uno(arweVar, parserForType, new jmb(concurrentMap, pyrVar, (arpe) null, 3));
    }

    @Override // defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d((int) ((Number) this.b.b()).longValue());
        a2.c(unv.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        a2.g(gry.EXPONENTIAL);
        a2.b = this.c.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FileTransferProcessorHandler");
    }

    @Override // defpackage.unx
    public final apca e() {
        return this.d.a;
    }

    @Override // defpackage.unx
    public final /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean h(apbt apbtVar) {
        return true;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean i(byte[] bArr) {
        return upb.f(this, bArr);
    }

    @Override // defpackage.unx
    public final akul q(uns unsVar, alog alogVar) {
        return this.d.q(unsVar, alogVar);
    }

    @Override // defpackage.unx
    public final /* synthetic */ String r() {
        return null;
    }

    @Override // defpackage.unx
    public final /* synthetic */ void g() {
    }
}
