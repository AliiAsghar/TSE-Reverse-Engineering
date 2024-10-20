package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalx implements aalv {
    private final /* synthetic */ int a;

    public aalx(int i) {
        this.a = i;
    }

    @Override // defpackage.aalv
    public final String a(String str) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return str.replaceAll("[0-9]", "0");
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return str.replace("\"", "\"\"");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll("[\n\r]+", " ");
    }
}
