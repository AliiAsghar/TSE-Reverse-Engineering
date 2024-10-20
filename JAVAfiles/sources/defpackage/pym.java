package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pym implements pza {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep");
    private final Context b;
    private final apwt c;
    private final ydk d;
    private final pzw e;
    private final int f;

    public pym(Context context, apwt apwtVar, ydk ydkVar, pzw pzwVar, int i) {
        this.b = context;
        this.c = apwtVar;
        this.d = ydkVar;
        this.e = pzwVar;
        this.f = i;
    }

    private static final apwj b(MediaEncryptor mediaEncryptor, String str) {
        aozy createBuilder = apwj.a.createBuilder();
        createBuilder.getClass();
        aozb w = aozb.w(mediaEncryptor.getKeyMaterial());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apwj apwjVar = (apwj) createBuilder.b;
        apwjVar.b |= 1;
        apwjVar.c = w;
        aozb w2 = aozb.w(mediaEncryptor.getDigest());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apwj apwjVar2 = (apwj) createBuilder.b;
        apwjVar2.b |= 2;
        apwjVar2.d = w2;
        int version = mediaEncryptor.getVersion();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apwj apwjVar3 = (apwj) createBuilder.b;
        apwjVar3.b |= 4;
        apwjVar3.e = version;
        Object fu = new pwb().m().fu(ContentType.d(str));
        fu.getClass();
        qel qelVar = (qel) fu;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apwj apwjVar4 = (apwj) createBuilder.b;
        apwjVar4.g = qelVar;
        apwjVar4.b |= 16;
        apag s = createBuilder.s();
        s.getClass();
        return (apwj) s;
    }

    @Override // defpackage.pza
    public final Object a(aksr aksrVar, pzi pziVar, arpe arpeVar) {
        if (this.f != 2 ? !(pziVar.d == null || pziVar.b == null) : !(pziVar.a == null || pziVar.b == null)) {
            this.c.b();
            MediaEncryptor mediaEncryptor = (MediaEncryptor) twd.a(MediaEncryptor.createEncryptorInstance());
            if (this.f == 1) {
                aozb aozbVar = pziVar.d;
                if (aozbVar != null) {
                    Object obj = aksrVar.d;
                    mediaEncryptor.getClass();
                    String str = pziVar.b;
                    str.getClass();
                    alvw g = a.g();
                    g.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(xod.j, obj);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep", "encryptThumbnail", 75, "EncryptionStep.kt")).q("Encrypting thumbnail.");
                    byte[] bArr = (byte[]) twd.a(mediaEncryptor.encrypt(aozbVar.H(), true));
                    this.e.g((pyz) obj, b(mediaEncryptor, str));
                    return new pzi(null, trx.a.toString(), null, aozb.w(bArr), 5);
                }
                throw new IllegalArgumentException("Thumbnail bytes must be present.");
            }
            Object obj2 = aksrVar.d;
            mediaEncryptor.getClass();
            Uri uri = pziVar.a;
            uri.getClass();
            String str2 = pziVar.b;
            str2.getClass();
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleFileTransfer");
            alvg alvgVar2 = (alvg) g2;
            alvgVar2.X(xod.j, obj2);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep", "encryptFile", 96, "EncryptionStep.kt")).q("Encrypting file.");
            try {
                anie anieVar = new anie(this.d.k(uri), mediaEncryptor);
                try {
                    Uri g3 = uhl.g(anieVar, this.b);
                    armd.i(anieVar, null);
                    aozy builder = b(mediaEncryptor, str2).toBuilder();
                    String g4 = actt.g(uri, str2);
                    g4.getClass();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    apwj apwjVar = (apwj) builder.b;
                    apwjVar.b |= 8;
                    apwjVar.f = g4;
                    apag s = builder.s();
                    s.getClass();
                    this.e.d((pyz) obj2, (apwj) s);
                    return new pzi(g3, trx.a.toString(), null, null, 12);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(anieVar, th);
                        throw th2;
                    }
                }
            } catch (FileNotFoundException e) {
                alvw h = a.h();
                h.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar3 = (alvg) ((alvg) h).g(e);
                alvgVar3.X(xod.j, obj2);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep", "encryptFile", 105, "EncryptionStep.kt")).t("Failed to get input stream for file: %s", uri);
                return pzk.a;
            }
        }
        throw new IllegalArgumentException("Invalid input in EncryptionStep.");
    }
}
