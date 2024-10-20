package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xql extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler");
    public static final alwo b = alwo.o("BugleNotifications");
    public static final utz c = uuh.e(uuh.b, "file_download_completed_handler_max_retry", 3);
    public static final utz d = uuh.e(uuh.b, "file_download_completed_handler_retry_delay", 2000);
    public static final utz e = uuh.r(175072004, "notifyConversationMetadataChange");
    static final alhr f = uuh.x(209776273, "call_telephone_callback_on_file_transfer_completed");
    public final osx A;
    public final pyh B;
    public final armf C;
    public final ttl E;
    private final xrg F;
    public final Context g;
    public final anen h;
    public final anen i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final rjm s;
    public final armf t;
    public final armf u;
    public final armf v;
    public final armf w;
    public final armf x;
    public final ogc y;
    public final xqc z;

    public xql(Context context, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, xrg xrgVar, ttl ttlVar, rjm rjmVar, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, ogc ogcVar, xqc xqcVar, osx osxVar, pyh pyhVar, armf armfVar15) {
        this.g = context;
        this.h = anenVar;
        this.i = anenVar2;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.o = armfVar6;
        this.r = armfVar7;
        this.p = armfVar8;
        this.q = armfVar9;
        this.F = xrgVar;
        this.E = ttlVar;
        this.s = rjmVar;
        this.t = armfVar10;
        this.u = armfVar11;
        this.v = armfVar12;
        this.w = armfVar13;
        this.x = armfVar14;
        this.z = xqcVar;
        this.A = osxVar;
        this.B = pyhVar;
        this.y = ogcVar;
        this.C = armfVar15;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(((Integer) c.e()).intValue());
        a2.h(((Integer) d.e()).intValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FileDownloadCompletedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        xqm xqmVar = (xqm) apbtVar;
        rve a2 = rve.a(xqmVar.c);
        akul i = this.F.a(a2).i(new vug(this, a2, Uri.parse(xqmVar.d), xqmVar, 6), this.h);
        if (((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
            return i;
        }
        return i.f(xpt.class, new xfn(a2, 7), this.h);
    }

    @Override // defpackage.unx
    public final apca e() {
        return xqm.a.getParserForType();
    }
}
