package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xez extends unp {
    private final Map a;
    private final armf b;
    private final armf c;
    private final arwe d;
    private final alvi e;

    public xez(Map map, armf armfVar, armf armfVar2, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.a = map;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = arweVar;
        this.e = alvi.m("com/google/android/apps/messaging/shared/tachygram/chat/TachygramInboxMessageRetryWorkHandler");
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        armf armfVar = this.b;
        une a = unf.a();
        a.d((int) ((Number) armfVar.b()).longValue());
        Object b = this.c.b();
        b.getClass();
        a.h(((Number) b).longValue());
        a.g(gry.EXPONENTIAL);
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("TachygramInboxMessageRetryWorkHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        aqds aqdsVar = (aqds) apbtVar;
        aqdsVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new wwh(this, aqdsVar, (arpe) null, 5));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = aqds.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.aqds r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xez.j(aqds, arpe):java.lang.Object");
    }
}
