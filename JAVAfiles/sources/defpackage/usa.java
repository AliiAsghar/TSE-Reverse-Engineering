package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usa extends arpw implements arqv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ usb c;
    final /* synthetic */ String d;
    final /* synthetic */ arwl e;
    final /* synthetic */ Runnable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usa(usb usbVar, String str, arwl arwlVar, Runnable runnable, arpe arpeVar) {
        super(2, arpeVar);
        this.c = usbVar;
        this.d = str;
        this.e = arwlVar;
        this.f = runnable;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((usa) c((use) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            use useVar = (use) this.b;
            usb usbVar = this.c;
            String str = this.d;
            arwl arwlVar = this.e;
            Runnable runnable = this.f;
            this.a = 1;
            obj = usbVar.a.d(str, useVar, arwlVar, runnable, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        usa usaVar = new usa(this.c, this.d, this.e, this.f, arpeVar);
        usaVar.b = obj;
        return usaVar;
    }
}
