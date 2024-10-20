package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pyj extends unp {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final xps b;
    public final xoe c;
    private final anen d;
    private final via e;
    private final pyk f;
    private final xoj g;

    public pyj(via viaVar, anen anenVar, pyk pykVar, xoj xojVar, xps xpsVar, xoe xoeVar) {
        this.e = viaVar;
        this.d = anenVar;
        this.f = pykVar;
        this.g = xojVar;
        this.b = xpsVar;
        this.c = xoeVar;
    }

    private final akul j(final xpv xpvVar, Optional optional, Optional optional2) {
        return this.f.a(xpvVar.d, xpvVar.h, xpvVar.f, optional, optional2).i(new ancs() { // from class: pyi
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                pyg pygVar = (pyg) obj;
                int b = pygVar.b();
                final xpv xpvVar2 = xpvVar;
                pyj pyjVar = pyj.this;
                if (b == 1) {
                    xps xpsVar = pyjVar.b;
                    final Uri c = pygVar.c();
                    alwl alwlVar = (alwl) xpn.a.g();
                    alwlVar.X(xod.a, xpvVar2.f);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadSucceeded", 80, "BugleFileDownloadCallbackHandler.java")).q("Download succeeded callback is called.");
                    try {
                        final xqn a2 = xpn.a(xpvVar2.g);
                        final xpn xpnVar = (xpn) xpsVar;
                        return aktp.ah(new Runnable() { // from class: xpl
                            /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                xpv xpvVar3 = xpvVar2;
                                xpu b2 = xpu.b(xpvVar3.c);
                                if (b2 == null) {
                                    b2 = xpu.FILE;
                                }
                                xqn xqnVar = a2;
                                Uri uri = c;
                                xpn xpnVar2 = xpn.this;
                                if (b2 == xpu.FILE) {
                                    String str = xqnVar.b;
                                    aozy createBuilder = xqm.a.createBuilder();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apag apagVar = createBuilder.b;
                                    xqm xqmVar = (xqm) apagVar;
                                    str.getClass();
                                    xqmVar.b |= 1;
                                    xqmVar.c = str;
                                    String str2 = xpvVar3.e;
                                    if (!apagVar.isMutable()) {
                                        createBuilder.u();
                                    }
                                    xqm xqmVar2 = (xqm) createBuilder.b;
                                    str2.getClass();
                                    xqmVar2.b |= 4;
                                    xqmVar2.e = str2;
                                    String uri2 = uri.toString();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apag apagVar2 = createBuilder.b;
                                    xqm xqmVar3 = (xqm) apagVar2;
                                    uri2.getClass();
                                    xqmVar3.b |= 2;
                                    xqmVar3.d = uri2;
                                    long j = xpvVar3.h;
                                    if (!apagVar2.isMutable()) {
                                        createBuilder.u();
                                    }
                                    xqm xqmVar4 = (xqm) createBuilder.b;
                                    xqmVar4.b |= 8;
                                    xqmVar4.f = j;
                                    amxo n = ((hgj) xpnVar2.e.b()).n();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    xqm xqmVar5 = (xqm) createBuilder.b;
                                    xqmVar5.g = n.h;
                                    xqmVar5.b |= 16;
                                    xqm xqmVar6 = (xqm) createBuilder.s();
                                    alwl alwlVar2 = (alwl) xpn.a.g();
                                    alwlVar2.X(xod.a, xpvVar3.f);
                                    alwlVar2.X(ydl.e, str);
                                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "invokeFilePostDownload", 177, "BugleFileDownloadCallbackHandler.java")).q("File download completed is queued.");
                                    ((xcs) xpnVar2.f.b()).o(xqnVar.b, new ahka("ToOnInvokeFilePostDownload"), xcr.TACHYGRAM_MESSAGE_ARRIVED);
                                    ((uof) ((vyv) xpnVar2.b.b()).a.b()).a(upk.a("file_download_completed", xqmVar6));
                                    return;
                                }
                                ((xcs) xpnVar2.f.b()).o(xqnVar.b, new ahka("ToOnInvokeThumbnailPostDownload"), xcr.TACHYGRAM_MESSAGE_ARRIVED);
                                aozy createBuilder2 = xrn.a.createBuilder();
                                String str3 = xqnVar.b;
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                apag apagVar3 = createBuilder2.b;
                                str3.getClass();
                                ((xrn) apagVar3).b = str3;
                                String str4 = xpvVar3.e;
                                if (!apagVar3.isMutable()) {
                                    createBuilder2.u();
                                }
                                xrn xrnVar = (xrn) createBuilder2.b;
                                str4.getClass();
                                xrnVar.d = str4;
                                String uri3 = uri.toString();
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                xrn xrnVar2 = (xrn) createBuilder2.b;
                                uri3.getClass();
                                xrnVar2.c = uri3;
                                ((vyv) xpnVar2.c.b()).u((xrn) createBuilder2.s());
                                alwl alwlVar3 = (alwl) xpn.a.g();
                                alwlVar3.X(ydl.e, xqnVar.b);
                                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "invokeThumbnailPostDownload", 199, "BugleFileDownloadCallbackHandler.java")).q("Thumbnail download completed is queued.");
                            }
                        }, xpnVar.g);
                    } catch (xpt e) {
                        return aktp.af(e);
                    }
                }
                if (pygVar.b() == 3) {
                    String str = xpvVar2.f;
                    ((alwl) ((alwl) ((alwl) pyj.a.g()).g(pygVar.d())).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/FileDownloadWorkHandler", "download", 119, "FileDownloadWorkHandler.java")).t("Auto paused downloadId: %s", str);
                    return pyjVar.c.a(str);
                }
                pwr a3 = pygVar.a();
                if (a3.b.equals(xoc.FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION)) {
                    return pyjVar.c.b(xpvVar2.f);
                }
                xps xpsVar2 = pyjVar.b;
                try {
                    xqn a4 = xpn.a(xpvVar2.g);
                    xpn xpnVar2 = (xpn) xpsVar2;
                    amro a5 = xpnVar2.h.a(a3);
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    amxo n = ((hgj) xpnVar2.e.b()).n();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar = (amgu) amglVar.b;
                    amguVar.aa = n.h;
                    amguVar.c |= 2097152;
                    amrl c2 = a3.c(a5);
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar2 = (amgu) amglVar.b;
                    c2.getClass();
                    amguVar2.an = c2;
                    amguVar2.d |= 4;
                    amgu amguVar3 = (amgu) amglVar.s();
                    aozy createBuilder = xqr.a.createBuilder();
                    String str2 = a4.b;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    xqr xqrVar = (xqr) apagVar;
                    str2.getClass();
                    xqrVar.b = 1 | xqrVar.b;
                    xqrVar.c = str2;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    xqr xqrVar2 = (xqr) apagVar2;
                    amguVar3.getClass();
                    xqrVar2.e = amguVar3;
                    xqrVar2.b |= 4;
                    String str3 = xpvVar2.d;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    xqr xqrVar3 = (xqr) createBuilder.b;
                    str3.getClass();
                    xqrVar3.b |= 8;
                    xqrVar3.f = str3;
                    xqr xqrVar4 = (xqr) createBuilder.s();
                    xpu b2 = xpu.b(xpvVar2.c);
                    if (b2 == null) {
                        b2 = xpu.FILE;
                    }
                    if (b2.equals(xpu.THUMBNAIL)) {
                        alwl alwlVar2 = (alwl) xpn.a.g();
                        alwlVar2.X(ydl.e, xqrVar4.c);
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadFailed", 131, "BugleFileDownloadCallbackHandler.java")).q("Thumbnail download failed.");
                        return aktp.ag(null);
                    }
                    return ((vyv) xpnVar2.d.b()).v(xqrVar4).h(new xpm(xqrVar4, a3, 0), xpnVar2.g);
                } catch (xpt e2) {
                    return aktp.af(e2);
                }
            }
        }, this.d).h(new psf(15), andi.a);
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        a2.b = this.e.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FileDownloadWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        Optional empty;
        xpv xpvVar = (xpv) apbtVar;
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(xod.a, xpvVar.f);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/FileDownloadWorkHandler", "processPendingWorkItemAsync", 76, "FileDownloadWorkHandler.java")).q("File download is starting via work scheduler.");
        Optional filter = Optional.of(xpvVar.i).filter(new nfp(4));
        xpu b = xpu.b(xpvVar.c);
        if (b == null) {
            b = xpu.FILE;
        }
        if (b.equals(xpu.FILE)) {
            empty = Optional.of(this.g);
        } else {
            empty = Optional.empty();
        }
        xpu b2 = xpu.b(xpvVar.c);
        if (b2 == null) {
            b2 = xpu.FILE;
        }
        if (!b2.equals(xpu.FILE)) {
            return j(xpvVar, empty, filter);
        }
        akrh e = aktp.e("HttpFileDownloader::download");
        try {
            akul j = j(xpvVar, empty, filter);
            e.b(j);
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.unx
    public final apca e() {
        return xpv.a.getParserForType();
    }

    @Override // defpackage.unp, defpackage.unx
    public final String r() {
        return "FileDownloadWorkHandler";
    }
}
