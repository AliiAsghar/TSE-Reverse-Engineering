package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abir extends abis {
    public abir(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.abis
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = abis.c.a;
        return acmd.c((ContentResolver) obj, this.a, (String) this.b);
    }
}
