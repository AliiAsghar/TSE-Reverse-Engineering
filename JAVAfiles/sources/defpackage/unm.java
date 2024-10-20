package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unm extends unp {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/workqueue/NoHandlerHandler");

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("NoHandlerHandler");
    }

    @Override // defpackage.unp
    public final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        ((aozo) apbtVar).getClass();
        alvw h = a.h();
        h.X(alwp.a, "BugleWorkQueue");
        ((alvg) h.h("com/google/android/apps/messaging/shared/datamodel/workqueue/NoHandlerHandler", "processPendingWorkItemAsync", 21, "NoHandlerHandler.kt")).t("WorkQueue: no handler found for type %s", unsVar.a().a);
        akul ag = aktp.ag(upm.d());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = aozo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
