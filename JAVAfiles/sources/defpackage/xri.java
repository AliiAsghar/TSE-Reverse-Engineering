package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xri extends unp {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public static final utz b = uuh.e(uuh.b, "persist_thumbnail_max_retry", 1);
    public static final utz c = uuh.e(uuh.b, "persist_thumbnail_handler_retry_delay", 1000);
    public final vyv d;
    private final anen e;
    private final anen f;
    private final xrg g;

    public xri(anen anenVar, anen anenVar2, xrg xrgVar, vyv vyvVar) {
        this.e = anenVar;
        this.f = anenVar2;
        this.g = xrgVar;
        this.d = vyvVar;
    }

    public static void j(rve rveVar, MessageIdType messageIdType, String str) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.e, rveVar.b);
        alwlVar.X(ydl.a, messageIdType.a());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/PersistThumbnailHandler", "logForDebug", BasePaymentResult.ERROR_REQUEST_FAILED, "PersistThumbnailHandler.java")).q(str);
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        if (((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
            return unf.a().a();
        }
        une a2 = unf.a();
        a2.d(((Integer) b.e()).intValue());
        a2.h(((Integer) c.e()).intValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("PersistThumbnailHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        xrj xrjVar = (xrj) apbtVar;
        try {
            rve a2 = rve.a(((xqn) apag.parseFrom(xqn.a, xrjVar.b, aozs.a())).b);
            akul i = this.g.a(a2).i(new xrd((Object) this, (Object) a2, (Object) xrjVar, 2, (byte[]) null), this.f);
            if (!((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
                return i.f(xpt.class, new xfn(a2, 9), this.e);
            }
            return i;
        } catch (apba e) {
            xyo e2 = D.e();
            e2.H("Could not parse opaque data. Cannot update thumbnail for incoming file transfer.");
            e2.r(e);
            return aktp.ag(upm.d());
        }
    }

    @Override // defpackage.unx
    public final apca e() {
        return xrj.a.getParserForType();
    }
}
