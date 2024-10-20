package defpackage;

import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mzn implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [mjb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v35, types: [psz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object mtwVar;
        Object mtwVar2;
        int i = 3;
        boolean z = false;
        int i2 = 1;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                adlx I = ((mzs) this.a).a.I();
                if (obj instanceof mts) {
                    sxx g = I.g();
                    Object obj2 = I.b;
                    sxy d = MessagesTable.d();
                    d.w("countItemsAfterKeyQuery");
                    d.s();
                    d.n(new agpl("COUNT(*)"), "cpt");
                    d.g(new mut(I, (mts) obj, i2));
                    sxx b = ((akip) obj2).b(d).b();
                    sxy d2 = MessagesTable.d();
                    d2.w("+countItemsAfterKeyAndTotalQuery");
                    d2.s();
                    d2.n(I.h(g), "total");
                    d2.n(I.h(b), "subtotal");
                    d2.u(1);
                    agmq n = d2.b().n();
                    try {
                        sxt sxtVar = (sxt) n;
                        if (!sxtVar.moveToNext()) {
                            mtwVar = I.c;
                            armd.i(n, null);
                        } else {
                            String cX = sxtVar.cX("total");
                            cX.getClass();
                            long parseLong = Long.parseLong(cX);
                            String cX2 = sxtVar.cX("subtotal");
                            cX2.getClass();
                            mtwVar = new mtw(parseLong, Long.parseLong(cX2), I, 1);
                            armd.i(n, null);
                        }
                        return mtwVar;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                throw new IllegalStateException("Check failed.");
            case 1:
                Object obj3 = this.b;
                mmw mmwVar = (mmw) obj3;
                return (alog) mmwVar.l.c("GetOrCreateConversationAction#syncParticipantsWithDatabase", new fgh(obj3, ((rtz) mmwVar.h.b()).C((alog) this.a), 10, bArr));
            case 2:
                Object obj4 = this.b;
                adlx I2 = ((mzs) this.a).a.I();
                if (obj4 instanceof mts) {
                    agmq n2 = I2.f((mts) obj4).n();
                    try {
                        sxt sxtVar2 = (sxt) n2;
                        if (!sxtVar2.moveToNext()) {
                            mtwVar2 = I2.c;
                            armd.i(n2, null);
                        } else {
                            String cX3 = sxtVar2.cX("total");
                            cX3.getClass();
                            long parseLong2 = Long.parseLong(cX3);
                            String cX4 = sxtVar2.cX("subtotal");
                            cX4.getClass();
                            mtwVar2 = new mtw(Long.parseLong(cX4), I2, parseLong2, 0);
                            armd.i(n2, null);
                        }
                        return mtwVar2;
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            case 3:
                ?? r0 = this.b;
                mzs mzsVar = (mzs) this.a;
                return mzsVar.i(r0, mzsVar.a.E(r0));
            case 4:
                ?? r02 = this.b;
                adlx I3 = ((mzs) this.a).a.I();
                if (r02 instanceof mts) {
                    agmq n3 = I3.f((mts) r02).n();
                    try {
                        sxt sxtVar3 = (sxt) n3;
                        if (!sxtVar3.moveToNext()) {
                            Object obj5 = I3.c;
                            armd.i(n3, null);
                            return obj5;
                        }
                        String cX5 = sxtVar3.cX("total");
                        cX5.getClass();
                        long parseLong3 = Long.parseLong(cX5);
                        String cX6 = sxtVar3.cX("subtotal");
                        cX6.getClass();
                        mtu mtuVar = new mtu(r02, Long.parseLong(cX6), I3, parseLong3);
                        armd.i(n3, null);
                        return mtuVar;
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            case 5:
                return ((rtz) ((ncz) this.b).g.b()).F(this.a.z()).map(new ncy(0 == true ? 1 : 0));
            case 6:
                alwl alwlVar = (alwl) DefaultRecipient.a.g();
                DefaultRecipient defaultRecipient = (DefaultRecipient) this.b;
                alwlVar.X(ydl.C, defaultRecipient.q());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "getRcsCapabilitiesLegacy", 709, "DefaultRecipient.java")).q("Retrieving Cached RCS Capabilities.");
                return this.a.f(defaultRecipient.c);
            case 7:
                if (true != ((mjq) this.b).g) {
                    i = 0;
                }
                nfq nfqVar = (nfq) this.a;
                if (((yaq) nfqVar.b.a()).a(i, nfqVar.b()) == yay.AVAILABLE) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                nhm nhmVar = (nhm) this.a;
                MediaPlayer mediaPlayer = nhmVar.g;
                if (mediaPlayer != null) {
                    mediaPlayer.setDataSource(nhmVar.a, (Uri) this.b);
                    nhmVar.g.prepare();
                }
                return null;
            case 9:
                return ((prd) this.b).b((String) this.a);
            case 10:
                xyo a = prk.a.a();
                a.H("Checking for pre-existing business info...");
                Object obj6 = this.a;
                a.z("RBM bot id", obj6);
                a.q();
                return (Boolean) teh.c((String) obj6, new mut(this.b, obj6, 6, bArr), new ngq(obj6, i));
            case 11:
                xyo c = prk.a.c();
                c.H("Beginning download for ".concat((String) this.b));
                c.z("url", this.a);
                c.q();
                return true;
            case 12:
                return ((ptb) this.a).b.f(this.b);
            case 13:
                ((lgg) ((nej) this.b).a).g(new ptf(this.a, 0 == true ? 1 : 0));
                return null;
            case 14:
                return ((pur) this.b).c.forceRefreshCapabilities((String) this.a);
            case 15:
                ConcurrentHashMap concurrentHashMap = ((pye) this.b).c;
                Object obj7 = this.a;
                pwz pwzVar = (pwz) concurrentHashMap.remove(obj7);
                if (pwzVar == null) {
                    alwl alwlVar2 = (alwl) pye.a.i();
                    alwlVar2.X(xod.a, obj7);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "pause", 217, "CronetFileDownloader.java")).q("Could not find ongoing file download to pause.");
                    return false;
                }
                pwq a2 = pwr.a();
                a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION);
                pwzVar.a(pwzVar.h, new pwj(a2.a()));
                alwl alwlVar3 = (alwl) pye.a.g();
                alwlVar3.X(xod.a, obj7);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "pause", 221, "CronetFileDownloader.java")).q("Paused ongoing file download.");
                return true;
            case 16:
                return Boolean.valueOf(((rwd) ((qan) this.b).b.b()).N(this.a));
            case 17:
                return Boolean.valueOf(((rwd) ((qap) this.b).a.b()).N(this.a));
            case 18:
                return ((rtz) ((qbq) this.b).d.b()).K((ConversationIdType) this.a);
            case 19:
                alwo alwoVar = qbq.a;
                sng sngVar = new sng();
                sngVar.aj("setConversationErrorState");
                sngVar.s((qpd) this.b);
                if (sngVar.e((ConversationIdType) this.a)) {
                    return upm.b();
                }
                return upm.d();
            default:
                apct apctVar = ((qfc) this.b).c;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                Object obj8 = this.a;
                Instant l = aotl.l(apctVar);
                aiut.b();
                sng sngVar2 = new sng();
                sngVar2.ag();
                sngVar2.aj("updateRcsGroupLastSyncTimestamp");
                sngVar2.L(Optional.of(l));
                if (sngVar2.e((ConversationIdType) obj8)) {
                    return upm.b();
                }
                return upm.d();
        }
    }

    public /* synthetic */ mzn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
