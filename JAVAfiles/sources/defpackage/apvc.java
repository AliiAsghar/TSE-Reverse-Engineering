package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apvc implements apvh {
    public static final char[] a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    public final String b;
    public final String c;
    public final apuu d;
    public final String e;
    public final apus f;
    public final aput g;
    public final algw h;
    public apvh i;
    public int j;
    public int k;
    public aovn l;
    private int m;

    public apvc(String str, apuu apuuVar, apus apusVar, String str2, aput aputVar, apvl apvlVar) {
        str.getClass();
        apusVar.getClass();
        this.b = str;
        this.c = "POST";
        this.d = apuuVar;
        this.e = albo.ag(str2);
        this.g = aputVar;
        this.f = apusVar;
        this.m = 1;
        this.h = apvlVar.c;
    }

    @Override // defpackage.apvh
    public final long a() {
        return this.f.d();
    }

    @Override // defpackage.apvh
    public final ListenableFuture b() {
        apva apvaVar = new apva(this, 0);
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.j("Scotty-Uploader-MultipartTransfer-%d");
        anen bB = albo.bB(Executors.newSingleThreadExecutor(arbj.t(arbjVar)));
        ListenableFuture submit = bB.submit(apvaVar);
        bB.shutdown();
        return submit;
    }

    public final synchronized void c() {
        int i;
        while (true) {
            i = this.m;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i != 3) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            albo.y(z);
        } else {
            throw new apvj(apvi.CANCELED, "");
        }
    }

    @Override // defpackage.apvh
    public final String d() {
        return null;
    }

    @Override // defpackage.apvh
    public final void e() {
        synchronized (this) {
            apvh apvhVar = this.i;
            if (apvhVar != null) {
                apvhVar.e();
            }
            this.m = 3;
            notifyAll();
        }
    }

    @Override // defpackage.apvh
    public final synchronized void h(aovn aovnVar, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z2 = false;
        }
        d.t(z2, "Progress threshold (millis) must be greater or equal to 0");
        this.l = aovnVar;
        this.j = i;
        this.k = i2;
    }
}
