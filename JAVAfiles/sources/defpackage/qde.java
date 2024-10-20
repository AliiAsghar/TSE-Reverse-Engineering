package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qde extends unp {
    private static final xze a = xze.g("BugleDataModel", "RevokeChatMessageResponseHandler");
    private final uvi b;
    private final rde c;

    public qde(rde rdeVar, uvi uviVar) {
        this.c = rdeVar;
        this.b = uviVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RevokeChatMessageResponseHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        try {
            rve a2 = rve.a(((qgd) apag.parseFrom(qgd.a, ((qgc) apbtVar).d, aozs.a())).c);
            if (a2.f().isEmpty()) {
                a.q("RevokeChatMessageResponse.opaque_data contained empty messageId");
                return aktp.ag(upm.d());
            }
            return this.c.b(a2).q().h(new qda(3), andi.a);
        } catch (apba e) {
            a.r("Unable to decode RevokeChatMessageResponse.opaque_data", e);
            return this.b.b(e).h(new qda(2), andi.a);
        }
    }

    @Override // defpackage.unx
    public final apca e() {
        return qgc.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "incoming_chat_api_queue";
    }
}
