package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akdj implements ancr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akdj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [akpe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        int i = 1;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                akae akaeVar = (akae) this.a;
                hkz b = hkz.b(akaeVar.a);
                b.f();
                b.getClass();
                return akaeVar.b.submit(new ajir(b, 14, bArr));
            case 2:
                ?? r0 = this.a;
                r0.getClass();
                return albo.bI(((apbt) r0.b()).toByteArray());
            case 3:
                ?? r02 = this.a;
                r02.getClass();
                return aktp.Y(((ancr) r02.b()).a(), new akez(akit.a, 4), andi.a);
            case 4:
                ?? r03 = this.a;
                r03.getClass();
                return albo.bI(r03.b());
            case 5:
                ?? r04 = this.a;
                r04.getClass();
                return ((ancr) r04.b()).a();
            case 6:
                return albo.bE(this.a);
            case 7:
                return ((akjb) this.a).m.c();
            case 8:
                aktp.d();
                Object obj = this.a;
                akul i2 = akul.g(((akjb) obj).p.a()).i(new ajzp(new afya(obj, 9, (short[][]) null), 9), andi.a);
                return albo.bW(i2).a(akto.k(new ahes(i2, obj, 18, bArr)), andi.a);
            case 9:
                return ((akjb) this.a).m.c();
            case 10:
                ListenableFuture T = aktp.T(((akjh) this.a).k.i(), abrn.class, new akez(agdl.q, 13), andi.a);
                akat.c(T, "Failed to update StorageInfos after registration", new Object[0]);
                return T;
            case 11:
                return albo.bE(this.a);
            case 12:
                return ((akkj) ((armf) this.a.getValue()).b()).a();
            case 13:
                akmq.b();
                PrintWriter printWriter = ((akmq) this.a).h;
                if (printWriter != null) {
                    printWriter.flush();
                }
                return albo.bI(null);
            case 14:
                Object obj2 = this.a;
                akoq akoqVar = new akoq(obj2, i);
                akos akosVar = (akos) obj2;
                return akosVar.f(aktp.Z(akosVar.i, akoqVar, akosVar.c));
            case 15:
                Object obj3 = this.a;
                aomi aomiVar = aomi.NO_USER_DATA;
                akob akobVar = (akob) obj3;
                albo.U(akobVar.a, "Synclet binding must be enabled to have a SyncKey");
                aknz aknzVar = akobVar.b;
                aknzVar.getClass();
                ((alvg) ((alvg) akos.a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 420, "SyncManagerImpl.java")).t("Starting synclet: %s", new aomj(aomiVar, aknzVar.b()));
                albo.U(akobVar.a, "Synclet binding must be enabled to have a Synclet");
                albo.U(akobVar.a, "Synclet binding must be enabled to have a SyncletProvider");
                armf armfVar = akobVar.c;
                armfVar.getClass();
                akoa akoaVar = (akoa) armfVar.b();
                akoaVar.getClass();
                return akoaVar.a();
            case 16:
                return this.a;
            case 17:
                return this.a.a();
            case 18:
                return this.a;
            default:
                return albo.bI(this.a.call());
        }
    }

    public akdj(Map.Entry entry, int i) {
        this.b = i;
        this.a = entry;
    }
}
