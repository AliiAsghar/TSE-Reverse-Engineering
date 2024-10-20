package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pye implements pyk {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final pxp d;
    public final hgj e;
    private final armf f;
    private final anen g;
    private final anen h;
    private final Context i;
    private final odp j;
    private final armf k;

    public pye(Context context, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, hgj hgjVar, odp odpVar, armf armfVar3, pxp pxpVar) {
        this.b = armfVar2;
        this.f = armfVar;
        this.e = hgjVar;
        this.g = anenVar;
        this.h = anenVar2;
        this.i = context;
        this.d = pxpVar;
        this.j = odpVar;
        this.k = armfVar3;
    }

    @Override // defpackage.pyk
    public final akul a(final String str, final int i, final String str2, final Optional optional, Optional optional2) {
        Uri d;
        if (this.j.a() && !((wfh) this.k.b()).S()) {
            return aktp.ag(new pya(new xon("download via satellite")));
        }
        final boolean isPresent = optional2.isPresent();
        if (isPresent) {
            d = Uri.parse((String) optional2.get());
        } else {
            d = uhl.d("file_".concat(String.valueOf(str2)), this.i);
        }
        final Uri uri = d;
        final File i2 = uhl.i(uri, this.i);
        if (isPresent && i != 0 && i2.length() == i) {
            return aktp.ag(ppm.d(uri));
        }
        if (!isPresent) {
            if (!((xot) this.f.b()).l(str2, xpg.DOWNLOAD, uri.toString())) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "updateDatabaseWithTransferHandle", 249, "CronetFileDownloader.java")).t("Failed to update transfer handle in database during download. Transfer ID: %s", str2);
            }
        }
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(i2, isPresent);
            akul g = akul.g(d.m(new dts() { // from class: pyc
                /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
                @Override // defpackage.dts
                public final Object a(dtq dtqVar) {
                    rhx rhxVar = new rhx(dtqVar, uri);
                    File file = i2;
                    String str3 = str2;
                    int i3 = i;
                    Optional optional3 = optional;
                    String str4 = str;
                    pye pyeVar = pye.this;
                    boolean z = isPresent;
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    pxo a2 = pyeVar.d.a();
                    pyd pydVar = new pyd(pyeVar, z, file, str3, i3, fileOutputStream2, optional3, str4);
                    anen anenVar = (anen) pyeVar.e.a.b();
                    anenVar.getClass();
                    str3.getClass();
                    a2.getClass();
                    pwz pwzVar = new pwz(anenVar, str3, rhxVar, a2, pydVar);
                    alwl alwlVar = (alwl) pye.a.g();
                    alwlVar.X(xod.a, str3);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "download", 169, "CronetFileDownloader.java")).q("File download is started.");
                    pyeVar.c.put(str3, pwzVar);
                    alwl alwlVar2 = (alwl) pwz.a.g();
                    alwlVar2.X(xod.a, pwzVar.c);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 64, "InProgressFileTransfer.java")).t("Starting InProgressFileTransfer HTTP execution flow. %s", pwzVar.d.getClass().getName());
                    if (pwzVar.i == pwzVar.e) {
                        pwzVar.a(pwzVar.f, pwl.a);
                        return "CronetFileDownloader#download";
                    }
                    throw new IllegalStateException(String.format("Transfer id %s already started.", pwzVar.c));
                }
            }));
            if (!optional.isEmpty()) {
                akrh e = aktp.e("CronetFileDownloader::download");
                try {
                    e.b(g);
                    e.close();
                } finally {
                }
            }
            return g.h(new kxr(this, str2, fileOutputStream, 13), this.g);
        } catch (FileNotFoundException e2) {
            pwq a2 = pwr.a();
            a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
            a2.c(e2);
            return aktp.ag(new pxy(a2.a()));
        }
    }

    @Override // defpackage.pyk
    public final akul b(String str) {
        return aktp.ai(new mzn(this, str, 15, null), this.h);
    }
}
