package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqq extends unp {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public static final utz b = uuh.e(uuh.b, "file_download_failed_handler_max_retry", 3);
    public static final utz c = uuh.e(uuh.b, "file_download_failed_handler_retry_delay", 2000);
    public final anen d;
    public final anen e;
    public final armf f;
    public final Optional g;
    public final armf h;
    public final kkc i;
    private final xrg j;
    private final armf k;

    public xqq(anen anenVar, anen anenVar2, armf armfVar, xrg xrgVar, Optional optional, armf armfVar2, kkc kkcVar, armf armfVar3) {
        this.d = anenVar;
        this.e = anenVar2;
        this.f = armfVar;
        this.j = xrgVar;
        this.g = optional;
        this.k = armfVar2;
        this.i = kkcVar;
        this.h = armfVar3;
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
        return aktp.e("FileDownloadFailedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final xqr xqrVar = (xqr) apbtVar;
        rve a2 = rve.a(xqrVar.c);
        akul i = this.j.a(a2).i(new ancs() { // from class: xqo
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v28, types: [qaq] */
            /* JADX WARN: Type inference failed for: r14v48 */
            /* JADX WARN: Type inference failed for: r14v49 */
            /* JADX WARN: Type inference failed for: r14v50 */
            /* JADX WARN: Type inference failed for: r14v51 */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                ?? r14;
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return aktp.ag(upm.d());
                }
                MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.ck()) {
                    alwl alwlVar = (alwl) xqq.a.g();
                    alwlVar.X(ydl.p, messageCoreData.z());
                    alwlVar.X(ydl.b, messageCoreData.B());
                    alwlVar.X(ydl.f, messageCoreData.E());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "processPendingWorkItemAsync", 132, "FileDownloadFailedHandler.java")).q("Message has already finished downloading. Skipping failure handler.");
                    return aktp.ag(upm.b());
                }
                xqr xqrVar2 = xqrVar;
                xqq xqqVar = xqq.this;
                if (((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
                    amgu amguVar = xqrVar2.e;
                    if (amguVar == null) {
                        amguVar = amgu.a;
                    }
                    amrl amrlVar = amguVar.an;
                    if (amrlVar == null) {
                        amrlVar = amrl.a;
                    }
                    String str = xqrVar2.f;
                    long a3 = messageCoreData.a();
                    long longValue = ((Long) xqqVar.h.b()).longValue();
                    aozy builder = amrlVar.toBuilder();
                    int a4 = messageCoreData.a() + 1;
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    amrl amrlVar2 = (amrl) builder.b;
                    amrlVar2.b |= 16;
                    amrlVar2.i = a4;
                    if (a3 >= longValue) {
                        aozy createBuilder = amro.a.createBuilder();
                        amrn amrnVar = amrn.NO_RETRY;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amro amroVar = (amro) createBuilder.b;
                        amroVar.c = amrnVar.f;
                        amroVar.b |= 1;
                        amro amroVar2 = (amro) createBuilder.s();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        amrl amrlVar3 = (amrl) builder.b;
                        amroVar2.getClass();
                        amrlVar3.h = amroVar2;
                        amrlVar3.b |= 8;
                    }
                    xqqVar.j(messageCoreData, (amrl) builder.s(), str);
                    amro amroVar3 = ((amrl) builder.b).h;
                    if (amroVar3 == null) {
                        amroVar3 = amro.a;
                    }
                    alwl alwlVar2 = (alwl) xqq.a.g();
                    alwlVar2.X(ydl.f, messageCoreData.E());
                    alwl alwlVar3 = (alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "executeRetryStrategy", 187, "FileDownloadFailedHandler.java");
                    amrn b2 = amrn.b(amroVar3.c);
                    if (b2 == null) {
                        b2 = amrn.UNKNOWN_RETRY_TYPE;
                    }
                    alwlVar3.C("Executing retry strategy [%s] for failed file download after a delay %d seconds.", b2, amroVar3.d);
                    kkc kkcVar = xqqVar.i;
                    amrn b3 = amrn.b(amroVar3.c);
                    if (b3 == null) {
                        b3 = amrn.UNKNOWN_RETRY_TYPE;
                    }
                    int ordinal = b3.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                r14 = ((kkg) kkcVar.b).e(Duration.ZERO, xqqVar);
                            } else {
                                r14 = kkcVar.c;
                            }
                        } else {
                            r14 = ((kkg) kkcVar.b).e(Duration.ofSeconds(amroVar3.d), xqqVar);
                        }
                    } else {
                        r14 = kkcVar.a;
                    }
                    return r14.a(messageCoreData).h(new xqp(0), xqqVar.d);
                }
                amgu amguVar2 = xqrVar2.e;
                if (amguVar2 == null) {
                    amguVar2 = amgu.a;
                }
                String str2 = xqrVar2.f;
                if (messageCoreData.j() == 105) {
                    alwl alwlVar4 = (alwl) xqq.a.g();
                    alwlVar4.X(ydl.p, messageCoreData.z());
                    alwlVar4.X(ydl.b, messageCoreData.B());
                    alwlVar4.X(ydl.f, messageCoreData.E());
                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "updateMessageFailedInDb", 206, "FileDownloadFailedHandler.java")).q("Message failed in auto download state. Updating message to manual download state.");
                    messageCoreData.bI(101);
                } else {
                    alwl alwlVar5 = (alwl) xqq.a.g();
                    alwlVar5.X(ydl.p, messageCoreData.z());
                    alwlVar5.X(ydl.b, messageCoreData.B());
                    alwlVar5.X(ydl.f, messageCoreData.E());
                    ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "updateMessageFailedInDb", 214, "FileDownloadFailedHandler.java")).q("Message failed in manual download state. Updating message to download failed state.");
                    messageCoreData.bI(106);
                }
                xqqVar.g.ifPresent(new xpw(messageCoreData, 4));
                return aktp.ai(new xfb(xqqVar, messageCoreData, 7), xqqVar.e).h(new wua(xqqVar, messageCoreData, amguVar2, str2, 4), xqqVar.e);
            }
        }, this.e);
        if (((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
            return i;
        }
        return i.f(xpt.class, new xfn(a2, 8), this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return xqr.a.getParserForType();
    }

    public final void j(MessageCoreData messageCoreData, amrl amrlVar, String str) {
        xqc xqcVar = (xqc) this.k.b();
        xqcVar.b(messageCoreData, "Bugle.Download.Failure.Attachment.Size.Bucket.Rcs");
        xqcVar.e(messageCoreData, 7, new iqp(xqcVar, amrlVar, str, 13, (char[]) null));
    }
}
