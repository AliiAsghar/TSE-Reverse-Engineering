package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.communication.synapse.security.scytale.MediaDecryptionParams;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttl {
    public static final xze a = xze.g("BugleEtouffee", "EncryptedFileReceiver");
    public final pwb b = new pwb();
    public final armf c;
    public final armf d;
    public final anen e;
    public final anen f;
    public final armf g;
    public final tvy h;
    public final iji i;
    public final iji j;
    private final apwt k;
    private final Context l;
    private final armf m;
    private final Optional n;

    public ttl(Context context, apwt apwtVar, armf armfVar, Optional optional, armf armfVar2, armf armfVar3, iji ijiVar, tvy tvyVar, iji ijiVar2, anen anenVar, anen anenVar2, armf armfVar4) {
        this.l = context;
        this.k = apwtVar;
        this.m = armfVar;
        this.n = optional;
        this.c = armfVar2;
        this.d = armfVar3;
        this.i = ijiVar;
        this.h = tvyVar;
        this.j = ijiVar2;
        this.e = anenVar;
        this.f = anenVar2;
        this.g = armfVar4;
    }

    public static boolean a(rve rveVar) {
        spt b = spv.b();
        b.w("isEncrypted");
        b.c(new tkg(rveVar, 20));
        return b.b().K();
    }

    public static spr c(rve rveVar) {
        spt b = spv.b();
        b.w("getEtouffeeMessageByRcsId1");
        b.c(new ttr(rveVar, 1));
        return (spr) b.b().n();
    }

    public static final void d(MessageCoreData messageCoreData) {
        rve E = messageCoreData.E();
        if (E.i()) {
            return;
        }
        spr c = c(E);
        try {
            if (c.moveToFirst()) {
                messageCoreData.bn();
                messageCoreData.bi(c.j(), c.q());
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Uri b(rve rveVar, Uri uri, int i) {
        MediaDecryptionParams mediaDecryptionParams;
        InputStream inputStream;
        Uri uri2 = uri;
        akrh e = aktp.e("EtouffeeFileReceiver#convertFile");
        try {
            this.k.b();
            if (a(rveVar)) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    InputStream openInputStream = this.l.getContentResolver().openInputStream(uri2);
                    try {
                        if (openInputStream != null) {
                            akrh e2 = aktp.e("EtouffeeFileReceiver#convertStream");
                            try {
                                if (!a(rveVar)) {
                                    inputStream = openInputStream;
                                } else {
                                    spr c = c(rveVar);
                                    try {
                                        if (c.moveToFirst()) {
                                            if (i == 2) {
                                                byte[] p = c.p();
                                                p.getClass();
                                                byte[] o = c.o();
                                                o.getClass();
                                                mediaDecryptionParams = new MediaDecryptionParams(p, o, c.c());
                                            } else {
                                                byte[] t = c.t();
                                                t.getClass();
                                                byte[] s = c.s();
                                                s.getClass();
                                                mediaDecryptionParams = new MediaDecryptionParams(t, s, c.e());
                                            }
                                            try {
                                                anie anieVar = new anie(openInputStream, (MediaEncryptor) twd.a(MediaEncryptor.createDecryptorInstance(mediaDecryptionParams)), 2, anie.a(), false);
                                                c.close();
                                                inputStream = anieVar;
                                            } catch (aqwb e3) {
                                                this.j.p(rveVar, 40);
                                                atomicBoolean.set(true);
                                                ((mbl) this.c.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 4);
                                                throw e3;
                                            }
                                        } else {
                                            this.j.p(rveVar, 39);
                                            atomicBoolean.set(true);
                                            ((mbl) this.c.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 3);
                                            throw new IllegalStateException("Can't open encrypted stream.");
                                        }
                                    } finally {
                                    }
                                }
                                e2.close();
                                try {
                                    Uri g = uhl.g(inputStream, this.l);
                                    if (g != null) {
                                        this.l.getContentResolver().delete(uri2, null, null);
                                        this.n.ifPresent(new swb(17));
                                        inputStream.close();
                                        openInputStream.close();
                                        uri2 = g;
                                    } else {
                                        this.j.p(rveVar, 38);
                                        atomicBoolean.set(true);
                                        ((mbl) this.c.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 2);
                                        throw new IOException("Failed to store decrypted data to internal storage.");
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            ((mbl) this.c.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 1);
                            throw new FileNotFoundException(a.cr(uri2, "fileUri was not found, fileUri="));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    xyo e4 = a.e();
                    e4.H("Unable to decrypt stream");
                    e4.z("rcsMessageId", rveVar);
                    e4.r(th);
                    if (!atomicBoolean.get()) {
                        if (th instanceof FileNotFoundException) {
                            this.j.p(rveVar, 37);
                        } else {
                            this.j.p(rveVar, 41);
                        }
                    }
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = amkg.a.createBuilder();
                    String ag = albo.ag(rveVar.b);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amkg amkgVar = (amkg) createBuilder.b;
                    amkgVar.b = 1 | amkgVar.b;
                    amkgVar.c = ag;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amkg amkgVar2 = (amkg) createBuilder.s();
                    amkgVar2.getClass();
                    amfrVar2.Z = amkgVar2;
                    amfrVar2.c |= 536870912;
                    ((maq) this.m.b()).j(amfqVar);
                    throw th;
                }
            }
            e.close();
            return uri2;
        } finally {
        }
    }
}
