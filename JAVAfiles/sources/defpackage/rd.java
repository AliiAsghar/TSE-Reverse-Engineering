package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rd extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gjz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [gkg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [gjz, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        gkl gklVar;
        boolean z = false;
        Bundle bundle = null;
        byte b = 0;
        byte b2 = 0;
        switch (this.b) {
            case 0:
                return new hwo(((re) this.a).l);
            case 1:
                re reVar = (re) this.a;
                Application application = reVar.getApplication();
                if (reVar.getIntent() != null) {
                    bundle = ((re) this.a).getIntent().getExtras();
                }
                return new eoo(application, this.a, bundle);
            case 2:
                rm rmVar = new rm(new ou(this.a, 10, b2 == true ? 1 : 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    Object obj = this.a;
                    if (!d.F(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new bn(obj, (Object) rmVar, 11, (byte[]) (b == true ? 1 : 0)));
                    } else {
                        ((re) obj).t(rmVar);
                    }
                }
                return rmVar;
            case 3:
                ((rm) this.a).d();
                return arnb.a;
            case 4:
                ((rm) this.a).c();
                return arnb.a;
            case 5:
                ((rm) this.a).d();
                return arnb.a;
            case 6:
                return ((eij) this.a).f().c;
            case 7:
                eim eimVar = (eim) ((eij) this.a).a;
                File canonicalFile = ((File) eimVar.d.a()).getCanonicalFile();
                synchronized (eim.b) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    if (!eim.a.contains(absolutePath)) {
                        Set set = eim.a;
                        absolutePath.getClass();
                        set.add(absolutePath);
                    } else {
                        throw new IllegalStateException(a.bW(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                    }
                }
                canonicalFile.getClass();
                return new eip(canonicalFile, eimVar.e, (kkc) eimVar.c.a(canonicalFile), new rd(canonicalFile, 8));
            case 8:
                Object obj2 = this.a;
                synchronized (eim.b) {
                    eim.a.remove(((File) obj2).getAbsolutePath());
                }
                return arnb.a;
            case 9:
                return eol.b(this.a);
            case 10:
                return Boolean.valueOf(((fzz) this.a).b.a);
            case 11:
                gat gatVar = (gat) this.a;
                gatVar.a.b.g(new gas(gatVar, 0));
                ((gat) this.a).a.b();
                return arnb.a;
            case 12:
                ((gav) this.a).l(true);
                return arnb.a;
            case 13:
                dyh dyhVar = (dyh) aqjn.Z(((gad) ((arrt) ((gqg) ((kkc) this.a).c).b).b).a());
                if (dyhVar == null || !(dyhVar instanceof gbg)) {
                    return null;
                }
                gbg gbgVar = (gbg) dyhVar;
                if (gbgVar.b != gbb.REFRESH) {
                    return null;
                }
                return gbgVar;
            case 14:
                ((gcz) this.a).i.h(arnb.a);
                return arnb.a;
            case 15:
                if (!((ghv) this.a).a.p() || ((ghv) this.a).a.r()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                return ((gil) this.a).e();
            case 17:
                return new gjf(new ghw(((gjc) this.a).b.a.b()));
            case 18:
                ?? r0 = this.a;
                r0.N().c(new gjw(r0));
                return arnb.a;
            case 19:
                gkm gkmVar = (gkm) this.a;
                String str = gkmVar.b;
                if (str != null && gkmVar.d) {
                    File noBackupFilesDir = gkmVar.a.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    File file = new File(noBackupFilesDir, ((gkm) this.a).b);
                    Object obj3 = this.a;
                    String absolutePath2 = file.getAbsolutePath();
                    mka mkaVar = new mka((byte[]) null, (byte[]) null, (byte[]) null);
                    gkm gkmVar2 = (gkm) this.a;
                    gklVar = new gkl(((gkm) obj3).a, absolutePath2, mkaVar, gkmVar2.c, gkmVar2.e);
                } else {
                    Context context = gkmVar.a;
                    mka mkaVar2 = new mka((byte[]) null, (byte[]) null, (byte[]) null);
                    gkm gkmVar3 = (gkm) this.a;
                    gklVar = new gkl(context, str, mkaVar2, gkmVar3.c, gkmVar3.e);
                }
                gklVar.setWriteAheadLoggingEnabled(((gkm) this.a).f);
                return gklVar;
            default:
                Class<?> loadClass = ((ClassLoader) ((hgi) this.a).a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                return loadClass;
        }
    }
}
