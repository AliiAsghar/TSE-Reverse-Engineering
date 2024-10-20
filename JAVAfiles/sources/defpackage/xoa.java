package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xoa {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final anen b;
    public final xot c;
    private final anen d;
    private final zxy e;

    public xoa(anen anenVar, anen anenVar2, xot xotVar, zxy zxyVar) {
        this.d = anenVar;
        this.b = anenVar2;
        this.c = xotVar;
        this.e = zxyVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    public final akul a(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xov xovVar = (xov) it.next();
            Optional optional = xovVar.a;
            Optional optional2 = xovVar.b;
            if (xovVar.a()) {
                if (qkv.d.contains(Integer.valueOf(xovVar.a.get().j()))) {
                    xpg n = ((xow) optional2.get()).n();
                    alwo alwoVar = a;
                    alvw m = alwoVar.m();
                    m.X(ydl.a, optional.get().B().a());
                    m.X(xod.a, ((xow) optional2.get()).p());
                    ((alwl) m.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfers", 125, "CancelFileTransferHelper.java")).t("Attempting to cancel ongoing file transfer. Transfer type: %s", n);
                    if (xpg.UPLOAD.equals(n)) {
                        Object obj = optional2.get();
                        xsf A = this.e.A();
                        String p = ((xow) obj).p();
                        p.getClass();
                        alobVar.h(A.a(p).h(new xqi(obj, 1), this.d));
                    } else if (xpg.DOWNLOAD.equals(n)) {
                        Object obj2 = optional2.get();
                        xpz z = this.e.z();
                        String p2 = ((xow) obj2).p();
                        p2.getClass();
                        alobVar.h(z.b(p2).h(new xeu(obj2, 20), this.d));
                    } else {
                        alwl alwlVar = (alwl) alwoVar.i();
                        alwlVar.X(ydl.a, optional.get().B().a());
                        alwlVar.X(xod.a, ((xow) optional2.get()).p());
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfers", 140, "CancelFileTransferHelper.java")).t("Transfer type not supported while trying to cancel ongoing file transfer: %s", n);
                    }
                }
            }
            alvw m2 = a.m();
            m2.X(ydl.a, optional.get().B().a());
            m2.X(xod.a, ((xow) optional2.get()).p());
            ((alwl) m2.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfers", 116, "CancelFileTransferHelper.java")).q("Message is not sending or downloading. Skipping cancelling upload/download.");
        }
        return aktp.ak(alobVar.g()).h(new xgu(17), this.d);
    }
}
