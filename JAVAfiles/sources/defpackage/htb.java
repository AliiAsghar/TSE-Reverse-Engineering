package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htb implements hnm {
    private final hqa a;
    private final hnm b;

    public htb(hqa hqaVar, hnm hnmVar) {
        this.a = hqaVar;
        this.b = hnmVar;
    }

    @Override // defpackage.hmx
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hnj hnjVar) {
        return this.b.a(new huh(((BitmapDrawable) ((hpt) obj).c()).getBitmap(), this.a, 1), file, hnjVar);
    }

    @Override // defpackage.hnm
    public final int b() {
        return 2;
    }
}
