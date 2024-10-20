package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpy {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final anen b;
    public final armf c;
    public final armf d;
    private final anen e;
    private final armf f;

    public xpy(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = anenVar;
        this.e = anenVar2;
        this.f = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    public static xpv a(FileInformation fileInformation, aozb aozbVar, String str, Optional optional) {
        xpk xpkVar = new xpk();
        aozy createBuilder = xpv.a.createBuilder();
        String i = fileInformation.i();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        xpv xpvVar = (xpv) apagVar;
        int i2 = 2;
        xpvVar.b |= 2;
        xpvVar.d = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        xpv xpvVar2 = (xpv) apagVar2;
        str.getClass();
        xpvVar2.b |= 8;
        xpvVar2.f = str;
        int a2 = fileInformation.a();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        xpv xpvVar3 = (xpv) apagVar3;
        xpvVar3.b |= 32;
        xpvVar3.h = a2;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        xpv xpvVar4 = (xpv) createBuilder.b;
        xpvVar4.b |= 16;
        xpvVar4.g = aozbVar;
        fileInformation.h().ifPresent(new xpw(createBuilder, 0));
        optional.ifPresent(new xpw(createBuilder, i2));
        xpu xpuVar = (xpu) xpkVar.fu((ajqd) fileInformation.g().orElse(ajqd.FILE));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xpv xpvVar5 = (xpv) createBuilder.b;
        xpvVar5.c = xpuVar.c;
        xpvVar5.b |= 1;
        return (xpv) createBuilder.s();
    }

    public final akul b(MessageIdType messageIdType, String str, FileInformation fileInformation, aozb aozbVar) {
        xpv a2 = a(fileInformation, aozbVar, str, Optional.empty());
        akrh e = aktp.e("FileDownloadWorker::scheduleAsync");
        try {
            akul aj = aktp.aj(new ttt(this, messageIdType, str, fileInformation, aozbVar, a2, 3), this.b);
            e.b(aj);
            e.close();
            return aj;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    public final akul c(xpv xpvVar) {
        String str = xpvVar.f;
        return ((uof) ((hgj) this.f.b()).a.b()).b(upk.b("file_download", xpvVar, new uta(null, null, null, str, null, null))).i(new xdg(9), this.e).h(new xpm(str, xpvVar, 2), this.b);
    }
}
