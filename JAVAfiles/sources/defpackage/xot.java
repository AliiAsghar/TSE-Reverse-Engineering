package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xot {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public static final utz b = uuh.f(uuh.b, "min_file_upload_validity", 86400000);
    public final agnq c;
    public final xnv d;
    private final armf e;
    private final anen f;

    public xot(anen anenVar, agnq agnqVar, armf armfVar, xnv xnvVar) {
        this.f = anenVar;
        this.c = agnqVar;
        this.e = armfVar;
        this.d = xnvVar;
    }

    public static alog d(final Instant instant, final int i, int i2, final Duration duration) {
        sya syaVar = new sya();
        syaVar.aj("updateMessagesForAutoResume");
        syaVar.P(new Function() { // from class: xor
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo416andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                syc sycVar = (syc) obj;
                alwo alwoVar = xot.a;
                sycVar.M(i);
                sycVar.U(new agoi("messages.raw_status", 1, 10007));
                sycVar.U(new agoi("messages.received_timestamp", 9, Long.valueOf(instant.minus(duration).toEpochMilli())));
                return sycVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        syaVar.L(i2);
        syaVar.G(instant.toEpochMilli());
        syaVar.u(0);
        Stream map = Collection.EL.stream(syaVar.a().b()).map(new xos(1));
        int i3 = alog.d;
        return (alog) map.collect(alls.a);
    }

    public static Optional e(MessageIdType messageIdType) {
        return (Optional) xpf.d(messageIdType, new xos(2), new wxx(messageIdType, 7));
    }

    public final xov a(MessageIdType messageIdType) {
        xou xouVar = new xou((byte[]) null);
        MessageCoreData u = ((rwd) this.e.b()).u(messageIdType);
        if (u != null) {
            xouVar.c(u);
            Optional e = e(messageIdType);
            if (!e.isEmpty()) {
                xouVar.b((xow) e.get());
                return xouVar.a();
            }
        }
        return xouVar.a();
    }

    public final xov b(String str, Optional optional) {
        MessageCoreData messageCoreData = null;
        xou xouVar = new xou((byte[]) null);
        Optional f = f(str, optional);
        if (f.isEmpty()) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(xod.a, str);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferMessageCoreData", 174, "FileTransferDatabaseOperations.java")).t("No FileTransferData entry found. %s", optional);
            return xouVar.a();
        }
        xouVar.b((xow) f.get());
        xow xowVar = (xow) f.get();
        MessageCoreData q = ((rwd) this.e.b()).q(xowVar.m());
        if (q == null) {
            alwl alwlVar2 = (alwl) a.g();
            alwlVar2.X(ydl.a, xowVar.m().a());
            alwlVar2.X(xod.a, xowVar.p());
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getMessageCoreData", 218, "FileTransferDatabaseOperations.java")).q("No MessageCoreData entry found.");
        } else {
            alwl alwlVar3 = (alwl) a.g();
            alwlVar3.X(ydl.a, q.B().a());
            alwlVar3.X(xod.a, xowVar.p());
            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getMessageCoreData", 226, "FileTransferDatabaseOperations.java")).q("MessageCoreData entry found.");
            messageCoreData = q;
        }
        if (messageCoreData == null) {
            alwl alwlVar4 = (alwl) a.g();
            alwlVar4.X(xod.a, str);
            ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferMessageCoreData", 184, "FileTransferDatabaseOperations.java")).q("MessageCoreData null.");
            return xouVar.a();
        }
        xouVar.c(messageCoreData);
        return xouVar.a();
    }

    public final akul c(String str, Optional optional) {
        return aktp.ai(new rbn((Object) this, str, (Object) optional, 18), this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional f(String str, Optional optional) {
        xpe xpeVar = new xpe();
        xpeVar.c(str);
        boolean z = true;
        optional.ifPresent(new xpw(xpeVar, true ? 1 : 0));
        xpc c = xpf.c();
        c.w("+getFileTransferBindData-file_transfer1");
        c.d(xpeVar);
        alog cR = ((xoz) c.b().n()).cR();
        if (((alsx) cR).c == 1) {
            return Optional.of((xow) cR.get(0));
        }
        if (cR.isEmpty()) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(xod.a, str);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 133, "FileTransferDatabaseOperations.java")).q("No FileTransferData entry found.");
        } else {
            xpa xpaVar = new xpa();
            xpaVar.f("getFileTransferBindData");
            xpaVar.b(xpeVar);
            if (xpaVar.d() <= 0) {
                z = false;
            }
            alwl alwlVar2 = (alwl) a.i();
            alwlVar2.X(xod.a, str);
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 148, "FileTransferDatabaseOperations.java")).t("Duplicate transfer id found. FileTransferData entries deleted: %b", Boolean.valueOf(z));
        }
        return Optional.empty();
    }

    public final Optional g(MessageIdType messageIdType) {
        return e(messageIdType).map(new xos(0));
    }

    public final List h(String str, xpg xpgVar) {
        akrh e = aktp.e("FileTransferDatabaseOperations#getFileTransferEntries");
        try {
            xpc c = xpf.c();
            c.w("getFileTransferEntries");
            xpe xpeVar = new xpe();
            xpeVar.c(str);
            xpeVar.d(xpgVar);
            c.k(new agpw(xpeVar));
            alog t = c.b().t();
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean i(MessageIdType messageIdType, String str) {
        xpe xpeVar = new xpe();
        xpeVar.c(str);
        xpeVar.d(xpg.UPLOAD);
        xpeVar.U(new agmd("file_transfer.message_id", 2, Long.valueOf(rvc.a(messageIdType))));
        xpa xpaVar = new xpa();
        xpaVar.f("deleteFileUploadDuplicateTransferId");
        xpaVar.b(xpeVar);
        if (xpaVar.d() > 0) {
            return true;
        }
        return false;
    }

    public final boolean j(MessageIdType messageIdType) {
        xpe xpeVar = new xpe();
        xpeVar.b(messageIdType);
        xpa xpaVar = new xpa();
        xpaVar.f("deleteFileUploadResponse");
        xpaVar.b(xpeVar);
        if (xpaVar.d() > 0) {
            return true;
        }
        return false;
    }

    public final boolean k(MessageIdType messageIdType) {
        return g(messageIdType).filter(new xdm(this, 9)).isPresent();
    }

    public final boolean l(String str, xpg xpgVar, String str2) {
        akrh e = aktp.e("FileTransferDatabaseOperations#updateFileTransferEntryWithTransferHandle");
        try {
            xpd xpdVar = new xpd();
            xpdVar.aj("updateFileTransferEntryWithTransferHandle");
            xpdVar.f(new uzn(str, xpgVar, 16));
            xpdVar.e(str2);
            boolean z = true;
            if (xpdVar.a().e() != 1) {
                z = false;
            }
            e.close();
            return z;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean m(MessageIdType messageIdType, String str, xpg xpgVar, qep qepVar) {
        akrh e = aktp.e("FileTransferDatabaseOperations#upsertFileTransferEntry");
        try {
            xox b2 = xpf.b();
            b2.c(messageIdType);
            b2.e(str);
            b2.f(xpgVar);
            b2.b(qepVar);
            xow a2 = b2.a();
            xpe xpeVar = new xpe();
            xpeVar.b(messageIdType);
            boolean s = a2.s(new agpw(xpeVar));
            e.close();
            return s;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean n(MessageIdType messageIdType, String str, xpg xpgVar, qep qepVar, byte[] bArr) {
        akrh e = aktp.e("FileTransferDatabaseOperations#upsertFileTransferEntryWithOpaqueData");
        try {
            xox b2 = xpf.b();
            b2.c(messageIdType);
            b2.e(str);
            b2.f(xpgVar);
            b2.b(qepVar);
            b2.d(bArr);
            xow a2 = b2.a();
            xpe xpeVar = new xpe();
            xpeVar.b(messageIdType);
            boolean s = a2.s(new agpw(xpeVar));
            e.close();
            return s;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
