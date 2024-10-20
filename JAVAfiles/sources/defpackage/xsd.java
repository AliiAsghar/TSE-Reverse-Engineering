package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsd extends unp {
    public final xrw b;
    public final xoj c;
    public final xoe d;
    public String e = "";
    public final wyp f;
    private final anen i;
    private final anen j;
    private final via k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final yyt q;
    private static final utz g = uuh.e(uuh.b, "file_upload_max_retry_count", 5);
    private static final utz h = uuh.e(uuh.b, "file_upload_retry_delay_seconds", 10);
    public static final alwo a = alwo.o("BugleFileTransfer");

    public xsd(wyp wypVar, anen anenVar, anen anenVar2, via viaVar, xoj xojVar, xoe xoeVar, xrw xrwVar, armf armfVar, yyt yytVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.f = wypVar;
        this.b = xrwVar;
        this.i = anenVar;
        this.j = anenVar2;
        this.k = viaVar;
        this.c = xojVar;
        this.d = xoeVar;
        this.l = armfVar;
        this.q = yytVar;
        this.m = armfVar2;
        this.n = armfVar3;
        this.o = armfVar4;
        this.p = armfVar5;
    }

    public static xss j(qeq qeqVar, String str) {
        akrh e = aktp.e("FileUploadWorkHandler#newSendFileTransferResponse");
        try {
            xsr xsrVar = new xsr(null);
            xsrVar.c(qeqVar);
            xsrVar.c = rve.a(str);
            qep qepVar = qeqVar.c;
            if (qepVar == null) {
                qepVar = qep.a;
            }
            xsrVar.b(qepVar.f);
            xss a2 = xsrVar.a();
            e.close();
            return a2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(((Integer) g.e()).intValue());
        a2.c(unv.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        a2.h(Duration.ofSeconds(((Integer) h.e()).intValue()).toMillis());
        a2.g(gry.EXPONENTIAL);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        a2.b = this.k.a();
        return a2.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FileUploadWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        boolean z;
        xsb xsbVar = (xsb) apbtVar;
        this.e = xsbVar.g;
        alwo alwoVar = a;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(xod.a, this.e);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 162, "FileUploadWorkHandler.java")).q("File upload is starting via work scheduler.");
        xrz a2 = new pwd().apply(xsbVar);
        xot xotVar = (xot) this.o.b();
        if (((xot) this.o.b()).k(rvc.b(this.e))) {
            alwl alwlVar2 = (alwl) alwoVar.g();
            alwlVar2.X(xod.a, this.e);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 176, "FileUploadWorkHandler.java")).q("Upload has already a valid response, skipping and retry sending the XML.");
            return this.b.a(j((qeq) xotVar.g(rvc.b(this.e)).get(), xsbVar.c), Optional.empty()).h(new xqp(6), andi.a).f(Throwable.class, new vug((Object) this, (Object) unsVar, (Object) a2, (Object) xsbVar, 11), this.i);
        }
        alwl alwlVar3 = (alwl) alwoVar.g();
        alwlVar3.X(xod.a, this.e);
        ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 197, "FileUploadWorkHandler.java")).q("File upload is starting via work scheduler.");
        akrh e = aktp.e("FileUploadWorkHandler#uploadOrResume");
        try {
            qei qeiVar = xsbVar.l;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            if ((qeiVar.b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Cannot fetch auth token in the file transfer upload or resume path because a self-identity was not provided.");
            akul f = akul.g(((qdq) this.p.b()).t(qeiVar).a()).i(new vug(this, xsbVar, unsVar, a2, 12, null), this.i).e(aniq.class, new xqp(11), this.j).i(new vug(this, xsbVar, unsVar, a2, 13, null), this.i).f(Throwable.class, new vug((Object) this, (Object) unsVar, (Object) a2, (Object) xsbVar, 10), this.i);
            e.b(f);
            e.close();
            return f;
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
        return xsb.a.getParserForType();
    }

    public final akul k(uns unsVar, xrz xrzVar, String str, qei qeiVar, pwr pwrVar) {
        String str2;
        qfu qfuVar;
        qhl qhlVar;
        int i = unsVar.a().b;
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 356, "FileUploadWorkHandler.java")).J("File transfer failure: HTTP response code = %d, reason = %s, detailed error message = %s", Integer.valueOf(pwrVar.c), pwrVar.b, pwrVar.e());
        amro a2 = ((qar) this.l.b()).a(pwrVar);
        int i2 = i + 1;
        amrl d = pwrVar.d(i2, a2);
        Throwable th = (Throwable) pwrVar.f.orElse(null);
        amrn b = amrn.b(a2.c);
        if (b == null) {
            b = amrn.UNKNOWN_RETRY_TYPE;
        }
        if (!unsVar.c()) {
            ((alwl) ((alwl) ((alwl) alwoVar.i()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 412, "FileUploadWorkHandler.java")).q("File upload failed as max retry count has been exceeded.");
            str2 = str;
        } else {
            if (b != amrn.NO_RETRY) {
                ((alwl) ((alwl) ((alwl) alwoVar.i()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 418, "FileUploadWorkHandler.java")).q("File upload failed with a recoverable error, scheduling retry.");
                MessageCoreData r = ((rwd) this.m.b()).r(rve.a(str));
                if (r == null) {
                    alwl alwlVar = (alwl) alwoVar.i();
                    alwlVar.X(ydl.e, str);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "logUploadFailedWithRetryAttempt", 489, "FileUploadWorkHandler.java")).q("Failed to log retry attempt, message is missing from the database.");
                } else if (!pwrVar.e.isEmpty()) {
                    yyt yytVar = this.q;
                    aozy createBuilder = amrk.a.createBuilder();
                    String str3 = pwrVar.e;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amrk amrkVar = (amrk) createBuilder.b;
                    str3.getClass();
                    amrkVar.b |= 8;
                    amrkVar.f = str3;
                    yytVar.D(r, d, (amrk) createBuilder.s(), Optional.of(xrzVar));
                } else {
                    this.q.C(r, d, Optional.of(xrzVar));
                }
                amrn b2 = amrn.b(a2.c);
                if (b2 == null) {
                    b2 = amrn.UNKNOWN_RETRY_TYPE;
                }
                b2.getClass();
                int ordinal = b2.ordinal();
                boolean z = true;
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            qfuVar = qfu.RECOVERY_STRATEGY_REFRESH_REGISTRATION;
                        } else {
                            throw new IllegalArgumentException("unknown enum value: ".concat(b2.toString()));
                        }
                    } else {
                        qfuVar = qfu.RECOVERY_STRATEGY_REPROVISION;
                    }
                } else {
                    qfuVar = qfu.RECOVERY_STRATEGY_NONE;
                }
                qfuVar.getClass();
                ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 379, "FileUploadWorkHandler.java")).t("Applying recovery strategy [%s] before retrying.", qfuVar.name());
                qhj a3 = ((qhs) this.n.b()).a(qfuVar);
                if (qfuVar.equals(qfu.RECOVERY_STRATEGY_REFRESH_REGISTRATION)) {
                    if ((qeiVar.b & 2) == 0) {
                        z = false;
                    }
                    albo.U(z, "Self chat endpoint must contain id.");
                    qhlVar = new qhp(qeiVar);
                } else {
                    qhlVar = qhl.b;
                }
                return a3.a(qhlVar).i(new tuy(this, str, pwrVar, i2, 4), this.j);
            }
            ((alwl) ((alwl) ((alwl) alwoVar.i()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 423, "FileUploadWorkHandler.java")).q("File upload failed as the current failure cannot be recovered.");
            str2 = str;
        }
        return l(str2, pwrVar, i2);
    }

    public final akul l(String str, pwr pwrVar, int i) {
        int i2 = 11;
        if (pwrVar.f.isPresent() && (pwrVar.f.get() instanceof CancellationException)) {
            i2 = 5;
        }
        xrw xrwVar = this.b;
        alwl alwlVar = (alwl) xru.a.g();
        alwlVar.X(ydl.e, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadFailed", 166, "FileUploadCallbackHandler.java")).q("Upload failed callback is called.");
        FileTransferEvent fileTransferEvent = new FileTransferEvent(20013, 0L, i2, str);
        ProcessFileTransferAction b = ((xru) xrwVar).h.b(fileTransferEvent);
        rhl rhlVar = b.u;
        aozy createBuilder = amro.a.createBuilder();
        amrn amrnVar = amrn.NO_RETRY;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amro amroVar = (amro) createBuilder.b;
        amroVar.c = amrnVar.f;
        amroVar.b |= 1;
        rhlVar.t("key_failed_file_transfer_diagnostics", new ProtoParsers$InternalDontUse(null, pwrVar.d(i, (amro) createBuilder.s())));
        rhl rhlVar2 = b.u;
        aozy createBuilder2 = amrk.a.createBuilder();
        String str2 = pwrVar.e;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amrk amrkVar = (amrk) createBuilder2.b;
        str2.getClass();
        amrkVar.b |= 8;
        amrkVar.f = str2;
        rhlVar2.t("key_failed_file_transfer_details", new ProtoParsers$InternalDontUse(null, (amrk) createBuilder2.s()));
        alwl alwlVar2 = (alwl) xru.a.g();
        alwlVar2.X(ydl.e, str);
        alwlVar2.X(xod.g, fileTransferEvent);
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadFailed", 197, "FileUploadCallbackHandler.java")).q("Invoking ProcessFileTransferAction.");
        return b.q().h(new xqp(10), andi.a);
    }

    @Override // defpackage.unp, defpackage.unx
    public final String r() {
        return "FileUploadWorkHandler";
    }
}
