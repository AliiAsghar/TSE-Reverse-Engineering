package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdm implements fdt {
    public fdp a;
    public boolean b;
    public final /* synthetic */ fdn c;
    public final apuv d;

    public fdm(fdn fdnVar, apuv apuvVar) {
        this.c = fdnVar;
        this.d = apuvVar;
    }

    @Override // defpackage.fdt
    public final void a() {
        Handler handler = this.c.i;
        dzg.g(handler);
        eul.ak(handler, new exl(this, 17));
    }
}
