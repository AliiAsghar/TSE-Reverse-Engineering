package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtg {
    public Object a;

    public adtg() {
    }

    public static Intent a(apht aphtVar) {
        Intent intent = new Intent();
        int i = aphtVar.c;
        int R = a.R(i);
        if (R != 0 && R == 2) {
            intent.setAction("com.google.android.ims.SIM_LOADED");
            Bundle bundle = new Bundle();
            bundle.putBoolean("SIM_CHANGED", aphtVar.d);
            intent.putExtras(bundle);
        } else {
            int R2 = a.R(i);
            if (R2 != 0 && R2 == 3) {
                intent.setAction("com.google.android.ims.SIM_ABSENT");
            }
        }
        return intent;
    }

    public final synchronized Intent b() {
        Object obj = this.a;
        if (obj == null) {
            return null;
        }
        return a((apht) obj);
    }

    public final synchronized apht c() {
        return (apht) this.a;
    }

    final synchronized String d() {
        String str;
        Object obj = this.a;
        if (obj != null) {
            int i = ((apht) obj).c;
            int R = a.R(i);
            if (R != 0 && R == 2) {
                str = "LOADED";
            }
            int R2 = a.R(i);
            if (R2 != 0 && R2 == 3) {
                str = "ABSENT";
            }
        }
        str = "UNKNOWN";
        return str;
    }

    public final synchronized void e(apht aphtVar) {
        aozy createBuilder = apht.a.createBuilder();
        int R = a.R(aphtVar.c);
        int i = 1;
        if (R == 0) {
            R = 1;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apht aphtVar2 = (apht) apagVar;
        aphtVar2.c = R - 1;
        aphtVar2.b |= 1;
        String str = aphtVar.f;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apht aphtVar3 = (apht) apagVar2;
        str.getClass();
        aphtVar3.b |= 8;
        aphtVar3.f = str;
        int R2 = a.R(aphtVar.e);
        if (R2 != 0) {
            i = R2;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apht aphtVar4 = (apht) createBuilder.b;
        aphtVar4.e = i - 1;
        aphtVar4.b |= 4;
        this.a = (apht) createBuilder.s();
    }

    public final boolean f() {
        return "LOADED".equals(d());
    }

    public final ResumeDownloadResult g() {
        Object obj = this.a;
        if (obj != null) {
            return new adsr((FileTransferResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void h(FileTransferResult fileTransferResult) {
        if (fileTransferResult != null) {
            this.a = fileTransferResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final PauseDownloadResult i() {
        Object obj = this.a;
        if (obj != null) {
            return new adsp((FileTransferResult) obj);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    public final void j(FileTransferResult fileTransferResult) {
        if (fileTransferResult != null) {
            this.a = fileTransferResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final PauseDownloadRequest k() {
        Object obj = this.a;
        if (obj != null) {
            return new adso((String) obj);
        }
        throw new IllegalStateException("Missing required properties: downloadId");
    }

    public final void l(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null downloadId");
    }

    public final FileTransferResult m() {
        if (this.a != null) {
            return new adsn((adss) this.a);
        }
        throw new IllegalStateException("Missing required properties: resultCode");
    }

    public final void n(adss adssVar) {
        if (adssVar != null) {
            this.a = adssVar;
            return;
        }
        throw new NullPointerException("Null resultCode");
    }

    public final FileDownloadResult o() {
        Object obj = this.a;
        if (obj != null) {
            return new adsm((String) obj);
        }
        throw new IllegalStateException("Missing required properties: fileDownloadId");
    }

    public final void p(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null fileDownloadId");
    }

    public adtg(byte[] bArr) {
        this.a = null;
    }
}
