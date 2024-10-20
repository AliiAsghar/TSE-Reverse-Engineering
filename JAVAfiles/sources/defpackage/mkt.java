package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkt extends unp {
    public static final alwo a = alwo.o("BugleDataModel");
    public final Context b;
    public final uhj c;
    public final anen d;
    public final anen e;
    public final anen f;
    public final wzs g;
    public final armf h;
    public final armf i;
    public final ugy j;
    public final qik k;
    public final rjm l;
    public final vjs m;
    public final vjs n;
    private final yjr o;

    public mkt(yjr yjrVar, Context context, uhj uhjVar, anen anenVar, anen anenVar2, anen anenVar3, wzs wzsVar, armf armfVar, armf armfVar2, ugy ugyVar, qik qikVar, rjm rjmVar, vjs vjsVar, vjs vjsVar2) {
        this.o = yjrVar;
        this.b = context;
        this.c = uhjVar;
        this.d = anenVar;
        this.e = anenVar2;
        this.f = anenVar3;
        this.g = wzsVar;
        this.h = armfVar;
        this.i = armfVar2;
        this.j = ugyVar;
        this.k = qikVar;
        this.l = rjmVar;
        this.m = vjsVar;
        this.n = vjsVar2;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("MarkMessagesAsReadHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        mkr mkrVar = (mkr) apbtVar;
        if (!this.o.y()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 123, "MarkMessagesAsReadHandler.java")).q("Not default SMS app. Can't mark as read.");
            return aktp.ag(upm.d());
        }
        Stream map = Collection.EL.stream(mkrVar.b).filter(new ilu(18)).map(new mfk(14));
        int i = alog.d;
        alog alogVar = (alog) map.collect(alls.a);
        if (alogVar.isEmpty()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 134, "MarkMessagesAsReadHandler.java")).q("MessageIds list is empty.");
            return aktp.ag(upm.d());
        }
        if (alogVar.size() != mkrVar.b.size()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "processPendingWorkItemAsync", 137, "MarkMessagesAsReadHandler.java")).q("Some message ids are invalid.");
        }
        alog alogVar2 = (alog) Collection.EL.stream(alogVar).map(new lch(this, mkrVar.c, 3)).collect(alls.a);
        return aktp.am(alogVar2).h(new mig(alogVar2, 4), this.e);
    }

    @Override // defpackage.unx
    public final apca e() {
        return mkr.a.getParserForType();
    }
}
