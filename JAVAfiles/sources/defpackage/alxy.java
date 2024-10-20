package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alxy extends alww {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public alxy(String str) {
        this.a = str;
    }

    @Override // defpackage.alww
    public String d() {
        return this.a;
    }

    @Override // defpackage.alww
    public void g(RuntimeException runtimeException, alwv alwvVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
