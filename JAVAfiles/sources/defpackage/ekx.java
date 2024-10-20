package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekx implements ekv {
    private final String a;

    public ekx(String str) {
        this.a = str;
    }

    @Override // defpackage.ekv
    public final boolean b(CharSequence charSequence, int i, int i2, elg elgVar) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            elgVar.b = elgVar.c() | 4;
            return false;
        }
        return true;
    }

    @Override // defpackage.ekv
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }
}
