package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsu {
    public static final acyz a = acyy.b("read_http_request_executor_factory_from_provider");
    public final acsv b;
    public final acob c;
    public final afxz d;
    private final acti e;
    private final actk f;
    private final actk g;
    private final armf h;
    private final armf i;
    private final adea j;
    private final adqg k;

    public acsu(afxz afxzVar, adea adeaVar, adqg adqgVar, acob acobVar, acti actiVar, actk actkVar, actk actkVar2, armf armfVar, armf armfVar2, acsv acsvVar) {
        this.d = afxzVar;
        this.j = adeaVar;
        this.k = adqgVar;
        this.c = acobVar;
        this.b = acsvVar;
        this.f = actkVar;
        this.g = actkVar2;
        this.h = armfVar;
        this.i = armfVar2;
        this.e = actiVar;
    }

    private final actk e() {
        if (((Boolean) a.a()).booleanValue()) {
            return (actk) this.h.b();
        }
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    public final acsp a(long j, String str, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, String str2, Optional optional, int i) {
        acnv acnvVar = new acnv(this.c, str, 2);
        acth a2 = this.e.a(acnvVar, e().a(instantMessageConfiguration, acnvVar));
        adea adeaVar = this.j;
        ?? r2 = adeaVar.b;
        String a3 = this.b.a();
        Context context = (Context) r2.b();
        acrm acrmVar = (acrm) adeaVar.e.b();
        adih adihVar = (adih) adeaVar.c.b();
        str.getClass();
        instantMessageConfiguration.getClass();
        str2.getClass();
        optional.getClass();
        return new acsp(context, acrmVar, adihVar, adeaVar.a, a2, j, str, instantMessageConfiguration, acugVar, str2, optional, i, acnvVar, a3);
    }

    public final acsx b(long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, acug acugVar) {
        acnv d = this.c.d(false, str);
        return this.d.i(j, str, str2, fileTransferInfo, instantMessageConfiguration, acugVar, false, d, c().a(instantMessageConfiguration, d), this.b.b());
    }

    public final actk c() {
        if (((Boolean) a.a()).booleanValue()) {
            return (actk) this.i.b();
        }
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    public final acum d(long j, String str, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, String str2, int i) {
        acnv acnvVar = new acnv(this.c, str, 6);
        acth a2 = this.e.a(acnvVar, e().a(instantMessageConfiguration, acnvVar));
        adqg adqgVar = this.k;
        ?? r2 = adqgVar.c;
        String a3 = this.b.a();
        Context context = (Context) r2.b();
        str.getClass();
        instantMessageConfiguration.getClass();
        acrm acrmVar = (acrm) adqgVar.d.b();
        str2.getClass();
        return new acum(context, a2, j, str, instantMessageConfiguration, acugVar, acrmVar, str2, i, acnvVar, a3, adqgVar.a);
    }
}
