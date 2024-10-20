package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adre implements adaf {
    final /* synthetic */ ArrayList a;
    private adqu b;
    private String c;

    public adre(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.adaf
    public final void a() {
        this.b = new adqu(adqt.UNKNOWN);
    }

    @Override // defpackage.adaf
    public final void b(byte[] bArr) {
        adqu adquVar = this.b;
        adquVar.getClass();
        String str = this.c;
        str.getClass();
        adquVar.d(str, bArr);
    }

    @Override // defpackage.adaf
    public final void c() {
        adqu adquVar = this.b;
        adquVar.getClass();
        this.a.add(adquVar);
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.adaf
    public final void d(adxq adxqVar) {
        if (albo.ar(adxqVar.a, assi.a)) {
            this.c = (String) adxqVar.b;
        }
    }
}
