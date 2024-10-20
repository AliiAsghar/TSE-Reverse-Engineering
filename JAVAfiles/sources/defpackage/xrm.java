package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrm extends unp {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public static final utz b = uuh.e(uuh.b, "thumbnail_download_completed_handler_max_retry", 1);
    public static final utz c = uuh.e(uuh.b, "thumbnail_download_completed_handler_retry_delay", 1000);
    public final anen d;
    public final anen e;
    public final rji f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final agnq k;
    public final vqm l;
    public final xqc m;
    public final ttl n;
    private final xrg o;

    public xrm(anen anenVar, anen anenVar2, xrg xrgVar, rji rjiVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, vqm vqmVar, agnq agnqVar, ttl ttlVar, xqc xqcVar) {
        this.d = anenVar;
        this.e = anenVar2;
        this.o = xrgVar;
        this.f = rjiVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.k = agnqVar;
        this.l = vqmVar;
        this.n = ttlVar;
        this.m = xqcVar;
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
        return aktp.e("ThumbnailDownloadCompletedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        xrn xrnVar = (xrn) apbtVar;
        rve a2 = rve.a(xrnVar.b);
        Uri parse = Uri.parse(xrnVar.c);
        String af = albo.af(xrnVar.d);
        if (Uri.EMPTY.equals(parse)) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.e, a2.b);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 158, "ThumbnailDownloadCompletedHandler.java")).q("Thumbnail Uri is not provided. Cannot update thumbnail for incoming file transfer.");
            return aktp.ag(upm.d());
        }
        akul i = this.o.a(a2).i(new xrd((Object) this, (Object) parse, (Object) af, 4, (byte[]) null), this.d);
        if (((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
            return i;
        }
        return i.f(xpt.class, new xfn(a2, 10), this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return xrn.a.getParserForType();
    }
}
