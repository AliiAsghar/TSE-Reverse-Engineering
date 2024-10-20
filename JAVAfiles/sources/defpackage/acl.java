package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acl implements aab {
    private final aat[] a;

    public acl(zz zzVar, float f, float f2) {
        int b = zzVar.b();
        aat[] aatVarArr = new aat[b];
        for (int i = 0; i < b; i++) {
            aatVarArr[i] = new aat(f, f2, zzVar.a(i));
        }
        this.a = aatVarArr;
    }

    @Override // defpackage.aab
    public final /* bridge */ /* synthetic */ aar a(int i) {
        return this.a[i];
    }
}
