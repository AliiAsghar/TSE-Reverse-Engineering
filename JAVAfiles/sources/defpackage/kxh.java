package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxh implements kzy {
    private final Context a;
    private final armf b;
    private View c;
    private final wyp d;

    public kxh(Context context, wyp wypVar, armf armfVar) {
        this.a = context;
        this.d = wypVar;
        this.b = armfVar;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        String str;
        boolean a = ((ohf) this.b.b()).a();
        String str2 = kzxVar.E;
        if (a && (str = kzxVar.ab) != null) {
            str2 = a.co(str, str2, " ");
        }
        this.c.setContentDescription(str2);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.c = view;
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        if (!TextUtils.equals(kzxVar.E, kzxVar2.E)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a9, code lost:
    
        if (r9 == 130) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d8, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d6, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d4, code lost:
    
        if (r9 == 130) goto L98;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    @Override // defpackage.kzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.kzw r37, defpackage.kzd r38) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxh.e(kzw, kzd):void");
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
