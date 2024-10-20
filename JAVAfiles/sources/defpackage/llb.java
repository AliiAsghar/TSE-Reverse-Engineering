package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llb implements rv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ llb(afsw afswVar, afgv afgvVar, arqr arqrVar, int i) {
        this.d = i;
        this.c = afswVar;
        this.a = afgvVar;
        this.b = arqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [afsw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, arqr] */
    @Override // defpackage.rv
    public final void a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ?? r6 = this.c;
                r6.getClass();
                Object obj2 = this.a;
                if (!booleanValue) {
                    ((alvg) afgv.b.g().h("com/google/android/libraries/compose/cameragallery/ui/camera/SystemCameraLauncher", "onCreate$lambda$1$lambda$0", 94, "SystemCameraLauncher.kt")).t("%s system capture wasn't successful", r6);
                    afgv afgvVar = (afgv) obj2;
                    affv affvVar = afgvVar.j;
                    if (affvVar != 0) {
                        affvVar.b(afgi.a, r6);
                    }
                    arrn.J(afgvVar.c, null, null, new aely(afgvVar, (arpe) null, 7), 3);
                    return;
                }
                afgv afgvVar2 = (afgv) obj2;
                arrn.J(afgvVar2.d, null, null, new aemw(afgvVar2, (afsw) r6, (arqr) this.b, (arpe) null, 5), 3);
                return;
            }
            ((alvg) llc.a.d().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher$launch$2$1", "onActivityResult", 43, "ActivityResultLauncher.kt")).t("Activity result callback invoked. %s", obj);
            ((arrx) this.a).a = true;
            this.b.w(obj);
            rw rwVar = (rw) ((arsb) this.c).a;
            if (rwVar != null) {
                rwVar.a();
                return;
            }
            return;
        }
        ((alvg) llc.a.d().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher$retrievePendingResult$2$1", "onActivityResult", 83, "ActivityResultLauncher.kt")).t("Activity result callback invoked for pending result. %s", obj);
        ((arrx) this.a).a = true;
        this.b.w(obj);
        rw rwVar2 = (rw) ((arsb) this.c).a;
        if (rwVar2 != null) {
            rwVar2.a();
        }
    }

    public llb(arrx arrxVar, arvo arvoVar, arsb arsbVar, int i) {
        this.d = i;
        this.a = arrxVar;
        this.b = arvoVar;
        this.c = arsbVar;
    }
}
