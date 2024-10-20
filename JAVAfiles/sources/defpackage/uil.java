package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uil extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingHandler");
    private final uin b;
    private final anen c;
    private final anen d;

    public uil(uin uinVar, anen anenVar, anen anenVar2) {
        this.b = uinVar;
        this.c = anenVar;
        this.d = anenVar2;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ResizingHandler");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [armf, java.lang.Object] */
    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        uim v;
        uio uioVar = (uio) apbtVar;
        uip uipVar = uioVar.c;
        if (uipVar == null) {
            uipVar = uip.a;
        }
        uip uipVar2 = uipVar;
        uin uinVar = this.b;
        String str = uioVar.d;
        if (uin.c(str)) {
            wpp wppVar = uinVar.f;
            Context context = (Context) wppVar.b.b();
            context.getClass();
            ?? r2 = wppVar.a;
            anen anenVar = (anen) wppVar.c.b();
            anenVar.getClass();
            uipVar2.getClass();
            v = new uik(context, r2, anenVar, uipVar2, str);
        } else if (gh.z(str)) {
            v = uinVar.e.v(uipVar2, str);
        } else {
            alvw i = uin.a.i();
            i.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "createResizingJob", 94, "ResizingManagerV2.java")).t("Unsupported type for input Uri: %s", uipVar2.c);
            ((mbl) uinVar.c.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
            throw new IllegalArgumentException("Unsupported input uri: ".concat(String.valueOf(uipVar2.c)));
        }
        return v.b().h(new uht(v, 15), this.c).e(Exception.class, new uhw(2), this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return uio.a.getParserForType();
    }
}
