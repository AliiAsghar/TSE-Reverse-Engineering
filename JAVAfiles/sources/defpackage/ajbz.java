package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajbz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajbz(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.c) {
            case 0:
                ajca ajcaVar = (ajca) this.b;
                ajcaVar.e.ad(this.a, ajcaVar.z().getDimensionPixelSize(R.dimen.list_scroll_offset));
                return;
            case 1:
                ajax ajaxVar = (ajax) this.b;
                ajaw ajawVar = ajaxVar.a;
                if (ajawVar != null) {
                    ajawVar.a(this.a);
                    ajaxVar.a = null;
                    return;
                }
                return;
            case 2:
                ((akas) this.b).stopSelf(this.a);
                return;
            case 3:
                ((aokz) this.b).b().e(this.a);
                return;
            case 4:
                ((aold) this.b).b.e(this.a);
                return;
            case 5:
                aoln aolnVar = (aoln) this.b;
                if (!aolnVar.h) {
                    int i = this.a;
                    if (aolnVar.e.e == 4) {
                        aolnVar.i.e(i);
                        return;
                    } else {
                        aolnVar.d += i;
                        return;
                    }
                }
                return;
            case 6:
                try {
                    int i2 = armc.a;
                    arax araxVar = ((aqzh) this.b).j;
                    int i3 = this.a;
                    if (i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d.t(z, "numMessages must be > 0");
                    if (((arej) araxVar).b()) {
                        return;
                    }
                    ((arej) araxVar).e += i3;
                    ((arej) araxVar).a();
                    return;
                } catch (Throwable th) {
                    ((aqzh) this.b).b(th);
                    return;
                }
            case 7:
                ((arbd) this.b).b.e(this.a);
                return;
            case 8:
                ((arbi) this.b).e.g(this.a);
                return;
            case 9:
                ((arbi) this.b).e.k(this.a);
                return;
            case 10:
                ((arbi) this.b).e.l(this.a);
                return;
            default:
                ((atfp) this.b).onStatus(this.a);
                return;
        }
    }

    public ajbz(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }
}
