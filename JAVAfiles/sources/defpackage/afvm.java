package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvm implements hxb {
    final /* synthetic */ afvn a;
    final /* synthetic */ afso b;
    final /* synthetic */ afso c;

    public afvm(afvn afvnVar, afso afsoVar, afso afsoVar2) {
        this.a = afvnVar;
        this.b = afsoVar;
        this.c = afsoVar2;
    }

    @Override // defpackage.hxb
    public final boolean eV(hpp hppVar, Object obj) {
        alvg alvgVar = (alvg) afvn.u.i();
        Throwable th = hppVar;
        if (hppVar == null) {
            th = new RuntimeException("Glide failed with null exception");
        }
        alvg alvgVar2 = (alvg) alvgVar.g(th).h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$$inlined$simpleGlideListener$1", "onLoadFailed", 128, "MediaViewHolder.kt");
        afvn afvnVar = this.a;
        alvgVar2.D("Failed to load %s with media=%s", afvnVar.z, this.b);
        afvn afvnVar2 = this.a;
        afvnVar2.a.setOnClickListener(null);
        afvnVar2.a.setClickable(false);
        afvnVar2.y.a();
        afvnVar2.a.setContentDescription(null);
        return false;
    }

    @Override // defpackage.hxb
    public final boolean eW(Object obj, Object obj2) {
        ((alvg) afvn.u.e().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$$inlined$simpleGlideListener$1", "onResourceReady", 132, "MediaViewHolder.kt")).t("Successfully rendered media=%s", this.c);
        return false;
    }
}
