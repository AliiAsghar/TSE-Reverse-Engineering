package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jud extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    final /* synthetic */ jug c;
    final /* synthetic */ arqg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jud(jug jugVar, arqg arqgVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = jugVar;
        this.d = arqgVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        jud judVar = new jud(this.c, this.d, (arpe) obj3);
        judVar.a = booleanValue;
        judVar.b = booleanValue2;
        return judVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        aqil.P(obj);
        boolean z2 = this.a;
        boolean z3 = this.b;
        alvw e = jug.a.e();
        e.X(alwp.a, "BugleComposeRow2");
        alvg alvgVar = (alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter$createUiDataFlow$1", "invokeSuspend", 100, "CameraGalleryInputUiAdapter.kt");
        Boolean valueOf = Boolean.valueOf(z2);
        if (this.c.a() != null) {
            z = true;
        } else {
            z = false;
        }
        alvgVar.J("CameraGalleryInputUiAdapter isEnabled %b, selfieGifUiAdapter %b, shouldShowCameraGalleryInput %b", valueOf, Boolean.valueOf(z), Boolean.valueOf(z3));
        aemn aemnVar = new aemn(z2, this.d, new jmy(this.c, 18));
        if (z3) {
            return aemnVar;
        }
        return null;
    }
}
