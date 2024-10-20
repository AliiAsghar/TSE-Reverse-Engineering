package defpackage;

import android.content.Context;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class woe {
    public static final xze a = xze.g("BugleAction", "IncomingRcsFileTransferEventProcessor");
    public static final utz b = uuh.f(uuh.b, "default_expiry_ft_metadata_update", TimeUnit.DAYS.toMillis(1));
    public final Context c;
    public final qzw d;
    public final anen e;
    public final anen f;
    public final armf g;
    public final xnv h;
    public final xrw i;
    public final vyv j;
    public final vyv k;

    public woe(Context context, anen anenVar, anen anenVar2, qzw qzwVar, xrw xrwVar, armf armfVar, xnv xnvVar, vyv vyvVar, vyv vyvVar2) {
        this.c = context;
        this.e = anenVar;
        this.f = anenVar2;
        this.d = qzwVar;
        this.i = xrwVar;
        this.g = armfVar;
        this.h = xnvVar;
        this.j = vyvVar;
        this.k = vyvVar2;
    }

    public static qep a(Instant instant, FileInfo fileInfo) {
        pwb pwbVar = new pwb();
        aozy createBuilder = qep.a.createBuilder();
        qel qelVar = (qel) pwbVar.m().fu(ContentType.d(fileInfo.mContentType));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qep qepVar = (qep) apagVar;
        qelVar.getClass();
        qepVar.e = qelVar;
        qepVar.b |= 1;
        String str = fileInfo.mUrl;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qep qepVar2 = (qep) createBuilder.b;
        str.getClass();
        qepVar2.f = str;
        apct j = aotl.j(instant);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        qep qepVar3 = (qep) apagVar2;
        j.getClass();
        qepVar3.g = j;
        qepVar3.b |= 2;
        int i = (int) fileInfo.mSize;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((qep) apagVar3).d = i;
        String str2 = fileInfo.mFileName;
        if (str2 == null) {
            return (qep) createBuilder.s();
        }
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        ((qep) createBuilder.b).c = str2;
        return (qep) createBuilder.s();
    }
}
