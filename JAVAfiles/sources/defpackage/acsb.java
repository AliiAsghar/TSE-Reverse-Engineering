package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsb extends acse {
    private final acts c;
    private final FileInformation d;
    private final PendingIntent e;
    private final String f;

    public acsb(Context context, acrz acrzVar, acts actsVar, FileInformation fileInformation, PendingIntent pendingIntent, String str) {
        super(context, acrzVar);
        this.c = actsVar;
        this.d = fileInformation;
        this.e = pendingIntent;
        this.f = str;
    }

    @Override // defpackage.acse
    protected final String a() {
        return this.f;
    }

    @Override // defpackage.acug
    public final void b(byte[] bArr, Uri uri) {
        String str;
        advr.c("HTTP file transfer download successful for download ID %s", this.f);
        actq actqVar = new actq(null);
        actqVar.f(this.d.a());
        actqVar.h(this.d.i());
        actqVar.c(this.d.b().toString());
        actqVar.i("temporary id until the TODO is done");
        this.d.h().ifPresent(new acsa(actqVar, 0));
        if (!Uri.EMPTY.equals(uri)) {
            actqVar.d(uri);
        } else if (bArr.length > 0) {
            actqVar.l(bArr);
            actqVar.k(this.d.b().toString());
        }
        Bundle a = this.c.a(actqVar.a());
        Optional g = this.d.g();
        if (!g.isEmpty() && !ajqd.FILE.equals(g.get())) {
            str = RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE;
        } else {
            str = RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED;
        }
        Intent putExtras = new Intent(str).putExtras(a);
        try {
            adtw.c(this.a, putExtras);
            this.e.send(this.a, 0, putExtras);
        } catch (Exception e) {
            advr.i(e, "Callback intent canceled for downloadFile. download ID: %s", this.f);
        }
        this.b.o(this.f);
    }
}
