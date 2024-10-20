package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agzr implements agzv {
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        agrk agrkVar = (agrk) agzt.a.get(getClass());
        if (agrkVar != null) {
            str = agrkVar.a;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return super.toString();
        }
        return str;
    }

    @Override // defpackage.agzu
    public final /* synthetic */ void a() {
    }
}
