package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnl implements alhr {
    private final Context a;
    private final /* synthetic */ int b;

    public ahnl(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.alhr
    public final /* synthetic */ Object get() {
        if (this.b != 0) {
            return algw.h(aiep.a(this.a));
        }
        if (agqa.d(this.a)) {
            return alfd.a;
        }
        return algw.i(new File(this.a.getFilesDir(), "primes/crash"));
    }
}
