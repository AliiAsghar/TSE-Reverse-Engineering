package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aomq implements armf {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ armf c;
    private aomm d = null;

    public aomq(Context context, String str, armf armfVar) {
        this.a = context;
        this.b = str;
        this.c = armfVar;
    }

    @Override // defpackage.armf, defpackage.arme
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aomm b() {
        if (this.d == null) {
            Context context = this.a;
            String str = this.b;
            armf armfVar = this.c;
            String packageName = context.getPackageName();
            armfVar.b();
            this.d = new aomm(packageName, str);
        }
        return this.d;
    }
}
