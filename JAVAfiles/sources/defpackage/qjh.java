package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qjh {
    public static final akul a(arwl arwlVar) {
        akul g = akul.g(arro.E(arwlVar));
        g.getClass();
        return g;
    }

    public static final akul b(arqr arqrVar, arwe arweVar) {
        return a(arrn.I(arweVar, null, null, new mwv(arqrVar, (arpe) null, 8), 3));
    }

    public static final akul c(arwe arweVar, arpi arpiVar, arwf arwfVar, arqv arqvVar) {
        arwfVar.getClass();
        if (arwfVar != arwf.b) {
            return a(arro.r(arweVar, arpiVar, arwfVar, arqvVar));
        }
        throw new IllegalArgumentException("CoroutineStart.LAZY is not supported for asyncFuture(). Split into separate async {} and asFuture() calls.");
    }

    public static final Object d(ListenableFuture listenableFuture, arpe arpeVar) {
        return arro.F(listenableFuture, arpeVar);
    }

    public static final arwl e(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return arro.H(listenableFuture);
    }

    public static final arxm f(arwe arweVar, arqx arqxVar, arpi arpiVar, arwf arwfVar, arqv arqvVar) {
        qji qjiVar = new qji();
        arxm arxmVar = (arxm) arqxVar.a(arweVar, arpiVar, arwfVar, arqvVar);
        arxmVar.s(new qin(qjiVar, 2));
        return arxmVar;
    }

    public static final asai g(akul akulVar) {
        return new asaa(new lfn(akulVar, (arpe) null, 6));
    }

    public static final asai h(arqg arqgVar) {
        return new asaa(new gds(arqgVar, (arpe) null, 3));
    }

    public static /* synthetic */ akul i(arwe arweVar, arqv arqvVar) {
        return c(arweVar, arpj.a, arwf.a, arqvVar);
    }

    public static /* synthetic */ akul j(arwe arweVar, arqv arqvVar) {
        arpj arpjVar = arpj.a;
        arwf arwfVar = arwf.a;
        arwfVar.getClass();
        if (arwfVar != arwf.b) {
            return a(arro.r(arweVar, arpjVar, arwfVar, arqvVar)).h(new qda(13), andi.a);
        }
        throw new IllegalArgumentException("CoroutineStart.LAZY is not supported for asyncFuture(). Split into separate async {} and asFuture() calls.");
    }

    public static /* synthetic */ andc k(arwe arweVar, arqv arqvVar) {
        arpj arpjVar = arpj.a;
        arwf arwfVar = arwf.a;
        arwfVar.getClass();
        return new andc(c(arweVar, arpjVar, arwfVar, arqvVar));
    }

    public static /* synthetic */ arxm l(arwe arweVar, arpi arpiVar, arqv arqvVar, int i) {
        if ((i & 1) != 0) {
            arpiVar = arpj.a;
        }
        arwf arwfVar = arwf.a;
        arweVar.getClass();
        arpiVar.getClass();
        arwfVar.getClass();
        return f(arweVar, qiv.a, arpiVar, arwfVar, arqvVar);
    }

    public static /* synthetic */ arxm m(arwe arweVar, arqv arqvVar) {
        arpj arpjVar = arpj.a;
        arwf arwfVar = arwf.a;
        arwfVar.getClass();
        return f(arweVar, qiw.a, arpjVar, arwfVar, arqvVar);
    }

    public static final arwl n(andc andcVar, arwe arweVar) {
        akuk akukVar = new akuk(andcVar);
        arxm v = arwi.v(arweVar.b());
        arvv arvvVar = new arvv();
        v.s(new kjs(akukVar, arvvVar, 10));
        final akfp akfpVar = new akfp(new qio(v, arvvVar), 1);
        andc andcVar2 = akukVar.a;
        andi andiVar = andi.a;
        long j = akto.a;
        final akry e = akqj.e();
        andcVar2.k(new andb() { // from class: aktg
            @Override // defpackage.andb
            public final void a(ahmn ahmnVar) {
                long j2 = akto.a;
                akry h = akqj.h(akqj.b(), akry.this);
                try {
                    akfpVar.a(ahmnVar);
                } finally {
                }
            }
        }, andiVar);
        return arvvVar;
    }

    public static final void o(pyz pyzVar, apwj apwjVar, qam qamVar) {
        qamVar.getClass();
        sdz b = qal.b();
        b.f(pyzVar);
        b.d(qamVar);
        b.c(apwjVar);
        if (b.a().h(new mut(pyzVar, qamVar, 11, null))) {
            alvw d = pzy.a.d();
            d.X(alwp.a, "BugleFileTransfer");
            alvg alvgVar = (alvg) d;
            alvgVar.X(xod.j, pyzVar);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$Companion", "updateFileTransferEntryWithEncryptionMetadataForFileType", 397, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file processing table entry with encryption metadata for file type %s.", qamVar.name());
            return;
        }
        alvw d2 = pzy.a.d();
        d2.X(alwp.a, "BugleFileTransfer");
        alvg alvgVar2 = (alvg) d2;
        alvgVar2.X(xod.j, pyzVar);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$Companion", "updateFileTransferEntryWithEncryptionMetadataForFileType", 405, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file processing table entry with encryption metadata for file type %s.", qamVar.name());
    }

    public static /* synthetic */ String p(int i) {
        if (i != 1) {
            return "FILE_TRANSFER_FAILURE";
        }
        return "FILE_INFORMATION";
    }

    public static String q(qei qeiVar) {
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        d.t(!b.equals(qeh.GROUP), "Unexpected remote chat endpoint of type group");
        return UUID.nameUUIDFromBytes(qeiVar.d.getBytes(StandardCharsets.UTF_8)).toString();
    }

    public static boolean r() {
        return anfi.a("bugle.enable_round_two_screen_effects", "bugle");
    }
}
