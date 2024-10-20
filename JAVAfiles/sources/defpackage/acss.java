package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acss implements armf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acss(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [adfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        int i;
        switch (this.b) {
            case 0:
                advr.d(new advp("FileTransferModule"), "getting upload digest based HttpRequestExecutor", new Object[0]);
                return this.a;
            case 1:
                advr.d(new advp("FileTransferModule"), "getting download digest based HttpRequestExecutor", new Object[0]);
                return this.a;
            case 2:
                acyz acyzVar = adet.a;
                return Optional.ofNullable(this.a.b());
            case 3:
                return ((adet) this.a).d();
            case 4:
                return Boolean.valueOf(((acxk) this.a.b()).a());
            case 5:
                return ((ansy) this.a).d();
            case 6:
                ?? r0 = this.a;
                if (((algw) r0.b()).f()) {
                    return null;
                }
                return null;
            case 7:
                return false;
            case 8:
                return (ahri) this.a.b();
            case 9:
                ?? r02 = this.a;
                if (((ahqz) r02.b()).b()) {
                    i = ((ahqz) r02.b()).a;
                } else {
                    i = 10;
                }
                return Integer.valueOf(i);
            case 10:
                return ((aklj) this.a).a();
            case 11:
                return ((cg) this.a).G();
            case 12:
                return (akcq) this.a.b();
            case 13:
                return (ydm) this.a.b();
            case 14:
                return aktp.x((Context) this.a);
            case 15:
                alob alobVar = new alob();
                alobVar.h(new aknl(0));
                alobVar.j((Iterable) this.a.b());
                alobVar.h(new aknk());
                alobVar.h(new aknl(1));
                return alobVar.g();
            case 16:
                return (akcq) this.a.b();
            case 17:
                return (akcq) this.a.b();
            case 18:
                return this.a;
            case 19:
                ((atsg) this.a).g();
                return false;
            default:
                return alog.r(((aokr) this.a).a());
        }
    }
}
