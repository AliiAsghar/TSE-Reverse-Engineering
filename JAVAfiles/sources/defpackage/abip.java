package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abip extends abis {
    public abip(String str, Boolean bool) {
        super(str, bool);
    }

    @Override // defpackage.abis
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = abis.c.a;
        return Boolean.valueOf(acmd.e((ContentResolver) obj, this.a, ((Boolean) this.b).booleanValue()));
    }
}
