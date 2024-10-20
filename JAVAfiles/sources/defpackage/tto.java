package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import j$.time.Duration;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tto implements xro {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor");
    private final Context b;
    private final xnv c;
    private final apwt d;
    private final xrp e;
    private final ydk f;
    private final armf g;
    private final armf h;

    public tto(Context context, xnv xnvVar, apwt apwtVar, xrp xrpVar, ydk ydkVar, armf armfVar, armf armfVar2) {
        this.b = context;
        this.c = xnvVar;
        this.d = apwtVar;
        this.e = xrpVar;
        this.f = ydkVar;
        this.g = armfVar;
        this.h = armfVar2;
    }

    @Override // defpackage.xro
    public final xrz a(MessageCoreData messageCoreData, alog alogVar) {
        if (!messageCoreData.cn()) {
            return this.e.a(messageCoreData, alogVar);
        }
        MessagePartCoreData G = messageCoreData.G();
        if (G != null) {
            spn a2 = spv.a();
            a2.p(messageCoreData.E());
            a2.g(this.c.f());
            xry xryVar = new xry(null);
            try {
                akrh e = aktp.e("EncryptedFileUploadPreprocessor#encryptFile");
                try {
                    Uri t = G.t();
                    if (t != null) {
                        InputStream k = this.f.k(t);
                        this.d.b();
                        MediaEncryptor mediaEncryptor = (MediaEncryptor) twd.a(MediaEncryptor.createEncryptorInstance());
                        anie anieVar = new anie(k, mediaEncryptor);
                        try {
                            Uri g = uhl.g(anieVar, this.b);
                            anieVar.close();
                            String U = G.U();
                            a2.d(mediaEncryptor.getKeyMaterial());
                            a2.c(mediaEncryptor.getDigest());
                            a2.e(mediaEncryptor.getVersion());
                            a2.f(g);
                            a2.k(yyb.bF(G));
                            a2.j(U);
                            alvi alviVar = a;
                            alvw d = alviVar.d();
                            d.X(alwp.a, "BugleEtouffee");
                            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "encryptAttachmentContentsAndProvideMetadata", 166, "EncryptedFileUploadPreprocessor.java")).q("Hiding file name and content type in fileUploadInfo");
                            xryVar.c(trx.a);
                            xryVar.d(g);
                            xryVar.e("encrypted_file");
                            e.close();
                            if (!G.bk() && !G.bz()) {
                                if (G.aW()) {
                                    xryVar.b(Duration.ofMillis(G.k()));
                                }
                            } else {
                                akrh e2 = aktp.e("EncryptedFileUploadPreprocessor#encryptPreview");
                                try {
                                    this.d.b();
                                    MediaEncryptor mediaEncryptor2 = (MediaEncryptor) twd.a(MediaEncryptor.createEncryptorInstance());
                                    byte[] a3 = ((xrq) this.g.b()).a(G, ((xrr) this.h.b()).a(alogVar));
                                    if (a3 != null) {
                                        byte[] bArr = (byte[]) twd.a(mediaEncryptor2.encrypt(a3, true));
                                        a2.n(mediaEncryptor2.getKeyMaterial());
                                        a2.m(mediaEncryptor2.getDigest());
                                        a2.o(mediaEncryptor2.getVersion());
                                        a2.l(ajru.h.toString());
                                        alvw d2 = alviVar.d();
                                        d2.X(alwp.a, "BugleEtouffee");
                                        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "createAndEncryptImagePreviewAndProvideMetadata", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "EncryptedFileUploadPreprocessor.java")).q("Hiding thumbnail content type in fileUploadInfo");
                                        xryVar.g(trx.a);
                                        xryVar.h(aozb.w(bArr));
                                    }
                                    e2.close();
                                } catch (Throwable th) {
                                    try {
                                        e2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            a2.b();
                            return xryVar.a();
                        } finally {
                        }
                    }
                    throw new IllegalArgumentException("The file transfer message does not contain an expected content URI");
                } finally {
                }
            } catch (IOException e3) {
                alvw i = a.i();
                i.X(alwp.a, "BugleEtouffee");
                alvg alvgVar = (alvg) ((alvg) i).g(e3);
                alvgVar.X(ydl.f, messageCoreData.E());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedFileUploadPreprocessor", "prepareFileForUpload", 111, "EncryptedFileUploadPreprocessor.java")).q("Unable to encrypt file transfer content");
                throw e3;
            }
        }
        throw new IllegalArgumentException();
    }
}
