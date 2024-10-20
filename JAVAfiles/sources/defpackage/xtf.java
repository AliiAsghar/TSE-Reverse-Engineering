package defpackage;

import android.util.Base64;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtf {
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/transfer/uploads/UploaderCommon");
    public final anen a;
    public final anen b;
    public final xrs c;
    public final apvm d;
    public final apvm e;
    public final armf f;
    private final anen h;
    private final armf i;
    private final armf j;
    private final znj k;

    public xtf(anen anenVar, anen anenVar2, anen anenVar3, xrs xrsVar, apvm apvmVar, armf armfVar, znj znjVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.a = anenVar;
        this.b = anenVar2;
        this.h = anenVar3;
        this.c = xrsVar;
        this.d = apvmVar;
        this.e = (apvm) armfVar.b();
        this.f = armfVar2;
        this.j = armfVar3;
        this.k = znjVar;
        this.i = armfVar4;
    }

    public static String e(aqhu aqhuVar) {
        return Base64.encodeToString(aqhuVar.toByteArray(), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final qep g(aqhy aqhyVar, Optional optional, Optional optional2) {
        int i;
        ContentType contentType = (ContentType) optional2.orElse(ContentType.d("application/vnd.gsma.rcs-ft-http+xml"));
        aozy createBuilder = qep.a.createBuilder();
        String str = (String) optional.orElse("");
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qep qepVar = (qep) createBuilder.b;
        str.getClass();
        qepVar.c = str;
        long j = aqhyVar.d;
        if (j > 2147483647L) {
            alvw i2 = g.i();
            i2.X(alwp.a, "BugleFileTransfer");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/transfer/uploads/UploaderCommon", "convertSizeBytes", 258, "UploaderCommon.java")).s("Uploaded file of size %d, which is larger than can be stored in FileInformation.size_bytes, int32 max (~2.15 gb).", j);
            i = Integer.MAX_VALUE;
        } else {
            i = (int) j;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((qep) createBuilder.b).d = i;
        qel qelVar = (qel) new pwb().m().fu(contentType);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qep qepVar2 = (qep) apagVar;
        qelVar.getClass();
        qepVar2.e = qelVar;
        qepVar2.b |= 1;
        String str2 = aqhyVar.b;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qep qepVar3 = (qep) createBuilder.b;
        str2.getClass();
        qepVar3.f = str2;
        apct apctVar = aqhyVar.c;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qep qepVar4 = (qep) createBuilder.b;
        apctVar.getClass();
        qepVar4.g = apctVar;
        qepVar4.b |= 2;
        return (qep) createBuilder.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final apvl h(long j) {
        if (j > 0) {
            apvk apvkVar = new apvk();
            apvkVar.a = xoo.c().b;
            apvkVar.b = j;
            return new apvl(apvkVar);
        }
        apvk apvkVar2 = new apvk();
        apvkVar2.a = xoo.c().b;
        return new apvl(apvkVar2);
    }

    public final long a(apus apusVar) {
        if (((pem) this.j.b()).a() && apusVar.e() <= 0) {
            return 104857600L;
        }
        return apusVar.e();
    }

    public final akuk b(xrz xrzVar, xte xteVar) {
        return akuk.b(new xtc(this, xteVar, xrzVar, 0), this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul c(final aqhu aqhuVar, final apus apusVar, final Optional optional, final Optional optional2, final aozb aozbVar, final String str, final long j) {
        return aktp.ai(new Callable() { // from class: xtb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xtf xtfVar = xtf.this;
                boolean a = ((ogb) xtfVar.f.b()).a();
                Optional optional3 = optional;
                apus apusVar2 = apusVar;
                long j2 = j;
                String str2 = str;
                Optional optional4 = optional2;
                aozb aozbVar2 = aozbVar;
                aqhu aqhuVar2 = aqhuVar;
                if (a && apusVar2 != null && xtfVar.a(apusVar2) > 0 && xtfVar.a(apusVar2) <= j2) {
                    return xtfVar.e.b(str2, xtfVar.d(optional3, optional4, xtfVar.a(apusVar2), aozbVar2), apusVar2, xtf.e(aqhuVar2), xtf.h(j2));
                }
                return xtfVar.d.b(str2, xtfVar.d(optional3, optional4, xtfVar.a(apusVar2), aozbVar2), apusVar2, xtf.e(aqhuVar2), xtf.h(j2));
            }
        }, this.h);
    }

    public final apuu d(Optional optional, Optional optional2, long j, aozb aozbVar) {
        apuu apuuVar = new apuu();
        apuuVar.e("X-Goog-Upload-Header-Content-Length", Long.toString(j));
        apuuVar.e("X-Goog-Upload-Header-Content-Type", (String) optional.map(new xos(11)).orElse("application/vnd.gsma.rcs-ft-http+xml"));
        apuuVar.e("X-Goog-Upload-File-Name", (String) optional2.orElse(""));
        apuuVar.d("Authorization", "Bearer ".concat(String.valueOf(Base64.encodeToString(aozbVar.H(), 2))));
        apuuVar.d("Upload-Type", "TG");
        if (!((String) this.i.b()).isEmpty()) {
            apuuVar.d("Cookie", (String) this.i.b());
        }
        return apuuVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final void f(pzn pznVar, apvh apvhVar, apus apusVar, xoj xojVar) {
        long a = a(apusVar);
        xojVar.getClass();
        pznVar.getClass();
        znj znjVar = this.k;
        anen anenVar = (anen) znjVar.b.b();
        anenVar.getClass();
        apvhVar.h(new xsu(xojVar, znjVar.a, pznVar, a, anenVar), xoo.b(), (int) apdp.a(apdp.c(((Long) xoo.a.e()).longValue())));
    }
}
