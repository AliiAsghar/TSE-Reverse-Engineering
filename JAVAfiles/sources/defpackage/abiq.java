package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiq extends abis {
    public abiq(String str, Integer num) {
        super(str, num);
    }

    @Override // defpackage.abis
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = abis.c.a;
        return Integer.valueOf(acmd.a((ContentResolver) obj, this.a, ((Integer) this.b).intValue()));
    }
}
